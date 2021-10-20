package ooad.newcode.vraag;

import ooad.newcode.antwoord.IAntwoord;

public class BeantwoordeVraag {

    private boolean isGoedBeantwoord;
    private Vraag vraag;
    private IAntwoord antwoord;

    public BeantwoordeVraag(IAntwoord antwoord, boolean isGoedBeantwoord, Vraag vraag) {
        this.antwoord = antwoord;
        this.isGoedBeantwoord = isGoedBeantwoord;
        this.vraag = vraag;
    }

    public Vraag getVraag() {
        return vraag;
    }

    public boolean getIsGoedBeantwoord() {
        return isGoedBeantwoord;
    }

}


