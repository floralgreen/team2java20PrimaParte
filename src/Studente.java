import java.util.Arrays;
import java.util.Comparator;

public class Studente {

    public String nome;
    public String cognome;
    public int eta;
    public String città;
    public String passatempo;
    public String ciboPreferito;
    public String videogiocoPreferito;
    public String filmPreferito;
    public String libroPreferito;
    public String nomeCucciolo;

    public Studente(String nome, String cognome, int eta, String città, String passatempo,
                    String ciboPreferito, String videogiocoPreferito,
                    String filmPreferito, String libroPreferito, String nomeCucciolo){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.città=città;
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

    public int getEtà() {
        return eta;
    }

    public String getCittà() {
        return città;
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

    public void setEtà(int età) {
        this.eta = eta;
    }

    public void setCittà(String città) {
        this.città = città;
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

    public void riordinaPerEta(Studente[] team) {
        Arrays.sort(team, Comparator.comparingInt(studente -> studente.eta));
        for (Studente studente : team) {
            System.out.println("Nome: " + studente.nome + ", Cognome: " + studente.cognome + ", Età: " + studente.eta);
        }
    }
    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", età=" + eta +
                ", città='" + città + '\'' +
                ", passatempo='" + passatempo + '\'' +
                ", ciboPreferito='" + ciboPreferito + '\'' +
                ", videogiocoPreferito='" + videogiocoPreferito + '\'' +
                ", filmPreferito='" + filmPreferito + '\'' +
                ", libroPreferito='" + libroPreferito + '\'' +
                ", nomeCucciolo='" + nomeCucciolo + '\'' +
                '}';
    }

}

