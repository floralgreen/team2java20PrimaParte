

public class Team {

    public static void main(String[] args) {

        Studente[] team = new Studente[5];

        Studente maria = new Studente("Maria", "Nappi", 27, "Molfetta"
                , "gym", "gelato", " The Sims", "Indiana Jones", "Mio nonno era un ciliegio", "Cuoricino di panna");

        team[0] = maria;

        maria.riordinaPerEta(team);
    }
}
