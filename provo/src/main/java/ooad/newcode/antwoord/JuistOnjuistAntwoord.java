package ooad.newcode.antwoord;

public class JuistOnjuistAntwoord implements IAntwoord{
    private final boolean antwoord;

    public JuistOnjuistAntwoord(boolean antwoord) {
        this.antwoord = antwoord;
    }

    @Override
    public String getAntwoord() {
        return String.valueOf(antwoord);
    }
}
