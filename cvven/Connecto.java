
package hotel.cvven;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;


/**
 *
 * @author Hp
 */
public class Connecto {
    
    
    public Connection createConnection() {
        
        Connection connection = null;
        
        MysqlDataSource mds = new MysqlDataSource();
        
        mds.setServerName("localhost");
        mds.setPortNumber(3306);
        mds.setUser("root");
        mds.setPassword("");
        mds.setDatabaseName("java_hotel_db");
        
        
        try {
            connection = (Connection) mds.getConnection();
         }catch(SQLException ex) {
             Logger.getLogger(Connecto.class.getName()).log(Level.SEVERE, null, ex);
         }
        return connection;
    }
        
}
