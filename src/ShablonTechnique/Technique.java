package ShablonTechnique;

import Interface.CanDo;

public abstract class Technique {
    private int id;
    private String name;
    private int year;
    private String model;

    public Technique(int id, String name, int year, String model) {
        this.id = id;
        String sox = name.toUpperCase();
        if (sox == sox.toUpperCase()) {
            this.name = sox;
        } else {
            System.out.println("Тамгалар чон болуш керек!");
        }

        if (year > 2016 && year <= 2033) {
            this.year = year;
        } else {
            System.out.println("Эскирип калыптыр, жанысын алып келиниз!");
        }

        this.model = model;
    }
    public Technique() {

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
        if (name == name.toUpperCase()) {
            this.name = name;
        } else {
            System.out.println("Тамгалар чон болуш керек!");
        }
    }


    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year > 2018 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("Эскирип калыптыр, жанысын алып келиниз!");
        }
    }


    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }


    public  abstract void oils();
    public  abstract void capaCity();



}
