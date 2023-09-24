// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal lion =new Animal("Felidae", "Lion", 5, true);
        Animal dog =new Animal("pet", "rex", 4, true);
        System.out.println(lion.isMammal);
        System.out.println(lion.name);

        Zoo myZoo = new Zoo("My Zoo", "My City", 25);
        myZoo.displayZoo();
        System.out.println("----------------------------");
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(dog));
        System.out.println(myZoo.removeAnimal(dog));

            }
}