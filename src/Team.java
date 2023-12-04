public class Team {

    public static void main(String[] args) {

        Studente[] team = new Studente[5];

        Studente luigi = new Studente("Luigi", "Mottola", 25, "Lusciano",
                "Table Top Gaming", "Pizza", "Killzone 2",
                "The Lord of the Rings (Original Trilogy)","The Lord of the Rings",
                "Macchia");

        team[3] = luigi;

        // Object Print Line
        System.out.println("The student's data are: " + luigi);

        //Method
        luigi.petPrinter(team);

// Old System Out Print Line (Week 1)

        System.out.println("Ivan, Piccioni, 28 , Roma" +
                "videogiochi , Pasta , Dark Souls 3 , Lord of the rign"+
                "lord of the ring, Athena");

        System.out.println("Stefano,Forcinito,33,Fabrica di Roma,Calcetto,Pizza,Fifa,Fast and Furius,Piccoli Brividi," +
               "Milo");

        System.out.println("Federico, Carducci, 23, Frosinone," +
                " Music, Pasta, Bloodborne, Arancia Meccaninca," +
                " Uno Nessuno Centomila, Mokaccina");

        System.out.println("Luigi, Mottola, 25, Lusciano, " +
                "Table Top Gaming, Pizza, Killzone 2, The Lord of the Rings (Original Trilogy), " +
                "The Lord of the Rings, Macchia");

        System.out.println("Maria, Nappi, 27, Molfetta, gym, gelato, The Sims" +
                "Indiana Jones, Mio nonno era un ciliegio, Cuoricino di panna");

    }
}
