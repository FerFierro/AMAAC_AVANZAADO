package com.enterprises.devare.amaac_avanzaado.controlador.adapters;

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
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.enterprises.devare.amaac_avanzaado.R;
import com.enterprises.devare.amaac_avanzaado.modelo.Pictograma;
import com.enterprises.devare.amaac_avanzaado.modelo.db.DBHelper;

import java.util.List;

import static com.enterprises.devare.amaac_avanzaado.R.color.accent_500;
import static com.enterprises.devare.amaac_avanzaado.R.color.accent_material_dark;
import static com.enterprises.devare.amaac_avanzaado.R.color.color_animo;

public class Ejercicios extends AppCompatActivity {

    //<editor-fold desc="DECLARION DE VARIABLES">
    Ejercicios.EjercicioAdaptador adapter;
    private DBHelper db;
    private RecyclerView recycler_ejercicios;
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
            Toast.makeText(Ejercicios.this, "oncreate "+parent.getId(), Toast.LENGTH_SHORT).show();
            Toast.makeText(Ejercicios.this, "oncreate "+parent.getChildAt(0), Toast.LENGTH_SHORT).show();
            Toast.makeText(Ejercicios.this, "oncreate "+parent.getVisibility(), Toast.LENGTH_SHORT).show();

            return new Ejercicios.EjercicioAdaptador.EjerciciosViewHolder(view);

        }
        //</editor-fold>

        //<editor-fold desc="MÉTODO onBindViewHolder">
        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

            final Pictograma object = mValues.get(position);

                Toast.makeText(Ejercicios.this, "Posicion " + position, Toast.LENGTH_SHORT).show();
                 Toast.makeText(Ejercicios.this, "itenView " +holder.itemView, Toast.LENGTH_SHORT).show();
            Toast.makeText(Ejercicios.this, "getLayoutPosition " +holder.getLayoutPosition(), Toast.LENGTH_SHORT).show();
            Toast.makeText(Ejercicios.this, "getAdapterPosition " +holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
            Toast.makeText(Ejercicios.this, "getItemId " +holder.getItemId(), Toast.LENGTH_SHORT).show();
            Toast.makeText(Ejercicios.this, "getItemViewType " +holder.getItemViewType(), Toast.LENGTH_SHORT).show();
            Toast.makeText(Ejercicios.this, "getAdapterPosition " +holder.getOldPosition(), Toast.LENGTH_SHORT).show();
            Toast.makeText(Ejercicios.this, "getAdapterPosition " +holder.toString(), Toast.LENGTH_SHORT).show();
                System.out.println(object.getNombre());

                ((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).tv_cv_ejercicio.setText(object.getNombre());
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), object.getIdSonido());
                ((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setEnabled(false);
                ((EjerciciosViewHolder) holder).fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mediaPlayer.isPlaying()) {
                            mediaPlayer.pause();
                            ((EjerciciosViewHolder) holder).fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF4081")));
                        } else {
                            ((EjerciciosViewHolder) holder).fab.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFF00")));
                            mediaPlayer.start();
                        }

                        ((Ejercicios.EjercicioAdaptador.EjerciciosViewHolder) holder).Ibtn_cv_ejercicio_siguiente.setEnabled(true);
                    }
                });

                ((EjerciciosViewHolder) holder).fab2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mediaPlayer.isPlaying()) {
                            mediaPlayer.pause();
                            ((EjerciciosViewHolder) holder).fab2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF4081")));
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
            LinearLayout ll_ejercicio;
            ImageButton Ibtn_cv_ejercicio_siguiente;

            public EjerciciosViewHolder(View itemView) {
                super(itemView);

                iv_cv_bloqueado = (ImageView) itemView.findViewById(R.id.iv_cv_bloqueado);
                tv_cv_ejercicio = (TextView) itemView.findViewById(R.id.tv_cv_ejercicio);
                ll_ejercicio= (LinearLayout) itemView.findViewById(R.id.ll_ejercicio);
                fab = (FloatingActionButton) itemView.findViewById(R.id.fab);
                fab2 = (FloatingActionButton) itemView.findViewById(R.id.fab2);
                Ibtn_cv_ejercicio_siguiente = (ImageButton) itemView.findViewById(R.id.Ibtn_cv_ejercicio_siguiente);

            }
            //</editor-fold>
        }
        //</editor-fold>
    }
}
