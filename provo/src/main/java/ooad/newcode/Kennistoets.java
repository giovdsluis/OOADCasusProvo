package ooad.newcode;

import ooad.newcode.vraag.BeantwoordeVraag;
import ooad.newcode.vraag.BeantwoordeVraagFactory;
import ooad.newcode.vraag.Vragen;

import java.util.ArrayList;
import java.util.List;


public class Kennistoets {
    private int huidigeVraagID;
    private int AANTALVRAGEN;
    private boolean eindeKennistoets;
    private int score;
    private Vragen vragen;
    private List<BeantwoordeVraag> beantwoordeVragen;
    private BeantwoordeVraagFactory beantwoordeVraagFactory;
    private Stopwatch stopwatch;

    public Kennistoets() {
        huidigeVraagID = -1;
        score = 0;
        eindeKennistoets = false;
        vragen = new Vragen();
        beantwoordeVraagFactory = new BeantwoordeVraagFactory();
        stopwatch = new Stopwatch();
        beantwoordeVragen = new ArrayList<>();
    }

    public String getVolgendeVraag() {
        if (huidigeVraagID >= AANTALVRAGEN-1) {
            setEindeKennistoets(true);
            stopwatch.stop();
            return "De quiz is afgelopen. Druk op enter voor je score.";
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

    public int getScore(){
        System.out.println(beantwoordeVraagFactory.getScore());
        return (beantwoordeVraagFactory.getScore() * (600 / stopwatch.getTijd()));
    }

    public void setVolgendeVraagID(){
        huidigeVraagID++;
    }

    public int getHuidigeVraagID() {
        return huidigeVraagID;
    }

    public boolean isEindeKennistoets() {
        return eindeKennistoets;
    }

    public void setEindeKennistoets(boolean eindeKennistoets) {
        this.eindeKennistoets = eindeKennistoets;
    }

    public void setAANTALVRAGEN(int AANTALVRAGEN) {
        this.AANTALVRAGEN = AANTALVRAGEN;
    }

}
