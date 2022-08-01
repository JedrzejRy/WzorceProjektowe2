package observer.before;

public class RadioNotification {
    public void updatePlayer(Player player){
        System.out.println("Radio : " + player.getName());
        System.out.println(player.getStatus());
    }
}
