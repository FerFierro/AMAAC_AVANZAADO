package com.enterprises.devare.amaac_avanzaado.controlador.adapters;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.enterprises.devare.amaac_avanzaado.R;
import com.enterprises.devare.amaac_avanzaado.controlador.dialogos.SeccionTerminadaDialogo;
import com.enterprises.devare.amaac_avanzaado.controlador.dialogos.SeccionTerminadaNivelDialogo;
import com.enterprises.devare.amaac_avanzaado.modelo.Nivel;
import com.enterprises.devare.amaac_avanzaado.modelo.db.DBHelper;
import com.enterprises.devare.amaac_avanzaado.modelo.db.DataManager;
import com.enterprises.devare.amaac_avanzaado.modelo.Pictograma;

import java.util.List;
import java.util.Locale;

import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCALES;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_A;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_E;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_I;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_O;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_U;

public class VocalesEjercicios extends AppCompatActivity {

    //<editor-fold desc="DECLARION DE VARIABLES">
    VocalesAdaptador adapter;
    private DBHelper db;
    private RecyclerView recycler_ejercicios;
    int nuevaPosicion;

    //</editor-fold>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ejercicio_niveles);
        db = new DBHelper(this);

        recycler_ejercicios = (RecyclerView) findViewById(R.id.reciclador_ejercicio_niveles);
        InitAdapter(recycler_ejercicios, db.getCategoria_Pictogramas(CAT_VOCALES));

    }

    //<editor-fold desc="MÉTODO iniciarDatos_Vocales_main() CARGA DE DATOS">
    public void iniciarDatos_Vocales_main(Context contexto) {
        DataManager datos = new DataManager();
        datos.Init_Contenido_niveles(contexto);
    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO InitAdapter()">
    public void InitAdapter(RecyclerView mRecyclerView, List<Pictograma> items) {

        System.out.println("Entre a InitAdapter");

        assert mRecyclerView != null;
        adapter = new VocalesAdaptador(items);
        System.out.println(items.get(4));

        setupRecyclerView(mRecyclerView, adapter);

    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO setupRecyclerView()">
    private void setupRecyclerView(@NonNull RecyclerView recyclerView, VocalesAdaptador items) {

        System.out.println("Entre a setupRecyclerView");

        recyclerView.setAdapter(items);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        }else{
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));

        }
        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.VERTICAL, false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.HORIZONTAL, false));
    }
    //</editor-fold>

    //<editor-fold desc="CLASE VocalesAdaptador">
    public class VocalesAdaptador extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private List<Pictograma> mValues;

        //<editor-fold desc="CONSTRUCTOR VocalesAdaptado()">
        public VocalesAdaptador(List<Pictograma> mValues) {
            this.mValues = mValues;
        }
        //</editor-fold>

        //<editor-fold desc="MÉTODO onCreateViewHolder()">
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view;
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view_ejercicio_preestablecido, parent, false);
            return new VocalesViewHolder(view);

        }
        //</editor-fold>

        //<editor-fold desc="MÉTODO onBindViewHolder">
        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

            nuevaPosicion=position+1;
            final Pictograma object = mValues.get(position);
            final int habilitado=object.getHabilitado();
            final boolean habilitadoEjercicio=estadoPictograma(habilitado);
            final int completado=object.getCompletado();
            final boolean completadoEjercicio=estadoPictograma(completado);
            int resultado;


            if (completadoEjercicio) {

                if (nuevaPosicion<mValues.size()){
                    final Pictograma seteo = mValues.get(nuevaPosicion);
                    seteo.setHabilitado(1);
                    db.updatePictograma(seteo);
//                    Toast.makeText(getApplicationContext(), "Progreso "+object.toString(), Toast.LENGTH_SHORT).show();
                }else{
                    FragmentManager fragmentManager = getFragmentManager();
                    new SeccionTerminadaNivelDialogo().show(fragmentManager, "SeccionTerminadaNivelDialog");
                }
            }

            switch (object.getNombre()) {

                case "Aa":
                    resultado=db.obtenerProgreso(CAT_VOCAL_A);
                    object.setProgreso(resultado);
                    break;

                case "Ee":
                    resultado=db.obtenerProgreso(CAT_VOCAL_E);
                    object.setProgreso(resultado);
                    break;

                case "Ii": resultado=db.obtenerProgreso(CAT_VOCAL_I);
                    object.setProgreso(resultado);
                    break;

                case "Oo":
                    resultado=db.obtenerProgreso(CAT_VOCAL_O);
                    object.setProgreso(resultado);
                    break;

                case "Uu":
                    resultado=db.obtenerProgreso(CAT_VOCAL_U);
                    object.setProgreso(resultado);
                    break;

            }
            int progresoNivel=object.getProgreso();
            ((VocalesViewHolder) holder).tv_total_ejercicios_vocales.setText("1/5");
            ((VocalesViewHolder) holder).tv_cv_ejercicio_vocal.setText(object.getNombre());
            ((VocalesViewHolder) holder).tv_cv_porcentaje_progreso.setText(progresoNivel+"%");
            ((VocalesViewHolder) holder).progressbar_nivel.setProgress(progresoNivel);

           if (habilitadoEjercicio){
                ((VocalesViewHolder) holder).iv_cv_ejercicio_nivel_bloqueado.setVisibility(View.INVISIBLE);
                ((VocalesViewHolder) holder).cv_ejercicios_nivel.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).tv_total_ejercicios_vocales.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).tv_cv_ejercicio_vocal.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).tv_cv_porcentaje_progreso.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).progressbar_nivel.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).tv_cv_porcentaje_progreso.setVisibility(View.VISIBLE);
                ((VocalesViewHolder) holder).progressbar_nivel.setVisibility(View.VISIBLE);

            }else{
                ((VocalesViewHolder) holder).iv_cv_ejercicio_nivel_bloqueado.setVisibility(View.VISIBLE);

                ((VocalesViewHolder) holder).cv_ejercicios_nivel.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).tv_total_ejercicios_vocales.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).tv_cv_ejercicio_vocal.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).tv_cv_porcentaje_progreso.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).progressbar_nivel.setEnabled(habilitadoEjercicio);
                ((VocalesViewHolder) holder).tv_cv_porcentaje_progreso.setVisibility(View.INVISIBLE);
                ((VocalesViewHolder) holder).progressbar_nivel.setVisibility(View.INVISIBLE);

            }
        }
        //</editor-fold>

        public boolean  estadoPictograma(int i){
            if(i==1){
                return  true;
            }else{
                return false;
            }
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        //<editor-fold desc="CLASE VocalesViewHolder">
        public class VocalesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            CardView cv_ejercicios_nivel;
            ImageView iv_cv_ejercicio_nivel_bloqueado;
            private TextView tv_total_ejercicios_vocales,
                    tv_cv_ejercicio_vocal,
                    tv_cv_porcentaje_progreso;
            ProgressBar progressbar_nivel;


            public static final String VOCAL_SELECCIONADA="com.enterprises.devare.amaac_avanzaado.controlador.adapters.vocalSeleccionada";
            public static final String VOCAL_NIVEL="com.enterprises.devare.amaac_avanzaado.controlador.adapters.vocalNivel";

            public VocalesViewHolder(View itemView) {
                super(itemView);
                cv_ejercicios_nivel= (CardView) itemView.findViewById(R.id.cv_ejercicios_nivel);
                iv_cv_ejercicio_nivel_bloqueado=(ImageView) itemView.findViewById(R.id.iv_cv_ejercicio_nivel_bloqueado) ;
                tv_total_ejercicios_vocales = (TextView) itemView.findViewById(R.id.tv_total_ejercicios_vocales);
                tv_cv_ejercicio_vocal = (TextView) itemView.findViewById(R.id.tv_cv_ejercicio_vocal);
                tv_cv_porcentaje_progreso = (TextView) itemView.findViewById(R.id.tv_cv_porcentaje_progreso);
                progressbar_nivel = (ProgressBar) itemView.findViewById(R.id.progressbar_nivel);
                cv_ejercicios_nivel.setOnClickListener(this);
            }
            //</editor-fold>

            @Override
            public void onClick(View v) {

                int posicision = getAdapterPosition();
                final Pictograma object = mValues.get(posicision);
                Intent ejercicio;
                ejercicio = new Intent(getApplicationContext(), Ejercicios.class);

                switch (object.getNombre()) {

                    case "Aa":
//                        Toast.makeText(VocalesEjercicios.this, "clikeastes Aa", Toast.LENGTH_SHORT).show();
                        estadoNivel(object.getNombre(),object);
                        ejercicio.putExtra(VOCAL_SELECCIONADA,CAT_VOCAL_A);
                        ejercicio.putExtra(VOCAL_NIVEL,object.getNombre());
                        startActivity(ejercicio);
                        break;

                    case "Ee":
                        estadoNivel(object.getNombre(),object);
                        ejercicio.putExtra(VOCAL_SELECCIONADA,CAT_VOCAL_E);
                        ejercicio.putExtra(VOCAL_NIVEL,object.getNombre());
                        startActivity(ejercicio);
                        break;

                    case "Ii":
                        estadoNivel(object.getNombre(),object);
                        ejercicio.putExtra(VOCAL_SELECCIONADA,CAT_VOCAL_I);
                        ejercicio.putExtra(VOCAL_NIVEL,object.getNombre());
                        startActivity(ejercicio);
                        break;

                    case "Oo":
                        estadoNivel(object.getNombre(),object);
                        ejercicio.putExtra(VOCAL_SELECCIONADA,CAT_VOCAL_O);
                        ejercicio.putExtra(VOCAL_NIVEL,object.getNombre());
                        startActivity(ejercicio);
                        break;

                    case "Uu":
                        estadoNivel(object.getNombre(),object);
                        ejercicio.putExtra(VOCAL_SELECCIONADA,CAT_VOCAL_U);
                        ejercicio.putExtra(VOCAL_NIVEL,object.getNombre());
                        startActivity(ejercicio);
                        break;

                }

            }

            //<editor-fold desc="MÉTODO esHabilitado()">
            public boolean esHabilitado(int valor){
                if(valor==1){
                    return true;
                }else{
                    return false;
                }
            }
            //</editor-fold>

            //<editor-fold desc="MÉTODO  estadoNivel()">
            public void estadoNivel(String nombreNivel,Pictograma pictograma){
                if(esHabilitado(pictograma.getHabilitado())==true){
                    int progresoNivel=pictograma.getProgreso();
                    int completado=pictograma.getCompletado();
                    /*Toast.makeText(VocalesEjercicios.this, "El nivel "+nombreNivel+" esta habilitado"+
                            " y el progreso es de : "+progresoNivel+"%"+
                            "Su valor de completado es: "+completado, Toast.LENGTH_LONG).show();*/
                }else{
                    Toast.makeText(VocalesEjercicios.this, "El nivel "+nombreNivel+" No esta habilitado", Toast.LENGTH_SHORT).show();
                }
            }
            //</editor-fold>
        }
        //</editor-fold>
    }
}
