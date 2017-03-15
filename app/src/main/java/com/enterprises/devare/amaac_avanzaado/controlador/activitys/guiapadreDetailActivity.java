package com.enterprises.devare.amaac_avanzaado.controlador.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.enterprises.devare.amaac_avanzaado.R;
import com.enterprises.devare.amaac_avanzaado.controlador.fragments.guiapadreDetailFragment;

public class guiapadreDetailActivity extends AppCompatActivity {

    //<editor-fold desc="MÉTODO CALLBACK onCreate(Bundle savedInstanceState)">
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guiapadre_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        //<editor-fold desc="Muestra el botón Arriba en la barra de acción.">
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        //</editor-fold>

        // http://developer.android.com/guide/components/fragments.html
        if (savedInstanceState == null) {

            Bundle arguments = new Bundle();
            arguments.putString(guiapadreDetailFragment.ID_ARTICULO,
                    getIntent().getStringExtra(guiapadreDetailFragment.ID_ARTICULO));
            guiapadreDetailFragment fragment = new guiapadreDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.guiapadre_detail_container, fragment).commit();
        }
    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO onOptionsItemSelected(MenuItem item)">
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {

            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            NavUtils.navigateUpTo(this, new Intent(this, guiapadreListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    //</editor-fold>
}

//Clase checada ningun error