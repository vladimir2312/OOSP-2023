import java.util.ArrayList;
import java.util.List;
public class Laboratory implements Observable {
    private List<Observer> observers;
    private String results;

    public Laboratory() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setResults(String results) {
        this.results = results;
        notifyObservers(results);
    }
}
