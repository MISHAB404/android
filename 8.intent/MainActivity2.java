package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        Bundle Extra=getIntent().getExtras();
        String name=Extra.getString("name");
        String domain=Extra.getString("domain");
        String course=Extra.getString("course");
        textView.setText(name+"\n"+domain+"\n"+course);
    }
}