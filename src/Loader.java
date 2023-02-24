
public class Loader
{
    public static void main(String[] args) {
        //создание объектов, 5-7
        //3.6 проверка конструктора с вводом имени и веса
        Cat murka = new Cat("Мурка",2000.);
        Cat vasya = new Cat("Вася");
        Cat shurka = new Cat();
        Cat firka = new Cat(5000.); //3.6 создание кошки через вес
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

        /*for(double i = shurka.getWeight(); i>1000; i--)
        {
            shurka.meow();
        }*/

        while(shurka.getWeight()>1000.){
            shurka.meow();
        }
        System.out.println("Shurka current status: "+shurka.getStatus());
        System.out.println("Shurka current weight: "+shurka.getWeight());

        shurka.drink(1.);

        //3.4 Проверка выполнения условий
        System.out.println("Cat.count: "+Cat.count);
        System.out.println("Cat.getCount(): "+Cat.getCount());

        //3.5
        murka.setTransportType(TransportType.CARGO_CAR);

        //3.5 проверка констант
        System.out.println("Всего глаз у кошки:"+Cat.CAT_EYES);
        System.out.println("Минимальный вес у кошки: "+Cat.CAT_MIN_WEIGHT);
        System.out.println("Максимальный вес у кошки: "+Cat.CAT_MAX_WEIGHT);

        //3.6 создание константы имени
        System.out.println(murka.getName());
        System.out.println(murka.getWeight());

        //3.6 проверка конструктора веса кошки
        System.out.println("Вес Мурки: "+murka.getWeight());
        System.out.println("Вес Фирки: "+firka.getWeight());

        /*Computer myNotebook = new Computer();
        myNotebook.processor = new Processor();
        //изменение переменных в объектах
        myNotebook.processor.coreCount = 4;
        myNotebook.processor.frequency = 2200;

        String name = new String();
        System.out.println(name.length());*/

        /*Cat cat = new Cat();
        System.out.println(cat.getStatus());*/

        //3.5.Задание создания перегруженного конструктора
        Cat cat1 = Loader.getKitten(1100.);
        Cat cat2 = Loader.getKitten(1100.);
        Cat cat3 = Loader.getKitten(1100.);
        System.out.println(cat1.getWeight()+cat2.getWeight()+cat3.getWeight());
    }
    private static Cat getKitten(double weight){
        return new Cat(weight);
    }

}