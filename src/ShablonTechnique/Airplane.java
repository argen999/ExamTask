package ShablonTechnique;

import Interface.CanDo;

public class Airplane extends Technique implements CanDo {
    public Airplane(int id, String name, int year, String model) {
        super(id, name, year, model);
    }
    public Airplane() {

    }
    @Override
    public void oils() {
        System.out.println("Керосин или бензин");
    }
    @Override
    public void capaCity() {
        System.out.println("525 пассажиров средний!");
    }

    @Override
    public void fly() {

    }
}
