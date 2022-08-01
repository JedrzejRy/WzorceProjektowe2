package observer.after;

public class RadioNotification implements Observer{
    @Override
    public void update(Player player) {
        System.out.println("Radio: " + player.getStatus());
    }
}
