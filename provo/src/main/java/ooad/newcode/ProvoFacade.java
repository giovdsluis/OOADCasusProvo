package ooad.newcode;

import ooad.newcode.antwoord.IAntwoord;
import ooad.newcode.antwoord.JuistOnjuistAntwoord;
import ooad.newcode.antwoord.KortAntwoord;
import ooad.newcode.antwoord.MeerkeuzeAntwoord;
import ooad.newcode.student.StudentenBeheerder;
import ooad.newcode.vraag.*;

import static java.lang.Boolean.parseBoolean;

public class ProvoFacade {
    private StudentenBeheerder studentenBeheerder;
    private Kennistoets kennistoets;
    private Vragen vragen;
    private Lokaal lokaal;

    public ProvoFacade() {
        studentenBeheerder = new StudentenBeheerder();
        kennistoets = new Kennistoets();
        vragen = new Vragen();
        lokaal = new Lokaal();
    }

    public void inloggen(String lokaal, String studentennaam) {
        studentenBeheerder.inloggen(lokaal, studentennaam);
    }

    public String getVolgendeVraag() {
        return kennistoets.getVolgendeVraag();
    }

    public int getScore() {
        return kennistoets.getScore();
    }

    public String getLokaal() {
        return lokaal.getLokaal();
    }

    public void getKennistoets() {
        kennistoets.setAANTALVRAGEN(vragen.hardcodedVragen.size());
        kennistoets.startTimer();
    }

    public void beantwoordVraag(String antwoord) {
        kennistoets.beantwoordVraag(antwoord);
    }

    public boolean isEindeKennistoets() {
        return kennistoets.isEindeKennistoets();
    }

    public void setLokaal() {
        lokaal.setLokaal();
    }
}

