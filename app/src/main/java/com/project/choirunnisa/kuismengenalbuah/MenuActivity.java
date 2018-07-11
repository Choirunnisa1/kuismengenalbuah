package com.project.choirunnisa.kuismengenalbuah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {


    Button btnKuis,btnMateri,btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void Tomateri(View view) {
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        startActivity(intent);

    }
    public void Tosoal(View view) {
        Intent n = new Intent(MenuActivity.this, AwalActivity.class);
        startActivity(n);

    }
    public void Keluar(View view){System.exit(0);}
}

