package ooad.newcode.vraag;

import ooad.newcode.antwoord.IAntwoord;

public abstract class Vraag {
    private String vraag;

    public Vraag(String vraag) {
        this.vraag = vraag;
    }

    public abstract boolean controleerAntwoord(IAntwoord antwoord);

    public String getVraag() {
        return this.vraag;
    }

}
