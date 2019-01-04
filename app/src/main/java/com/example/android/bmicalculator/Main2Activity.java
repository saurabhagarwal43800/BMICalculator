package com.example.android.bmicalculator;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;

public class Main2Activity extends AppCompatActivity {
    TextView txt2, txt3;
    private final int ORANGE = 0xFFFF3300;
    private final int MAGENTA=0xFF9b2d39;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        //Intent intent1 = getIntent();
        // String height = intent.getStringExtra("message");
        //String weight = intent.getStringExtra("message");
        double h = getIntent().getDoubleExtra("Height",0);
        double w = getIntent().getDoubleExtra("Weight",0);
        double bmi = w / (h * h);
        //String bmis=Double.toString(bmi);
        txt2.setText("" + bmi);
        while (bmi > 0) {
            if (bmi < 18.5) {
                txt3.setText(R.string.underweight);
                txt3.setTextColor(Color.YELLOW);
                break;

            } else if (bmi >= 18.5 && bmi <= 24.9) {
                txt3.setText("normal weight");
                txt3.setTextColor(Color.GREEN);
                break;
            } else if (bmi >= 25 && bmi <= 29.9) {
                txt3.setText("overweight");
                txt3.setTextColor(ORANGE);
                break;
            } else if (bmi >= 30 && bmi <= 34.9) {
                txt3.setText("class 1 obese");
                txt3.setTextColor(Color.RED);
                break;
            } else if (bmi >= 35 && bmi <= 39.9) {
                txt3.setText("class 2 obese");
                txt3.setTextColor(Color.BLUE);
                break;
            } else if (bmi >= 40) {
                txt3.setText("class 3 obese");
                txt3.setTextColor(MAGENTA);
                break;
            }
        }
    }
}
