package ShablonTechnique;

public class Sidan extends Technique{
    public Sidan(int id, String name, int year, String model) {
        super(id, name, year, model);
    }
    public Sidan() {

    }
    @Override
    public void oils() {
        System.out.println("Бензин!");
    }
    @Override
    public void capaCity() {
        System.out.println("5 киши");
    }


}
