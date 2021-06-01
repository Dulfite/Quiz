package com.company;
import com.company.QuestionType.TrueFalse;
import com.company.QuestionType.MultipleChoice;
//import com.company.QuestionType.Checkbox;

public class QuizRunner {

    public static void main(String[] args) {
	    MultipleChoice q1 = new MultipleChoice("What was the first of the 4 empires the statue of Nebuchadnezzar was based upon?",
                "Babylon");
	    q1.setChoiceAnswers("Persia","Rome", "Greece" , "Babylon");

	    TrueFalse q2 = new TrueFalse("While gold is the most valuable metal, it is the softest", true);

	    TrueFalse q3 = new TrueFalse("Cleopatra married Emperor Trajen", false);

	    MultipleChoice q4 = new MultipleChoice("13 is a _____ number", "prime");
	    q4.setChoiceAnswers("primus", "even","negative", "prime");


    }
}
