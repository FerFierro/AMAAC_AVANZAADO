package com.enterprises.devare.amaac_avanzaado.controlador.adapters;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.enterprises.devare.amaac_avanzaado.R;
import com.enterprises.devare.amaac_avanzaado.modelo.Pictograma;
import com.enterprises.devare.amaac_avanzaado.modelo.db.DBHelper;

import java.util.List;
public class Ejercicios extends AppCompatActivity {

    //<editor-fold desc="DECLARION DE VARIABLES">
    Ejercicios.EjercicioAdaptador adapter;
    private DBHelper db;
    private RecyclerView recycler_ejercicios;
    MediaPlayer mPlayer;
    private boolean fabStateVolume = false;
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
        System.out.println(items.get(4));

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
            System.out.println(object.getNombre());

            ((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).tv_cv_ejercicio.setText(object.getNombre());
            ((EjerciciosViewHolder) holder).fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fabStateVolume) {
                        if (mPlayer.isPlaying()) {
                            mPlayer.stop();

                        }
                        ((EjerciciosViewHolder) holder).fab.setImageResource(object.getIdSonido());
                        fabStateVolume = false;

                    } else {
                        mPlayer = MediaPlayer.create(getApplicationContext(),object.getIdSonido());
                        mPlayer.setLooping(true);
                        mPlayer.start();
                        ((EjerciciosViewHolder) holder).fab.setImageResource(R.drawable.ic_toast_megaphone_2);
                        fabStateVolume = true;

                    }
                }
            });

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
            FloatingActionButton fab,fab2;
            ImageButton Ibtn_cv_ejercicio_siguiente;


            public EjerciciosViewHolder(View itemView) {
                super(itemView);

                iv_cv_bloqueado = (ImageView) itemView.findViewById(R.id.iv_cv_bloqueado);
                tv_cv_ejercicio = (TextView) itemView.findViewById(R.id.tv_cv_ejercicio);
                fab = (FloatingActionButton) itemView.findViewById(R.id.fab);
                fab2 = (FloatingActionButton) itemView.findViewById(R.id.fab2);
                Ibtn_cv_ejercicio_siguiente = (ImageButton) itemView.findViewById(R.id.Ibtn_cv_ejercicio_siguiente);

            }
            //</editor-fold>
        }
        //</editor-fold>
    }
}
