package ooad.newcode;

import ooad.newcode.student.StudentenBeheerder;
import ooad.newcode.vraag.*;

public class KennistoetsController {
    private StudentenBeheerder studentenBeheerder;
    private Deelname deelname;
    private KennistoetsVragen kennistoetsVragen;
    private Lokaal lokaal;

    public KennistoetsController() {
        studentenBeheerder = new StudentenBeheerder();
        deelname = new Deelname();
        kennistoetsVragen = new KennistoetsVragen();
        lokaal = new Lokaal();
    }

    public void inloggen(String lokaal, String studentennaam) {
        studentenBeheerder.inloggen(lokaal, studentennaam);
    }

    public String getVolgendeVraag() {
        return deelname.getVolgendeVraag();
    }

    public int getScore() {
        return deelname.getScore();
    }

    public String getLokaal() {
        return lokaal.getLokaal();
    }

    public void getKennistoets() {
        deelname.setAANTALVRAGEN(kennistoetsVragen.hardcodedVragen.size());
    }

    public void beantwoordVraag(String antwoord) {
        deelname.beantwoordVraag(antwoord);
    }

    public boolean isEindeKennistoets() {
        return deelname.isEindeKennistoets();
    }

    public void setLokaal() {
        lokaal.setLokaal();
    }
}

