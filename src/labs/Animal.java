package labs;

public class Animal {
    String species;

    public Animal (String species) {
        this.species = species;
    }

    public String makeSounds() {
        return "Animal make sounds";
    }

    public String displayAnimalName() {
        return "I am a " + species;
    }

    public static void main (String[] args) {
        Dog myDog = new Dog("Dog");
        Pig myPig = new Pig("Pig");
        Animal[] myAnimals = {myDog, myPig};
        for (Animal eachAnimal : myAnimals) {
            System.out.println(eachAnimal.displayAnimalName());
            System.out.println(eachAnimal.makeSounds());
        }
    }
}

class Dog extends Animal {
    public Dog (String species){
        super(species);
    }

    public String makeSounds() {
        return "Woof! Woof!";
    }
}

class Pig extends Animal {
    public Pig (String species){
        super(species);
    }

    public String makeSounds() {
        return "Wee! Wee!";
    }
}



