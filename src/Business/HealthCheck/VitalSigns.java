
package Business.HealthCheck;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author sshreeka
 */
public class VitalSigns {
    
   private int BodyTemp;
   private int oxygenLevel;

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }
   private Instant date;
  

    public int getBodyTemp() {
        return BodyTemp;
    }

    public void setBodyTemp(int BodyTemp) {
        this.BodyTemp = BodyTemp;
    }

      
    public Instant getDate() {
        Date date = new Date();
        return date.toInstant();
    }
}
