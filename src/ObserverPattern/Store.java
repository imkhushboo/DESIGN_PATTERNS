package ObserverPattern;

import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args)
    {

    StockObservable iphoneObservable = new IphoneObservable();
    NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iphoneObservable,"vkhushboo540@gmail.com");
    NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iphoneObservable,"heelriolog@gmail.com");
    NotificationAlertObserver observer3 = new MobileAlertObserverImpl(iphoneObservable,"9027227980");

    iphoneObservable.add(observer1);
    iphoneObservable.add(observer2);
    iphoneObservable.add(observer3);

//    iphoneObservable.setStockCount(10);
    iphoneObservable.setStockCount(0);
//    iphoneObservable.setStockCount(10);
        System.out.println(iphoneObservable.getStockCount());
        iphoneObservable.setStockCount(10);
        System.out.println(iphoneObservable.getStockCount());




    }



}
