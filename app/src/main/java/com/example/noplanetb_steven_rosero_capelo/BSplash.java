package com.example.noplanetb_steven_rosero_capelo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BSplash extends AppCompatActivity  implements Animation.AnimationListener {
    TextView tvtitsplash;
    ImageView imco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsplash);
        getSupportActionBar().hide();

        tvtitsplash = (TextView) findViewById(R.id.tvtitsplash);
        imco = (ImageView) findViewById(R.id.imco);

        Animation escalar = AnimationUtils.loadAnimation(this, R.anim.escalar);
        Animation caida = AnimationUtils.loadAnimation(this, R.anim.caida);
        tvtitsplash.startAnimation(escalar);
        imco.startAnimation(caida);

        escalar.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(getApplicationContext(), BLogIn.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
