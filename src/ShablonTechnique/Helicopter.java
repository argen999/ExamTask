package ShablonTechnique;

import Interface.CanDo;

public class Helicopter extends Technique implements CanDo {
    public Helicopter(int id, String name, int year, String model) {
        super(id, name, year, model);
    }
    public Helicopter() {

    }
    @Override
    public void oils() {
        System.out.println("Бензин или керосин!");
    }
    @Override
    public void capaCity() {
        System.out.println("2 орундук!");
    }

    @Override
    public void fly() {

    }
}
