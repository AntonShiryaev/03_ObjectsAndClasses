
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
    public Cat(double weight){
        this();
        this.weight=weight;
        this.originWeight=weight;
    }
    //3.6 конструктор с строкой имени и веса
    public Cat(String name, double weight){
        this();
        this.name=name;
        this.weight=weight;
        this.originWeight=weight;
    }
    //геттер
    public String getName(){
        return name;
    }

    //3.7 геттеры и сеттеры. выше геттер. ниже сеттер
    public void setName(String name){
        this.name=name;
    }

    //3.5
    public void setTransportType(TransportType type){}

    public void meow()
    {
        if(weight>=minWeight && weight<=maxWeight){
        weight = weight - 1;
        System.out.println("Meow");}
        else{
            System.out.println("Тишина, вес кошки: "+weight);
        }
    }

    public void feed(Double amount)
    {
        if(weight>=minWeight && weight<=maxWeight){
        weight = weight + amount;}
        else{
            System.out.println("Накормить невозможно, вес кошки: "+weight);
        }
    }

    //Урок 3. Допзадание запрета
    public void drink(Double amount)
    {
        if(weight>=minWeight && weight<=maxWeight){
        weight = weight + amount;}
        else{
            System.out.println("Напоить невозможно, вес кошки: "+weight);
        }
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