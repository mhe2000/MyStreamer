package com.example.maryjean.mystreamer;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = this;

        imageView = (ImageView) findViewById(R.id.imageView);
        Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(imageView);

        
    }
}
