package ShablonAnimal;

public class Dog extends Animal{
    public Dog(int id, String name, int age, boolean domesticAnimal) {
        super(id, name, age, domesticAnimal);
    }
    public Dog() {
        super();
    }
    @Override
    public void run(){
        System.out.println("Кадимки иттин орточо чуркоо ылдамдыгы саатына 10-15 км. \n" +
                " Ал эми көптөгөн породалар үчүн максималдуу ылдамдыгы болжол менен бирдей:\n " +
                "мисалы, немис овчаркалары жана добермандар 35 км / ч чейин чуркайт, \n" +
                "Caucasian койчулар - 30 км / ч чейин. \n" +
                "Бирок натыйжаларды дээрлик эки эсе тез көрсөтө алган уникалдуулары бар.");
    }
    @Override
    public void whatDoesItEat(){
        System.out.println("Иттер нан,соок,жугунду жейт. \n" +
                "Бирок уй жаныбары болгондуктан жакшы, \n" +
                "ден соолукту чындаган тамак бериш керек!!!");
    }
    @Override
    public void whereDoesItLive(){
        System.out.println("Акылдуу болгондуктан уйротуп, уйдо жашагыдай кылып уйротсо болот. \n" +
                "Бирок ит уй кайтарганга керек, ошон учун короодо уясында болгон жакшы!!!");
    }

}
