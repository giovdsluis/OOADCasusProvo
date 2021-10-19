package ooad.newcode;

import ooad.newcode.vraag.BeantwoordeVraag;
import ooad.newcode.vraag.BeantwoordeVraagFactory;
import ooad.newcode.vraag.Vragen;

import java.util.ArrayList;
import java.util.List;


public class Kennistoets {
    private int huidigeVraagID;
    private int AANTALVRAGEN;
    private Vragen vragen;
    private List<BeantwoordeVraag> beantwoordeVragen;
    private BeantwoordeVraagFactory beantwoordeVraagFactory;

    public Kennistoets() {
        huidigeVraagID = -1;
        vragen = new Vragen();
        beantwoordeVraagFactory = new BeantwoordeVraagFactory();
        beantwoordeVragen = new ArrayList<>();
    }

    public String getVolgendeVraag() {
        if (huidigeVraagID >= AANTALVRAGEN-1) {
            return "De quiz is afgelopen.";
        } else {
            setVolgendeVraagID();
            var vraagBeschrijving = vragen.hardcodedVragen.get(huidigeVraagID).getVraag();
            return (getHuidigeVraagID() + 1) + ". " + vraagBeschrijving;
        }
    }

    public void beantwoordVraag(String antwoordTekst) {
        var beantwoordeVraag = beantwoordeVraagFactory.createBeantwoordeVraag(antwoordTekst, this);
        beantwoordeVragen.add(beantwoordeVraag);
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
