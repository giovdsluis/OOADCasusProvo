package ooad.newcode.vraag;

import ooad.newcode.Kennistoets;
import ooad.newcode.vraag.Vraag;
import ooad.newcode.vraag.antwoord.IAntwoord;
import ooad.newcode.vraag.antwoord.KortAntwoord;
import ooad.newcode.vraag.antwoord.MeerkeuzeAntwoord;

public class BeantwoordeVraagFactory {

    public Vraag createBeantwoordeVraag(String antwoordTekst, Kennistoets kennistoets) {
        var huidigeVraag = kennistoets.getHuidigeVraagID();
        IAntwoord antwoord;

        if (huidigeVraag.getClass().equals(MeerkeuzeVraag.class)) {
            antwoord = new MeerkeuzeAntwoord(antwoordTekst.charAt(0));
        } else {
            antwoord = new KortAntwoord(antwoordTekst);
        }
        var isGoedBeantwoord = huidigeVraag.controleerAntwoord(antwoord);
        return new BeantwoordeVraag(antwoord, isGoedBeantwoord, huidigeVraag);
    }

}
