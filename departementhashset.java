
package tn.esprit.gestiondepartement.services;

import tn.esprit.gestiondepartement.entities.Departement;
import tn.esprit.gestiondepartement.interfaces.IDepartement;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class DepartementHashSet implements IDepartement<Departement> {

    // Collection pour stocker les départements
    private Set<Departement> departements;

    // Constructeur
    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    // Ajouter un département
    @Override
    public void ajouterDepartement(Departement d) {

        if (departements.add(d)) {
            System.out.println("Département ajouté avec succès !");
        } else {
            System.out.println("Ce département existe déjà !");
        }
    }

    // Rechercher un département par son nom
    @Override
    public boolean rechercherDepartement(String nomDepartement) {

        for (Departement d : departements) {

            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }

        return false;
    }

    // Rechercher un département par objet
    @Override
    public boolean rechercherDepartement(Departement d) {

        return departements.contains(d);
    }

    // Supprimer un département
    @Override
    public void supprimerDepartement(Departement d) {

        if (departements.remove(d)) {
            System.out.println("Département supprimé avec succès !");
        } else {
            System.out.println("Département introuvable !");
        }
    }

    // Afficher tous les départements
    @Override
    public void afficherDepartements() {

        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    // Trier les départements par ID
    @Override
    public void trierDepartementsParId() {

        Set<Departement> departementsTries =
                new TreeSet<>(Comparator.comparingInt(Departement::getId));

        departementsTries.addAll(departements);

        for (Departement d : departementsTries) {
            System.out.println(d);
        }
    }

    // Trier par nom puis par nombre d'employés
    @Override
    public void trierDepartementsParNomEtNombreEmployes() {

        Set<Departement> departementsTries =
                new TreeSet<>(
                        Comparator.comparing(Departement::getNomDepartement)
                                .thenComparingInt(Departement::getNombreEmployes)
                                .thenComparingInt(Departement::getId)
                );

        departementsTries.addAll(departements);

        for (Departement d : departementsTries) {
            System.out.println(d);
        }
    }
}
