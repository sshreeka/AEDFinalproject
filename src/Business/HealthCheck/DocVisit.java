/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HealthCheck;

import java.util.Date;

/**
 *
 * @author sshreeka sshreeka
 */

public class DocVisit {
    public VitalSigns vitalSigns;

    public DocVisit(VitalSigns vitals) {
        this.vitalSigns = vitals;
        this.timeStamp = new Date();
    }
    
    public Date timeStamp;
    
    public Date getTimeStamp() {
        return timeStamp;
    }
    
    public VitalSigns getVitalSigns() {
        return vitalSigns;
        
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
}
