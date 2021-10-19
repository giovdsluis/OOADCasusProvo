package ooad.oldcode;

import java.util.ArrayList;

public class Questions {
    Answer answer = new Answer();

    public Questions(){

    }

    public ArrayList<Question> createQuestions(){
        Question question1 = new Question("Welke van de begrippen need, features en requirements horne bij het solution domain?", "C", answer.getMultipleChoiceAnswers(0));
        Question question2 = new Question("Wat wordt bedoeld met 'elicit need from stakeholder'?", "A", answer.getMultipleChoiceAnswers(1));
        Question question3 = new Question("Wat leg je vast m.b.v. use cases?", "C", answer.getMultipleChoiceAnswers(2));
        Question question4 = new Question("Welke term wordt gebruikt voor 'the ability to describe and follow the life of a requirement, in both forwards and backwards direction'?", answer.getOpenAnswers(3));
        Question question5 = new Question("In een project wordt gewerkt volgens een iteratieve en incrementele aanpak. Aan het begin van het project heb je de requirements opgesteld. Op welke momenten in het project kunnen de requirements gewijzigd worden?", "B", answer.getMultipleChoiceAnswers(4));
        Question question6 = new Question("De onderstaande eis R1 valt in de categorie Usability. R1: Het systeem moet 75% van de webpagina's binnen 2 seconden tonen. Voor de overige pagina's mag het nooit langer dan 5 seconden duren.", answer.getOpenAnswers(5));
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        return questions;
    }
}
