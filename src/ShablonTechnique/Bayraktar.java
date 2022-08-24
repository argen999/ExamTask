package ShablonTechnique;

import Interface.CanDo;

public class Bayraktar extends Technique implements CanDo {
    public Bayraktar(int id, String name, int year, String model) {
        super(id, name, year, model);
    }
    public Bayraktar() {

    }
    @Override
    public void oils() {
        System.out.println("Керосин или бензин!");
    }
    @Override
    public void capaCity() {
        System.out.println("Авто пилот!");
    }

    @Override
    public void fly() {

    }
}
