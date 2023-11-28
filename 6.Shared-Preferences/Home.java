package com.example.sharedpreferences;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initUI();

        SharedPreferences sharedPref=getSharedPreferences("My_Pref",MODE_PRIVATE);
        tv1.setText(sharedPref.getString("FName",""));
        tv2.setText(sharedPref.getString("LName",""));
        tv3.setText(sharedPref.getString("Gender",""));

    }

    private void initUI() {
        tv1=findViewById(R.id.fname);
        tv2=findViewById(R.id.lname);
        tv3=findViewById(R.id.gender);
    }
}