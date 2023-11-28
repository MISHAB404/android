package com.example.imgtoggle;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int image[]={R.mipmap.img1,R.mipmap.img2};
    int currentindex=0;
    Button btn;
    ImageView imv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        imv=findViewById(R.id.imageView);

    }


    public void click(View view) {
        currentindex();
    }

    private void currentindex() {
        switch(currentindex){
            case 0:imv.setImageResource(image[1]);
                currentindex=1;
                break;
            case 1:imv.setImageResource(image[0]);
                currentindex=0;
                break;

        }
    }
}