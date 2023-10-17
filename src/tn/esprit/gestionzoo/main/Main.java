package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnimalTerrestre lion = new AnimalTerrestre("Felidae", "Lion", 5, true,4);
        AnimalTerrestre elephant = new AnimalTerrestre("Elephantidae", "Elephant", 10, false,4);
        AnimalTerrestre giraffe = new AnimalTerrestre("Giraffidae", "Giraffe", 7, false,4);
        AnimalAquatique fish = new AnimalAquatique("Fish", "Nemo", 5, true, "Coral reef");
        Dauphin dolphin = new Dauphin("Mammal", "Dolly", 10, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Antarctic", 10.2f);

        Zoo myZoo = new Zoo("My Zoo", "My City", 25);
        Zoo myZoooo = new Zoo("My Zoo2", "My City2", 25);
        System.out.println(myZoo.addAnimal(fish));
        System.out.println(myZoo.addAnimal(dolphin));
        System.out.println(myZoo.addAnimal(penguin));
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoooo.addAnimal(elephant));
        System.out.println(myZoooo.addAnimal(giraffe));
        myZoo.displayAnimals();
        fish.swim();
        dolphin.swim();
        penguin.swim();

        Zoo result = Zoo.comparerZoo(myZoooo, myZoo);

        if (result != null) {
            System.out.println("The zoo with the most animals is: " + result.getName());
        } else {
            System.out.println("Both zoos have the same number of animals.");
        }

            }
}