package com.rbapps.programmingcodes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        ImageView imageView= findViewById(R.id.imageView);
        Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        imageView.setAnimation(anim);

        Thread timer=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent intent =new Intent(Splash_Screen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        timer.start();
    }
}
