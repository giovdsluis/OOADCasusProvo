package ooad.newcode.vraag;

import ooad.newcode.vraag.antwoord.IAntwoord;

import java.util.List;

public class KortAntwoordVraag extends Vraag {

    private List<KortAntwoordVraag> mogelijkeKortAntwoorden;

    public KortAntwoordVraag(String vraag, List<KortAntwoordVraag> mogelijkeKortAntwoorden) {
        super(vraag);
        this.mogelijkeKortAntwoorden = mogelijkeKortAntwoorden;
    }

    @Override
    public boolean controleerAntwoord(IAntwoord antwoord) {
        return mogelijkeKortAntwoorden.stream().anyMatch(goedAntwoord -> goedAntwoord.getAntwoord().equals(antwoord.getAntwoord()));
    }
}
