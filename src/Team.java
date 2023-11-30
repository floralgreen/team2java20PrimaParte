public class Team {

    public static void main(String[] args) {

        Studente[] team = new Studente[5];

        Studente federico = new Studente("Federico","Carducci", 23, "Ceprano",
                "Music", "Pasta", "Bloodborne",
                "Arancia Meccanica", "Uno Nessuno Centomila", "Mokaccina");

        team[0] = federico;

        Studente.printLolPlayers(team);

        System.out.println("Ivan, Piccioni, 28 , Roma" +
                "videogiochi , Pasta , Dark Souls 3 , Lord of the rign"+
                "lord of the ring, Athena");

        System.out.println("Stefano,Forcinito,33,Fabrica di Roma,Calcetto,Pizza,Fifa,Fast and Furius,Piccoli Brividi," +
               "Milo");

        System.out.println("Luigi, Mottola, 25, Lusciano, " +
                "Table Top Gaming, Pizza, Killzone 2, The Lord of the Rings (Original Trilogy), " +
                "The Lord of the Rings, Macchia");

        System.out.println("Maria, Nappi, 27, Molfetta, gym, gelato, The Sims" +
                "Indiana Jones, Mio nonno era un ciliegio, Cuoricino di panna");

    }
}
