package com.enterprises.devare.amaac_avanzaado.controlador.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.enterprises.devare.amaac_avanzaado.R;
import com.enterprises.devare.amaac_avanzaado.modelo.dummy.GuiaPadreContent;

public class guiapadreDetailFragment extends Fragment {

    public static final String ID_ARTICULO = "item_id";

    private GuiaPadreContent.GuiaPadre itemDetallado;

    //<editor-fold desc="CONSTRUCTOR">
    public guiapadreDetailFragment() {
    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO CALLBACK onCreate(Bundle savedInstanceState)">
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ID_ARTICULO)) {

            itemDetallado = GuiaPadreContent.ITEM_MAP.get(getArguments().getString(ID_ARTICULO));

           /* Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(itemDetalldo.titulo);//el contenido dentro ded  i barra
            }*/
        }
    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO onCreateView()">
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmento_detalle_articulo, container, false);

        if (itemDetallado != null) {

            //((TextView) v.findViewById(R.id.tecnica_detail_guia_de_uso)).setText(itemDetallado.descripcion);
            ((TextView) v.findViewById(R.id.titulo)).setText(itemDetallado.titulo);
            ((TextView) v.findViewById(R.id.fecha)).setText(itemDetallado.fecha);
            ((TextView) v.findViewById(R.id.contenido)).setText(itemDetallado.descripcion);
            ImageView myImageView = (ImageView) v.findViewById(R.id.imagen);
            myImageView.setImageResource(itemDetallado.idImagen);
        }

        return v;
    }
    //</editor-fold>
}