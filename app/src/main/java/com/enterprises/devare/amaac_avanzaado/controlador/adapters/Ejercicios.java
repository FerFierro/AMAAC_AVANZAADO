package com.enterprises.devare.amaac_avanzaado.controlador.adapters;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.enterprises.devare.amaac_avanzaado.R;
import com.enterprises.devare.amaac_avanzaado.controlador.dialogos.SeccionTerminadaDialogo;
import com.enterprises.devare.amaac_avanzaado.controlador.servicios.MusicaService;
import com.enterprises.devare.amaac_avanzaado.modelo.Pictograma;
import com.enterprises.devare.amaac_avanzaado.modelo.db.DBHelper;

import java.util.List;

import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_A;

public class Ejercicios extends AppCompatActivity {

    //<editor-fold desc="DECLARION DE VARIABLES">
    Ejercicios.EjercicioAdaptador adapter;
    private DBHelper db;
    private RecyclerView recycler_ejercicios;
    public static final String ID_Sonido="com.enterprises.devare.amaac_avanzaado.controlador.adapters.SONIDO";
    Intent i;
    int nuevaPosicion;

    //</editor-fold>

    //<editor-fold desc="MÉTODO CALLBACK onCreate()">
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios);

        db = new DBHelper(this);

        recycler_ejercicios = (RecyclerView) findViewById(R.id.reciclador_ejercicio_niveles);
        Intent intent=getIntent();
        int categoria;

        categoria= intent.getIntExtra(VocalesEjercicios.VocalesAdaptador.VocalesViewHolder.VOCAL_SELECCIONADA,1);
        InitAdapter(recycler_ejercicios, db.getCategoria_Pictogramas(categoria));
    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO InitAdapter()">
    public void InitAdapter(RecyclerView mRecyclerView, List<Pictograma> items) {

        System.out.println("Entre a InitAdapter");

        assert mRecyclerView != null;
        adapter = new Ejercicios.EjercicioAdaptador(items);

        setupRecyclerView(mRecyclerView, adapter);

    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO setupRecyclerView()">
    private void setupRecyclerView(@NonNull RecyclerView recyclerView, Ejercicios.EjercicioAdaptador items) {

        System.out.println("Entre a setupRecyclerView");

        recyclerView.setAdapter(items);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.VERTICAL, false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.HORIZONTAL, false));
    }
    //</editor-fold>

    //<editor-fold desc="CLASE VocalesAdaptador">
    public class EjercicioAdaptador extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private List<Pictograma> mValues;


        //<editor-fold desc="CONSTRUCTOR VocalesAdaptado()">
        public EjercicioAdaptador(List<Pictograma> mValues) {
            this.mValues = mValues;
        }
        //</editor-fold>


        //<editor-fold desc="MÉTODO onCreateViewHolder()">
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view;
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ejercicio, parent, false);

            return new Ejercicios.EjercicioAdaptador.EjerciciosViewHolder(view);
        }
        //</editor-fold>


        //<editor-fold desc="MÉTODO onBindViewHolder">
        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

            final Pictograma object = mValues.get(position);
            final int nombre=object.getIdSonido();
            final int habilitado=object.getHabilitado();
            final boolean habilitadoEjercicio=estadoPictograma(habilitado);

                ((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).tv_cv_ejercicio.setText(object.getNombre());
                ((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setEnabled(false);

            if (habilitadoEjercicio){
                ((EjerciciosViewHolder) holder).iv_cv_bloqueado.setVisibility(View.INVISIBLE);

                ((EjerciciosViewHolder) holder).ll_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).ll_controles.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).tv_cv_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).card_view_controles.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).cv_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).fab.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).fab2.setEnabled(habilitadoEjercicio);

            }
            else{
                ((EjerciciosViewHolder) holder).iv_cv_bloqueado.setVisibility(View.VISIBLE);
                ((EjerciciosViewHolder) holder).ll_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).ll_controles.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).tv_cv_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).card_view_controles.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).cv_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).fab.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).fab2.setEnabled(habilitadoEjercicio);
            }
                  //  ((EjerciciosViewHolder) holder).iv_cv_bloqueado.setVisibility(View.VISIBLE);

                ((EjerciciosViewHolder) holder).fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        i=new Intent(getApplicationContext(),MusicaService.class);
                        i.putExtra(ID_Sonido,nombre);
                        startService(i);

                       /* if (mediaPlayer.isPlaying()) {

                            mediaPlayer.pause();
                            ((EjerciciosViewHolder) holder).fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF4081")));
                        } else {
                            ((EjerciciosViewHolder) holder).fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFF00")));
                            mediaPlayer.start();
                        }*/

                        ((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setEnabled(true);
                    }
                });

                ((EjerciciosViewHolder) holder).fab2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(getApplicationContext(),MusicaService.class);
                        stopService(i);
                    }
                });

            ((EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nuevaPosicion=position+1;
                    if (nuevaPosicion<mValues.size()){
                        final Pictograma seteo = mValues.get(nuevaPosicion);
                        seteo.setHabilitado(1);
                        seteo.setCompletado(1);
                        db.updatePictograma(seteo);
                        adapter.notifyDataSetChanged();
                    }else{
                        FragmentManager fragmentManager = getFragmentManager();
                        new SeccionTerminadaDialogo().show(fragmentManager, "SeccionTerminadaDialog");
                    }
                }
            });

        }


        public boolean  estadoPictograma(int i){
            if(i==1){
                return  true;
            }else{
                return false;
            }
        }
        //</editor-fold>



                @Override
        public int getItemCount() {
            return mValues.size();
        }

        //<editor-fold desc="CLASE VocalesViewHolder">
        public class EjerciciosViewHolder extends RecyclerView.ViewHolder {

            ImageView iv_cv_bloqueado;

            private TextView tv_cv_ejercicio;
            ImageView fab,fab2;
            CardView card_view_controles,cv_ejercicio;
            LinearLayout ll_ejercicio,ll_controles;
            ImageButton Ibtn_cv_ejercicio_siguiente;

            public EjerciciosViewHolder(View itemView) {
                super(itemView);

                iv_cv_bloqueado = (ImageView) itemView.findViewById(R.id.iv_cv_bloqueado);
                tv_cv_ejercicio = (TextView) itemView.findViewById(R.id.tv_cv_ejercicio);
                ll_ejercicio= (LinearLayout) itemView.findViewById(R.id.ll_ejercicio);
                ll_controles= (LinearLayout) itemView.findViewById(R.id.ll_controles);
                fab = (ImageView) itemView.findViewById(R.id.fab);
                fab2 = (ImageView) itemView.findViewById(R.id.fab2);
                card_view_controles = (CardView) itemView.findViewById(R.id.card_view_controles);
                cv_ejercicio = (CardView) itemView.findViewById(R.id.cv_ejercicio);
                Ibtn_cv_ejercicio_siguiente = (ImageButton) itemView.findViewById(R.id.Ibtn_cv_ejercicio_siguiente);
            }
            //</editor-fold>
        }
        //</editor-fold>
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        stopService(i);
        super.onPause();
    }

}
