package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    Button b1, b2, b3, b4, Back;
    TextView res;
    EditText N1, N2;

    double result;
    int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        b1=findViewById(R.id.add);
        b2=findViewById(R.id.min);
        b3=findViewById(R.id.mul);
        b4=findViewById(R.id.div);
        Back=findViewById(R.id.back);

        res=findViewById(R.id.res);

        N1=findViewById(R.id.Number1);
        N2=findViewById(R.id.Number2);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Back = new Intent(Calculator.this, MainActivity.class);
                startActivity(Back);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=Integer.parseInt(N1.getText().toString());
                n2=Integer.parseInt(N2.getText().toString());

                result = n1 + n2;

                res.setText(String.valueOf(result));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=Integer.parseInt(N1.getText().toString());
                n2=Integer.parseInt(N2.getText().toString());

                result = n1 - n2;

                res.setText(String.valueOf(result));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=Integer.parseInt(N1.getText().toString());
                n2=Integer.parseInt(N2.getText().toString());

                result = n1 * n2;

                res.setText(String.valueOf(result));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=Integer.parseInt(N1.getText().toString());
                n2=Integer.parseInt(N2.getText().toString());

                result = n1 / n2;

                res.setText(String.valueOf(result));
            }
        });

    }
}