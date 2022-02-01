package com.example.qrscanner;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnScan;
    public static TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnScan = findViewById(R.id.btn_scan);
        textView = findViewById(R.id.text_view);

        btnScan.setOnClickListener(view -> {

            startActivity(new Intent(getApplicationContext(), ScanActivity.class));

        });

    }
}