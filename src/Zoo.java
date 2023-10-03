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
    public String getName() {
        return name;
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
    public boolean isZooFull() {
        int numberOfAnimals = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                numberOfAnimals++;
            }
        }

        return numberOfAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int countZoo1 = z1.countAnimals();
        int countZoo2 = z2.countAnimals();

        if (countZoo1 > countZoo2) {
            return z1;
        } else if (countZoo2 > countZoo1) {
            return z2;
        } else {
            return null;
        }
    }

    private int countAnimals() {
        int numberOfAnimals = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                numberOfAnimals++;
            }
        }
        return numberOfAnimals;
    }





}
