package basemodels;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observersList = new ArrayList<>();
    public void attach(Observer observer) {
        observersList.add(observer);
    }
    public void detach(Observer observer) {
        observersList.remove(observer);
    }
    public void notifyObservers() {
        for(Observer observer : observersList) {
            observer.update(this);
        }
    }
}
