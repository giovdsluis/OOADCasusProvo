package ooad.newcode;

public class Lokaal {
    private int minimum;
    private int maximum;
    private int lokaal;

    public Lokaal(){
        minimum = 1;
        maximum = 99;
    }

    public String getLokaal() {
        return String.valueOf(lokaal);
    }

    public void setLokaal() {
        lokaal = minimum + (int)(Math.random() * ((maximum - minimum) + 1));
    }

}
