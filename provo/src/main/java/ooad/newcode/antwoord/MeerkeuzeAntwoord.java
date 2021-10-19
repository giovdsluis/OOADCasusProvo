package ooad.newcode.antwoord;

public class MeerkeuzeAntwoord implements IAntwoord {

    private char antwoord;

    public MeerkeuzeAntwoord(char antwoord) {
        this.antwoord = antwoord;
    }

    @Override
    public String getAntwoord() {
        return String.valueOf(antwoord);
    }

}
