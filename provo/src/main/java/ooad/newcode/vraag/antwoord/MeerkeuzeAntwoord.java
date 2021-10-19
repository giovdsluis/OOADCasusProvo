package ooad.newcode.vraag.antwoord;

public class MeerkeuzeAntwoord implements IAntwoord {

    private final char antwoord;

    public MeerkeuzeAntwoord(char antwoordTekst) {
        this.antwoord = antwoordTekst;
    }

    @Override
    public String getAntwoord() {
        return String.valueOf(antwoord);
    }
}
