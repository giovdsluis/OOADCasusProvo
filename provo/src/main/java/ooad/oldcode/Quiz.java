package ooad.oldcode;

import java.util.ArrayList;

public class Quiz {
    public ArrayList<Question> questions = new ArrayList<Question>();
    private boolean allQuestionsAnswered;
    private int turn;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        turn = 0;
        allQuestionsAnswered = false;
    }

    public void setAllQuestionsAnswered(boolean allQuestionsAnswered) {
        this.allQuestionsAnswered = allQuestionsAnswered;
    }

    public boolean isAllQuestionsAnswered(){
        return allQuestionsAnswered;
    }
}
