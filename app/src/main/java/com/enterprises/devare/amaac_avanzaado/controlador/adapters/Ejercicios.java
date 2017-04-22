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
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
    int nuevaPosicion;
    int categoria;
    String nombreNivel;
    //</editor-fold>

    static MediaPlayer mediaPlayer;
    Thread hilo;
    int flagBotonPlay= 0;
    int seguroDeVida=0;



    //<editor-fold desc="MÉTODO CALLBACK onCreate()">
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios);


        db = new DBHelper(this);

        recycler_ejercicios = (RecyclerView) findViewById(R.id.reciclador_ejercicio_niveles);
        Intent intent=getIntent();





        categoria= intent.getIntExtra(VocalesEjercicios.VocalesAdaptador.VocalesViewHolder.VOCAL_SELECCIONADA,1);
        nombreNivel=intent.getStringExtra(VocalesEjercicios.VocalesAdaptador.VocalesViewHolder.VOCAL_NIVEL);
        InitAdapter(recycler_ejercicios, db.getCategoria_Pictogramas(categoria));




    }
    //</editor-fold>





/*
    @Override
    public void onBackPressed() {
        Thread.currentThread().interrupt();

        Toast.makeText(getApplicationContext(), "back", Toast.LENGTH_LONG).show();

        finish();
    }

*/

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


        private String getHRM(int milliseconds )
        {
            int seconds = (int) (milliseconds / 1000) % 60 ;
            int minutes = (int) ((milliseconds / (1000*60)) % 60);
            int hours   = (int) ((milliseconds / (1000*60*60)) % 24);
            String aux="";
            aux=((hours<10)?"0"+hours:hours) + ":" + ((minutes<10)?"0"+minutes:minutes) + ":" + ((seconds<10)?"0"+seconds:seconds);
            return  aux;
        }

        public void displayStateAndIsAlive(Thread thread) {
            // java.lang.Thread.State can be NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
            System.out.println("ESTADOHilo");
            System.out.println("State:" + thread.getState());
            System.out.println("Is alive?:" + thread.isAlive());
        }





        //<editor-fold desc="MÉTODO onBindViewHolder">
        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

            final Pictograma object = mValues.get(position);
            final int nombre=object.getIdSonido();
            final int habilitado=object.getHabilitado();
            final boolean habilitadoEjercicio=estadoPictograma(habilitado);





                ((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).tv_cv_ejercicio.setText(object.getNombre());
                //((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setEnabled(false);

                ((EjerciciosViewHolder) holder).tv_etiempo.setText("00:00:00");

            if (habilitadoEjercicio){
                ((EjerciciosViewHolder) holder).iv_cv_bloqueado.setVisibility(View.INVISIBLE);

                ((EjerciciosViewHolder) holder).ll_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).ll_controles.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).tv_cv_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).tv_etiempo.setEnabled(habilitadoEjercicio);


                ((EjerciciosViewHolder) holder).card_view_controles.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).cv_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).fab.setVisibility(View.VISIBLE);
                //((EjerciciosViewHolder) holder).fab2.setVisibility(View.VISIBLE);
     //           ((EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setVisibility(View.VISIBLE);

            }
            else{

                ((EjerciciosViewHolder) holder).iv_cv_bloqueado.setVisibility(View.VISIBLE);
                ((EjerciciosViewHolder) holder).ll_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).ll_controles.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).tv_cv_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).tv_etiempo.setEnabled(habilitadoEjercicio);


                ((EjerciciosViewHolder) holder).card_view_controles.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).cv_ejercicio.setEnabled(habilitadoEjercicio);
                ((EjerciciosViewHolder) holder).fab.setVisibility(View.INVISIBLE);
               // ((EjerciciosViewHolder) holder).fab2.setVisibility(View.INVISIBLE);
 //               ((EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setVisibility(View.INVISIBLE);
            }
                  //

                ((EjerciciosViewHolder) holder).fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

