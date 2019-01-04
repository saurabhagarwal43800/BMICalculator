package com.example.android.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        btn=(Button)findViewById(R.id.btn);


    }
    public void bmi(View view)
    {

        double height=Double.parseDouble(ed1.getText().toString());
        double weight=Double.parseDouble(ed2.getText().toString());
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("Height",height);
        intent.putExtra("Weight",weight);
        startActivity(intent);
    }
}
