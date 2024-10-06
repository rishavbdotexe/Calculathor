package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.math.BigDecimal;


public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private Button add,subtract,multiply,divide;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        answer = findViewById(R.id.answer);
        //to addbutoon
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val1 = n1.getText().toString();
                String val2 = n2.getText().toString();
                if (val1.isEmpty() )
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 1st Box", Toast.LENGTH_SHORT).show();
                } 
                else if (val2.isEmpty()) 
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 2nd Box", Toast.LENGTH_SHORT).show();   
                } else if (val1.isEmpty() && val2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 1st and 2nd Box", Toast.LENGTH_SHORT).show();
                } else
                {

double result = Double.parseDouble(val1)  + Double.parseDouble(val2);
                    answer.setText("Answer : " + result);
                }
            }
        });
        //subtract button
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val1 = n1.getText().toString();
                String val2 = n2.getText().toString();
                if (val1.isEmpty() )
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 1st Box", Toast.LENGTH_SHORT).show();
                }
                else if (val2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 2nd Box", Toast.LENGTH_SHORT).show();
                } else if (val1.isEmpty() && val2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 1st and 2nd Box", Toast.LENGTH_SHORT).show();
                } else
                {
                    double result = Double.parseDouble(val1)  - Double.parseDouble(val2);
                    answer.setText("Answer : " + result);
                }
            }
        });
        //to multiply
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val1 = n1.getText().toString();
                String val2 = n2.getText().toString();
                if (val1.isEmpty() )
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 1st Box", Toast.LENGTH_SHORT).show();
                }
                else if (val2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 2nd Box", Toast.LENGTH_SHORT).show();
                } else if (val1.isEmpty() && val2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 1st and 2nd Box", Toast.LENGTH_SHORT).show();
                } else
                {
                    double result = Double.parseDouble(val1)  * Double.parseDouble(val2);
                    answer.setText("Answer : " + result);
                }
            }
        });
        //to divide
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val1 = n1.getText().toString();
                String val2 = n2.getText().toString();
                if  (val1.isEmpty() && val2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 1st and 2nd Box", Toast.LENGTH_SHORT).show();
                }
                else if (val2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 2nd Box", Toast.LENGTH_SHORT).show();
                } else if (val1.isEmpty() )
                {
                    Toast.makeText(MainActivity.this, "Enter Value in 1st Box", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double result = Double.parseDouble(val1)  / Double.parseDouble(val2);
                    answer.setText("Answer : " + result);
                }
            }
        });
            // I HOPE IT RUNS : ( OR : )


        Toast.makeText(this, "Welcome to Calculathor", Toast.LENGTH_SHORT).show();
    }
}