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

import java.util.Random;

public class Level4 extends AppCompatActivity {

    Button start_L4;
    TextView text_L4;


    private static final int[] bttn_L4 ={R.id.l4button1, R.id.l4button2,R.id.l4button3, R.id.l4button4,
            R.id.l4button5, R.id.l4button6,R.id.l4button7, R.id.l4button8,R.id.l4button9,
            R.id.l4button10, R.id.l4button11,R.id.l4button12, R.id.l4button13,
            R.id.l4button14, R.id.l4button15,R.id.l4button16,
            R.id.l4button17, R.id.l4button18,R.id.l4button19, R.id.l4button20,
            R.id.l4button21, R.id.l4button22,R.id.l4button23, R.id.l4button24,R.id.l4button25};

    private Button[] button_L4 = new Button[bttn_L4.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
        for (int i = 0; i<bttn_L4.length; i++) {
            button_L4[i] = (Button)findViewById(bttn_L4[i]);
        }

        start_L4 = findViewById(R.id.start_btn4);
        text_L4 = findViewById(R.id.l4textView1);

        Random random = new Random();
        int min =0;
        int max =24;

        int val = min + (int)(Math.random() * (max - min + 1));
        int val2 = min + (int)(Math.random() * (max - min + 1));
        int val3 = min + (int)(Math.random() * (max - min + 1));
        int val4 = min + (int)(Math.random() * (max - min + 1));

        text_L4.setText("Please click Button" +Integer.toString(val+1)
                +" and Button"+Integer.toString(val2+1)
                +" and Button"+Integer.toString(val3+1)
                +" and Button"+Integer.toString(val4+1));

        button_L4[val].setBackgroundColor(Color.BLACK);
        button_L4[val2].setBackgroundColor(Color.BLACK);
        button_L4[val3].setBackgroundColor(Color.BLACK);
        button_L4[val4].setBackgroundColor(Color.BLACK);

        button_L4[val].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L4[val].setBackgroundColor(Color.GREEN);
            }

        });

        button_L4[val2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L4[val2].setBackgroundColor(Color.GREEN);
            }

        });

        button_L4[val3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L4[val3].setBackgroundColor(Color.GREEN);
            }

        });

        button_L4[val4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L4[val4].setBackgroundColor(Color.GREEN);
                Intent intent = new Intent(Level4.this, Level5.class);
                startActivity(intent);

            }
        });



    }

}







