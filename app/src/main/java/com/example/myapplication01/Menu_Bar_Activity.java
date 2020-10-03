package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;

public class Menu_Bar_Activity extends AppCompatActivity {
    private Button button;
    private Button button01;
    private Button button03;
    private Button button04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__bar_);
        button =(Button) findViewById(R.id.location);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openafterLocation();
            }
        });
        button01 = (Button) findViewById(R.id.greenE_Zone);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAftergreenEzone();
            }
        });
        button03 = (Button)findViewById(R.id.about_us);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openafteraboutus();
            }
        });
        button04 = (Button)findViewById(R.id.information_cell);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openafterinfo();
            }
        });
    }
    public void openafterLocation(){
        Intent intent = new Intent(this, afterLocation.class);
        startActivity(intent);
    }
    public void openAftergreenEzone(){
        Intent intent = new Intent(this, AfterGreenEzone.class);
        startActivity(intent);
    }
    public void openafteraboutus(){
        Intent intent = new Intent(this,About_us_Activity.class);
        startActivity(intent);
    }
    public void openafterinfo(){
        Intent intent = new Intent(this,afterinformationcellActivity.class);
        startActivity(intent);
    }
}