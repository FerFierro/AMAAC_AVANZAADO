package com.enterprises.devare.amaac_avanzaado.controlador.servicios;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import com.enterprises.devare.amaac_avanzaado.controlador.adapters.Ejercicios;

public class MusicaService extends Service {
    MediaPlayer reproductor;
    int idRaw;

    @Override
    public void onCreate() {
        Toast.makeText(this, "Servicio creado con sonido ", Toast.LENGTH_SHORT).show();

    }

    @Override
    public int onStartCommand(Intent intenc, int flags, int idArranque) {
        idRaw = intenc.getIntExtra(Ejercicios.ID_Sonido, 0);reproductor = MediaPlayer.create(getApplicationContext(), idRaw);

        if (reproductor.isPlaying()) {

            reproductor.pause();

        } else {
            reproductor.start();
        }

        Toast.makeText(this, "id sonido " + idRaw, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Servicio arrancado " + idArranque, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Servicio creado con sonido " + idRaw, Toast.LENGTH_SHORT).show();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Servicio detenido", Toast.LENGTH_SHORT).show();
        reproductor.stop();
    }

    @Override
    public IBinder onBind(Intent intencion) {

        return null;
    }
}