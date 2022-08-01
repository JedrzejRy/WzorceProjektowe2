package observer.after;


public class Main {
    public static void main(String[] args) {
        Player player = new Player("Lewy", Status.IDLE);
        TvNotification tv = new TvNotification();
        RadioNotification radio = new RadioNotification();
        player.addObserver(tv);
        player.addObserver(radio);
        player.update(Status.TACKLED);
    }
}
