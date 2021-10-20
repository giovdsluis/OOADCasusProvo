package ooad.newcode;

public class Stopwatch {

    private long startTime;
    private long stopTime;
    private int aantalSeconde;

    public Stopwatch() {
        startTime = System.currentTimeMillis();
        stopTime = 0;
        aantalSeconde = 0;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
        setAantalSeconde(getGebruikteTijdInSecondes());
    }

    public int getGebruikteTijdInSecondes() {
        int elapsed;
        elapsed = ((int) (stopTime - startTime)) / 1000;
        return elapsed;
    }

    public void setAantalSeconde(int gebruikteTijd){
        aantalSeconde = gebruikteTijd;
    }

    public int getTijd(){
        return aantalSeconde;
    }
}
