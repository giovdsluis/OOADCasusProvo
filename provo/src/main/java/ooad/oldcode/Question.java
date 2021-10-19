package ooad.oldcode;


import java.util.ArrayList;

public class Question {
    String question;
    private String rightAnswer;
    ArrayList<String> rightAnswers = new ArrayList<>();
    ArrayList<String> allAnswers = new ArrayList<>();
    private boolean isMultipleChoice;

    public boolean isMultipleChoice() {
        return isMultipleChoice;
    }

    public Question(String question, String rightAnswer, ArrayList<String> allAnswers) {
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.allAnswers = allAnswers;
        isMultipleChoice = true;
    }

    public Question(String question, ArrayList<String> rightAnswers){
        this.question = question;
        this.rightAnswers = rightAnswers;
        isMultipleChoice = false;
    }

    public String CompareAnswer(String answer, Score score) {
        if (!isMultipleChoice) {
            for (int i = 0; i < rightAnswers.size(); i++) {
                if (rightAnswers.get(i).equals(answer)) {
                    score.setAantalGoed(1);
                    return "YAY";
                }
            }
            return "Answer is wrong";
        }
        else {
            if (rightAnswer.equals(answer)) {
                score.setAantalGoed(1);
                return "YAY";
            }
        }
        return "Answer is wrong";
    }
}
