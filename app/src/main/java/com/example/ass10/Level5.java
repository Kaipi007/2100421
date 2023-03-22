package com.example.ass10;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Level5 extends AppCompatActivity {


    private static final int[] bttn_L5 ={R.id.l5button1, R.id.l5button2,R.id.l5button3, R.id.l5button4,
            R.id.l5button5, R.id.l5button6,R.id.l5button7, R.id.l5button8,R.id.l5button9,
            R.id.l5button10, R.id.l5button11,R.id.l5button12, R.id.l5button13,
            R.id.l5button14, R.id.l5button15,R.id.l5button16,
            R.id.l5button17, R.id.l5button18,R.id.l5button19, R.id.l5button20,
            R.id.l5button21, R.id.l5button22,R.id.l5button23, R.id.l5button24,R.id.l5button25,
            R.id.l5button26, R.id.l5button27,R.id.l5button28, R.id.l5button29,
            R.id.l5button30, R.id.l5button31,R.id.l5button32, R.id.l5button33,R.id.l5button34,
            R.id.l5button35,R.id.l5button36};

    private Button[] button_L5 = new Button[bttn_L5.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);

        for (int i = 0; i<bttn_L5.length; i++) {
            button_L5[i] = (Button)findViewById(bttn_L5[i]);
        }
        Random random = new Random();
        int min =0;
        int max =35;

        int val = min + (int)(Math.random() * (max - min + 1));
        int val2 = min + (int)(Math.random() * (max - min + 1));
        int val3 = min + (int)(Math.random() * (max - min + 1));
        int val4 = min + (int)(Math.random() * (max - min + 1));
        int val5 = min + (int)(Math.random() * (max - min + 1));

        button_L5[val].setBackgroundColor(Color.BLACK);
        button_L5[val2].setBackgroundColor(Color.BLACK);
        button_L5[val3].setBackgroundColor(Color.BLACK);
        button_L5[val4].setBackgroundColor(Color.BLACK);
        button_L5[val5].setBackgroundColor(Color.BLACK);

        button_L5[val].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L5[val].setBackgroundColor(Color.GREEN);

            }

        });

        button_L5[val2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L5[val2].setBackgroundColor(Color.GREEN);

            }

        });

        button_L5[val3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L5[val3].setBackgroundColor(Color.GREEN);
            }

        });

        button_L5[val4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L5[val4].setBackgroundColor(Color.GREEN);
            }
        });

        button_L5[val5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_L5[val5].setBackgroundColor(Color.GREEN);
            }
        });


    }

}


