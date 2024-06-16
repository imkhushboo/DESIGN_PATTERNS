package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    List<NotificationAlertObserver> observer = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver o) {
        observer.add(o);

    }

    @Override
    public void remove(NotificationAlertObserver o) {
        observer.remove(o);

    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver x:observer)
        {
            x.update();
        }
    }

    @Override
    public void setStockCount(int stocks) {

        if(stockCount == 0)
        {
            notifySubscriber();
        }

        stockCount = stockCount + stocks;

    }

    @Override
    public int getStockCount() {
        return stockCount;

    }
}
