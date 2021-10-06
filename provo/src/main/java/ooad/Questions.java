package ooad;

import java.util.ArrayList;

public class Questions {
    Answer answer = new Answer();

    public Questions(){

    }

    public ArrayList<Question> createQuestions(){
        Question vraag1 = new Question("Welke van de begrippen need, features en requirements horne bij het solution domain?", "C", answer.getMultipleChoiceAnswers(0));
        Question vraag2 = new Question("Wat wordt bedoeld met 'elicit need from stakeholder'?", "A", answer.getMultipleChoiceAnswers(1));
        Question vraag3 = new Question("Wat leg je vast m.b.v. use cases?", "C", answer.getMultipleChoiceAnswers(2));
        Question vraag4 = new Question("Welke term wordt gebruikt voor 'the ability to describe and follow the life of a requirement, in both forwards and backwards direction'?", answer.getOpenAnswers(3));
        Question vraag5 = new Question("In een project wordt gewerkt volgens een iteratieve en incrementele aanpak. Aan het begin van het project heb je de requirements opgesteld. Op welke momenten in het project kunnen de requirements gewijzigd worden?", "B", answer.getMultipleChoiceAnswers(4));
        Question vraag6 = new Question("De onderstaande eis R1 valt in de categorie Usability. R1: Het systeem moet 75% van de webpagina's binnen 2 seconden tonen. Voor de overige pagina's mag het nooit langer dan 5 seconden duren.", answer.getOpenAnswers(5));
        ArrayList<Question> vragen = new ArrayList<>();
        vragen.add(vraag1);
        vragen.add(vraag2);
        vragen.add(vraag3);
        vragen.add(vraag4);
        vragen.add(vraag5);
        vragen.add(vraag6);
        return vragen;
    }
}
