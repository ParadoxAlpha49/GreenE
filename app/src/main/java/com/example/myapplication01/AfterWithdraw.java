package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterWithdraw extends AppCompatActivity {
    private Button button;
    private Button button01;
    private Button button02;
    private Button button03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_withdraw);
        button = (Button) findViewById(R.id.bkash);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAfterclickingBkash();
            }
        });
        button01 = (Button) findViewById(R.id.payPal);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAfterclickingpaypal();
            }
        });
        button02 = (Button) findViewById(R.id.neteller);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAfterclickingneteller();
            }
        });
        button03 = (Button) findViewById(R.id.skrill);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAfterclickingsktill();
            }
        });
    }
    public void openAfterclickingBkash(){
        Intent intent = new Intent(this,AfterclickingBkash.class);
        startActivity(intent);

    }
    public void openAfterclickingpaypal(){
        Intent intent = new Intent(this,AfterclickingBkash.class);
        startActivity(intent);
    }
    public void openAfterclickingneteller(){
        Intent intent = new Intent(this,AfterclickingBkash.class);
        startActivity(intent);
    }
    public void openAfterclickingsktill(){
        Intent intent = new Intent(this,AfterclickingBkash.class);
        startActivity(intent);
    }
}