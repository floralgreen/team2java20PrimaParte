import java.util.Arrays;

public class Team {

    public static void main(String[] args) {

        Studente[] team = new Studente[5];
        Studente studente1 = new Studente("Ivan","Piccioni",28,"Roma",
                "Videogiochi","Pasta", "DarkSouls3",
                "LordofTheRing", "LordOfTheRing","Athena");

        Studente maria = new Studente("Maria", "Nappi", 27, "Molfetta"
                , "gym", "gelato", " The Sims", "Indiana Jones", "Mio nonno era un ciliegio", "Cuoricino di panna");

        Studente federico = new Studente("Federico","Carducci", 23, "Ceprano",
                "Music", "Pasta", "LOL",
                "Arancia Meccanica", "Uno Nessuno Centomila", "Mokaccina");
        team[3] = studente1;
        team[0] = federico;
        team[1] = maria;



        System.out.println("i dati dello studente  sono=" + team[3]);
        studente1.membriConLoStessoNome();
        federico.printLolPlayers(team);

        maria.riordinaPerEta(team);
    }
}
