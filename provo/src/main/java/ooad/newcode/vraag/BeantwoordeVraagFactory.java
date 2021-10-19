package ooad.newcode.vraag;

import ooad.newcode.Kennistoets;
import ooad.newcode.antwoord.IAntwoord;
import ooad.newcode.antwoord.JuistOnjuistAntwoord;
import ooad.newcode.antwoord.KortAntwoord;
import ooad.newcode.antwoord.MeerkeuzeAntwoord;

import static java.lang.Boolean.parseBoolean;

public class BeantwoordeVraagFactory {
    private Vragen vragen;

    public BeantwoordeVraagFactory() {
        vragen = new Vragen();
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
        System.out.println(huidigeVraag.controleerAntwoord(antwoord));
        return new BeantwoordeVraag(antwoord, isGoedBeantwoord, huidigeVraag);
    }

//    public void beantwoordeVraag() {
//        MeerkeuzeVraag meerkeuzeVraag = new MeerkeuzeVraag(vraag, antwoordTekst);
//        KortAntwoordVraag kortAntwoordVraag = new KortAntwoordVraag(vraag);
//        JuistOnjuistVraag juistOnjuistVraag = new JuistOnjuistVraag(vraag);
//        var huidigeVraag = vragen.hardcodedVragen.get(kennistoets.getHuidigeVraagID());
//        IAntwoord antwoord;
//
//        if (huidigeVraag.getClass().equals(MeerkeuzeVraag.class)) {
//            antwoord = new MeerkeuzeAntwoord(antwoordTekst.charAt(0));
//            //meerkeuzeVraag.setMeerkeuzeAntwoord((MeerkeuzeAntwoord) antwoord);
//            System.out.println(meerkeuzeVraag.controleerAntwoord(antwoord));
//        } else if (huidigeVraag.getClass().equals(KortAntwoordVraag.class)) {
//            antwoord = new KortAntwoord(antwoordTekst);
//            System.out.println(kortAntwoordVraag.controleerAntwoord(antwoord));
//        } else {
//            antwoord = new JuistOnjuistAntwoord(parseBoolean(antwoordTekst));
//            System.out.println(juistOnjuistVraag.controleerAntwoord(antwoord));
//        }
//    }
}
