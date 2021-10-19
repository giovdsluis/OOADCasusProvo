package ooad.newcode.vraag;

import ooad.newcode.vraag.Vraag;
import ooad.newcode.vraag.antwoord.KortAntwoord;
import ooad.newcode.vraag.antwoord.MeerkeuzeAntwoord;

import java.util.List;

public class Vragen {

    static final public List<Vraag> hardcodedVragen = List.of(
            new MeerkeuzeVraag("Welke van de begrippen need, features en requirements horne bij het solution domain? \n " +
                    "A.Arequipa \n " +
                    "B.Caracas \n " +
                    "C.Lima \n " +
                    "D.Santiago ",
                    new MeerkeuzeAntwoord('C')),

            new MeerkeuzeVraag("Wat wordt bedoeld met 'elicit need from stakeholder'? \n" +
                    "A.Davis Cup \n" +
                    "B.Diamond League \n" +
                    "C.Fed Cup \n" +
                    "D.Nations League",
                    new MeerkeuzeAntwoord('A')),

            new MeerkeuzeVraag("Wat leg je vast m.b.v. use cases? \n" +
                    "A.Ruth \n" +
                    "B.Emmy \n" +
                    "C.Joanne \n" +
                    "D.Agatha ",
                    new MeerkeuzeAntwoord('C')),

            new KortAntwoordVraag("Welke term wordt gebruikt voor 'the ability to describe and follow the life of a requirement, in both forwards and backwards direction'? \n" +
                    List.of(
                        new KortAntwoord(""),
                        new KortAntwoord())
                    ),

            new KortAntwoordVraag("In een project wordt gewerkt volgens een iteratieve en incrementele aanpak. Aan het begin van het project heb je de requirements opgesteld. Op welke momenten in het project kunnen de requirements gewijzigd worden?" +
                    List.of(
                            new KortAntwoord("Avignon"))
            ),

            new JuistOnjuistVraag("De onderstaande eis R1 valt in de categorie Usability. R1: Het systeem moet 75% van de webpagina's binnen 2 seconden tonen. Voor de overige pagina's mag het nooit langer dan 5 seconden duren. \n" +
                    List.of(
                            new JuistOnjuistAntwoord(false))
            ),
    );
}
