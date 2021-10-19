package ooad.newcode.vraag;

import ooad.newcode.antwoord.IAntwoord;
import ooad.newcode.antwoord.MeerkeuzeAntwoord;

public class MeerkeuzeVraag extends Vraag {

    private MeerkeuzeAntwoord meerkeuzeAntwoord;

    public MeerkeuzeVraag(String vraag, MeerkeuzeAntwoord antwoord) {
        super(vraag);
        this.meerkeuzeAntwoord = antwoord;
    }

    public MeerkeuzeVraag(String vraag) {
        super(vraag);
    }

    @Override
    public boolean controleerAntwoord(IAntwoord antwoord) {
        System.out.println(this.meerkeuzeAntwoord);
        //System.out.println(meerkeuzeAntwoord.getAntwoord().equals(antwoord.getAntwoord()));
        return this.meerkeuzeAntwoord.getAntwoord().equals(antwoord.getAntwoord());
    }
}
