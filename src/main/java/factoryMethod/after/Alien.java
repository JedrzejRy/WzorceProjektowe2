package factoryMethod.after;

public abstract class Alien {
    private String rank;
    private String type;
    private int stamina;

    public Alien(String rank, String type, int stamina) {
        this.rank = rank;
        this.type = type;
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "rank='" + rank + '\'' +
                ", type='" + type + '\'' +
                ", stamina=" + stamina +
                '}';
    }
}
