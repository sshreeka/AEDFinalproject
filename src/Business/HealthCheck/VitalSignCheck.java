
package Business.HealthCheck;

import Business.Person.Person;

/**
 *
 * @author sshreeka sshreeka
 */
public class VitalSignCheck {

    public static boolean isBPNormal(Person patient) {
        AgeGroup ageGroup = patient.getAgeGroup();
        try{
        DocVisitHistory history = patient.getEncounterHistory();
        DocVisit docvisit = history.latestEncounter;
        VitalSigns vitalSigns = docvisit.getVitalSigns();
        int bp = vitalSigns.getBodyTemp();
        switch (ageGroup) {
            case Newborn:
                return bp > 49 && bp < 71;
            case Infant:
                return bp > 69 && bp < 101;
            case Toddler:
            case PreSchooler:
                return bp > 79 && bp < 111;
            case SchoolAge:
                return bp > 79 && bp < 121;
            case Adolscent:
                return bp > 109 && bp < 121;
        }
        // Throw exception invalid value
        return true;
        }
       catch( Exception e){
        return true;
 }
    }
    
    public static boolean isOxygenLevelAbNormal(Person patient) {
        AgeGroup ageGroup = patient.getAgeGroup();
           try{

        DocVisitHistory history = patient.getEncounterHistory();
        DocVisit docvisit = history.latestEncounter;
        VitalSigns vitalSigns = docvisit.getVitalSigns();
        int hr = vitalSigns.getOxygenLevel();
        if (hr < 85){
                    System.out.print(hr);
            return true;
        }
        // Throw exception invalid value
        return false;
    }        catch( Exception e){
                return true;


    }
}
}
