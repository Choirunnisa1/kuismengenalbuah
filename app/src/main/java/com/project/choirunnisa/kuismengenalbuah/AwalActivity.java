package com.project.choirunnisa.kuismengenalbuah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AwalActivity extends AppCompatActivity {
    ImageView imgjambu, imgmanggis, imgstrawberry, imgapel, imgalpukat, imgdurian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);
        setInisialisasi();
        onClickMantab();

    }
    private void onClickMantab() {

        imgdurian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(AwalActivity.this,KuisActivity.class);
                d.putExtra("gambar","durian");
                startActivity(d);
            }
        });

        imgapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(AwalActivity.this,KuisActivity.class);
                c.putExtra("gambar","apel");
                startActivity(c);
            }
        });

        imgjambu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(AwalActivity.this, KuisActivity.class);
                a.putExtra("gambar","jambuair");
                startActivity(a);
            }
        });

        imgmanggis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ab = new Intent(AwalActivity.this,KuisActivity.class);
                ab.putExtra("gambar","manggis");
                startActivity(ab);
            }
        });
        imgalpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ai = new Intent(AwalActivity.this,KuisActivity.class);
                ai.putExtra("gambar","alpukat");
                startActivity(ai);
            }
        });
    }

    private void setInisialisasi() {
        imgjambu = (ImageView)findViewById(R.id.jambuair);
        imgalpukat = (ImageView)findViewById(R.id.alpukat);
        imgmanggis = (ImageView)findViewById(R.id.manggis);
        imgstrawberry= (ImageView)findViewById(R.id.strawberry);
        imgdurian = (ImageView)findViewById(R.id.durian);
        imgapel= (ImageView)findViewById(R.id.apel);

    }
}
