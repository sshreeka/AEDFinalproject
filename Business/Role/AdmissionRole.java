/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.Admission.AdmissionJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sshreeka sshre`eka
 */
public class AdmissionRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdmissionJPanel(userProcessContainer,account,business);
    }

    
    
}
