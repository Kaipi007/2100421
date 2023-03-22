package com.example.ass10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class Level1 extends AppCompatActivity {

    Button end;
    TextView text, textViewCountDown, score_L1;


    //private Integer myVariable = 0;
    private static final int[] bttn ={R.id.button1, R.id.button2,R.id.button3, R.id.button4};
    private Button[] button = new Button[bttn.length];

    //declaration for timer
    private static final long COUNTDOWN_IN_MILLIS = 5000;
    private ColorStateList textColorDefaultCd;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        for (int i = 0; i<bttn.length; i++) {
            button[i] = (Button)findViewById(bttn[i]);
        }
        end = findViewById(R.id.end_btn);
        text = findViewById(R.id.textView1);
        final TextView score_L1 = findViewById(R.id.score1);
        textViewCountDown = findViewById(R.id.textViewCountDown);

        //declare for timer
        textColorDefaultCd = textViewCountDown.getTextColors();
        timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        startCountDown();

        //random generate numbers to be clicked by users
        Random random = new Random();
        int min =0;
        int max =8;
        int val = min + (int)(Math.random() * (max - min + 1));


        //set the end button
//        end.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        //display what users should click
        text.setText("Please click Button" +Integer.toString(val+1) );
        //set the button to be clicked to black
        button[val].setBackgroundColor(Color.BLACK);


        button[val].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button[val].setBackgroundColor(Color.GREEN);

                Intent intent = new Intent(Level1.this, Level2.class);
                startActivity(intent);
                countDownTimer.cancel();
            }

        });


    }

    private void startCountDown() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();

            }
            @Override
            public void onFinish() {
                timeLeftInMillis =0;
                updateCountDownText();
            }
        }.start();
    }
    private void updateCountDownText() {
        int minutes = (int)(timeLeftInMillis /1000);
        int seconds = (int) (timeLeftInMillis/1000)%60;

        String timeFormatted = String.format (Locale.getDefault(),"%02d:%02d", minutes,seconds);

        textViewCountDown.setText(timeFormatted);
        if (timeLeftInMillis <10000){
            textViewCountDown.setTextColor(Color.RED);
        }
    }

}
