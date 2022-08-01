package observer.task;

public class RadioInfo implements News {
    @Override
    public void update(Forecast forecast) {
        System.out.println("Radio: " + forecast.getWeather());
    }
}
