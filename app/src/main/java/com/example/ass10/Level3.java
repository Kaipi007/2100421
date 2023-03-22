package com.example.ass10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Level3 extends AppCompatActivity {

    Button start_L3;
    TextView text_L3;
    private boolean l3clicked1 , l3clicked2, l3clicked3 = false;

    private static final int[] bttn_L3 ={R.id.l3button1, R.id.l3button2,R.id.l3button3, R.id.l3button4,
            R.id.l3button5, R.id.l3button6,R.id.l3button7, R.id.l3button8,R.id.l3button9,
            R.id.l3button10, R.id.l3button11,R.id.l3button12, R.id.l3button13,
            R.id.l3button14, R.id.l3button15,R.id.l3button16};

    private Button[] button_L3 = new Button[bttn_L3.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        for (int i = 0; i<bttn_L3.length; i++) {
            button_L3[i] = (Button)findViewById(bttn_L3[i]);
        }

        start_L3 = findViewById(R.id.start_btn3);
        text_L3 = findViewById(R.id.l3textView1);

        Random random = new Random();
        int min =0;
        int max =15;
        int val = min + (int)(Math.random() * (max - min + 1));
        int val2 = min + (int)(Math.random() * (max - min + 1));
        int val3 = min + (int)(Math.random() * (max - min + 1));

        text_L3.setText("Please click Button" +Integer.toString(val+1)
                +" and Button"+Integer.toString(val2+1)
                +" and Button"+Integer.toString(val3+1));

        button_L3[val].setBackgroundColor(Color.BLACK);
        button_L3[val2].setBackgroundColor(Color.BLACK);
        button_L3[val3].setBackgroundColor(Color.BLACK);

        button_L3[val].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l3clicked1 = true;
                button_L3[val].setBackgroundColor(Color.GREEN);
            }

        });

        button_L3[val2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l3clicked2 = true;
                button_L3[val2].setBackgroundColor(Color.GREEN);

            }

        });

        button_L3[val3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l3clicked3 = true;
                button_L3[val3].setBackgroundColor(Color.GREEN);

                    Intent intent = new Intent(Level3.this, Level4.class);
                    startActivity(intent);
                }




        });




    }



}






