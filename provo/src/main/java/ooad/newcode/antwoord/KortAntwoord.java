package ooad.newcode.antwoord;

public class KortAntwoord implements IAntwoord {

    private String antwoord;

    public KortAntwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    @Override
    public String getAntwoord() {
        return String.valueOf(antwoord);
    }
}

