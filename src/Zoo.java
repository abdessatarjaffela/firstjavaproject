public class Zoo {
    Animal [] animals;
    String name;
    String city;
    final int nbrCages=25;

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;

    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + nbrCages;
    }
    public boolean addAnimal(Animal animal) {
        int index = 0;
          while (index < animals.length && animals[index] != null) {
            index++;
        }

        if (index < animals.length) {
            animals[index] = animal;
            return true;
        } else {
            return false;
        }
    }
    public void displayAnimals() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println("Animal " + (i + 1) + ":");
                System.out.println("Name: " + animals[i].getName());
                System.out.println("Family: " + animals[i].getFamily());
                System.out.println("Age: " + animals[i].getAge());
                System.out.println("Is Mammal: " + animals[i].isMammal());
                System.out.println();
            }
        }
    }
    public int searchAnimal(Animal animalS) {
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if (animal != null && animal.getName().equals(animalS.getName())) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animalS) {
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if (animal != null && animal.getName().equals(animalS.getName())) {
                animals[i] = null;
                return true;
            }
        }
        return false;
    }




}
