package factoryMethod.after;

public class AlienFactory extends UnitFactory{
    @Override
    public Alien create(String type) {
        switch (type){
            case "Muton":
                return new Muton("Soldier","Alien",100);
            case "Sectoid":
                return new Sectoid("Leader","Alien",150);
        }
        return null;
    }
}
