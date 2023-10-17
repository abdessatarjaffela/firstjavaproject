package tn.esprit.gestionzoo.entities;

public class AnimalAquatique extends Animal {
    private String habitat;

    public AnimalAquatique(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
