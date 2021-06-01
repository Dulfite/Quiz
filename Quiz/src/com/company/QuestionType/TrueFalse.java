package com.company.QuestionType;
import com.company.QuestionSuper;

public class TrueFalse extends QuestionSuper {

    private boolean answer;

    public TrueFalse(String prompt, boolean anAnswer) {
        super(prompt);
    }

    @Override
    public void showAnswers() {
        System.out.println("");
    }

    public void setAnswer(boolean anAnswer) {
        answer = anAnswer;
    }

    public boolean getAnswer() {
        return answer;
    }
}
