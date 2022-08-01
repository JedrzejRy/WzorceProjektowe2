package observer.task;

public class TvInfo implements News{
    @Override
    public void update(Forecast forecast) {
        System.out.println("TV: " + forecast.getWeather());
    }
}
