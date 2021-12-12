/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Admission;


/**
 *
 * @author sshreeka sshreeka
 */
public class Admission {
     private String Name;
     private String Availibity;

    public String getAvailibity() {
        return Availibity;
    }

    public void setAvailibity(String Availibity) {
        this.Availibity = Availibity;
    }
    public String getName() {
        return Name;
    }
 public Admission(String UserName){
        this.UserName=UserName;
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
