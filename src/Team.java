import java.util.Arrays;

public class Team {

    public static void main(String[] args) {

        Studente[] team = new Studente[5];

        Studente federico = new Studente("Federico","Carducci", 23, "Ceprano",
                "Music", "Pasta", "LOL",
                "Arancia Meccanica", "Uno Nessuno Centomila", "Mokaccina");

        team[0] = federico;

        federico.printLolPlayers(team);

    }
}
