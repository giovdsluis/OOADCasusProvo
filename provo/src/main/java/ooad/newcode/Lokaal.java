package ooad.newcode;

public class Lokaal {
    private int minimum;
    private int maximum;
    private int lokaalNummer;

    public Lokaal(){
        minimum = 1;
        maximum = 99;
    }

    public String getLokaalNummer() {
        return String.valueOf(lokaalNummer);
    }

    public void setLokaal() {
        lokaalNummer = minimum + (int)(Math.random() * ((maximum - minimum) + 1));
    }

}
