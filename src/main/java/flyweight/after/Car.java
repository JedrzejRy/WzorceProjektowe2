package flyweight.after;

public class Car {
    private int milage;
    private Color color;

    public Car(int milage, String color) {
        this.milage = milage;
        switch (color) {
            case "Black" -> this.color = ColorValues.getBlack();
            case "White" -> this.color = ColorValues.getWhite();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "milage=" + milage +
                ", color=" + color +
                '}';
    }
}
