package flyweight.Task;

public class Unit {
    private String position;
    private Values values;

    public Unit(String position, Values values) {
        this.position = position;
        this.values = values;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "position=" + position +
                ", unitValues=" + values +
                '}';
    }
}
