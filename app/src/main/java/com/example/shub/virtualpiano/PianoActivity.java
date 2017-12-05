package com.example.shub.virtualpiano;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Shub on 11/11/17.
 */

public class PianoActivity extends Activity {

    Button a, b, c, d, e, f, g;

    private SoundPool soundPool;
    private int soundA, soundB, soundC, soundD, soundE, soundF, soundG;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);

        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        d = (Button) findViewById(R.id.d);
        e = (Button) findViewById(R.id.e);
        f = (Button) findViewById(R.id.f);
        g = (Button) findViewById(R.id.g);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else{

            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        soundA = soundPool.load(this, R.raw.a, 1);
        soundB = soundPool.load(this, R.raw.b, 1);
        soundC = soundPool.load(this, R.raw.c, 1);
        soundD = soundPool.load(this, R.raw.d, 1);
        soundE = soundPool.load(this, R.raw.e, 1);
        soundF = soundPool.load(this, R.raw.f, 1);
        soundG = soundPool.load(this, R.raw.g, 1);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundA, 1, 1, 0, 0, 1 );
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundB, 1, 1, 0, 0, 1 );
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundC, 1, 1, 0, 0, 1 );
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundD, 1, 1, 0, 0, 1 );
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundE, 1, 1, 0, 0, 1 );
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundF, 1, 1, 0, 0, 1 );
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundG, 1, 1, 0, 0, 1 );
            }
        });


    }
}
