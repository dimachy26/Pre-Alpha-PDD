package com.example.javatestvictorin;

public class QuestionsList {

    private String answer1, answer2, answer3, answer4, question, answer;
    private String userSelectedAnswer;

    public QuestionsList(String question, String answer1, String answer2, String answer3, String answer4, String answer, String userSelectedAnswer) {
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.question = question;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}
