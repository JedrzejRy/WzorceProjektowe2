package flyweight.Task;

public class UnitValues {
    private static final Values tank = new Values(250,100,50,2000);
    private static final Values rifleMan = new Values(50,10,15,100);
    private static final Values destroyer = new Values(150,60,80,1700);

    public static Values getTank() {
        return tank;
    }

    public static Values getRifleMan() {
        return rifleMan;
    }

    public static Values getDestroyer() {
        return destroyer;
    }
}
