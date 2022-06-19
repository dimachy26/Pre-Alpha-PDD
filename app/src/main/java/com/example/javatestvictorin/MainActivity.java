package com.example.javatestvictorin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout bil1 = findViewById(R.id.bil1);
        final LinearLayout bil2 = findViewById(R.id.bil2);
        final LinearLayout bil3 = findViewById(R.id.bil3);
        final LinearLayout bil4 = findViewById(R.id.bil4);
        final LinearLayout bil5 = findViewById(R.id.bil5);
        final LinearLayout bil6 = findViewById(R.id.bil6);
        final LinearLayout bil7 = findViewById(R.id.bil7);
        final LinearLayout bil8 = findViewById(R.id.bil8);
        final LinearLayout bil9 = findViewById(R.id.bil9);
        final LinearLayout bil10 = findViewById(R.id.bil10);

        final Button start = findViewById(R.id.startTest);

        bil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet1";
                bil1.setBackgroundResource(R.drawable.pressed_bilet);

                bil2.setBackgroundResource(R.drawable.round_back_blue);
                bil3.setBackgroundResource(R.drawable.round_back_blue);
                bil4.setBackgroundResource(R.drawable.round_back_blue);
                bil5.setBackgroundResource(R.drawable.round_back_blue);
                bil6.setBackgroundResource(R.drawable.round_back_blue);
                bil7.setBackgroundResource(R.drawable.round_back_blue);
                bil8.setBackgroundResource(R.drawable.round_back_blue);
                bil9.setBackgroundResource(R.drawable.round_back_blue);
                bil10.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        bil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet2";
                bil2.setBackgroundResource(R.drawable.pressed_bilet);

                bil1.setBackgroundResource(R.drawable.round_back_blue);
                bil3.setBackgroundResource(R.drawable.round_back_blue);
                bil4.setBackgroundResource(R.drawable.round_back_blue);
                bil5.setBackgroundResource(R.drawable.round_back_blue);
                bil6.setBackgroundResource(R.drawable.round_back_blue);
                bil7.setBackgroundResource(R.drawable.round_back_blue);
                bil8.setBackgroundResource(R.drawable.round_back_blue);
                bil9.setBackgroundResource(R.drawable.round_back_blue);
                bil10.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        bil3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet3";
                bil3.setBackgroundResource(R.drawable.pressed_bilet);

                bil1.setBackgroundResource(R.drawable.round_back_blue);
                bil2.setBackgroundResource(R.drawable.round_back_blue);
                bil4.setBackgroundResource(R.drawable.round_back_blue);
                bil5.setBackgroundResource(R.drawable.round_back_blue);
                bil6.setBackgroundResource(R.drawable.round_back_blue);
                bil7.setBackgroundResource(R.drawable.round_back_blue);
                bil8.setBackgroundResource(R.drawable.round_back_blue);
                bil9.setBackgroundResource(R.drawable.round_back_blue);
                bil10.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        bil4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet4";
                bil4.setBackgroundResource(R.drawable.pressed_bilet);

                bil1.setBackgroundResource(R.drawable.round_back_blue);
                bil2.setBackgroundResource(R.drawable.round_back_blue);
                bil3.setBackgroundResource(R.drawable.round_back_blue);
                bil5.setBackgroundResource(R.drawable.round_back_blue);
                bil6.setBackgroundResource(R.drawable.round_back_blue);
                bil7.setBackgroundResource(R.drawable.round_back_blue);
                bil8.setBackgroundResource(R.drawable.round_back_blue);
                bil9.setBackgroundResource(R.drawable.round_back_blue);
                bil10.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        bil5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet5";
                bil5.setBackgroundResource(R.drawable.pressed_bilet);

                bil1.setBackgroundResource(R.drawable.round_back_blue);
                bil2.setBackgroundResource(R.drawable.round_back_blue);
                bil4.setBackgroundResource(R.drawable.round_back_blue);
                bil3.setBackgroundResource(R.drawable.round_back_blue);
                bil6.setBackgroundResource(R.drawable.round_back_blue);
                bil7.setBackgroundResource(R.drawable.round_back_blue);
                bil8.setBackgroundResource(R.drawable.round_back_blue);
                bil9.setBackgroundResource(R.drawable.round_back_blue);
                bil10.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        bil6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet6";
                bil6.setBackgroundResource(R.drawable.pressed_bilet);

                bil1.setBackgroundResource(R.drawable.round_back_blue);
                bil2.setBackgroundResource(R.drawable.round_back_blue);
                bil4.setBackgroundResource(R.drawable.round_back_blue);
                bil5.setBackgroundResource(R.drawable.round_back_blue);
                bil3.setBackgroundResource(R.drawable.round_back_blue);
                bil7.setBackgroundResource(R.drawable.round_back_blue);
                bil8.setBackgroundResource(R.drawable.round_back_blue);
                bil9.setBackgroundResource(R.drawable.round_back_blue);
                bil10.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        bil7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet7";
                bil7.setBackgroundResource(R.drawable.pressed_bilet);

                bil1.setBackgroundResource(R.drawable.round_back_blue);
                bil2.setBackgroundResource(R.drawable.round_back_blue);
                bil4.setBackgroundResource(R.drawable.round_back_blue);
                bil5.setBackgroundResource(R.drawable.round_back_blue);
                bil6.setBackgroundResource(R.drawable.round_back_blue);
                bil3.setBackgroundResource(R.drawable.round_back_blue);
                bil8.setBackgroundResource(R.drawable.round_back_blue);
                bil9.setBackgroundResource(R.drawable.round_back_blue);
                bil10.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        bil8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet8";
                bil8.setBackgroundResource(R.drawable.pressed_bilet);

                bil1.setBackgroundResource(R.drawable.round_back_blue);
                bil2.setBackgroundResource(R.drawable.round_back_blue);
                bil4.setBackgroundResource(R.drawable.round_back_blue);
                bil5.setBackgroundResource(R.drawable.round_back_blue);
                bil6.setBackgroundResource(R.drawable.round_back_blue);
                bil7.setBackgroundResource(R.drawable.round_back_blue);
                bil3.setBackgroundResource(R.drawable.round_back_blue);
                bil9.setBackgroundResource(R.drawable.round_back_blue);
                bil10.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        bil9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet9";
                bil9.setBackgroundResource(R.drawable.pressed_bilet);

                bil1.setBackgroundResource(R.drawable.round_back_blue);
                bil2.setBackgroundResource(R.drawable.round_back_blue);
                bil4.setBackgroundResource(R.drawable.round_back_blue);
                bil5.setBackgroundResource(R.drawable.round_back_blue);
                bil6.setBackgroundResource(R.drawable.round_back_blue);
                bil7.setBackgroundResource(R.drawable.round_back_blue);
                bil8.setBackgroundResource(R.drawable.round_back_blue);
                bil3.setBackgroundResource(R.drawable.round_back_blue);
                bil10.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        bil10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "bilet10";
                bil10.setBackgroundResource(R.drawable.pressed_bilet);

                bil1.setBackgroundResource(R.drawable.round_back_blue);
                bil2.setBackgroundResource(R.drawable.round_back_blue);
                bil4.setBackgroundResource(R.drawable.round_back_blue);
                bil5.setBackgroundResource(R.drawable.round_back_blue);
                bil6.setBackgroundResource(R.drawable.round_back_blue);
                bil7.setBackgroundResource(R.drawable.round_back_blue);
                bil8.setBackgroundResource(R.drawable.round_back_blue);
                bil9.setBackgroundResource(R.drawable.round_back_blue);
                bil3.setBackgroundResource(R.drawable.round_back_blue);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopic.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Выберите номер билета", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, Bilet1Activity.class);
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                    finish();

                }

            }
        });
    }
}