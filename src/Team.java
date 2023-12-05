import java.util.Arrays;

public class Team {

    public static void main(String[] args) {

        Studente[] team = new Studente[5];
        Studente ivan = new Studente("Ivan","Piccioni",28,"Roma",
                "Videogiochi","Pasta", "DarkSouls3",
                "LordofTheRing", "LordOfTheRing","Athena");

        Studente maria = new Studente("Maria", "Nappi", 27, "Molfetta"
                , "gym", "gelato", " The Sims", "Indiana Jones", "Mio nonno era un ciliegio", "Cuoricino di panna");

        Studente federico = new Studente("Federico","Carducci", 23, "Ceprano",
                "Music", "Pasta", "LOL",
                "Arancia Meccanica", "Uno Nessuno Centomila", "Mokaccina");


        Studente luigi = new Studente("Luigi", "Mottola", 25, "Lusciano",
                "Table Top Gaming", "Pizza", "Killzone 2",
                "The Lord of the Rings (Original Trilogy)","The Lord of the Rings",
                "Macchia");

        team[0] = federico;
        team[1] = maria;
        team[2] = luigi;
        team[3] = ivan;



        //Method
        luigi.petPrinter(team);
        ivan.membriConLoStessoNome(team);
        federico.printLolPlayers(team);
        maria.riordinaPerEta(team);
    }
}
