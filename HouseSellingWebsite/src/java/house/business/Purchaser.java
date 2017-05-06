/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house.business;

import java.util.Random;

/**
 *
 * @author keerthana
 */
public class Purchaser {
    
    private int membership_id;
    private String home_id;
    private String uemail;
    private String location;
    private String cc_num;
    private String meet_time;

    public String getMeet_time() {
        return meet_time;
    }

    public void setMeet_time() {
        Random rand = new Random();
        int value = rand.nextInt(24);
        meet_time = "Meet time at "+value+":00"+ " at the house location tomorrow.";
        this.meet_time = meet_time;
        
    }
    
    
    
    
    public Purchaser(){}

    public int getMembership_id() {
        return membership_id;
    }

    public void setMembership_id(int membership_id) {
        this.membership_id = membership_id;
    }

    public String getHome_id() {
        return home_id;
    }

    public void setHome_id(String home_id) {
        this.home_id = home_id;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCc_num() {
        return cc_num;
    }

    public void setCc_num(String cc_num) {
        this.cc_num = cc_num;
    }
    
    
    
}
