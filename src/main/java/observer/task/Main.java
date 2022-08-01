package observer.task;

public class Main {
    public static void main(String[] args) {
        Forecast forecast = new Forecast(Weather.SUNNY);
        TvInfo tvInfo = new TvInfo();
        RadioInfo radioInfo = new RadioInfo();
        forecast.addNews(tvInfo);
        forecast.addNews(radioInfo);
        forecast.update(Weather.RAINY);
    }
}
