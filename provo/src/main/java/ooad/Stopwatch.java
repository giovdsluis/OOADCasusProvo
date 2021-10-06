package ooad;

public class Stopwatch {

    private long startTime = 0;
    private long stopTime = 0;
    Score score = new Score();

    public Stopwatch()
    {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
        System.out.println("StopWatch: " + getElapsedTime() + " milliseconds.");
        System.out.println("StopWatch: " + getElapsedTimeSecs() + " seconds.");
        score.setAantalSeconde((int) getElapsedTime());
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }

    public int getElapsedTimeSecs() {
        int elapsed;
        elapsed = ((int)(stopTime - startTime)) / 1000;
        return elapsed;
    }
}
