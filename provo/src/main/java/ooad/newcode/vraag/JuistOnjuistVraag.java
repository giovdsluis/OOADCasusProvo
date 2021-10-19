package ooad.newcode.vraag;

import ooad.newcode.antwoord.IAntwoord;
import ooad.newcode.antwoord.JuistOnjuistAntwoord;

public class JuistOnjuistVraag extends Vraag{
    private JuistOnjuistAntwoord juistOnjuistAntwoord;

    public JuistOnjuistVraag(String vraag, JuistOnjuistAntwoord antwoord) {
        super(vraag);
        this.juistOnjuistAntwoord = antwoord;
    }

    public JuistOnjuistVraag(String vraag) {
        super(vraag);
    }

    @Override
    public boolean controleerAntwoord(IAntwoord antwoord) {
        return this.juistOnjuistAntwoord.getAntwoord().equals(antwoord.getAntwoord());
    }
}
