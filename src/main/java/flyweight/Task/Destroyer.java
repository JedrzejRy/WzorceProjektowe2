package flyweight.Task;

public class Destroyer extends Unit{
    public Destroyer(String position) {
        super(position, UnitValues.getDestroyer());
    }
}
