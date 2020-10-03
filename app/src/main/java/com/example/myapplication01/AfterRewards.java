package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterRewards extends AppCompatActivity {
    private Button button;
    private Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_rewards);
        button = (Button)findViewById(R.id.menu_bar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmenu();
            }
        });
        button01 = (Button)findViewById(R.id.profile);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openprofile();
            }
        });
    }
    public void openmenu(){
        Intent intent = new Intent(this, Menu_Bar_Activity.class);
        startActivity(intent);
    }
    public void openprofile() {
        Intent intent = new Intent(this, AfterProfileActivity.class);
        startActivity(intent);
    }
}