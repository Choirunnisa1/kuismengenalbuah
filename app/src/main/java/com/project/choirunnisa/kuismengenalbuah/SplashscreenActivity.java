package com.project.choirunnisa.kuismengenalbuah;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class SplashscreenActivity extends AppCompatActivity {

    TextView tvSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splashscreen);
        tvSplash = (TextView) findViewById(R.id.tvSplash);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                finish(); //biar tidak kembali ke splash screen
            }
        }, 3000L); //3000 L = 3 detik
    }
}


