package Logger_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logobject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
//        logobject.log(LogProcessor.INFO,"exception happens");
        logobject.log(LogProcessor.DEBUG,"Debug");
//        logobject.log(LogProcessor.ERROR,"throws error");
    }
}
