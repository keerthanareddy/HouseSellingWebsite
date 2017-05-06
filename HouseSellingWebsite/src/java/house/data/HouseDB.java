/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.data;
import house.business.Purchaser;
import house.business.Home;
import house.business.Admin;
import house.business.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author keerthana
 */
public class HouseDB {
    private static List<Customer> customers = null;
    private static List<Admin> admin = null;
    private static List<Home> house=null;
    private static List<Purchaser> purchaser = null;
    
    
     public static ArrayList<Customer> selectCustomers()
    {
        
        System.out.println("In the select Products methods!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        ArrayList<Customer> customers = new ArrayList();
        ConnectionPool pool=null;
        Connection c=null;
         try{
//  Class.forName("com.mysql.jdbc.Driver");
//   String dbURL = "jdbc:mysql://localhost:3306/nbad";
//            String username = "root";
//            String password = "1234";
//            Connection c = DriverManager.getConnection( dbURL, username,password);
//            Statement s = c.createStatement();     
      //  pool.getConnection();
       pool= ConnectionPool.getInstance();
         c=pool.getConnection();
         Statement s = c.createStatement();
        
        
            String sql="select * from Customer1";
            System.out.print("after select");
             ResultSet productsResSet;
            productsResSet = s.executeQuery(sql);
              
            if (productsResSet != null) 
            {
                                while (productsResSet.next()) 
                                {
                    Customer cust = new Customer();
                    cust.setmembershipid(productsResSet.getInt(1));
                    cust.setfname(productsResSet.getString(2));
                    cust.setmname(productsResSet.getString(3));
                    cust.setlname(productsResSet.getString(4));
                    cust.setAddressLine1(productsResSet.getString(5));
                    cust.setcity(productsResSet.getString(6));
                    cust.setstate(productsResSet.getString(7));
                    cust.setzipcode(productsResSet.getString(8));
                    cust.setemail(productsResSet.getString(9));
                    cust.setpassword(productsResSet.getString(10));
                    cust.setccnum(productsResSet.getString(11));
                    //cust.setccexpiry(productsResSet.getDate(12));
                    cust.setcvv(productsResSet.getString(12));
                    
                    customers.add(cust);
                } 
                                c.close();
                                return customers;
            } 
        
            else {
                System.out.println("in else");
                  return customers;
            }                      
           
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("in catch"+e);
        }
         finally {
            pool.freeConnection(c);        
        } 
         
return customers;

}
     
     public static Customer selectCustomer(String username, String password) {
        customers = selectCustomers();
        for (Customer p : customers) {
            if (username != null
                    && username.equalsIgnoreCase(p.getemail()) && password!=null && password.equals(p.getpassword())) {
                return p;
            }
        }
        return null;
    }
     public static Customer selectCustomer(String email) {
        customers = selectCustomers();
        for (Customer p : customers) {
            if (email != null
                    && email.equalsIgnoreCase(p.getemail())) {
                return p;
            }
        }
        return null;
    }
     
     public static List<Admin> selectAdmins() throws ClassNotFoundException, SQLException
     {
         ConnectionPool pool=null;
        Connection connection=null;
         admin = new ArrayList();
        
        PreparedStatement ps = null;
        ResultSet rslt = null;
        String query = "SELECT * FROM InventoryManager";
        try {
            pool = ConnectionPool.getInstance();
            connection = pool.getConnection();
            ps = connection.prepareStatement(query);
            rslt = ps.executeQuery();
            while (rslt.next()) {
                String Username = rslt.getString("username");                
                String Password = rslt.getString("password");
                
                Admin p = new Admin();
                p.setaname(Username);
                p.setapassword(Password);
                              
                admin.add(p);
            }
            connection.close();
            return admin;
        } 
        catch (SQLException e) {
            System.out.println(e);
            return null;
        } 
        finally {
            pool.freeConnection(connection);        
        }                      
     }
      public static Admin selectAdmin(String uname, String password) throws ClassNotFoundException, SQLException {
        admin = selectAdmins();
        for (Admin p : admin) {
            if (p != null
                    && uname.equals(p.getaname()) && password.equals(p.getapassword())) {
                return p;
            }
        }
        return null;
    }
     
      public static List<Home> selectHouses() throws SQLException, ClassNotFoundException {
        house = new ArrayList();
        ConnectionPool pool=null;
        Connection c=null;
        try {
        pool = ConnectionPool.getInstance();
        c = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rslt = null;
        String query = "SELECT * FROM Home1";
        
            ps = c.prepareStatement(query);
            rslt = ps.executeQuery();
            while (rslt.next()) {
                String Homeid = rslt.getString("home_id");
                System.out.println("home id's"+Homeid);
                String location=rslt.getString("location");
                String Area = rslt.getString("area");
                String Cost = rslt.getString("cost");
                String Builders = rslt.getString("builders");
                String Status_=rslt.getString("status_");
                String BdBa=rslt.getString("bdba");
                String Contact=rslt.getString("contact");
           
                Home h = new Home();
                
              
               h.setHomeId(Homeid);
               h.setAddress(location);
               h.setArea(Area);
               h.setCost(Cost);
               h.setCompany(Builders);
               h.setStatus(Status_);
               h.setNoBdAndBa(BdBa);
               h.setCost(Cost);
               h.setContact(Contact);
               
               house.add(h);
                
            }
            c.close();
            return house;

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        finally {
            pool.freeConnection(c);
        }
    }
public static Home selectHouse(String homeId){
        try {
            house = selectHouses();
        } catch (SQLException ex) {
            Logger.getLogger(HouseDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HouseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Home p : house) {
            if (homeId != null
                    && homeId.equalsIgnoreCase(p.getHomeId())) {
                return p;
            }
        }
        
        return null;
        
}
  
  
  public static void updateHouse(Home h) throws ClassNotFoundException, SQLException {
        ConnectionPool pool=null;
        Connection connection=null;
        
        PreparedStatement ps = null;              
        String query = "UPDATE Home1 SET location=?, area=?, cost=?, builders=?, status_=?, bdba=?, contact=? WHERE home_id= ?";
        try {
            pool = ConnectionPool.getInstance();
            connection = pool.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, h.getAddress());
            ps.setString(2, h.getArea());
            ps.setString(3, h.getCost());
            ps.setString(4, h.getCompany());
            ps.setString(5, h.getStatus());
            ps.setString(6, h.getNoBdAndBa());
            ps.setString(7, h.getContact());
            ps.setString(8, h.getHomeId());

            System.out.println("im in updating"+h.getCompany()+h.getHomeId());
            ps.executeUpdate();
            connection.close();
        } 
        catch (SQLException e) {
            System.out.println(e);
        } finally {
            pool.freeConnection(connection);
        }
    }
   public static void editCustomerProfile(Customer c) throws ClassNotFoundException, SQLException {
       ConnectionPool pool=null;
        Connection connection=null;
        
        PreparedStatement ps = null;              
        String query = "UPDATE Customer1 SET first_name = ?,middle_name=?,last_name=?,address=?,city=?,state=?,zip_code=?,password=?,cc_num=?,cc_cvv=?  WHERE email= ?";
        try {
 
            pool = ConnectionPool.getInstance();
            connection = pool.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, c.getfname());
            ps.setString(2, c.getmname());
            ps.setString(3, c.getlname());
            ps.setString(4, c.getAddressLine1());
            ps.setString(5, c.getcity());
            ps.setString(6, c.getstate());
            ps.setString(7, c.getzipcode());
            ps.setString(8, c.getpassword());
            ps.setString(9, c.getccnum());
            ps.setString(10, c.getcvv());
            ps.setString(11, c.getemail());
                       
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            pool.freeConnection(connection);
        }
    }
   public static void deleteHouse(Home home) throws ClassNotFoundException, SQLException {
       ConnectionPool pool=null;
        Connection connection=null;
       
        PreparedStatement ps = null;
             
        String query = "DELETE from Home1 WHERE home_id = ?";
        try {
            pool = ConnectionPool.getInstance();
            connection = pool.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, home.getHomeId());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            pool.freeConnection(connection);
        }
    }
   
   
   public static String getSalt(String Email) throws ClassNotFoundException, SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs =null;
        
