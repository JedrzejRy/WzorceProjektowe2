package strategy.task;

public class Discount implements Price{
    @Override
    public double price(double price) {
        return price * 0.9;
    }
}
