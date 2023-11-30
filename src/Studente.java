public class Studente {

    public String nome;
    public String cognome;
    public int eta;
    public String citta;
    public String passatempo;
    public String ciboPreferito;
    public String videogiocoPreferito;
    public String filmPreferito;
    public String libroPreferito;
    public String nomeCucciolo;

    public Studente(String nome, String cognome, int eta, String citta, String passatempo,
                    String ciboPreferito, String videogiocoPreferito,
                    String filmPreferito, String libroPreferito, String nomeCucciolo){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.citta=citta;
        this.passatempo=passatempo;
        this.ciboPreferito=ciboPreferito;
        this.videogiocoPreferito=videogiocoPreferito;
        this.filmPreferito=filmPreferito;
        this.libroPreferito=libroPreferito;
        this.nomeCucciolo=nomeCucciolo;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public String getCitta() {
        return citta;
    }

    public String getPassatempo() {
        return passatempo;
    }

    public String getCiboPreferito() {
        return ciboPreferito;
    }

    public String getVideogiocoPreferito() {
        return videogiocoPreferito;
    }

    public String getFilmPreferito() {
        return filmPreferito;
    }

    public String getLibroPreferito() {
        return libroPreferito;
    }

    public String getNomeCucciolo() {
        return nomeCucciolo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setPassatempo(String passatempo) {
        this.passatempo = passatempo;
    }

    public void setCiboPreferito(String ciboPreferito) {
        this.ciboPreferito = ciboPreferito;
    }

    public void setVideogiocoPreferito(String videogiocoPreferito) {
        this.videogiocoPreferito = videogiocoPreferito;
    }

    public void setFilmPreferito(String filmPreferito) {
        this.filmPreferito = filmPreferito;
    }

    public void setLibroPreferito(String libroPreferito) {
        this.libroPreferito = libroPreferito;
    }

    public void setNomeCucciolo(String nomeCucciolo) {
        this.nomeCucciolo = nomeCucciolo;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", citta='" + citta + '\'' +
                ", passatempo='" + passatempo + '\'' +
                ", ciboPreferito='" + ciboPreferito + '\'' +
                ", videogiocoPreferito='" + videogiocoPreferito + '\'' +
                ", filmPreferito='" + filmPreferito + '\'' +
                ", libroPreferito='" + libroPreferito + '\'' +
                ", nomeCucciolo='" + nomeCucciolo + '\'' +
                '}';
    }

    public static void printLolPlayers(Studente[] team) {
        String lolGame = "LOL";
        String leagueOfLegends = "League of Legends";

        for (int i = 0; i < team.length ; i++) {
            if(team[i] != null){
                if(team[i].videogiocoPreferito == lolGame || team[i].videogiocoPreferito == leagueOfLegends){
                    System.out.println(team[i].nome);
                }
            }
        }
    }

}
