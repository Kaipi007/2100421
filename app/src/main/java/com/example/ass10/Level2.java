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

public class Level2 extends AppCompatActivity {

    Button start_L2;
    TextView text_L2, textViewCountDown2, score_L2;


    private boolean clicked1 , clicked2 = false;
    private static final int[] bttn_L2 ={R.id.l2button1, R.id.l2button2,R.id.l2button3, R.id.l2button4,
            R.id.l2button5, R.id.l2button6,R.id.l2button7, R.id.l2button8,R.id.l2button9};
    private Button[] button_L2 = new Button[bttn_L2.length];

    //declaration for timer
    private static final long COUNTDOWN_IN_MILLIS = 5000;
    private ColorStateList textColorDefaultCd;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        //score_L2.setText(Level1.myVariable);

        for (int i = 0; i<bttn_L2.length; i++) {
            button_L2[i] = findViewById(bttn_L2[i]);
        }
        start_L2 = findViewById(R.id.start_btn2);
        text_L2 = findViewById(R.id.l2textView1);
        score_L2 = findViewById(R.id.scorel2);

        final TextView score_L1 = findViewById(R.id.scorel2);
        textViewCountDown2 = findViewById(R.id.textViewCountDown2);

        //declare for timer
        textColorDefaultCd = textViewCountDown2.getTextColors();
        timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        startCountDown();

        Random random = new Random();
        int min =0;
        int max =8;
        int val = min + (int)(Math.random() * (max - min + 1));
        int val2 = min + (int)(Math.random() * (max - min + 1));
        text_L2.setText("Please click Button" +Integer.toString(val+1) +" and Button"+Integer.toString(val2+1));

        button_L2[val].setBackgroundColor(Color.BLACK);
        button_L2[val2].setBackgroundColor(Color.BLACK);

        //get score from main
        Intent intent = getIntent();
        int passed = intent.getIntExtra("Score",1);
        score_L2.setText("Score : " + passed);

        button_L2[val].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button_L2[val].setBackgroundColor(Color.GREEN);
                clicked1 = true;
                score_L2.setText("Score : " + (passed +1));

            }

        });

        button_L2[val2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L2[val2].setBackgroundColor(Color.GREEN);
                clicked2=true;
                if( clicked1 == true ){
                    text_L2.setText("Good Job!!");
                    //score_L2.setText("Score : " + (passed +2));

                    Intent intent = new Intent(Level2.this, Level3.class);
                    startActivity(intent);
                    countDownTimer.cancel();

                }

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

        textViewCountDown2.setText(timeFormatted);
        if (timeLeftInMillis <10000){
            textViewCountDown2.setTextColor(Color.RED);
        }
    }

}
