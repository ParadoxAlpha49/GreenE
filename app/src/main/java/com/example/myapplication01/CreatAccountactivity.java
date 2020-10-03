package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreatAccountactivity extends AppCompatActivity {
    private Button button;
    private Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_accountactivity);
        button =(Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmainActivity();
            }
        });
        button01 = (Button) findViewById(R.id.button5);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity01();
            }
        });

    }
    public void openmainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openMainActivity01(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}