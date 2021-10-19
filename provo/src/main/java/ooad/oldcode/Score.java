package ooad.oldcode;

public class Score {
    private int score;
    private int aantalGoed;
    private int aantalSeconde;

    public Score(){

    }

    public int getScore(){
        score = aantalGoed * (300 / aantalSeconde);
        return score;
    }

    public void resetAantalGoed() { aantalGoed = 0; }

    public void setAantalGoed(int aantalGoed) {
        this.aantalGoed += aantalGoed;
    }

    public int getAantalGoed() {
        return aantalGoed;
    }

    public void setAantalSeconde(int aantalSeconde) { this.aantalSeconde = aantalSeconde; }
}
