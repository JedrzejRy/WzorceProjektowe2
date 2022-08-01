package flyweight.Task;

public class Tank extends Unit{
    public Tank(String position) {
        super(position, UnitValues.getTank());
    }
}
