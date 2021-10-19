package ooad.newcode.antwoord;

public class JuistOnjuistAntwoord implements IAntwoord{

    private boolean antwoord;

    public JuistOnjuistAntwoord(boolean antwoord) {
        this.antwoord = antwoord;
    }

    @Override
    public String getAntwoord() {
        return String.valueOf(antwoord);
    }
}
