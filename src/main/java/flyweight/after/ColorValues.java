package flyweight.after;

public class ColorValues {
    private static Color black = new Color(0,0,0);
    private static Color white = new Color(255,255,255);

    public static Color getBlack() {
        return black;
    }

    public static Color getWhite() {
        return white;
    }
}
