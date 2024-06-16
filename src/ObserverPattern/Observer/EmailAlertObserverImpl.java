package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    StockObservable observable;
    String emailId;

    public  EmailAlertObserverImpl(StockObservable observable,String emailId){
        this.observable = observable;
        this.emailId = emailId;

    }

    @Override
    public void update() {
        sendEmail(emailId);
    }

    public void sendEmail(String emailId){
        System.out.println("msg sent to " + emailId);
    }
}
