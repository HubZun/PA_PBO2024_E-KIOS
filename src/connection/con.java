
package connection;

import java.sql.*;

public class con {
    public Connection con;
    public boolean con() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/ekios_db";
            String user = "root";
            String pass = "";
            
            con = DriverManager.getConnection(url,user,pass);
            
            
    }catch(Exception e){
        System.out.println("Error "+e.getMessage());
        return false;
    }return true;
    }
    
    
}
 