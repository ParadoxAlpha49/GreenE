package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AfterProfileActivity extends AppCompatActivity {
    private Button button;
    private Button button01;
    private Button dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_profile);
        button = (Button) findViewById(R.id.rewards);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAfterRewards();
            }
        });
        button01 = (Button) findViewById(R.id.withdraw);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAfterWithdraw();
            }
        });
        dashboard = (Button)findViewById(R.id.dashboard);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendashboard();
            }
        });
    }
    public void openAfterRewards(){
        Intent intent = new Intent(this,AfterRewards.class);
        startActivity(intent);
    }
    public void openAfterWithdraw(){
        Intent intent = new Intent(this, AfterWithdraw.class);
        startActivity(intent);
    }
    public void opendashboard(){
        Intent intent = new Intent(this,afterprofiledashboard.class);
        startActivity(intent);
    }
}