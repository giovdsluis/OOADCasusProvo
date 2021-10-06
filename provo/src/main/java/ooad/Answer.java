package ooad;

import java.util.ArrayList;

public class Answer {

    public ArrayList<String> getOpenAnswers(int turn){
        ArrayList<String> answers = new ArrayList<>();
        if(turn == 3) {
            answers.add("traceability");
            answers.add("tracebility");
            answers.add("traceabillity");
            answers.add("tracebillity");
        }
        else if(turn == 5) {
            answers.add("False");
            answers.add("false");
            answers.add("niet waar");
            answers.add("Niet waar");
        }
        return answers;
    }

    public ArrayList<String> getMultipleChoiceAnswers(int turn){
        ArrayList<String> answers = new ArrayList<>();
        if(turn == 0) {
            answers.add("A: need, features en requirements");
            answers.add("B: needs en requirements");
            answers.add("C: features en requirements");
            answers.add("D: alleen requirements");
        }
        else if(turn == 1) {
            answers.add("A: Het boven tafel krijgen van de needs van belanghebbenden");
            answers.add("B: Het documenteren van de needs van belanghebbenden");
            answers.add("C: Het valideren van de needs van belanghebbenden");
            answers.add("D: Het vertalen van de needs van belanghebbenden naar software features");
        }
        else if(turn == 2) {
            answers.add("A: needs");
            answers.add("B: features");
            answers.add("C: functional requirements");
            answers.add("D: non-functional requirements");
        }
        else if(turn == 4) {
            answers.add("A: Op elke gewenst moment");
            answers.add("B: Na elke iteratie");
            answers.add("C: Niet meer, de requirements liggen vast");
        }
        return answers;
    }

    public ArrayList<String> getMutlipleChoiceAnswers(int randomQuiz, int turn) {
        ArrayList<String> multipleChoiceAnswers = new ArrayList<>();
        multipleChoiceAnswers = getMultipleChoiceAnswers(turn);
        return multipleChoiceAnswers;
    }
}
