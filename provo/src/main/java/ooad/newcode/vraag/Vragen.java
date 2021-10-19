package ooad.newcode.vraag;

import ooad.newcode.antwoord.JuistOnjuistAntwoord;
import ooad.newcode.antwoord.KortAntwoord;
import ooad.newcode.antwoord.MeerkeuzeAntwoord;

import java.util.List;

public class Vragen {

    static final public List<Vraag> hardcodedVragen = List.of(
            new MeerkeuzeVraag("Welke van de begrippen need, features en requirements horne bij het solution domain? \n " +
                    "A: need, features en requirements \n " +
                    "B: needs en requirements \n " +
                    "C: features en requirements \n " +
                    "D: alleen requirements ",
                    new MeerkeuzeAntwoord('C')
            ),

            new MeerkeuzeVraag("Wat wordt bedoeld met 'elicit need from stakeholder'? \n" +
                    "A: Het boven tafel krijgen van de needs van belanghebbenden \n" +
                    "B: Het documenteren van de needs van belanghebbenden \n" +
                    "C: Het valideren van de needs van belanghebbenden \n" +
                    "D: Het vertalen van de needs van belanghebbenden naar software features",
                    new MeerkeuzeAntwoord('A')
            ),

            new MeerkeuzeVraag("Wat leg je vast m.b.v. use cases? \n" +
                    "A: needs \n" +
                    "B: features \n" +
                    "C: functional requirements \n" +
                    "D: non-functional requirements ",
                    new MeerkeuzeAntwoord('C')
            ),

            new KortAntwoordVraag("Welke term wordt gebruikt voor 'the ability to describe and follow the life of a requirement, in both forwards and backwards direction'? \n",
                    List.of(
                            new KortAntwoord("traceability"),
                            new KortAntwoord("tracebility"),
                            new KortAntwoord("traceabillity"),
                            new KortAntwoord("tracebillity")
                    )
            ),

            new MeerkeuzeVraag("In een project wordt gewerkt volgens een iteratieve en incrementele aanpak. Aan het begin van het project heb je de requirements opgesteld. Op welke momenten in het project kunnen de requirements gewijzigd worden?" +
                    "A: Op elke gewenst moment \n" +
                    "B: Na elke iteratie \n" +
                    "C: Niet meer, de requirements liggen vast \n",
                    new MeerkeuzeAntwoord('B')
            ),

            new JuistOnjuistVraag("De onderstaande eis R1 valt in de categorie Usability. R1: Het systeem moet 75% van de webpagina's binnen 2 seconden tonen. Voor de overige pagina's mag het nooit langer dan 5 seconden duren. \n",
                    new JuistOnjuistAntwoord(false)
            )
    );
}
