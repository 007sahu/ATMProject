package bank.management.system;
import java.sql.*;


public class conn{
    Connection c;
    Statement s;
    ResultSet rs;
    public conn(){
        String url= "jdbc:mysql://localhost:3306/atm" ;
        String username = "root";
        String password = "";
    try{

        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(url,username,password);
        s=c.createStatement();

    }catch(Exception e){
        System.out.println(e);
    }
    }
    
}