        String query= "SELECT salt FROM Customer1 WHERE email=?";
        try{
        ps=connection.prepareStatement(query);
        ps.setString(1, Email);
        rs=ps.executeQuery();
        String salt= null;
        if(rs.next()){
            salt =rs.getString("salt");
        }
        if(salt== null || salt.length()==0){
            return null;
        }else{
           return salt; 
        }
        
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }finally{
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
    }
    }
   
   
   
   

     public static void insertCustomer(Customer customer) throws ClassNotFoundException, SQLException {  
        ConnectionPool pool=null;
        Connection connection=null;
         
        PreparedStatement ps = null;
        String query = "INSERT INTO Customer1 (first_name, middle_name, last_name, address, city, state, zip_code, email, password, salt,cc_num, cc_cvv) "
          + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        try {
            pool = ConnectionPool.getInstance();
            connection = pool.getConnection();
            //System.out.println("movie.data.MovieDB.insertCustomer()");
            ps = connection.prepareStatement(query);
           // ps.setInt(1, customer.getmembershipid());
            ps.setString(1, customer.getfname());
            ps.setString(2, customer.getmname());
            ps.setString(3, customer.getlname());
            ps.setString(4, customer.getAddressLine1());
            ps.setString(5, customer.getcity());
            ps.setString(6, customer.getstate());
         // ps.setString(8, null);
            ps.setString(7, customer.getzipcode());
            ps.setString(8, customer.getemail());
            ps.setString(9, customer.getpassword());
            ps.setString(10, customer.getSalt());
            ps.setString(11, customer.getccnum());
            ps.setString(12, customer.getcvv());
            
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            pool.freeConnection(connection);
        }
    }
     public static void insertHouse(Home h) throws ClassNotFoundException, SQLException {
         ConnectionPool pool=null;
        Connection connection=null;
        
        PreparedStatement ps = null;
        String query = "INSERT INTO Home1 (home_id,location,area,cost,builders,status_,bdba,contact) "
          + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pool = ConnectionPool.getInstance();
            connection = pool.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, h.getHomeId());
            ps.setString(2, h.getAddress());
            ps.setString(3, h.getArea());
            ps.setString(4, h.getCost());
            ps.setString(5, h.getCompany());
            ps.setString(6, h.getStatus());
            ps.setString(7, h.getNoBdAndBa());         
            ps.setString(8, h.getContact());
            
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            pool.freeConnection(connection);
        }
    }
     public static void insertIntoPurchasers(String id, String uemail) throws ClassNotFoundException, SQLException {
         ConnectionPool pool=null;
        Connection connection=null;
        
        PreparedStatement ps = null;
        ResultSet rslt = null;
        int membershipID=0;
        String ccNumber = "";
        String location="";
        String query = "SELECT * FROM Customer1 WHERE email=?";
        try {
            pool = ConnectionPool.getInstance();
            connection = pool.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, uemail);                        
            rslt=ps.executeQuery();
            while (rslt.next()) {
                membershipID = rslt.getInt("membership_id");
                ccNumber=rslt.getString("cc_num");
                ps = null;
                //connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        } 
        String query2 = "SELECT * FROM Home1 WHERE home_id=?";
        try {            
            ps = connection.prepareStatement(query2);
            ps.setString(1, id);                        
            rslt=ps.executeQuery();
            while (rslt.next()) {
                location = rslt.getString("location");                
                ps = null;
            }
            //connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        String query3 = "INSERT INTO Purchaser (membership_id,home_id,location,email,cc_num) values (?,?,?,?,?)";
        try {            
            ps = connection.prepareStatement(query3);
            ps.setInt(1, membershipID); 
            ps.setString(2, id); 
            ps.setString(3,location);
            ps.setString(4,uemail);
            ps.setString(5,ccNumber);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }                
        finally {
            connection.close();
            pool.freeConnection(connection);
        }
    }
      public static List<Purchaser> selectPurchases(String uemail) throws ClassNotFoundException, SQLException {  
          purchaser=new ArrayList(); 
         ConnectionPool pool=null;
        Connection connection=null; 
       
        PreparedStatement ps = null;
        ResultSet rslt = null;
        String query = "SELECT * FROM Purchaser WHERE email=?";
        try {
            pool = ConnectionPool.getInstance();
            connection = pool.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, uemail);                        
            rslt=ps.executeQuery();
             while (rslt.next()) {
                int userid = rslt.getInt("membership_id");
                String homeId=rslt.getString("home_id");
                String location = rslt.getString("location");
                String ccNumber = rslt.getString("cc_num");
                Purchaser p = new Purchaser();
                
                
                p.setMembership_id(userid);
                p.setHome_id(homeId);
                p.setLocation(location);
                p.setCc_num(ccNumber);
                p.setUemail(uemail);
                p.setMeet_time();
                purchaser.add(p);  
                
                 System.out.println("hello");
        } 
             connection.close();
             return purchaser; 
        }catch (SQLException e) {
            
            System.out.println("Keerthana Reddy");
            return null;
        } finally {
            pool.freeConnection(connection);
        }
    }
    
}
