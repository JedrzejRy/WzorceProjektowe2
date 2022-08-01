package strategy.after;

public class Boxer {
    private String name;
    private Punch punch;

    public Boxer(String name) {
        this.name = name;
    }

    public void hit(){
        System.out.println(punch);
    }

    public void setPunch(Punch punch) {
        this.punch.punch();
    }

}
