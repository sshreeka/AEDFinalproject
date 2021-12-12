
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Quarantine.QuarantineJPanel;

/**
 *
 * @author swathisharma
 */
public class QuarantineRole extends Role{
       public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new QuarantineJPanel(userProcessContainer, account,business);
    }
}
