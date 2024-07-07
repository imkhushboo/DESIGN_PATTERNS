package Proxy_Design_Pattern;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Create  a new row in the DB");
    }

    @Override
    public void delete(String client, int employeeid) throws Exception {
        System.out.println("Delete a new row in DB");
    }

    @Override
    public EmployeeDo get(String client, int employeeid) throws Exception {
        return new EmployeeDo();
    }
}
