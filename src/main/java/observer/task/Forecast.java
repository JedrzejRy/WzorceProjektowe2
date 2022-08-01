package observer.task;

import java.util.ArrayList;
import java.util.List;

public class Forecast implements Observable {
    private Weather weather;
    private final List<News> newsList = new ArrayList<>();

    public Forecast(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void addNews(News news) {
        newsList.add(news);
    }

    @Override
    public void removeNews(News news) {
        newsList.remove(news);
    }

    @Override
    public void notifyAllNews() {
        for (News news : newsList) {
            news.update(this);
        }
    }

    public void update(Weather weather) {
        this.weather = weather;
        notifyAllNews();
    }

    public Weather getWeather() {
        return weather;
    }
}
