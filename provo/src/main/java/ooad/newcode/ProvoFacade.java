package ooad.newcode;

import ooad.newcode.student.StudentenBeheerder;
import ooad.newcode.vraag.Vraag;

public class ProvoFacade {
    public StudentenBeheerder studentenBeheerder;
    public Kennistoets kennistoets;
    public Vraag vraag;

    public ProvoFacade() {
        studentenBeheerder = new StudentenBeheerder();
        kennistoets = new Kennistoets();
        vraag = new Vraag();
    }

    public void inloggen(String lokaal, String studentennaam) {
        studentenBeheerder.inloggen(lokaal, studentennaam);
    }

    public String getVolgendeVraag(){
        return kennistoets.getVolgendeVraag();
    }

    public void beantwoordVraag(String studentennaam, String antwoord) {
        kennistoets.beantwoordVraag();
    }
}

