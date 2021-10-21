package ooad.newcode;

public class App {
    public static void main( String[] args )
    {
        var provo = new KennistoetsController();
        var ui = new ConsoleUI(provo);
        ui.start();
    }
}
