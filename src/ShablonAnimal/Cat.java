package ShablonAnimal;

public class Cat extends Animal{
    public Cat(int id, String name, int age, boolean domesticAnimal) {
        super(id, name, age, domesticAnimal);
    }
    public Cat() {
        super();
    }
    @Override
    public void run() {
        System.out.println("Фелинологдор мышыктын чуркоо ылдамдыгын саатына 13,5-13,8 километр деп аныкташат. \n" +
                "Ал эми мышыктын коркок, \n" +
                "шашылбаган тротусунун ылдамдыгы жайбаракат басып бараткан адамдын ылдамдыгынан \n" +
                "бир аз көбүрөөк - саатына 8 километрге жакын.");
    }
    @Override
    public void whatDoesItEat() {
        System.out.println("Кошачий кормдорду, балык, сут.");
    }
    @Override
    public void whereDoesItLive() {
        System.out.println("Уйдо жашашат. Фнткени уйдо пайдасы кобуроок!!!");
    }



}
