package observer.task;

public interface Observable {
    void addNews(News news);
    void removeNews(News news);
    void notifyAllNews();
}

