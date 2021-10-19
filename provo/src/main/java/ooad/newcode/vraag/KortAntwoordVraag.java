package ooad.newcode.vraag;

import ooad.newcode.antwoord.IAntwoord;
import ooad.newcode.antwoord.KortAntwoord;

import java.util.List;

public class KortAntwoordVraag extends Vraag {

    private List<KortAntwoord> mogelijkeKortAntwoorden;

    public KortAntwoordVraag(String vraag, List<KortAntwoord> mogelijkeKortAntwoorden) {
        super(vraag);
        this.mogelijkeKortAntwoorden = mogelijkeKortAntwoorden;
    }

    public KortAntwoordVraag(String vraag) {
        super(vraag);
    }

    @Override
    public boolean controleerAntwoord(IAntwoord antwoord) {
        return mogelijkeKortAntwoorden.stream().anyMatch(goedAntwoord -> goedAntwoord.getAntwoord().equals(antwoord.getAntwoord()));
    }
}
