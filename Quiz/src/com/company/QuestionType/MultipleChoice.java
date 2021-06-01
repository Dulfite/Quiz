package com.company.QuestionType;
import com.company.QuestionSuper;
import java.util.Arrays;
import java.util.ArrayList;

public class MultipleChoice extends QuestionSuper {
    private ArrayList<String> choiceAnswers = new ArrayList<>();
    private String answer;

    public MultipleChoice(String aPrompt, String anAnswer) {
        super(aPrompt);
        answer = anAnswer;
    }

    @Override
    public void showAnswers() {
        int i = 0;
        for (String anAnswer : choiceAnswers) {
            System.out.println(i+1 + "! " + anAnswer);
            i++;
        }
    }

    public String getAnswers() {
        return answer;
    }

    public ArrayList<String> getChoiceAnswers() {
        return choiceAnswers;
    }

    public void setChoiceAnswers(String ... someAnswers) {
        choiceAnswers.addAll(Arrays.asList(someAnswers));
    }
}
