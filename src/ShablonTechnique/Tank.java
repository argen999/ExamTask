package ShablonTechnique;

public class Tank extends Technique{
    public Tank(int id, String name, int year, String model) {
        super(id, name, year, model);
    }
    public Tank() {

    }
    @Override
    public void oils() {
        System.out.println("Салярка менен журот!");
    }
    @Override
    public void capaCity() {
        System.out.println("3 орундук же 4 орундуак болот!");
    }


}
