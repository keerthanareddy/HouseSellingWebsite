/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.business;
public class Customer {
    private int membershipId;
    private String fname;
    private String mname;
    private String lname;
    private String AddressLine1;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    private String password;
    private String salt;
    private String ccnum;    
    private String cvv;

public Customer()   { }
 public void setmembershipid(int id) {
        this.membershipId = id;
    }

    public int getmembershipid() {
        return membershipId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    

public void setfname(String fname) {
        this.fname = fname;
    }

    public String getfname() {
        return fname;
    }
public void setmname(String mname) {
        this.mname = mname;
    }

    public String getmname() {
        return mname;
    }
    public void setlname(String lname) {
        this.lname = lname;
    }

    public String getlname() {
        return lname;
    }
    public void setAddressLine1(String address) {
        this.AddressLine1 = address;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }
 public void setcity(String city) {
        this.city = city;
    }

    public String getcity() {
        return city;
    }
    
     public void setstate(String state) {
        this.state = state;
    }

    public String getstate() {
        return state;
    }
     public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getzipcode() {
        return zipcode;
    }
 public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }
     public void setpassword(String password) {
        this.password = password;
    }

    public String getpassword() {
        return password;
    }
     public void setccnum(String ccnum) {
        this.ccnum = ccnum;
    }

    public String getccnum() {
        return ccnum;
    }
 
     public void setcvv(String cvv) {
        this.cvv = cvv;
    }

    public String getcvv() {
        return cvv;
    }
}