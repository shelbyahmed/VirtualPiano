package com.example.shub.virtualpiano;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView;
    ImageButton music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.welcome_text_view);
        music = (ImageButton)findViewById(R.id.imageButton);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"fonts/Stitch.ttf");
        textView.setTypeface(customFont);
        textView.setTextColor(Color.parseColor("#465767"));
        music.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                MediaPlayer sound = MediaPlayer.create(MainActivity.this, R.raw.chopan);
                sound.start();

            }
        });

    }


    public void Piano(View view){

        String button_text;
        button_text = ((Button) view).getText().toString();
        if(button_text.equals("Piano")){

            Intent intent = new Intent(this, PianoActivity.class);
                startActivity(intent);
        }

    }

    public void PianoMedia(View view){

        String button_text;
        button_text =((Button) view).getText().toString();
        if(button_text.equals("Piano Media")){

            Intent intent = new Intent(this, MediaActivity.class);
            startActivity(intent);
        }
    }
}
