/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Quarantine;

import Business.Admission.*;
import Business.TestingCenter.*;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Nikhil
 */
public class QuarantineDirectory {
    private ArrayList<Quarantine> QuarantineDirectoryList;
   
    private Quarantine quarantine;

    public QuarantineDirectory() {
        this.QuarantineDirectoryList = new ArrayList<Quarantine>();
    }

    
    public Quarantine createQuarantineCenter(String uName){
        quarantine = new Quarantine(uName);
        QuarantineDirectoryList.add(quarantine);
        return quarantine;
    }
    public ArrayList<Quarantine> getQuarantineList() {
        return QuarantineDirectoryList;
    }

    public void setQuarantineDirectoryList(ArrayList<Quarantine> QuarantineDirectoryList) {
        this.QuarantineDirectoryList = QuarantineDirectoryList;
    }

  

    
    public void deleteQuarantineDirectory(String username){
        for(int i=0;i<QuarantineDirectoryList.size();i++){
            if(QuarantineDirectoryList.get(i).getUserName().equals(username)){
                QuarantineDirectoryList.remove(i);
            }
        }
    }
    
    
}
