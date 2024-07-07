package Logger_Design_Pattern;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int loglevel, String message) {
        System.out.println("info-");
        if(loglevel == INFO){
            System.out.println("INFO: "+message);
        }else{
            super.log(loglevel,message);
        }
    }
}
