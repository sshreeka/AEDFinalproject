/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Vaccination;

import Business.EcoSystem;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import userinterface.TestingCenter.doTestJPanel;

/**
 *
 * @author sshreeka sshreeka
 */
public class VaccinationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccinationJPanel
     */
    
        private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    public VaccinationJPanel(JPanel userProcessContainer,EcoSystem system,UserAccount user) {
        initComponents();
            this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        whoRadio.setVisible(false);
                whoNotRadio.setVisible(false);

        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1);
        group.add(jRadioButton2);

        ButtonGroup vaccinegrp = new ButtonGroup();
        vaccinegrp.add(whoNotRadio);
        vaccinegrp.add(whoRadio);



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        Backbtn = new javax.swing.JButton();
        whoRadio = new javax.swing.JRadioButton();
        whoNotRadio = new javax.swing.JRadioButton();

        jLabel1.setText("Vaccination Status");

        jRadioButton1.setText("Yes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Vaccinated");

        jLabel3.setText("Non Vaccinated");

        jRadioButton2.setText("No");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        whoRadio.setText("WHO approved");
        whoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoRadioActionPerformed(evt);
            }
        });

        whoNotRadio.setText("Not WHO approved");
        whoNotRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoNotRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Backbtn)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(whoNotRadio)
                    .addComponent(whoRadio)
                    .addComponent(jLabel1))
                .addContainerGap(432, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel2)
                    .addComponent(whoRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(whoNotRadio)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(Backbtn)
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        whoRadio.setVisible(true);
        whoNotRadio.setVisible(true);

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void whoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoRadioActionPerformed
        // TODO add your handling code here:
        
           for(Person cust:system.getPersonDirectory().getCustList()){
            if(user.getUsername().equals(cust.getUserName())){
                cust.setVaccinationStatus("WHO approved Vaccine ");
            }
        }
    }//GEN-LAST:event_whoRadioActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        
                if (jRadioButton2.isSelected()){
                    whoRadio.setVisible(false);
                    whoNotRadio.setVisible(false);

        }
                
                       nonWHOVaccine doTest =new nonWHOVaccine(userProcessContainer, system, user);
        userProcessContainer.add("Manage Vaccination",doTest);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void whoNotRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoNotRadioActionPerformed
        // TODO add your handling code here:
        
        
          nonWHOVaccine doTest =new nonWHOVaccine(userProcessContainer, system, user);
        userProcessContainer.add("Manage Vaccination",doTest);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_whoNotRadioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton whoNotRadio;
    private javax.swing.JRadioButton whoRadio;
    // End of variables declaration//GEN-END:variables
}
