package com.company;
import com.company.QuestionSuper;
import com.company.QuestionType.MultipleChoice;
import com.company.QuestionType.TrueFalse;

import java.util.*;

public class Quiz<Question> {
    private ArrayList<Question> newArrayList;
    ArrayList<Question> questions = null;
    List<String> userAnswers = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addQuestions(Question ... someQuestions) {
        questions.addAll(Arrays.asList(someQuestions));
    }

    public void askQuestions(){
        for (Question aQuestion : questions) {
            aQuestion.askQuestions();
            aQuestion.showAnswers();
            int userAnswer = in.nextInt();

            if (aQuestion instanceof TrueFalse){
                boolean correctAnswer = ((TrueFalse) aQuestion).getAnswer();
                boolean userAnswerBoolean;
                while (userAnswer != 1 && userAnswer !=2 ){
                    System.out.println("Select either 1 for true or 2 for false and try again!");
                    userAnswer = in.nextInt();
                }
                if (userAnswer == 1){
                    userAnswerBoolean = true;
                    if (correctAnswer) {
                        userAnswers.add("correct");
                    }
                }
                if (userAnswer == 2) {
                    userAnswerBoolean = false;
                    if (!correctAnswer){
                        userAnswers.add("correct");
                    }
                }
            }
            if (aQuestion instanceof MultipleChoice){
                int maxAnswerRange = ((MultipleChoice) aQuestion).getChoiceAnswers().size();
                int correctAnswer = ((MultipleChoice) aQuestion).getChoiceAnswers().indexOf(((MultipleChoice) aQuestion).getAnswers());
                while (userAnswer > maxAnswerRange || userAnswer < 0){
                    System.out.println("Type the number attached to your answer.");
                    userAnswer = in.nextInt();
                }
                if (userAnswer - 1 == correctAnswer){
                    userAnswers.add("correct");
                } else {
                    userAnswers.add("incorrect");
                }
            }
        }
        in.close();
    }
    public void gradeQuiz(){
        int correctAnswers = Collections.frequency(userAnswers, "correct");
        int totalNumberOfQuestions = questions.size();
        System.out.println("You responded " + correctAnswers + " times correctly out of " + totalNumberOfQuestions + " attempts.");
    }
}
