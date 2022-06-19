package com.example.javatestvictorin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.text.TextRunShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Bilet1Activity extends AppCompatActivity {

    private TextView questions, question;

    private AppCompatButton answer1, answer2, answer3, answer4;
    private AppCompatButton nextB;


    private Timer timerQ;

    private int second = 0;
    private int minut = 8;

    private List<QuestionsList> questionsList;

    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilet1);

        final ImageView backB = findViewById(R.id.back);
        final TextView timer = findViewById(R.id.timerQ);
        final TextView selectedTopicName = findViewById(R.id.textView2);

        questions = findViewById(R.id.counter_Q);
        question = findViewById(R.id.question);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);

        nextB = findViewById(R.id.nextB);

        final String getSelectedTopic = getIntent().getStringExtra("selectedTopic");

        selectedTopicName.setText(getSelectedTopic);

        questionsList = QuestionsBank.getQuestions(getSelectedTopic);

        startTimer(timer);

        questions.setText((currentQuestionPosition + 1) + "/" + questionsList.size());
        question.setText(questionsList.get(0).getQuestion());
        answer1.setText(questionsList.get(0).getAnswer1());
        answer2.setText(questionsList.get(0).getAnswer2());
        answer3.setText(questionsList.get(0).getAnswer3());
        answer4.setText(questionsList.get(0).getAnswer4());

        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timerQ.purge();
                timerQ.cancel();

                startActivity(new Intent(Bilet1Activity.this, MainActivity.class));
                finish();
            }
        });

        if(answer4.getText().toString().isEmpty()){
            answer4.setVisibility(View.INVISIBLE);
        }
        nextB.setVisibility(View.INVISIBLE);


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = answer1.getText().toString();
                    answer1.setBackgroundResource(R.drawable.uncorrect_answer);
                    answer1.setTextColor(Color.WHITE);
                    nextB.setVisibility(View.VISIBLE);

                    revealAnswer();
                    questionsList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = answer2.getText().toString();
                    answer2.setBackgroundResource(R.drawable.uncorrect_answer);
                    answer2.setTextColor(Color.WHITE);
                    nextB.setVisibility(View.VISIBLE);

                    revealAnswer();
                    questionsList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = answer3.getText().toString();
                    answer3.setBackgroundResource(R.drawable.uncorrect_answer);
                    answer3.setTextColor(Color.WHITE);
                    nextB.setVisibility(View.VISIBLE);

                    revealAnswer();
                    questionsList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()){
                    selectedOptionByUser = answer4.getText().toString();
                    answer4.setBackgroundResource(R.drawable.uncorrect_answer);
                    answer4.setTextColor(Color.WHITE);
                    nextB.setVisibility(View.VISIBLE);

                    revealAnswer();
                    questionsList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });
        nextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeNextQuestion();
            }
        });

    }
    private void startTimer (TextView timerTextView){

        timerQ = new Timer();
        timerQ.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(second == 0 && minut == 0){
                    timerQ.purge();
                    timerQ.cancel();


                    Intent intent = new Intent(Bilet1Activity.this, ResultsQ.class);
                    intent.putExtra("correct", getCorrectAnswers());
                    intent.putExtra("incorrect", getInCorrectAnswers());


                    startActivity(intent);
                    finish();
                } else if(second == 0){
                    minut--;
                    second = 59;
                }
                else {
                    second--;
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String finalMinutes = String.valueOf(minut);
                        String finalSecond = String.valueOf(second);

                        if (finalMinutes.length() == 1){
                            finalMinutes = "0" + finalMinutes;
                        }
                        if (finalSecond.length() == 1){
                            finalSecond = "0" + finalSecond;
                        }
                        timerTextView.setText(finalMinutes + ":" + finalSecond);
                    }
                });
            }
        }, 1000, 1000);

    }
    private int getCorrectAnswers(){
        int correctAnswers = 0;

        for (int i = 0; i < questionsList.size(); i++){
            final String getUserSelectedAnswer = questionsList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();
            if(getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }

        }

        return correctAnswers;
    }
    private int getInCorrectAnswers(){
        int correctAnswers = 0;

        for (int i = 0; i < questionsList.size(); i++){
            final String getUserSelectedAnswer = questionsList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsList.get(i).getAnswer();
            if(!getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers = correctAnswers++;
            }

        }

        return correctAnswers;
    }

    @Override
    public void onBackPressed() {
        timerQ.purge();
        timerQ.cancel();

        startActivity(new Intent(Bilet1Activity.this, MainActivity.class));
        finish();
    }

    private void revealAnswer(){
        final String getAnswer = questionsList.get(currentQuestionPosition).getAnswer();


        if(answer1.getText().toString().equals(getAnswer)){
            answer1.setBackgroundResource(R.drawable.correct_answer);
            answer1.setTextColor(Color.WHITE);
        }
        else if (answer2.getText().toString().equals(getAnswer)){
                answer2.setBackgroundResource(R.drawable.correct_answer);
                answer2.setTextColor(Color.WHITE);
        }
        else if (answer3.getText().toString().equals(getAnswer)){
            answer3.setBackgroundResource(R.drawable.correct_answer);
            answer3.setTextColor(Color.WHITE);
        }
        else if (answer4.getText().toString().equals(getAnswer)){
            answer4.setBackgroundResource(R.drawable.correct_answer);
            answer4.setTextColor(Color.WHITE);
        }
    }
    private void changeNextQuestion(){
        currentQuestionPosition++;
        nextB.setVisibility(View.INVISIBLE);

        if((currentQuestionPosition + 1) == questionsList.size()){
            nextB.setText("Завершить");
        }
        if(currentQuestionPosition < questionsList.size()){
            selectedOptionByUser = "";

            answer1.setBackgroundResource(R.drawable.background_for_answers);
            answer1.setTextColor(Color.BLACK);

            answer2.setBackgroundResource(R.drawable.background_for_answers);
            answer2.setTextColor(Color.BLACK);

            answer3.setBackgroundResource(R.drawable.background_for_answers);
            answer3.setTextColor(Color.BLACK);

            answer4.setBackgroundResource(R.drawable.background_for_answers);
            answer4.setTextColor(Color.BLACK);

            questions.setText((currentQuestionPosition + 1) + "/" + questionsList.size());
            question.setText(questionsList.get(currentQuestionPosition).getQuestion());
            answer1.setText(questionsList.get(currentQuestionPosition).getAnswer1());
            answer2.setText(questionsList.get(currentQuestionPosition).getAnswer2());
            answer3.setText(questionsList.get(currentQuestionPosition).getAnswer3());
            answer4.setText(questionsList.get(currentQuestionPosition).getAnswer4());
        }
        else{
            Intent intent = new Intent(Bilet1Activity.this, ResultsQ.class);
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getInCorrectAnswers());

            startActivity(intent);
            finish();
        }
    }
}