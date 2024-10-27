package Entity;

public class Etudiant {

    private int id;
    private String nomComplet;
    private String cin;
    private String dateNaissance;
    private String filiere;

    public Etudiant(int id, String nomComplet, String cin, String dateNaissance, String filiere) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.cin = cin;
        this.dateNaissance = dateNaissance;
        this.filiere = filiere;
    }

    public Etudiant() {
    }

    public int getId() {
        return id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getCin() {
        return cin;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}
