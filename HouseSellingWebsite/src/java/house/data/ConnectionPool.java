/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {
    
   private static ConnectionPool pool = null;
    private static DataSource dataSource = null;

    public synchronized static ConnectionPool getInstance() {
        if (pool == null) {
            pool = new ConnectionPool();
        }
        return pool;
    }

    private ConnectionPool() {
        try {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/nbad");
            System.out.println("data: "+dataSource);
        } catch (NamingException e) {
            System.err.println(e);
        }
    }

    /*
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException sqle) {
            System.err.println(sqle);
            return null;
        }
    }
*/

    public void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
       //nbadassignment.cnvctcxt2fkd.us-west-2.rds.amazonaws.com:3306
          Class.forName("com.mysql.jdbc.Driver");    
          String dbName = "nbad";        
          String userName = "keerthana";        
          String password = "keeru789";      
          String hostname = "keerthana.cszj1yg1ursp.us-west-2.rds.amazonaws.com";      
          String port = "3306";
          String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;        
          return DriverManager.getConnection(jdbcUrl);
    }
}
