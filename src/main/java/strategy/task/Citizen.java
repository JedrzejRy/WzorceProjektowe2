package strategy.task;

public class Citizen {
    private String name;
    private int age;

    private Price price;


    public double getMedicinePrice(double cost){
        return this.price.price(cost);
    }

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }
}
