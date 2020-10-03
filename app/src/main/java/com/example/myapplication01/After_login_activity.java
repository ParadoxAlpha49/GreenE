package com.example.myapplication01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class After_login_activity extends AppCompatActivity implements View.OnClickListener {
    public static TextView resultTextView;
    Button scanTheCode;
    private TextView txtWelcome;
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login_activity);
        String struser_name = getIntent().getStringExtra("Username");
        txtWelcome = findViewById(R.id.welcome);
        txtWelcome.setText("Welcome " + struser_name);
        resultTextView = (TextView)findViewById(R.id.results);
        scanTheCode = findViewById(R.id.scan_the_code);
        scanTheCode.setOnClickListener(this);
        button = (Button) findViewById(R.id.menu_bar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu_Bar_Activity();
            }
        });
        button1 =(Button) findViewById(R.id.profile);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAfterProfileActivity();
            }
        });
    }

    @Override
    public void onClick(View view) {
        scanTheCode();

    }
    private void scanTheCode(){
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setCaptureActivity(After_Scan_Activity.class);
        integrator.setOrientationLocked(false);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrator.setPrompt("Scanning");
        integrator.initiateScan();

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode , data);
        if (result != null){
            if (result.getContents() != null){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(result.getContents());
                builder.setTitle("Scanning Result");
                builder.setPositiveButton("Scan Again Please", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        scanTheCode();
                    }
                }).setNegativeButton("Finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
            else {
                Toast.makeText(this, "No Results", Toast.LENGTH_LONG).show();
            }
        }else {
            super.onActivityResult(requestCode,resultCode,data);
        }
    }
    public void openMenu_Bar_Activity(){
        Intent intent = new Intent(this, Menu_Bar_Activity.class);
        startActivity(intent);
    }
    public void openAfterProfileActivity(){
        Intent intent = new Intent(this, AfterProfileActivity.class);
        startActivity(intent);
    }
}