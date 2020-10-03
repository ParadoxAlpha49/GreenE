package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 private EditText user_name;
 private Button log_in;
 private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name = findViewById(R.id.User_name);
        log_in = findViewById(R.id.Log_in);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stuser_name = user_name.getText().toString();
                Intent intent = new Intent(MainActivity.this, After_login_activity.class);
                intent.putExtra(  "Username", stuser_name);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencreataccount();
            }
        });

    }
    public void opencreataccount(){
        Intent intent = new Intent(this,CreatAccountactivity.class);
        startActivity(intent);
    }
}