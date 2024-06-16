package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements  NotificationAlertObserver{
    StockObservable observable;
    String mobile_no;

    public MobileAlertObserverImpl(StockObservable observable,String mobile_no){
        this.observable = observable;
        this.mobile_no = mobile_no;
    }
    @Override
    public void update() {
        sendMobile(mobile_no);
    }

    public void sendMobile(String mobile_no){
        System.out.println("msg sent to: mobile"+ mobile_no);
    }
}
