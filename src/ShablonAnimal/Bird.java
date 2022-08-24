package ShablonAnimal;

import Interface.CanDo;

public class Bird extends Animal implements CanDo {
    public Bird(int id, String name, int age, boolean domesticAnimal) {
        super(id, name, age, domesticAnimal);
    }
    public Bird() {
        super();
    }
    @Override
    public void run() {
        System.out.println("Боз турналар, сельд чардактары, чоң деңиз чардактары 50 км/саат ылдамдыкта учат, \n" +
                "мукурлар, сискиндер - 55 км/саат, өлтүргүч киттер - 55-60 км/саат, \n" +
                "ар кандай түрдөгү жапайы каздар - 70-90 км/саат. , wigeons - 75-85 км / ч, \n" +
                "ар кандай түрдөгү Waders - болжол менен 90 км / ч орточо.");
    }
    @Override
    public void whatDoesItEat() {
        System.out.println("Курт кумурскаларды, эт, кээ бири жылаандарды жешет!");
    }
    @Override
    public void whereDoesItLive() {
        System.out.println("Уяларда жашай. Ал уяны каяка курат чымчык озу чечет!");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }

}
