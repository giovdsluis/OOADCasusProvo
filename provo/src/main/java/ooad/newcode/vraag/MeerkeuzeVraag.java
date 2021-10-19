package ooad.newcode.vraag;

import ooad.newcode.antwoord.IAntwoord;
import ooad.newcode.antwoord.MeerkeuzeAntwoord;

public class MeerkeuzeVraag extends Vraag {

    private MeerkeuzeAntwoord meerkeuzeAntwoord;

    public MeerkeuzeVraag(String vraag, MeerkeuzeAntwoord antwoord) {
        super(vraag);
        this.meerkeuzeAntwoord = antwoord;
    }

    @Override
    public boolean controleerAntwoord(IAntwoord antwoord) {
        return this.meerkeuzeAntwoord.getAntwoord().equals(antwoord.getAntwoord());
    }
}
