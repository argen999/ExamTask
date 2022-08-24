package Main;

import Interface.CanDo;
import ShablonPeople.*;
import ShablonAnimal.*;
import ShablonTechnique.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            method1();
        } else if (number == 2) {
            method2();
        } else {
            System.out.println("Андай метод жок елки!!!!!!!!");
        }



    }
    public static void method1() {
        firstMethod();
    }
    public static void firstMethod() {
        Scanner sc = new Scanner(System.in);
        Animal cat = new Cat(111111,"Джеси",2,true);
        Animal dog = new Dog(222222,"Rex",3,true);
        Animal eagle1 = new Eagle(333333,"Sancho",1,false);
        Animal eagle2 = new Eagle(444444,"Aigyr",1,false);
        Animal eagle3 = new Eagle(555555,"Bakla",1,false);
        Animal eagle4 = new Eagle(666666,"Turmush",1,false);
        Animal eagle5 = new Eagle(777777,"Bilal",1,false);
        Animal whiteSwam1 = new WhiteSwam(888888,"ASDF",4,false);
        Animal whiteSwam2 = new WhiteSwam(999999,"Germ",1,false);
        Animal whiteSwam3 = new WhiteSwam(112233,"Herou",5,false);
        Animal bird1 = new Bird(132343,"Fake",2,false);
        Animal bird2 = new Bird(142444,"Slke",6,false);

        Technique technique1 = new Airplane(666,"Uch",2019,"White-tailed eagle");
        Technique technique2 = new Airplane(123,"Jet",2020,"Wedge-tailed eagle");
        Technique technique3 = new Bayraktar(567,"Churka",2018,"Golden eagle");


        Animal[] animals = {cat,dog,eagle1,eagle2,eagle3,eagle4,eagle5,
                whiteSwam1,whiteSwam2,whiteSwam3,bird1,bird2};

        Technique[] techniques = {technique1,technique2,technique3};

        Person person1 = new Person(1222324252,"Асан",18,animals,techniques);


        Animal animal1 = new Cat(456,"Quis",1,true);
        Animal animal2 = new Dog(32476354,"Ak tosh",3,true);
        Animal animal3 = new Dog(239823,"Fantom",3,true);
        Animal animal4 = new Eagle(352363,"Bik",1,false);
        Animal animal5 = new Eagle(345872934,"ilal",1,false);
        Animal animal6 = new Eagle(32532498,"Bil",1,false);
        Animal animal7 = new Eagle(10732159,"lala",1,false);
        Animal animal8 = new WhiteSwam(233468456,"Horoi",5,false);
        Animal animal9 = new WhiteSwam(90058728,"Horoirou",5,false);
        Animal animal10 = new Bird(45872987,"Gwof",7,false);
        Animal animal11 = new Bird(34637648,"Dkjr",2,false);
        Animal animal12 = new Bird(57357235,"Jkja",8,false);

        Technique techniques1 = new Tank(982375,"jueo",2019,"container");
        Technique techniques2 = new Tank(447495,"djir",2019,"vessel");
        Technique techniques3 = new Tank(728798,"skfur",2019,"cauldron");
        Technique techniques4 = new Helicopter(9326438,"iemdu",2022,"Eurocopter UH-72 Lakota");
        Technique techniques5 = new Helicopter(38745,"fdgh",2022,"MD 500 Defender");
        Technique techniques6 = new Helicopter(6328395,"wyubhf",2022,"Sikorsky SH-60 Seahawk");
        Technique techniques7 = new Helicopter(947478,"wuvhbg",2022,"Multimission maritime ");
        Technique techniques8 = new Helicopter(1743832,"qwuqr",2022,"Boeing AH-64 Apache");


        Animal[] animalss = {animal1,animal2,animal3,animal4,animal5,animal6,
                animal7,animal8,animal9,animal10,animal11,animal12};

        Technique[] technique = {techniques1,techniques2,techniques3,techniques4,
                techniques5,techniques6,techniques7,techniques8};

        Person person2 = new Person(1323334353,"Усон",34,animalss,technique);


        Animal animals1 = new Cat(456,"dfh",1,true);
        Animal animals2 = new Cat(456,"Quihggs",1,true);
        Animal animals3 = new Dog(32476354,"Asddsfsb",3,true);
        Animal animals4 = new Eagle(10732159,"cgjfj",1,false);
        Animal animals5 = new Eagle(10732159,"hljkjos",1,false);
        Animal animals6 = new Eagle(10732159,"sgybgb",1,false);
        Animal animals7 = new Eagle(10732159,"ewuhnjvf",1,false);
        Animal animals8 = new Eagle(10732159,"wjbjncko",1,false);
        Animal animals9 = new Eagle(10732159,"wehncmi",1,false);
        Animal animals10 = new WhiteSwam(90058728,"ewnjcmvmk",5,false);
        Animal animals11 = new WhiteSwam(90058728,"ewprnnomk",5,false);
        Animal animals12 = new WhiteSwam(90058728,"kmkonginj",5,false);
        Animal animals13 = new WhiteSwam(90058728,"uiesjnt",5,false);
        Animal animals14 = new WhiteSwam(90058728,"pwenjn",5,false);
        Animal animals15 = new Bird(57357235,"Jkja",8,false);

        Technique techniquess3 = new Sidan(567,"rmtpv ",2018,"Golden");
        Technique techniquess4 = new Bayraktar(567,"srngjn",2018,"Golden eagle");

        Animal[] animals16 = {animals1,animals2,animals2,animals3,animals4,animals5,animals6,
                animals7,animals7,animals8,animals9,animals10,animals11,animals12,animals13,animals14,animals15};


        Technique[] techniques9 = {techniquess3,techniquess4};

        Person person3 = new Person(1121314151,"Адыл",22,animals16,techniques9);

        Animal a1 = new Bird();
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        Animal a4 = new Eagle();
        Animal a5 = new WhiteSwam();
        Technique a6 = new Airplane();
        Technique a7 = new Bayraktar();
        Technique a8 = new Helicopter();
        Technique a9 = new Sidan();
        Technique a10 = new Tank();
        Animal[] masssiv = {a1,a2,a3,a4,a5};
        Technique[] masssiv1 = {a6,a7,a8,a9,a10};

        for (Animal a:masssiv) {
            if (a instanceof Bird) {
                System.out.println("Птица\n");

            } else if (a instanceof Cat) {
                System.out.println("Кот\n");
            } else if (a instanceof Dog) {
                System.out.println("Собака\n");
            } else if (a instanceof Eagle) {
                System.out.println("Ороль\n");
            } else  {
                System.out.println("Лебедь\n");
            }
            System.out.println("Run method");
            a.run();
            System.out.println("\n\n");
            System.out.println("What does it eat?");
            a.whatDoesItEat();
            System.out.println("\n\n");
            System.out.println("Where does it live?");
            a.whereDoesItLive();
            System.out.println("\n\n");
            if (a instanceof Eagle || a instanceof Bird || a instanceof WhiteSwam) {
                System.out.println("\n\n");
                System.out.println("Fly");
                ((CanDo) a).fly();
                System.out.println("\n\n");
            }
        }
        for (Technique aa:masssiv1) {
            if (aa instanceof Airplane) {
                System.out.println("Самолет\n");

            } else if (aa instanceof Bayraktar) {
                System.out.println("Истребитель авто пилот!\n");
            } else if (aa instanceof Helicopter) {
                System.out.println("Верталет\n");
            } else if (aa instanceof Sidan) {
                System.out.println("Сидан\n");
            } else  {
                System.out.println("Танка\n");
            }
            System.out.println("Oils");
            aa.oils();
            System.out.println("\n\n");
            System.out.println("Capa city");
            aa.capaCity();
            System.out.println("\n\n");
            if (aa instanceof Airplane || aa instanceof Bayraktar || aa instanceof Helicopter) {
                System.out.println("\n\n");
                System.out.println("Fly");
                ( (CanDo) aa).fly();
                System.out.println("\n\n");
            }
        }

        System.out.println("\n\n\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ат жаз:");
            String soz = sc.nextLine();
            if (person1.getName().equals(soz)) {
                for (Animal p:person1.animals) {
                    System.out.println("Айди = "+p.getId() );
                    System.out.println("Аты = "+p.getName() );
                    System.out.println("Жашы = "+p.getAge() );
                    System.out.println("Домашние = "+p.getDomesticAnimal() );
                    System.out.println("--------------------------");
                }
                System.out.println("\n\n\n");
                for (Technique t:person1.techniques) {
                    System.out.println("id = "+t.getId() );
                    System.out.println("name = "+t.getName() );
                    System.out.println("year = "+t.getYear() );
                    System.out.println("model = "+t.getModel() );
                    System.out.println("---------------------------");
                }
            } else if (person2.getName().equals(soz)) {
                for (Animal p:person2.animals) {
                    System.out.println("Айди = "+p.getId() );
                    System.out.println("Аты = "+p.getName() );
                    System.out.println("Жашы = "+p.getAge() );
                    System.out.println("Домашние = "+p.getDomesticAnimal() );
                    System.out.println("--------------------------");
                }
                System.out.println("\n\n\n");
                for (Technique t:person2.techniques) {
                    System.out.println("id = "+t.getId() );
                    System.out.println("name = "+t.getName() );
                    System.out.println("year = "+t.getYear() );
                    System.out.println("model = "+t.getModel() );
                    System.out.println("---------------------------");
                }
            } else if (person3.getName().equals(soz)) {
                for (Animal p:person3.animals) {
                    System.out.println("Айди = "+p.getId() );
                    System.out.println("Аты = "+p.getName() );
                    System.out.println("Жашы = "+p.getAge() );
                    System.out.println("Домашние = "+p.getDomesticAnimal() );
                    System.out.println("--------------------------");
                }
                System.out.println("\n\n\n");
                for (Technique t:person3.techniques) {
                    System.out.println("id = "+t.getId() );
                    System.out.println("name = "+t.getName() );
                    System.out.println("year = "+t.getYear() );
                    System.out.println("model = "+t.getModel() );
                    System.out.println("---------------------------");
                }

            } else {
                System.out.println("Жашоо керемет!");
            }

        }



    }
    public static void method2() {
        secondMethod();
    }
    public static void secondMethod() {
        Animal eagle1 = new Eagle(333333,"Sancho",1,false);
        Animal animals1 = new Cat(456,"dfh",1,true);
        Animal animals13 = new WhiteSwam(90058728,"uiesjnt",5,false);
        Animal animal2 = new Dog(32476354,"Ak tosh",3,true);
        Animal animals15 = new Bird(57357235,"Jkja",8,false);
        Animal[] animals = {eagle1,animals1,animals13,animal2,animals15};

        Technique techniquess3 = new Sidan(567,"rmtpv ",2018,"Golden");
        Technique techniquess4 = new Bayraktar(567,"srngjn",2018,"Golden eagle");
        Technique techniques8 = new Helicopter(1743832,"qwuqr",2022,"Boeing AH-64 Apache");
        Technique techniques1 = new Tank(982375,"jueo",2019,"container");
        Technique technique2 = new Airplane(123,"Jet",2020,"Wedge-tailed eagle");
        Technique[] techniques = {techniquess3,techniquess4,techniques8,techniques1,technique2};

        Animal[] uchpait = new Animal[5];
        Animal[] uchat = new Animal[5];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat || animals[i] instanceof Dog) {
                System.out.println("Учпаган жаныбарлар!");
                uchpait[i] = animals[i];
                System.out.println(uchpait[i].getId() );
                System.out.println(uchpait[i].getName() );
                System.out.println(uchpait[i].getAge() );
                System.out.println(uchpait[i].getDomesticAnimal() );
                System.out.println("--------------------------");
            } else if (animals[i] instanceof Eagle || animals[i] instanceof WhiteSwam || animals[i] instanceof Bird) {
                System.out.println("Учкан жаныбарлар!");
                uchat[i] = animals[i];
                System.out.println(uchat[i].getId() );
                System.out.println(uchat[i].getName() );
                System.out.println(uchat[i].getAge() );
                System.out.println(uchat[i].getDomesticAnimal() );
                System.out.println("--------------------------");
            }
        }
        System.out.println("\n\n\n\n");
        Technique[] uchpait1 = new Technique[5];
        Technique[] uchat2 = new Technique[5];
        for (int i = 0; i < techniques.length; i++) {
            if (techniques[i] instanceof Tank || techniques[i] instanceof Sidan) {
                System.out.println("Учпаган техника");
                uchpait1[i] = techniques[i];
                System.out.println(uchpait1[i].getId() );
                System.out.println(uchpait1[i].getName() );
                System.out.println(uchpait1[i].getYear() );
                System.out.println(uchpait1[i].getModel() );
                System.out.println("--------------------------");
            } else if (techniques[i] instanceof Airplane || techniques[i] instanceof Helicopter || techniques[i] instanceof Bayraktar) {
                System.out.println("Учкан техника");
                uchat2[i] = techniques[i];
                System.out.println(uchat2[i].getId() );
                System.out.println(uchat2[i].getName() );
                System.out.println(uchat2[i].getYear() );
                System.out.println(uchat2[i].getModel() );
                System.out.println("--------------------------");
            }
        }




    }

}
