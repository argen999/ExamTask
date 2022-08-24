package ShablonAnimal;

import Interface.CanDo;

public class WhiteSwam extends Animal implements CanDo {
    public WhiteSwam(int id, String name, int age, boolean domesticAnimal) {
        super(id, name, age, domesticAnimal);
    }
    public WhiteSwam() {
        super();
    }
    @Override
    public void run() {
        System.out.println("скорость белого лебедя  — 60 км/час\n" +
                "Максимальная скорость полета лебедя — 90 км/ч.\n" +
                "Сильная мускулатура позволяет лебедям совершать долгие перелеты в тысячи километров на юг и обратно в родные места.\n" +
                "Примечательно, что лебеди поднимаются на высоту до 8000 м благодаря прекрасному оперению, согревающему птиц.\n" +
                "Даже на лодке их догнать невозможно. Если взлететь птица не может, она ныряет и плывет под водой от опасности.\n" +
                "Хотя с воды взлетает эта птица тяжело, долго разбегается, шлепая по воде лапами, и лишь постепенно набирает скорость и высоту. \n" +
                "Летит, вытянув шею, с редкими, но сильными взмахами крыльев, производящими шорох.\n" +
                "Теперь Вы знаете с какой скоростью летит лебедь и какие расстояния преодолевают эти птицы.");
    }
    @Override
    public void whatDoesItEat() {
        System.out.println("Негизги азыгы суу өсүмдүктөрү жана алардагы майда жаныбарлар \n" +
                "(моллюскалар, суу эшектери). Канаттуу 70-90 см тереңдикке жетет. \n" +
                "Жер бетинде ак куу чөп жана дан эгиндери менен азыктанат. \n" +
                "Эрүү мезгилинде бойго жеткен канаттуулар 4 кг чейин суу өсүмдүктөрүн жешет.");
    }
    @Override
    public void whereDoesItLive() {
        System.out.println("Ак куулар Евразияда, Түндүк жана Түштүк Америкада, \n" +
                "Австралияда кеңири таралган. Бул канаттуулар суу сактагычтардын жээктеринде жашашат \n" +
                "жана салыштырмалуу кичинекей дарыяларда жана көлдөрүндө, \n" +
                "ошондой эле ири суу сактагычтардын жээгинде - деңиз лагуналарында жана эстуарийлерде жашай алышат.");
    }

    @Override
    public void fly() {
        System.out.println("учам");
    }

}
