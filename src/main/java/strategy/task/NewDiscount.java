package strategy.task;

public class NewDiscount implements Price{

    @Override
    public double price(double price) {
        return price * 0.5;
    }
}
