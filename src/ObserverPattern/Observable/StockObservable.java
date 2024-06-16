package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public  void add(NotificationAlertObserver observer);
    public  void remove(NotificationAlertObserver observer);
    public void notifySubscriber();
    public void setStockCount(int stocks);
    public int getStockCount();


}
