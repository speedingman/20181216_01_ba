package com.example.zeros.a20181216_01_ba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout koreafoodBtn;
    LinearLayout busikfoodBtn;
    LinearLayout jpfoodBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         bindViews();
         setValues();

         setupEvents();

        }

        void setValues(){

        }

    void setupEvents(){
        koreafoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RestarantListActivity.class);

                startActivity(intent);


            }


        });
        busikfoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RestarantListActivity.class);
                startActivity(intent);

            }
        });

        jpfoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RestarantListActivity.class);
                startActivity(intent);

            }
        });

    }

    void bindViews(){
        koreafoodBtn = findViewById(R.id.koreafoodBtn);
        busikfoodBtn = findViewById(R.id.busikfoodBtn);
        jpfoodBtn = findViewById(R.id.jpfoodBtn);

    }
}
