/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Person.PersonDirectory;
import Business.TestingCenter.TestingCenterDirectory;
import Business.Admission.AdmissionDirectory;
import Business.Quarantine.QuarantineDirectory;
        
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author sshreeka  
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private TestingCenterDirectory testingCenterDirectory;
    private PersonDirectory personDirectory;
    private AdmissionDirectory admissionDirectory;
    private QuarantineDirectory quarantineDirectory;

    public PersonDirectory getPersonDirectory() {
        if(personDirectory == null)
        {
            personDirectory = new PersonDirectory();
        }
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public TestingCenterDirectory getTestingCenterDirectory() {
        if(testingCenterDirectory == null)
        {
            testingCenterDirectory = new TestingCenterDirectory();
        }
        return testingCenterDirectory;
    }

    public void setTestingCenterDirectory(TestingCenterDirectory testingCenterDirectory) {
        this.testingCenterDirectory = testingCenterDirectory;
    }

    public AdmissionDirectory getAdmissionDirectory() {
        if(admissionDirectory == null)
        {
            admissionDirectory = new AdmissionDirectory();
        }
        return admissionDirectory;
    }

    public void setAdmissionDirectory(AdmissionDirectory admissionDirectory) {
        this.admissionDirectory = admissionDirectory;
    }
   public QuarantineDirectory getQuarantineDirectory() {
        if(quarantineDirectory == null)
        {
            quarantineDirectory = new QuarantineDirectory();
        }
        return quarantineDirectory;
    }

    public void setQuarantineDirectory(QuarantineDirectory quarantineDirectory) {
        this.quarantineDirectory = quarantineDirectory;
    }

    
    

    public EcoSystem(PersonDirectory personDirectory,TestingCenterDirectory testingCenterDirectory , QuarantineDirectory quarantineDirectory, AdmissionDirectory admissionDirectory) {

        this.personDirectory = personDirectory;
        this.testingCenterDirectory = testingCenterDirectory;
        this.quarantineDirectory = quarantineDirectory;
        this.admissionDirectory = admissionDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
