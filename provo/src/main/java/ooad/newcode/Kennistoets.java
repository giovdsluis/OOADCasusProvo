package ooad.newcode;

import ooad.newcode.vraag.Vraag;
import ooad.newcode.vraag.Vragen;

import java.util.Arrays;

public class Kennistoets {
    public int huidigeVraagID;
    public int AANTALVRAGEN;
    private Vragen vragen;

    public Kennistoets() {
        vragen = new Vragen();
    }

    public String getVolgendeVraag() {
        if (huidigeVraagID >= AANTALVRAGEN) {
            return "De quiz is afgelopen.";
        } else {
            setVolgendeVraagID();
            var vraagBeschrijving = vragen.hardcodedVragen.get(huidigeVraagID).getVraag();
            return getHuidigeVraagID() + ". " + vraagBeschrijving;
        }
    }

    public void setVolgendeVraagID(){
        huidigeVraagID++;
    }

    public int getHuidigeVraagID() {
        return huidigeVraagID;
    }

    public void setHuidigeVraagID(int huidigeVraagID) {
        this.huidigeVraagID = huidigeVraagID;
    }

    public int getAANTALVRAGEN() {
        return AANTALVRAGEN;
    }

    public void setAANTALVRAGEN(int AANTALVRAGEN) {
        this.AANTALVRAGEN = AANTALVRAGEN;
    }
}
