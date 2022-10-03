package Homeworks.homework16.cat_dog.animal;

public class Animal {

    private final String animalType;
    private final String name;
    private final String voice;

    public Animal(String animalType, String name, String voice) {
        this.animalType = animalType;
        this.name = name;
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "I am a " + animalType +
                ". My name is " + name +
                ". " + voice;
    }

    public void sound() {
        System.out.println(this);
    }
}
