package com.company;

public abstract class QuestionSuper {

    private String prompt;

    public QuestionSuper(String prompt) {
        this.prompt = prompt;
    }

    public void askQuestion() {
        System.out.println(prompt);
    }

    public abstract void showAnswers();

    public void setPrompt(String aPrompt) {
        prompt = aPrompt;
    }

}
