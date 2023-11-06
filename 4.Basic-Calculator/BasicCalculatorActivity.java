package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.ImageView;

public class BasicCalculatorActivity extends AppCompatActivity {

    private EditText num1, num2;
    private EditText result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);

        ImageView back = findViewById(R.id.arrowIcon);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicCalculatorActivity.this, HomeActivity.class);
                startActivity(intent);

            }
        });

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
    }

    public void calculator(View view) {
        int n1 = (int) Double.parseDouble(num1.getText().toString());
        int n2 = (int) Double.parseDouble(num2.getText().toString());
        int results = 0;

        if (view.getId() == R.id.add) {
            results = n1 + n2;
        } else if (view.getId() == R.id.sub) {
            results = n1 - n2;
        } else if (view.getId() == R.id.mul) {
            results = n1 * n2;
        } else if (view.getId() == R.id.div) {
            if (n2 != 0) {
                results = n1 / n2;
            } else {
                result.setText("Error: Division by zero");
                return;
            }
        }
        result.setText("" + results);
    }
}