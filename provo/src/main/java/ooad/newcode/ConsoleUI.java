package ooad.newcode;

import java.util.Scanner;

public class ConsoleUI {
    private ProvoFacade provo;
    Scanner scanner;
    boolean provoRunning = true;
    boolean eindeKennistoets = false;
    String screen = "menu";

    public ConsoleUI(ProvoFacade provo) {
        this.provo = provo;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        do {
            switch (screen) {
                case "menu": {
                    do {
                        System.out.println("=========================================");
                        System.out.println("=               Main menu               =");
                        System.out.println("=========================================");
                        System.out.println(provo.getLokaal());
                        System.out.print("Wat wilt u doen?: \n" + "Aanmelden bij een kennistoets of verlaten? \n");
                        String menuKeuze = scanner.nextLine();
                        if ("aanmelden".equals(menuKeuze)) {
                            screen = "aanmelden";
                        } else if ("verlaten".equals(menuKeuze)) {
                            screen = "verlaten";
                        }
                    } while (screen == "menu");
                }
                break;

                case "aanmelden":
                    inloggen();
                    break;

                case "verlaten":
                    verlaten();
                    break;

                case "maken kennistoets":
                    maakKennistoets();
                    break;
            }
        }
        while (provoRunning);
    }

    private void inloggen() {
        System.out.println("=========================================");
        System.out.println("=               Aanmelden               =");
        System.out.println("=========================================");
        System.out.print("Lokaal: ");
        var lokaalScanner = scanner.nextLine();
        var lokaal = provo.getLokaal();
        if (lokaal.equals(lokaalScanner)) {
            System.out.print("Studentennaam: ");
            var studentennaam = scanner.nextLine();
            provo.inloggen(lokaalScanner, studentennaam);
            System.out.println("U bent aangemeld");
            screen = "maken kennistoets";
        } else {
            System.out.println("Probeer het opnieuw");
            screen = "aanmelden";
        }
    }

    private void maakKennistoets() {
        System.out.println("=========================================");
        System.out.println("=             Kennistoets               =");
        System.out.println("=========================================");
        provo.getKennistoets();
        while (!eindeKennistoets) {
            var vraag = provo.getVolgendeVraag();
            System.out.println(vraag);
            var antwoord = scanner.nextLine();
            provo.beantwoordVraag(vraag, antwoord);
        }
        System.out.println("Gefeliciteerd! je hebt een score van " + provo.getScore() + " punten behaald!");
        screen = "verlaten";
    }

    public void verlaten() {
        provoRunning = false;
    }
}
