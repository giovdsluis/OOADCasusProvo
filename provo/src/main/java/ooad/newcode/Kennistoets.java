package ooad.newcode;

public class Kennistoets {
    public int huidigeVraagID;
    public int AANTALVRAGEN;

    public String getVolgendeVraag() {
        if(huidigeVraagID >= AANTALVRAGEN) {
            return  "er zijn geen vragen meer";
        }
        setVolgendeVraagNummer();
        return quiz.getVraag(huidigeVraagID).getVraag();
    }

    public void beantwoordVraag() {
        var beantwoordeVraag = beantwoordeVraagFactory.createBeantwoordeVraag(antwoordTekst, this);
        beantwoordeVragen.add(beantwoordeVraag);
    }
}
