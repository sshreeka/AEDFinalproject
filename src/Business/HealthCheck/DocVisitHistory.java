package Business.HealthCheck;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author sshreeka sshreeka
 */
public class DocVisitHistory {
    public Stack<DocVisit> history = new Stack<DocVisit>();
    public DocVisit latestEncounter;
    
    public void recordEncounter(DocVisit encounter){
        this.latestEncounter = encounter;
        this.history.push(encounter);
    }
}

