package ShablonAnimal;

import Interface.CanDo;

public abstract class Animal  {
    private int id;
    private String name;
    private int age;
    private boolean domesticAnimal;

    public Animal(int id, String name, int age, boolean domesticAnimal) {
        this.id = id;

        if (name.length() <=  2) {
            System.out.println("2 тамгадан аз ат берген болбойт! \n" +
                    "2 тамгадан жогору ат бериниз!!");
        } else {
            this.name = name;
        }

        if (age < 0) {
            System.out.println("Жашын терс бергенге болбойт!");
        } else {
            this.age = age;
        }

        this.domesticAnimal = domesticAnimal;
    }
    public Animal() {
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
        if (name.length() <=  2) {
            System.out.println("2 тамгадан аз ат берген болбойт! \n" +
                    "2 тамгадан жогору ат бериниз!!");
        } else {
            this.name = name;
        }
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Жашын терс бергенге болбойт!");
        } else {
            this.age = age;
        }
    }


    public boolean getDomesticAnimal() {
        return domesticAnimal;
    }
    public void setDomesticAnimal(boolean domesticAnimal) {
        this.domesticAnimal = domesticAnimal;
    }

    public abstract void run();
    public abstract void whatDoesItEat();
    public abstract void whereDoesItLive();



}
