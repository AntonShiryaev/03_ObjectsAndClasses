
public class Loader
{
    public static void main(String[] args) {
        //создание объектов, 5-7
        Cat murka = new Cat();
        Cat vasya = new Cat();
        Cat shurka = new Cat();
        Cat firka = new Cat();
        Cat tirka = new Cat();

        //1.вывести вес
        System.out.println("Murka weight: " + murka.getWeight());
        System.out.println("Vasya weight: " + vasya.getWeight());
        System.out.println("shurka weight: " + shurka.getWeight());
        System.out.println("firka weight: " + firka.getWeight());
        System.out.println("tirka weight: " + tirka.getWeight());

        //2.покормить двух, распечатать вес

        murka.feed(50.); //double
        System.out.println("\nMurka new weight: " + murka.getWeight());
        vasya.feed(300.);
        System.out.println("Vasya new weight: " + vasya.getWeight());

        //3.Перекормить
        vasya.drink(10000.);
        System.out.println("Vasya new weight: " + vasya.getWeight());
        System.out.println(vasya.getStatus());

        //4.Замяукать
        for(double i = shurka.getWeight(); i>999; i--)
        {
            shurka.meow();
            System.out.println(i);
            System.out.println(shurka.getStatus());
        }

            shurka.meow();
            System.out.println("shurka weight: " + shurka.getWeight());

        System.out.println("Hello");
        System.out.println("shurka minweight: " + shurka.getminWeight());



        /*Computer myNotebook = new Computer();
        myNotebook.processor = new Processor();
        //изменение переменных в объектах
        myNotebook.processor.coreCount = 4;
        myNotebook.processor.frequency = 2200;

        String name = new String();
        System.out.println(name.length());*/

        /*Cat cat = new Cat();
        System.out.println(cat.getStatus());*/
    }
}