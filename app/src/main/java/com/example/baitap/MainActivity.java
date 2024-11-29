package com.example.baitap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

import com.example.baitap.FeatureActivity;
import com.example.baitap.R;

public class MainActivity extends AppCompatActivity {

    private Button btnBuy, btnSell, btnOk;
    private CheckBox checkRemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnOk = findViewById(R.id.btnOk);


        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FeatureActivity.class);
                startActivity(intent);
            }
        });
    }
}
