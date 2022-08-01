package observer.before;

public class Main {
    public static void main(String[] args) {
        Player lewy = new Player("Lewandowski", Status.IDLE);
        TvNotification tv = new TvNotification();
        RadioNotification radio = new RadioNotification();
        tv.updatePlayer(lewy);
        lewy.setStatus(Status.PASSED);
        radio.updatePlayer(lewy);
    }
}
