package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button cal, next;
EditText w, h;
TextView res,res2;

float weight, height, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal=findViewById(R.id.cal);
        next = findViewById(R.id.Calcu);
        w = findViewById(R.id.weight);
        h = findViewById(R.id.height);
        res = findViewById(R.id.result);
        res2 = findViewById(R.id.result2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cal = new Intent(getApplicationContext(), Calculator.class);
                startActivity(cal);
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                weight = Float.parseFloat(w.getText().toString());
                height = Float.parseFloat(h.getText().toString());

                result = weight/(height*height);

                res.setText(String.valueOf(result));

                if (result >= 27.5){
                    res2.setText("Obese");
                }

                else if (result<18.5) {
                    res2.setText("Under Weight");
                }

                else if (result>=23 && result<27.5){
                    res2.setText("Pre-Obese");
                }

                else {
                    res2.setText("Normal");
                }

            }
        });

    }
}