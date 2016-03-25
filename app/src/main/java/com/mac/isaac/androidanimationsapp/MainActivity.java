package com.mac.isaac.androidanimationsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView)findViewById(R.id.imageView);
    }

    public void clockwise(View view){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.clockwise);
        image.startAnimation(animation);
    }

    public void zoom(View view){
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.zoom);
        image.startAnimation(animation1);
    }

    public void fade(View view){
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.fade);
        image.startAnimation(animation1);
    }

    public void blink(View view){
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.blink);
        image.startAnimation(animation1);
    }

    public void move(View view){
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.move);
        image.startAnimation(animation1);
    }

    public void slide(View view){
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.slide);
        image.startAnimation(animation1);
    }
}
