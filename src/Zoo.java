public class Zoo {

    String name;
    String city;
    int nbrCages;
    Animal[] animals;

    // Prosit 3
    int nbrAnimals;

    // Prosit 3
    static final int MAX_ANIMALS = 25;


    public Zoo() {
        this.animals = new Animal[MAX_ANIMALS];
        this.nbrAnimals = 0;
        this.nbrCages = MAX_ANIMALS;
    }


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[MAX_ANIMALS];
        this.nbrAnimals = 0;
    }


    public void dispaly_zoo() {
        System.out.println("le nom du zoo" + this.name
                + " city " + this.city
                + ", nbr cgaes " + this.nbrCages);
    }


    public String toString() {
        return "le nom du zoo" + this.name
                + " city " + this.city
                + ", nbr cgaes " + this.nbrCages;
    }


    // =========================
    // PROSIT 3 - INSTRUCTION 10
    // =========================

    public boolean addAnimal(Animal animal) {

        if (nbrAnimals < animals.length) {

            animals[nbrAnimals] = animal;
            nbrAnimals++;

            return true;
        }

        return false;
    }


    // =========================
    // PROSIT 3 - INSTRUCTION 11
    // =========================

    public void displayAnimals() {

        for (int i = 0; i < nbrAnimals; i++) {

            System.out.println(
                    "Animal " + (i + 1)
                            + " : "
                            + animals[i].name
                            + " - "
                            + animals[i].family
                            + " - "
                            + animals[i].age
            );
        }
    }


    public int searchAnimal(String name) {

        for (int i = 0; i < nbrAnimals; i++) {

            if (animals[i].name.equals(name)) {

                return i;
            }
        }

        return -1;
    }


    // =========================
    // PROSIT 3 - INSTRUCTION 12
    // =========================

    public boolean addAnimalUnique(Animal animal) {

        if (searchAnimal(animal.name) != -1) {

            return false;
        }

        if (nbrAnimals < animals.length) {

            animals[nbrAnimals] = animal;
            nbrAnimals++;

            return true;
        }

        return false;
    }


    // =========================
    // PROSIT 3 - INSTRUCTION 13
    // =========================

    public boolean removeAnimal(Animal animal) {

        int index = searchAnimal(animal.name);

        if (index == -1) {

            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {

            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;

        nbrAnimals--;

        return true;
    }


    // =========================
    // PROSIT 3 - INSTRUCTION 15
    // =========================

    public boolean isZooFull() {

        return nbrAnimals >= nbrCages;
    }


    public Zoo comparerZoo(Zoo z1, Zoo z2) {

        if (z1.nbrAnimals >= z2.nbrAnimals) {

            return z1;
        }

        return z2;
    }
}