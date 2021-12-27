import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bar {
    private boolean HappyHour = false;
    private List<BarObserver> observers = new ArrayList<BarObserver>();

    public boolean isHappyHour() {
        return HappyHour;
    };
    public void startHappyHour() {
        HappyHour = true;
        notifyObservers();
    };
    public void endHappyHour() {
        HappyHour = false;
        notifyObservers();
    };

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

}