/*
                        i=new Intent(getApplicationContext(),MusicaService.class);
                        i.putExtra(ID_Sonido,nombre);
                        startService(i);
*/


                        flagBotonPlay++;
                        seguroDeVida++;
                        Log.d("seguroDeVida", "->" + seguroDeVida);


                        if(mediaPlayer != null){
                           // Log.d("xxxxxxxxxx", "-> " + mediaPlayer.getCurrentPosition());
                            mediaPlayer.stop();
                            //mediaPlayer.release();
                            //mediaPlayer= null;
                        }


                        /*
                        System.out.println("////////////////////////");
                        if(hilo != null){
                            if(hilo.isAlive()){
                                displayStateAndIsAlive(hilo);
                                hilo.interrupt();
                                System.out.println( "->" + Thread.currentThread().isInterrupted() );
                                hilo=null;
                                System.out.println( "->" + Thread.currentThread().isAlive() );
                            }else{
                                System.out.println("//HILO NULL//");
                                displayStateAndIsAlive(hilo);
                            }
                            //NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED
                        }
                        */



                            //=======================================================================

                            try {

                                mediaPlayer= MediaPlayer.create(getApplicationContext(), nombre);

                                hilo= new Thread(new Runnable() {
                                    int i=0;
                                    int duracion= mediaPlayer.getDuration();
                                    int posicionActual=-1;
                                    boolean isMPPlaying=true;
                                    public void run() {

                                        Log.d("tiempoD", "-> " + duracion);
                                        while (isMPPlaying){

                                            try {
                                                Thread.sleep(500);


                                                try {
                                                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                                        public void onCompletion(MediaPlayer mp) {
                                                            ((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setVisibility(View.VISIBLE);
                                                            ((EjerciciosViewHolder) holder).tv_etiempo.setTextColor(getResources().getColor(R.color.color_respuestas));
                                                            ((EjerciciosViewHolder) holder).fab.setImageResource(R.drawable.ic_play);
                                                            // hilo.interrupt();
                                                            Toast.makeText(Ejercicios.this, "MediaPlayer Finished", Toast.LENGTH_SHORT).show();
                                                            isMPPlaying = false;
                                                            mediaPlayer.release();
                                                            mediaPlayer= null;
                                                            seguroDeVida=0;


                                                        }
                                                    });
                                                }catch (Exception e){
                                                    e.printStackTrace();
                                                }
                                                if(!isMPPlaying) break;
                                                else{
                                                    //Log.d("isMPPlaying", ""+ isMPPlaying);
                                                    posicionActual= mediaPlayer.getCurrentPosition();
                                                }


                                                if(seguroDeVida >= 10){
                                                    startActivity(new Intent(getApplicationContext(), IniciarNivel_main.class ));
                                                    System.out.println("Seguro de vida");
                                                    System.out.println("////////////////////////");
                                                    displayStateAndIsAlive(hilo);
                                                    hilo.interrupt();
                                                    displayStateAndIsAlive(hilo);
                                                    finish();

                                                }





                                                if(posicionActual == 0) i++;

                                                if(i == 2){
                                                    Log.d("Hilo", "Se repite en 0 la posicionActual");
                                                    mediaPlayer.stop();
                                                    //mediaPlayer.release();
                                                    break;}






                                                if(posicionActual >= 9500 && posicionActual <= 13500 ) {

                                                    ((EjerciciosViewHolder) holder).tv_etiempo.post(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            ((EjerciciosViewHolder) holder).tv_etiempo.setVisibility(View.VISIBLE);
                                                            ((EjerciciosViewHolder) holder).tv_etiempo.setText(getHRM(posicionActual - 9500));
                                                        }
                                                    });

                                                    runOnUiThread(new Runnable() {
                                                        public void run() {
                                                            ((EjerciciosViewHolder) holder).iv_ejercicio.setVisibility(View.VISIBLE);
                                                        }
                                                    });
                                                }

                                                else if (posicionActual > 13500 && posicionActual <= 15500){

                                                    ((EjerciciosViewHolder) holder).tv_etiempo.post(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            ((EjerciciosViewHolder) holder).tv_etiempo.setTextColor(getResources().getColor(R.color.color_bebidas));
                                                            ((EjerciciosViewHolder) holder).tv_etiempo.setText(getHRM(posicionActual - 9500));
                                                        }
                                                    });

                                                }

                                                else {

                                                    ((EjerciciosViewHolder) holder).tv_etiempo.post(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            ((EjerciciosViewHolder) holder).tv_etiempo.setVisibility(View.INVISIBLE);
                                                        }
                                                    });

                                                    runOnUiThread(new Runnable() {
                                                        public void run() {
                                                            ((EjerciciosViewHolder) holder).iv_ejercicio.setVisibility(View.INVISIBLE);
                                                        }
                                                    });
                                                }



