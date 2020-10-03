package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterGreenEzone extends AppCompatActivity {
    private Button bangladesh;
    private Button india;
    private Button usa;
    private Button uk;
    private Button nepal;
    private Button canada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_green_ezone);
        bangladesh = (Button) findViewById(R.id.bangladesh);
        bangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbangladesh();
            }
        });
        india = (Button) findViewById(R.id.india);
        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openindia();
            }
        });

        usa = (Button) findViewById(R.id.usa);
        usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openusa();
            }
        });
        uk = (Button) findViewById(R.id.uk);
        uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openuk();
            }
        });
        nepal = (Button) findViewById(R.id.nepal);
        nepal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennepal();
            }
        });
        canada = (Button) findViewById(R.id.canada);
        canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencanada();
            }
        });
    }
    public void openbangladesh(){
        Intent intent = new Intent(this, Bangladesh.class);
        startActivity(intent);
    }
    public void openindia(){
        Intent intent = new Intent (this, india.class);
        startActivity(intent);
    }
    public void openusa(){
        Intent intent = new Intent(this,usa.class);
        startActivity(intent);
    }
    public void openuk(){
        Intent intent = new Intent(this,uk.class);
        startActivity(intent);
    }
    public void opennepal(){
        Intent intent = new Intent(this,nepal.class);
        startActivity(intent);
    }
    public void opencanada(){
        Intent intent = new Intent(this,canada.class);
        startActivity(intent);
    }
}