
public class Loader
{
    public static void main(String[] args)
    {
        //создание объектов
        Cat murka = new Cat();
        System.out.println("Murka weight: "+murka.getWeight());
        //вызов методов объектов
        murka.meow();
        System.out.println("Murka new weight: "+murka.getWeight());
        Cat vasya = new Cat();
        System.out.println("Vasya weight: "+vasya.getWeight());

        Computer myNotebook = new Computer();
        myNotebook.processor = new Processor();
        //изменение переменных в объектах
        myNotebook.processor.coreCount = 4;
        myNotebook.processor.frequency = 2200;

        String name = new String();
        System.out.println(name.length());

        /*Cat cat = new Cat();
        System.out.println(cat.getStatus());*/
    }
}