//                                                Log.d("tiempoPA", "-> " + posicionActual);


                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                        }

                                        System.out.println("////////////////////////");
                                        displayStateAndIsAlive(hilo);
                                        hilo.interrupt();
                                        displayStateAndIsAlive(hilo);
                                        //mediaPlayer.stop();
                                        //mediaPlayer.release();
                                        //mediaPlayer= null;


                                    }
                                });


                            }catch (Exception e){}


                            //=======================================================================


                        switch (flagBotonPlay){
                            case 1:
                                hilo.start();
                                mediaPlayer.start();
                                ((EjerciciosViewHolder) holder).fab.setImageResource(R.drawable.ic_stop);
                                Log.d("numHilos", "HilosFinal: " + Thread.activeCount());
                            break;

                            case 2:
                                mediaPlayer.stop();
                                ((EjerciciosViewHolder) holder).fab.setImageResource(R.drawable.ic_play);
                                Log.d("numHilos", "HilosFinal: " + Thread.activeCount());
                                flagBotonPlay= 0;
                             }

                    }
                });




            /*
                ((EjerciciosViewHolder) holder).fab2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("numHilos", "HilosF: " + Thread.activeCount());
                        if(mediaPlayer!=null){
                            hilo.interrupt();
                        }

                    }
                });

            */


            ((EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flagBotonPlay=0;
                    seguroDeVida=0;

                    nuevaPosicion=position+1;
                    if(object.getCompletado() != 1){
                        Log.d("nivel", "desbloqueando nivel" );

                        object.setCompletado(1);
                        object.setProgreso(20);
                        db.updatePictograma(object);

                        if (nuevaPosicion<mValues.size()){
                            final Pictograma seteo = mValues.get(nuevaPosicion);
                            seteo.setHabilitado(1);
                            db.updatePictograma(seteo);
                            Toast.makeText(Ejercicios.this, "Progreso "+object.toString(), Toast.LENGTH_SHORT).show();
                            adapter.notifyDataSetChanged();
                        }else{
                            FragmentManager fragmentManager = getFragmentManager();
                            new SeccionTerminadaDialogo().show(fragmentManager, "SeccionTerminadaDialog");
                            db.updateCampoPictograma(nombreNivel,1);
                        }

                    }

                    Log.d("numHilos", "HilosF: " + Thread.activeCount());
                    recycler_ejercicios.post(new Runnable() {
                        @Override
                        public void run() {

                            if( !((nuevaPosicion) == adapter.getItemCount()) )     recycler_ejercicios.smoothScrollToPosition( nuevaPosicion );


                            Log.d("recyclerV", "getItemCount: " + adapter.getItemCount() );
                            Log.d("recyclerV", "posicionActual: " + position );
                            Log.d("recyclerV", "posicionNueva: " + nuevaPosicion );

                        }
                    });




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
        public class EjerciciosViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

            ImageView iv_cv_bloqueado;

            private TextView tv_cv_ejercicio, tv_etiempo;
            ImageView fab,fab2, iv_ejercicio;
            CardView card_view_controles,cv_ejercicio;
            LinearLayout ll_ejercicio,ll_controles;
            ImageButton Ibtn_cv_ejercicio_siguiente;

            public EjerciciosViewHolder(View itemView) {
                super(itemView);

                iv_cv_bloqueado = (ImageView) itemView.findViewById(R.id.iv_cv_bloqueado);
                tv_cv_ejercicio = (TextView) itemView.findViewById(R.id.tv_cv_ejercicio);
                tv_etiempo= (TextView) itemView.findViewById(R.id.tv_etiempo);

                ll_ejercicio= (LinearLayout) itemView.findViewById(R.id.ll_ejercicio);
                ll_controles= (LinearLayout) itemView.findViewById(R.id.ll_controles);
                fab = (ImageView) itemView.findViewById(R.id.fab);
                //fab2 = (ImageView) itemView.findViewById(R.id.fab2);
                iv_ejercicio = (ImageView) itemView.findViewById(R.id.iv_ejercicio);

                card_view_controles = (CardView) itemView.findViewById(R.id.card_view_controles);
                cv_ejercicio = (CardView) itemView.findViewById(R.id.cv_ejercicio);
                Ibtn_cv_ejercicio_siguiente = (ImageButton) itemView.findViewById(R.id.Ibtn_cv_ejercicio_siguiente);
                cv_ejercicio.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                int posicision = getAdapterPosition();
                Pictograma ejercicio=mValues.get(posicision);
                Toast.makeText(Ejercicios.this, "Clickeastes la letra "+ejercicio.getNombre()+"\n"
                                +"Este ejercicio tiene un progreso de :"+ejercicio.getProgreso()+"\n"
                                +"su valor de habilitado es :"+ejercicio.getHabilitado()+"\n"
                                +"su valor de completado es :"+ejercicio.getCompletado()
                                , Toast.LENGTH_LONG).show();
            }
            //</editor-fold>
        }
        //</editor-fold>
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

}
