package com.example.shub.virtualpiano;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.net.URL;

/**
 * Created by Shub on 11/11/17.
 */

public class MediaActivity extends Activity {

    VideoView video;
    VideoView video2;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        video = (VideoView)findViewById(R.id.videoView1);
        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video1);
        video.setVideoURI(uri);

        Button playbutton = (Button) findViewById(R.id.button);
        playbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                video.start();
            }

        });

        Button stopbutton = (Button) findViewById(R.id.button2);
        stopbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                video.pause();
            }

        });

        video2 = (VideoView)findViewById(R.id.videoView2);
        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video2);
        video2.setVideoURI(uri);

        Button playbutton2 = (Button) findViewById(R.id.button3);
        playbutton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                video2.start();
            }

        });

        Button stopbutton2 = (Button) findViewById(R.id.button4);
        stopbutton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                video2.pause();
            }

        });

    }




}
