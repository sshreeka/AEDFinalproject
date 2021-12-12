/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Quarantine;

import Business.Admission.*;
import Business.TestingCenter.*;

/**
 *
 * @author Nikhil
 */
public class Quarantine {
     private String Name;

  
    public Quarantine(String UserName){
        this.UserName=UserName;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
     private String UserName;
     
}
