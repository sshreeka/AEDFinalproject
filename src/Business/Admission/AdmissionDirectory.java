/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Admission;

import Business.TestingCenter.*;
import Business.Person.Person;
import Business.Quarantine.Quarantine;
import java.util.ArrayList;

/**
 *
 * @author sshreeka sshreeka
 */
public class AdmissionDirectory {
    private ArrayList<Admission> AdmissionDirectoryList;
   
    private Admission admission;

    public AdmissionDirectory() {
        AdmissionDirectoryList = new ArrayList<Admission>();
    }
    
    
        public Admission createAdmissionCenter(String uName){
        admission = new Admission(uName);
        AdmissionDirectoryList.add(admission);
        return admission;
    }

    public ArrayList<Admission> getAdmissionList() {
        return AdmissionDirectoryList;
    }

    public void setAdmissionDirectoryList(ArrayList<Admission> AdmissionDirectoryList) {
        this.AdmissionDirectoryList = AdmissionDirectoryList;
    }

    public Admission getAdmissionDirectory() {
        return admission;
    }

    public void setTestingCenterListMan(Admission admission) {
        this.admission = admission;
    }
   
    
    public void deleteTestingCenter(String username){
        for(int i=0;i<AdmissionDirectoryList.size();i++){
            if(AdmissionDirectoryList.get(i).getUserName().equals(username)){
                AdmissionDirectoryList.remove(i);
            }
        }
    }
    
    
}
