/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;
import Business.HealthCheck.AgeGroup;
import Business.HealthCheck.DocVisit;
import Business.HealthCheck.DocVisitHistory;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author sshreeka sshreeka
 */
public class Person {
    private String Name;
    public String UserName;
    private String vaccinationStatus = "No update";
    private String role = "No update";
    private String Travelling = "No update";
    private String testResult = "No update";
    private AgeGroup ageGroup;
    private LocalDate dateOfBirth;
    private String critical = "Critical";
    private String recovered;
    private String Status = "No update";
    private int Temp;
    private int O2;

    public int getTemp() {
        return Temp;
    }

    public void setTemp(int Temp) {
        this.Temp = Temp;
    }

    public int getO2() {
        return O2;
    }

    public void setO2(int O2) {
        this.O2 = O2;
    }
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private DocVisitHistory encounterHistory = new DocVisitHistory();

    public DocVisitHistory getEncounterHistory() {

        return encounterHistory;
    }

    public void setEncounterHistory(DocVisitHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
     
    }
    public String getTestResult() {
        return testResult;
    }
    public AgeGroup getAgeGroup() {
        return ageGroup;
    }
    
    public void setAgeGroup() {
        Period period = Period.between(LocalDate.now(), this.dateOfBirth);
        //System.out.println(period.getMonths() +  " " +  period.getMonths());    
        int ageInMonths = Math.abs((period.getYears()*12) + Math.abs(period.getMonths()));
        int ageInYears = ageInMonths / 12;
        if (ageInMonths < 1) {
            this.ageGroup = AgeGroup.Newborn;
        } else if (ageInMonths >= 1 && ageInMonths <= 12) {
            this.ageGroup = AgeGroup.Infant;

        } else if (ageInYears >= 1 && ageInYears <= 3) {
            this.ageGroup = AgeGroup.Toddler;

        } else if (ageInYears >= 3 && ageInYears <= 5) {
            this.ageGroup = AgeGroup.PreSchooler;

        } else if (ageInYears >= 6 && ageInYears <= 12) {
            this.ageGroup = AgeGroup.SchoolAge;

        } else {
            this.ageGroup = AgeGroup.Adolscent;
        }
    }
    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    public String getTravelling() {
        return Travelling;
    }

    public void setTravelling(String Travelling) {
        this.Travelling = Travelling;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }
    
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    private String address= "No update";
    private String number;

    public Person(String UserName){
        this.UserName=UserName;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return Name;
    }

    
}
