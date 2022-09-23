package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int num;
    private TextView output;
    private Button plus;
    private Button minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num + 1 == 0) {
                    num++;
                    output.setText(String.valueOf(num));
                    output.setTextColor(Color.rgb(45, 94, 216));
                } else {
                    num++;
                    output.setText(String.valueOf(num));
                    output.setTextColor(Color.rgb(76, 175, 80));
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num - 1 == 0) {
                    num--;
                    output.setText(String.valueOf(num));
                    output.setTextColor(Color.rgb(45, 94, 216));
                } else {
                    num--;
                    output.setText(String.valueOf(num));
                    output.setTextColor(Color.rgb(244, 67, 54));
                }

            }
        });
        output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = 0;
                output.setText(String.valueOf(num));
                output.setTextColor(Color.rgb(45, 94, 216));
            }
        });
    }

    private void init() {
        num = 0;
        output = findViewById(R.id.num);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
    }
}