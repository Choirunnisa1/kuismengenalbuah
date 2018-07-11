package com.project.choirunnisa.kuismengenalbuah;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer player;
    private Button Btnmanggis;
    private Button Btnjambu;
    private Button Btnstrawberry;
    private Button Btndurian;
    private Button Btnapel;
    private Button Btnalpukat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Btnmanggis = (Button) this.findViewById(R.id.manggis);
        Btnmanggis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(1);
            }
        });

        Btndurian = (Button) this.findViewById(R.id.durian);
        Btndurian.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(2);
            }
        });

        Btnalpukat = (Button) this.findViewById(R.id.alpukat);
        Btnalpukat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(3);

            }
        });

        Btnapel = (Button) this.findViewById(R.id.apel);
        Btnapel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(4);

            }
        });

        Btnjambu = (Button) this.findViewById(R.id.jambuair);
        Btnjambu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(5);

            }
        });

        Btnstrawberry = (Button) this.findViewById(R.id.strawberry);
        Btnstrawberry.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(6);

            }
        });

    }


    @Override
    public void onPause() {
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){
        }
    }


    private void playSound(int arg){
        try{
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        }catch(Exception e){
 //        Toast.makeText(this, " Masuk Exception", Toast.LENGTH_LONG).show();
        }
        if (arg == 1){

       //   Toast.makeText(this, isPlaying+" Burung Hantu", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.manggis);

        }else if (arg==2){
//            Toast.makeText(this, isPlaying+" Gajah", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.durian);
        }else if (arg==3){
//            Toast.makeText(this, isPlaying+" Kambing", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.alpukat);
        }else if (arg==4){
//            Toast.makeText(this, isPlaying+" Kucing", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.apel);
        }else if (arg==5){
//            Toast.makeText(this, isPlaying+" Lebah", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.jambuair);
        }else if (arg==6){
//            Toast.makeText(this, isPlaying+" Singa", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.strawberry);
        }
        player.setLooping(false); // Set looping
        player.start();
    }
}
