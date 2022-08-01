package strategy.task;

public class NoDiscount implements Price{
    @Override
    public double price(double price) {
        return price;
    }
}
