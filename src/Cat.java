
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    //3.4 увелич если кошку создали, убывать если взорв или умерл
    public static int count = 0;
    //3.4 возвращает общее кол-во кошек
    public static int getCount(){
        return count;
    }

    //3.5 создать константы
    public static final int CAT_EYES = 2;
    public static final double CAT_MIN_WEIGHT = 1000.0;
    public static final double CAT_MAX_WEIGHT = 9000.0;
    //3.5 enum добавить окрасы
    public void setOkrasType(OkrasType type){}

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    //3.6 создание конструктора имени
    private String name;
    public Cat(String name){
        this(); //для одновременного вызова других одноименных конструкторов для создания в них нужных переменных
        this.name=name;
    }
    public Cat(int weight){
        this();
        this.weight=weight;
        this.originWeight=weight;
    }
    //3.6 конструктор с строкой имени и веса
    public Cat(String name, int weight){
        this();
        this.name=name;
        this.weight=weight;
        this.originWeight=weight;
    }
    public String getName(){
        return name;
    }




    //3.5
    public void setTransportType(TransportType type){}

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            //3.4 Условия убывания
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            //3.4 Условия убывания
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}