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
    }

    @Override
    public int onStartCommand(Intent intenc, int flags, int idArranque) {
        idRaw = intenc.getIntExtra(Ejercicios.ID_Sonido, 0);
        reproductor = MediaPlayer.create(getApplicationContext(), idRaw);

        if (reproductor.isPlaying()) {

            reproductor.pause();

        } else {
            reproductor.start();

        }

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        reproductor.stop();
    }

    @Override
    public IBinder onBind(Intent intencion) {

        return null;
    }
}