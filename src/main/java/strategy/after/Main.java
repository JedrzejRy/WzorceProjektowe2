package strategy.after;

public class Main {
    public static void main(String[] args) {
        Boxer rocky = new Boxer("Rocky");
        rocky.setPunch(new LeftPunch());
        rocky.hit();
    }
}
