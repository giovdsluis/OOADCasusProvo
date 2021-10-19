package ooad.newcode;

import ooad.newcode.antwoord.IAntwoord;
import ooad.newcode.antwoord.JuistOnjuistAntwoord;
import ooad.newcode.antwoord.KortAntwoord;
import ooad.newcode.antwoord.MeerkeuzeAntwoord;
import ooad.newcode.student.StudentenBeheerder;
import ooad.newcode.vraag.*;

import static java.lang.Boolean.parseBoolean;

public class ProvoFacade {
    public StudentenBeheerder studentenBeheerder;
    public Kennistoets kennistoets;
    private Vragen vragen;

    public ProvoFacade() {
        studentenBeheerder = new StudentenBeheerder();
        kennistoets = new Kennistoets();
        vragen = new Vragen();
    }

    public void inloggen(String lokaal, String studentennaam) {
        studentenBeheerder.inloggen(lokaal, studentennaam);
    }

    public String getVolgendeVraag(){
        return kennistoets.getVolgendeVraag();
    }

    public int getScore() {
        return 1;
    }

    public String getLokaal() {
        return "1";
    }

    public void getKennistoets() {
        kennistoets.setAANTALVRAGEN(vragen.hardcodedVragen.size());
    }

    public void beantwoordVraag(String vraag, String antwoordTekst) {
        MeerkeuzeVraag meerkeuzeVraag = new MeerkeuzeVraag(vraag);
        KortAntwoordVraag kortAntwoordVraag = new KortAntwoordVraag(vraag);
        JuistOnjuistVraag juistOnjuistVraag = new JuistOnjuistVraag(vraag);
        var huidigeVraag = vragen.hardcodedVragen.get(kennistoets.getHuidigeVraagID());
        IAntwoord antwoord;

        if (huidigeVraag.getClass().equals(MeerkeuzeVraag.class)) {
            antwoord = new MeerkeuzeAntwoord(antwoordTekst.charAt(0));
            System.out.println(meerkeuzeVraag.controleerAntwoord(antwoord));
        } else if (huidigeVraag.getClass().equals(KortAntwoordVraag.class)){
            antwoord = new KortAntwoord(antwoordTekst);
            System.out.println(kortAntwoordVraag.controleerAntwoord(antwoord));
        } else {
            antwoord = new JuistOnjuistAntwoord(parseBoolean(antwoordTekst));
            System.out.println(juistOnjuistVraag.controleerAntwoord(antwoord));
        }
    }
}

