package com.enterprises.devare.amaac_avanzaado.controlador.adapters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.enterprises.devare.amaac_avanzaado.R;
import com.enterprises.devare.amaac_avanzaado.modelo.Pictograma;
import com.enterprises.devare.amaac_avanzaado.modelo.db.DBHelper;

import java.util.List;

import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES;

public class Consonantes_main extends AppCompatActivity {

    //<editor-fold desc="DECLARION DE VARIABLES">

    MediaPlayer mPlayer;
    private boolean fabStateVolume = false;
    ConsonantesAdaptador adapter;
    private DBHelper db;
    private RecyclerView recycler_ejercicios;

    //</editor-fold>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ejercicio_niveles);
        db = new DBHelper(this);

        recycler_ejercicios = (RecyclerView) findViewById(R.id.reciclador_ejercicio_niveles);
        InitAdapter(recycler_ejercicios, db.getCategoria_Pictogramas(CAT_CONSONANTES));

    }


    //<editor-fold desc="MÉTODO InitAdapter()">
    public void InitAdapter(RecyclerView mRecyclerView, List<Pictograma> items) {

        System.out.println("Entre a InitAdapter");

        assert mRecyclerView != null;
        adapter = new ConsonantesAdaptador(items);
        System.out.println(items.get(4));

        setupRecyclerView(mRecyclerView, adapter);

    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO setupRecyclerView()">
    private void setupRecyclerView(@NonNull RecyclerView recyclerView, ConsonantesAdaptador items) {

        System.out.println("Entre a setupRecyclerView");

        recyclerView.setAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.VERTICAL, false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.HORIZONTAL, false));
    }
    //</editor-fold>

    //<editor-fold desc="CLASE VocalesAdaptador">
    public class ConsonantesAdaptador extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        private List<Pictograma> mValues;

        //<editor-fold desc="CONSTRUCTOR VocalesAdaptado()">
        public ConsonantesAdaptador(List<Pictograma> mValues) {
            this.mValues = mValues;
        }
        //</editor-fold>

        //<editor-fold desc="MÉTODO onCreateViewHolder()">
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view;
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view_ejercicio_preestablecido, parent, false);
            return new ConsonantesViewHolder(view);

        }
        //</editor-fold>

        //<editor-fold desc="MÉTODO onBindViewHolder">
        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

            final Pictograma object = mValues.get(position);
            System.out.println(object.getNombre());

            ((ConsonantesViewHolder) holder).mVTextVocal.setText(object.getNombre());

            ((ConsonantesViewHolder) holder).mfab1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fabStateVolume) {
                        if (mPlayer.isPlaying()) {
                            mPlayer.stop();

                        }
                        ((ConsonantesViewHolder) holder).mfab1.setImageResource(R.drawable.ic_play);
                        fabStateVolume = false;

                    } else {
                        mPlayer = MediaPlayer.create(Consonantes_main.this, object.getIdSonido());
                        mPlayer.setLooping(true);
                        mPlayer.start();
                        ((ConsonantesViewHolder) holder).mfab1.setImageResource(R.drawable.ic_toast_megaphone_2);
                        fabStateVolume = true;

                    }
                }
            });

            ((ConsonantesViewHolder) holder).mfab2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fabStateVolume) {
                        if (mPlayer.isPlaying()) {
                            mPlayer.stop();

                        }
                        ((ConsonantesViewHolder) holder).mfab2.setImageResource(R.drawable.ic_play);
                        fabStateVolume = false;

                    } else {
                        mPlayer = MediaPlayer.create(Consonantes_main.this, object.getIdSonido2());
                        mPlayer.setLooping(true);
                        mPlayer.start();
                        ((ConsonantesViewHolder) holder).mfab2.setImageResource(R.drawable.ic_toast_megaphone_2);
                        fabStateVolume = true;

                    }
                }
            });


            ((ConsonantesViewHolder) holder).mfab3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fabStateVolume) {
                        if (mPlayer.isPlaying()) {
                            mPlayer.stop();

                        }
                        ((ConsonantesViewHolder) holder).mfab3.setImageResource(R.drawable.ic_play);
                        fabStateVolume = false;

                    } else {
                        mPlayer = MediaPlayer.create(Consonantes_main.this, object.getIdSonido3());
                        mPlayer.setLooping(true);
                        mPlayer.start();
                        ((ConsonantesViewHolder) holder).mfab3.setImageResource(R.drawable.ic_toast_megaphone_2);
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
        public class ConsonantesViewHolder extends RecyclerView.ViewHolder {
            private TextView mVTextVocal;
            public FloatingActionButton mfab1, mfab2, mfab3;

            public ConsonantesViewHolder(View itemView) {
                super(itemView);

                mVTextVocal = (TextView) itemView.findViewById(R.id.tv_card_ejercicio_preestablecido);
                mfab1 = (FloatingActionButton) itemView.findViewById(R.id.fab);
                mfab2 = (FloatingActionButton) itemView.findViewById(R.id.fab2);
                mfab3 = (FloatingActionButton) itemView.findViewById(R.id.fab3);
            }
        }
        //</editor-fold>
    }
    //</editor-fold>
}
