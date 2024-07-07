package Proxy_Design_Pattern;

public class EmployeeDaoProxyImpl implements EmployeeDao{
    EmployeeDao empobj;

    EmployeeDaoProxyImpl(){
        empobj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equals("ADMIN")){
            empobj.create(client,obj);
            return;

        }

        throw new Exception("Access Denied!");
    }

    @Override
    public void delete(String client, int employeeid) throws Exception {
        if(client.equals("ADMIN")){
            empobj.delete(client,employeeid);
            return;
        }

        throw new Exception("Access Denied!");
    }

    @Override
    public EmployeeDo get(String client, int employeeid) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return empobj.get(client,employeeid);

        }

        throw new Exception("Access Denied!");
    }
}
