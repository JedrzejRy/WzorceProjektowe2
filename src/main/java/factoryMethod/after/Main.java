package factoryMethod.after;

public class Main {
    public static void main(String[] args) {
        UnitFactory unitFactory = new AlienFactory();
        Alien muton = unitFactory.create("Muton");
        Alien sectoid = unitFactory.create("Sectoid");
        System.out.println(muton);
        System.out.println(sectoid);
    }
}
