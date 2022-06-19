package com.example.javatestvictorin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.javatestvictorin.R.id;

public class ResultsQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_q);

        final AppCompatButton anotherQBtn = findViewById(id.anotherQ);
        final TextView results = findViewById(R.id.results);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);


        results.setText(String.valueOf(getCorrectAnswers) + "/" + "8");

        anotherQBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsQ.this, MainActivity.class));
                finish();
            }
        });

   }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ResultsQ.this, MainActivity.class));
        finish();
    }
}