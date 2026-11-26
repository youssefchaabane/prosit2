
package tn.esprit.gestiondepartement.main;

import tn.esprit.gestiondepartement.entities.Departement;
import tn.esprit.gestiondepartement.services.DepartementHashSet;

public class Main {

    public static void main(String[] args) {

        // Création de la collection
        DepartementHashSet gestion = new DepartementHashSet();

        // Création des départements
        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Finance", 15);
        Departement d3 = new Departement(3, "Ressources Humaines", 8);
        Departement d4 = new Departement(4, "Marketing", 12);

        // Ajouter les départements
        System.out.println("=== Ajouter les départements ===");

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4);

        // Tester l'ajout d'un doublon
        Departement d5 = new Departement(1, "Informatique", 20);

        gestion.ajouterDepartement(d5);

        // Afficher les départements
        System.out.println("\n=== Afficher les départements ===");

        gestion.afficherDepartements();

        // Rechercher par nom
        System.out.println("\n=== Recherche par nom ===");

        System.out.println(
                gestion.rechercherDepartement("Finance")
        );

        System.out.println(
                gestion.rechercherDepartement("Comptabilité")
        );

        // Rechercher par objet
        System.out.println("\n=== Recherche par objet ===");

        System.out.println(
                gestion.rechercherDepartement(d1)
        );

        // Trier par ID
        System.out.println("\n=== Tri par ID ===");

        gestion.trierDepartementsParId();

        // Trier par nom et nombre d'employés
        System.out.println(
                "\n=== Tri par nom et nombre d'employés ==="
        );

        gestion.trierDepartementsParNomEtNombreEmployes();

        // Supprimer un département
        System.out.println("\n=== Supprimer un département ===");

        gestion.supprimerDepartement(d2);

        // Afficher après suppression
        System.out.println(
                "\n=== Affichage après suppression ==="
        );

        gestion.afficherDepartements();
    }
}
