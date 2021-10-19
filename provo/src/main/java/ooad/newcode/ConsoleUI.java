package ooad.newcode;

import java.util.Scanner;

public class ConsoleUI {
    private ProvoFacade provo;
    Scanner scanner;
    boolean provoRunning = true;
    boolean eindeKennistoets = false;
    private String studentennaam;

    public ConsoleUI(ProvoFacade provo) {
        this.provo = provo;
        this.scanner = new Scanner(System.in);
    }

    public void start()  {
        System.out.println("=========================================");
        System.out.println("=               Main menu               =");
        System.out.println("=========================================");
        provo.getLokaal();
        System.out.print("Wat wilt u doen?: \n" + "Aanmelden bij een kennistoets of verlaten? \n");
        var gekozenUsecase = Integer.parseInt(scanner.nextLine());
        do{
            switch (gekozenUsecase) {
                case 1:
                    inloggen();
                    gekozenUsecase = 3;
                    break;
                case 2:
                    verlaten();
                    break;
                case 3:
                    maakKennistoets();
                    break;
            }
            while(provoRunning);
        }
    }

    private void inloggen() {
        System.out.println("Aanmelden bij een kennistoets");
        System.out.print("Lokaal: ");
        var lokaal = scanner.nextLine();
        System.out.print("Studentennaam: ");
        var studentennaam = scanner.nextLine();
        provo.inloggen(lokaal, studentennaam);
        System.out.println("U bent aangemeld \n \n");
        start();
    }

    private void maakKennistoets() {
        System.out.println("=========================================");
        System.out.println("=             Kennistoets               =");
        System.out.println("=========================================");
        while(!eindeKennistoets) {
            var vraag = provo.getVolgendeVraag();
            System.out.println(vraag);
            var antwoord = scanner.nextLine();
            provo.beantwoordVraag(studentennaam, antwoord);
        }
        System.out.println("De quiz is afgelopen. Gefeliciteerd! je hebt een score van " + provo.getScore() + " punten behaald!\n\n");
    }

//    private void voegQuizToe() {
//        System.out.println("Quiz toevoegen");
//        System.out.print("quiz naam: ");
//        var quiznaam = scanner.nextLine();
//        quebble.maakNieuweQuizAan(quiznaam);
//        var alleVragen = quebble.getAlleVragen();
//        for(int i = 0; i < alleVragen.size(); i++) {
//            System.out.println(i + ": " + alleVragen.get(i).getVraag());
//        }
//        System.out.print("E: kies eerste 8 vragen \nI: kies 8 vragen op basis van 8 id's\n");
//        var soortKeuze = scanner.nextLine();
//        for(int i = 0; i < 8; i++) {
//            if (soortKeuze.equals("E")) {
//                quebble.voegVraagToeAanQuiz(quiznaam, alleVragen.get(i).getVraag());
//            }
//            if(soortKeuze.equals("I")) {
//                var keuze = Integer.parseInt(scanner.nextLine());
//                quebble.voegVraagToeAanQuiz(quiznaam, alleVragen.get(keuze).getVraag());
//            }
//        }
//        System.out.println("Quiz aangemaakt \n \n");
//        start();
//    }

    public void verlaten() {
        provoRunning = false;
    }
}
