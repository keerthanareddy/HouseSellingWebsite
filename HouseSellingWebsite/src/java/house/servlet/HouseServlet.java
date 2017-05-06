/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.servlet;

import house.data.HouseDB;
import house.business.Purchaser;
import house.business.Home;
import house.business.Admin;
import house.business.Customer;
import static house.util.PasswordUtil.hashAndSaltPassword;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HouseServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HouseServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HouseServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String action = request.getParameter("action");
        String url = null;
        if (action == null) {
            action = "add";
            url = "/product.jsp";
        }
        
        
        if (action.equals("edit")) {
            String id = request.getParameter("homeId");
            Home home = HouseDB.selectHouse(id);           
            request.setAttribute("home", home);
            request.setAttribute("id_",id);
            url = "/editHouse.jsp";
        }
        
      if (action.equals("delete")) {
            String id = request.getParameter("homeId");
            Home home = HouseDB.selectHouse(id);
            request.setAttribute("home", home);
            url = "/confirmDelete.jsp";
        }
      if (action.equals("viewhousesbyuser")) {
            String id = request.getParameter("uemail");
            List<Home> houseList=null;
           try {
               houseList = HouseDB.selectHouses();
           } catch (SQLException ex) {
               Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
           }
            request.setAttribute("houseList", houseList);
            request.setAttribute("username", id);
            url = "/DisplayHousesToUser.jsp";
        }
      if(action.equals("editprofile"))
      {
          String email=request.getParameter("uemail");
          Customer cust=HouseDB.selectCustomer(email);
          request.setAttribute("cust",cust);     
          url="/editProfile.jsp";
      }
      if(action.equals("purchaseHouse")){
          String id=request.getParameter("homeId");
          String uemail=request.getParameter("uemail");
          System.out.println("--------------");
          
           try {
               HouseDB.insertIntoPurchasers(id,uemail);
               
           } catch (ClassNotFoundException ex) {
               
               Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               
               Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
           }
          List<Purchaser> purchases=null;
           try {
               purchases = HouseDB.selectPurchases(uemail);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
           }
          request.setAttribute("rentals",purchases);
          request.setAttribute("uemail", uemail);      
          url="/MailConfirmation.jsp";          
      }
      
      if(action.equals("showpurchases"))    {
          String email=request.getParameter("uemail");
          List<Purchaser> purchasers=null;
           try {
               purchasers = HouseDB.selectPurchases(email);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
           }
          System.out.println("select purchaser "+purchasers);
           request.setAttribute("purchasers", purchasers);
           request.setAttribute("uemail", email);      
           url="/DisplayPurchasers.jsp";
      }
      
     
    getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = null;
        if (request.getParameter("register") != null) {
            String Fname = request.getParameter("fname");
            String Mname = request.getParameter("mname");
            String Lname = request.getParameter("lname");
            String Address = request.getParameter("address");
            String City = request.getParameter("city");
            String State = request.getParameter("state");
            String Zipcode = request.getParameter("zipcode");
            String Email = request.getParameter("email");
            String Password = request.getParameter("password");
            String Ccnum = request.getParameter("ccnum");            
            String Cvv = request.getParameter("cvv");            
           
            Customer cust = new Customer();
            ArrayList<String> passwordlist = new ArrayList<String>();
            try {
                try {
                    passwordlist = hashAndSaltPassword(Password,Email);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            cust.setmembershipid(50);
            cust.setfname(Fname);
            cust.setmname(Mname);
            cust.setlname(Lname);
            cust.setAddressLine1(Address);
            cust.setcity(City);
            cust.setstate(State);
            cust.setzipcode(Zipcode);
            cust.setemail(Email);
            cust.setpassword(passwordlist.get(1));
            cust.setSalt(passwordlist.get(0));
            cust.setccnum(Ccnum);            
            cust.setcvv(Cvv);                                                             
            try {            
                HouseDB.insertCustomer(cust);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            url = "/AfterRegister.jsp";                              
        }
        
        
        if (request.getParameter("addhouse") != null) {
            String Homeid = request.getParameter("homeid");
            String Location = request.getParameter("location");
            String Area = request.getParameter("area");
            String Cost = request.getParameter("cost");
            String Builders = request.getParameter("builders");
            String Status_ = request.getParameter("status_");
            String BdBa = request.getParameter("bdba");
            String Contact = request.getParameter("contact");
            
            Home h = new Home();
          
            h.setHomeId(Homeid);
            h.setAddress(Location);
            h.setArea(Area);
            h.setCost(Cost);
            h.setCompany(Builders);
            h.setStatus(Status_);
            h.setNoBdAndBa(BdBa);
            h.setContact(Contact);                                                        
            try {
                HouseDB.insertHouse(h);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            url = "/AfterLoginAsAdmin.jsp";                              
        }
        
        if(request.getParameter("login")!=null)
        {
            String Email=request.getParameter("username");
            String Password=request.getParameter("password");
            ArrayList<String> hashed = new ArrayList<String>(); 
            try {
                hashed = hashAndSaltPassword(Password,Email);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("hashed"+hashed.get(1));
            Customer c= HouseDB.selectCustomer(Email, hashed.get(1));
            if(c!=null)
            {
                request.setAttribute("username", Email);
                url="/AfterLoginAsUser.jsp";
            }
            else
                url="/index.jsp";
        }
        if(request.getParameter("adminlogin")!=null)
        {
            String Name=request.getParameter("adminname");
            String Password=request.getParameter("adminpassword");
            Admin a=null;
            try {
                a = HouseDB.selectAdmin(Name, Password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(a!=null)
                url="/AfterLoginAsAdmin.jsp";
            else
                url="/index.jsp";
        }
        
        
        if (request.getParameter("viewhouses")!=null) {
            List<Home> homeList=null;
            try {
                homeList = HouseDB.selectHouses();
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("im here");
            request.setAttribute("homeList", homeList);
            url = "/houses.jsp";
        }
        
        if (request.getParameter("viewhousesbyuser")!=null) {
            
            List<Home> houselist=null;
            try {
                houselist = HouseDB.selectHouses();
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("house list: "+houselist);
            request.setAttribute("houseList", houselist);
            url = "/DisplayHousesToUser.jsp";
        }
          if (request.getParameter("UpdateExist") != null) {
            String id_ = request.getParameter("homeId");
            String location = request.getParameter("address");
            String area = request.getParameter("area");
            String cost = request.getParameter("cost");
            String builders = request.getParameter("company");
            String status_ = request.getParameter("status_");
            String bdba = request.getParameter("noBdAndBa");
            String contact = request.getParameter("contact");
            Home h = new Home();
            System.out.println("home is is: "+id_);
            h.setHomeId(id_);
            h.setAddress(location);
            h.setArea(area);
            h.setCost(cost);
            h.setCompany(builders);
            h.setStatus(status_);
            h.setNoBdAndBa(bdba);
            h.setContact(contact);
            try {
                HouseDB.updateHouse(h);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            List<Home> homeList=null; 
            try {
                homeList = HouseDB.selectHouses();
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("homeList", homeList);
            url = "/houses.jsp";
        }
          if(request.getParameter("UpdateCustomer")!=null)
          {
            String Fname = request.getParameter("fname");
            String Mname = request.getParameter("mname");
            String Lname = request.getParameter("lname");
            String Address = request.getParameter("address");
            String City = request.getParameter("city");
            String State = request.getParameter("state");
            String Zipcode = request.getParameter("zipcode");
            //String Email = request.getParameter("email");
            String Password = request.getParameter("password");
            String Ccnum = request.getParameter("ccnum");            
            String Cvv = request.getParameter("cvv");            
           
            Customer cust = new Customer();
            //cust.setmembershipid(50);
            cust.setfname(Fname);
            cust.setmname(Mname);
            cust.setlname(Lname);
            cust.setAddressLine1(Address);
            cust.setcity(City);
            cust.setstate(State);
            cust.setzipcode(Zipcode);
            //cust.setemail(Email);
            cust.setpassword(Password);
            cust.setccnum(Ccnum);
            
            cust.setcvv(Cvv);                                                             
            try {
                HouseDB.editCustomerProfile(cust);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("cust",cust);
            url="/afterProfileEdit.jsp";
          }

        if (request.getParameter("Yes") != null) {
            String code = request.getParameter("homeId");
            Home h = HouseDB.selectHouse(code);
            try {
                HouseDB.deleteHouse(h);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            List<Home> homeList=null;
            try {
                homeList = HouseDB.selectHouses();
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("homeList", homeList);
            url = "/houses.jsp";
        }

        if (request.getParameter("No") != null) {
            List<Home> homeList=null;
            try {
                homeList = HouseDB.selectHouses();
            } catch (SQLException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HouseServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("homeList", homeList);
            url = "/houses.jsp";
        }
       

     
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}