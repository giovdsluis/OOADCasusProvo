package ooad.newcode.vraag;

import ooad.newcode.Kennistoets;
import ooad.newcode.antwoord.IAntwoord;
import ooad.newcode.antwoord.JuistOnjuistAntwoord;
import ooad.newcode.antwoord.KortAntwoord;
import ooad.newcode.antwoord.MeerkeuzeAntwoord;

import static java.lang.Boolean.parseBoolean;

public class BeantwoordeVraagFactory {
    private Vragen vragen;
    private int score;

    public BeantwoordeVraagFactory() {
        vragen = new Vragen();
        score = 0;
    }

    public BeantwoordeVraag createBeantwoordeVraag(String antwoordTekst, Kennistoets kennistoets) {
        var huidigeVraag = vragen.hardcodedVragen.get(kennistoets.getHuidigeVraagID());
        IAntwoord antwoord;

        if (huidigeVraag.getClass().equals(MeerkeuzeVraag.class)) {
            antwoord = new MeerkeuzeAntwoord(antwoordTekst.charAt(0));
        } else if (huidigeVraag.getClass().equals(KortAntwoordVraag.class)) {
            antwoord = new KortAntwoord(antwoordTekst);
        } else {
            antwoord = new JuistOnjuistAntwoord(parseBoolean(antwoordTekst));
        }
        var isGoedBeantwoord = huidigeVraag.controleerAntwoord(antwoord);

        if(huidigeVraag.controleerAntwoord(antwoord) == true) {
            setScore();
        }

        return new BeantwoordeVraag(antwoord, isGoedBeantwoord, huidigeVraag);
    }

    public void setScore(){
        score++;
    }

    public int getScore(){
        return score;
    }
}
