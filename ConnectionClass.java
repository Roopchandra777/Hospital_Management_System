package Hospital;

import java.sql.*;

public class ConnectionClass 
{
    Connection con;
    Statement stm;
    ConnectionClass()
    {
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Roopchandra@7772");
           stm=con.createStatement();
           if(con.isClosed())
           {
               System.out.println("not connect");
           }
           else
           {
               System.out.println(" connect");        
           }
           
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        new ConnectionClass();
    }
}
