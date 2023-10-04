package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal dog = new Animal("Pet", "Rex", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, false);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 7, false);
        Animal tiger = new Animal("Felidae", "Tiger", 6, true);
        Animal panda = new Animal("Ursidae", "Panda", 8, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 15, false);

        Zoo myZoo = new Zoo("My tn.esprit.gestionzoo.entities.Zoo", "My City", 25);
        Zoo myZoooo = new Zoo("My Zoo2", "My City2", 25);
        myZoo.displayZoo();
        System.out.println("----------------------------");
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(myZoooo.addAnimal(elephant));
        System.out.println(myZoooo.addAnimal(giraffe));
        System.out.println(myZoooo.addAnimal(tiger));
        System.out.println(myZoooo.addAnimal(panda));
        System.out.println(myZoooo.addAnimal(crocodile));
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(dog));
        System.out.println(myZoo.removeAnimal(dog));
        System.out.println(myZoo.isZooFull());
        System.out.println("----------------------------");
        Zoo result = Zoo.comparerZoo(myZoooo, myZoo);

        if (result != null) {
            System.out.println("The zoo with the most animals is: " + result.getName());
        } else {
            System.out.println("Both zoos have the same number of animals.");
        }

            }
}