import java.util.Scanner;
class Animal {
    String name;
    String family;
    int age;
    public Animal(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Nom : " + name
                + ", Famille : " + family
                + ", Age : " + age;
    }
}
class Zoo {

    String name;
    String city;
    int nbrCages;
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    @Override
    public String toString() {
        return "Nom du zoo : " + name + ", Ville : " + city + ", Nombre de cages : " + nbrCages;
    }
}
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;

        do {
            System.out.print("Donner le nom du zoo : ");
            name = sc.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Le nom du zoo ne doit pas être vide.");
            }

        } while (name.isEmpty());


        int nbrCages;

        do {
            System.out.print("Donner le nombre de cages : ");
            nbrCages = sc.nextInt();

            if (nbrCages <= 0) {
                System.out.println("Le nombre de cages doit être positif.");
            }

        } while (nbrCages <= 0);
        sc.nextLine();

        System.out.print("Donner la ville : ");
        String city = sc.nextLine();
        Zoo myZoo = new Zoo(name, city, nbrCages);
        Animal lion = new Animal("Simba", "Felidae", 5);
        Animal elephant = new Animal("Dumbo", "Elephantidae", 10);
        Animal tiger = new Animal("Tigrou", "Felidae", 7);

        myZoo.displayZoo();
        System.out.println();
        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(tiger);
        sc.close();
    }
}