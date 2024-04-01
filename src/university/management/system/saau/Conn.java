
package university.management.system.saau;
import java.sql.*;
/**
 *
 * @author Saurabh
 */
public class Conn {
    
    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystemsaau","root","Saurabh@890");
            s =c.createStatement();
            
        }catch(Exception e){
                e.printStackTrace();
            }
    }
    
}
