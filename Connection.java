import java.sql.*;
public class Connection {

    public static java.sql.Connection getConnection() {
        java.sql.Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/quiz","root","root");
        }
        catch(Exception ex){
            System.out.println(ex);
            
        }
        return con;
    }
    
}



    

