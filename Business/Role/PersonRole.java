/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.PersonRole.PersonAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sshreeka  
 */
public class PersonRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new PersonAreaJPanel(userProcessContainer, account,business);
    }
    
    
}
