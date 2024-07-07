package Proxy_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        try{
            
        EmployeeDao emptableobj = new EmployeeDaoProxyImpl();
        emptableobj.create("ADMIN",new EmployeeDo());
        System.out.println("Operation Successful");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
