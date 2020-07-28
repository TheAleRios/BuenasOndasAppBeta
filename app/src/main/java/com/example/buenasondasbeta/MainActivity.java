package com.example.buenasondasbeta;


import android.os.Build;
import android.os.Bundle;



import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //boton 1
        final Button vibrate_btn = findViewById(R.id.bt_vibrate);
        final long[] pattern = {200, 300};

        //boton 2
        final Button vibrate_btn2 = findViewById(R.id.bt_vibrate2);
        final long[] pattern2 = {200, 400};
        final int[] amplitude2 = {0,100};

        //botton 3
        final Button vibrate_btn3 = findViewById(R.id.bt_vibrate3);
        final long[] pattern3 = {200, 500};

        //botton 4
        final Button vibrate_btn4 = findViewById(R.id.bt_vibrate4);
        final long[] pattern4 = {200, 600};

        //botton 5
        final Button vibrate_btn5 = findViewById(R.id.bt_vibrate5);
        final long[] pattern5 = {200, 700};

        //botton 6
        final Button vibrate_btn6 = findViewById(R.id.bt_vibrate6);
        final long[] pattern6 = {200, 800};

        //botton 7
        final Button vibrate_btn7 = findViewById(R.id.bt_vibrate7);
        final long[] pattern7 = {200, 900};

        //botton 8
        final Button vibrate_btn8 = findViewById(R.id.bt_vibrate8);
        final long[] pattern8 = {200, 1000};
        final int[] amplitud8 = {0,50};

        //botton 9
        final Button vibrate_btn9 = findViewById(R.id.bt_vibrate9);
        final long[] pattern9 = {200, 1100};
        final int[] amplitud9 = {0,50};

        //vibracion y animacion
        final Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);

        vibrate_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){



                vibrator.vibrate(pattern2, -1);
                vibrate_btn.startAnimation(animation);
            }
        });

        vibrate_btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                vibrator.vibrate(pattern2, -1);
                vibrate_btn2.startAnimation(animation);
            }
        });

        vibrate_btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(pattern3, -1);
                vibrate_btn3.startAnimation(animation);
            }
        });

        vibrate_btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(pattern4, -1);
                vibrate_btn4.startAnimation(animation);
            }
        });

        vibrate_btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(pattern5, -1);
                vibrate_btn5.startAnimation(animation);
            }
        });

        vibrate_btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(pattern6, -1);
                vibrate_btn6.startAnimation(animation);
            }
        });

        vibrate_btn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                vibrator.vibrate(pattern7, -1);
                vibrate_btn7.startAnimation(animation);
            }
        });

        vibrate_btn8.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                vibrator.vibrate(pattern8, -1);
                vibrate_btn8.startAnimation(animation);
            }
        });


        vibrate_btn9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                vibrator.vibrate(pattern9, -1);
                vibrate_btn9.startAnimation(animation);
            }
        });






    }


    public void tapToAnimate(View view) {
        Button button = (Button)findViewById(R.id.bt_vibrate2);
        final Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        final long[] pattern = {4000, 2600};

        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        button.startAnimation(animation);


    }

    public long[] genVibratorPattern( float intensity, long duration )
    {
        float dutyCycle = Math.abs( ( intensity * 2.0f ) - 1.0f );
        long hWidth = (long) ( dutyCycle * ( duration - 1 ) ) + 1;
        long lWidth = dutyCycle == 1.0f ? 0 : 1;

        int pulseCount = (int) ( 2.0f * ( (float) duration / (float) ( hWidth + lWidth ) ) );
        long[] pattern = new long[ pulseCount ];

        for( int i = 0; i < pulseCount; i++ )
        {
            pattern[i] = intensity < 0.5f ? ( i % 2 == 0 ? hWidth : lWidth ) : ( i % 2 == 0 ? lWidth : hWidth );
        }

        return pattern;
    }




}