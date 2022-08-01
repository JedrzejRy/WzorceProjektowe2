package flyweight.Task;

public class Values {
    private int hp ;
    private int armour;
    private int speed;
    private int cost;

    public Values(int hp, int armour, int speed, int cost) {
        this.hp = hp;
        this.armour = armour;
        this.speed = speed;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Values{" +
                "hp=" + hp +
                ", armour=" + armour +
                ", speed=" + speed +
                ", cost=" + cost +
                '}';
    }
}
