package ShablonPeople;

import ShablonAnimal.*;
import ShablonTechnique.*;

public class Person {
    private int id;
    private String name;
    private int age;
    public Animal[] animals;
    public Technique[] techniques;

    public Person(int id, String name, int age, Animal[] animals, Technique[] techniques) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.animals = animals;
        this.techniques = techniques;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }


    public Technique[] getTechniques() {
        return techniques;
    }
    public void setTechniques(Technique[] techniques) {
        this.techniques = techniques;
    }


}
