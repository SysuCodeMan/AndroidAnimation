package com.example.chen.androidanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Chen on 2017/4/20.
 */

public class MainActivity extends AppCompatActivity {
    ImageView frame_animation_view;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        frame_animation_view = (ImageView) findViewById(R.id.FrameAnimation);
        AnimationDrawable animationDrawable = (AnimationDrawable)frame_animation_view.getBackground();
        animationDrawable.start();
        super.onCreate(savedInstanceState);
    }
}
