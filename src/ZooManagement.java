import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // =========================
        // PROSIT 1
        // =========================

        String name;

        do {

            System.out.print("Donner le nom du zoo : ");

            name = sc.nextLine().trim();

            if (name.isEmpty()) {

                System.out.println(
                        "Le nom du zoo ne doit pas être vide."
                );
            }

        } while (name.isEmpty());


        int nbrCages;

        do {

            System.out.print("Donner le nombre de cages : ");

            nbrCages = sc.nextInt();

            if (nbrCages <= 0) {

                System.out.println(
                        "Le nombre de cages doit être positif."
                );
            }

        } while (nbrCages <= 0);


        sc.nextLine();


        // =========================
        // PROSIT 2
        // =========================

        Zoo zoo1 = new Zoo(name, "Tunis", nbrCages);


        new Animal("you", "chaaaaa", 5, true);


        Animal lion = new Animal();

        lion.name = "youssef";
        lion.family = "cha";
        lion.age = 5;
        lion.isMammal = true;


        Zoo myZoo = new Zoo();

        myZoo.name = "beleve";
        myZoo.city = "tunis";
        myZoo.nbrCages = 20;


        zoo1.dispaly_zoo();

        System.out.println(myZoo);

        System.out.println(myZoo.toString());


        // =========================
        // PROSIT 3
        // =========================

        Animal elephant =
                new Animal("Elephantidae", "Elephant", 10, true);

        Animal tiger =
                new Animal("Felidae", "Tigre", 7, true);

        Animal giraffe =
                new Animal("Giraffidae", "Girafe", 8, true);


        // Instruction 10
        System.out.println(
                "Ajout du lion : "
                        + zoo1.addAnimal(lion)
        );

        System.out.println(
                "Ajout de l'elephant : "
                        + zoo1.addAnimal(elephant)
        );

        System.out.println(
                "Ajout du tigre : "
                        + zoo1.addAnimal(tiger)
        );


        // Instruction 11
        System.out.println();

        System.out.println("Liste des animaux :");

        zoo1.displayAnimals();


        System.out.println();

        System.out.println(
                "Position du lion : "
                        + zoo1.searchAnimal("youssef")
        );


        // Instruction 11
        Animal lion2 =
                new Animal("cha", "youssef", 5, true);

        System.out.println();

        System.out.println(
                "Recherche du deuxieme lion : "
                        + zoo1.searchAnimal(lion2.name)
        );


        // Instruction 12
        System.out.println();

        System.out.println(
                "Ajout du lion une deuxieme fois : "
                        + zoo1.addAnimalUnique(lion2)
        );


        // Instruction 13
        System.out.println();

        System.out.println(
                "Suppression du tigre : "
                        + zoo1.removeAnimal(tiger)
        );


        System.out.println();

        System.out.println("Animaux apres suppression :");

        zoo1.displayAnimals();


        // Instruction 15
        System.out.println();

        System.out.println(
                "Le zoo est plein : "
                        + zoo1.isZooFull()
        );


        // Deuxieme zoo
        Zoo zoo2 =
                new Zoo("Zoo2", "Sousse", 20);


        zoo2.addAnimal(
                new Animal("Ursidae", "Panda", 4, true)
        );

        zoo2.addAnimal(
                new Animal("Giraffidae", "Girafe", 8, true)
        );

        zoo2.addAnimal(
                new Animal("Equidae", "Zebre", 6, true)
        );


        // Comparaison des deux zoos
        Zoo zooPlusGrand =
                zoo1.comparerZoo(zoo1, zoo2);


        System.out.println();

        System.out.println(
                "Zoo qui contient le plus d'animaux : "
                        + zooPlusGrand.name
        );


        sc.close();
    }
}