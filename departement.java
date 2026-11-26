
package tn.esprit.gestiondepartement.entities;

import java.util.Objects;

public class Departement {

    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // Constructeur par défaut
    public Departement() {
    }

    // Constructeur paramétré
    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Getter et Setter de id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter et Setter de nomDepartement
    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    // Getter et Setter de nombreEmployes
    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // Redéfinition de equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Departement d = (Departement) obj;

        return id == d.id &&
                Objects.equals(nomDepartement, d.nomDepartement);
    }

    // Redéfinition de hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement);
    }

    // Redéfinition de toString()
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}
