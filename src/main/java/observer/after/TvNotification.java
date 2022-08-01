package observer.after;

public class TvNotification implements Observer{

    @Override
    public void update(Player player) {
        System.out.println("Tv: " + player.getStatus());
    }
}
