package observer.before;

public class TvNotification {
    public void updatePlayer(Player player){
        System.out.println("TV: " + player.getName());
        System.out.println(player.getStatus());
    }
}
