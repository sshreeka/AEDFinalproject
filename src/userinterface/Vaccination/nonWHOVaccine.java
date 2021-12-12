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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author swathisharma
 */
public class nonWHOVaccine extends javax.swing.JPanel {

    /**
     * Creates new form nonWHOVaccine
     */
    
          private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    public nonWHOVaccine(JPanel userProcessContainer, EcoSystem system, UserAccount user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jButton1.setVisible(false);
             ButtonGroup group = new ButtonGroup();
        group.add(getWHORadio);
        group.add(DonotVaccineButton);
        jDateChooser1.setVisible(false);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        getWHORadio = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        DonotVaccineButton = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();

        popupMenu1.setLabel("popupMenu1");
        popupMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu1ActionPerformed(evt);
            }
        });

        getWHORadio.setText("Get WHO approved vaccine");
        getWHORadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getWHORadioActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pfizer", "Covishield", "JJ", "Moderna", "Sinopharm", "Sinovac" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        DonotVaccineButton.setText("Do not get Vaccinated");
        DonotVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonotVaccineButtonActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10AM", "12PM", "2PM", "4PM" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Confirm Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tremont St", "Boylston St", "Seaport ", "West Roxbury", "Brooklyne", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DonotVaccineButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getWHORadio)
                        .addGap(46, 46, 46)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Backbtn)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(getWHORadio)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(58, 58, 58)
                .addComponent(DonotVaccineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(Backbtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getWHORadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getWHORadioActionPerformed
        // TODO add your handling code here:
        
        jComboBox1.setVisible(true);
                jComboBox3.setVisible(true);

        
    }//GEN-LAST:event_getWHORadioActionPerformed

    private void DonotVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonotVaccineButtonActionPerformed
        // TODO add your handling code here:
        if ( DonotVaccineButton.isSelected()){
                    jComboBox1.setVisible(false);
                    jComboBox2.setVisible(false);
                    jComboBox3.setVisible(false);

                    jButton1.setVisible(false);
                    jDateChooser1.setVisible(false);

        }
                   for(Person cust:system.getPersonDirectory().getCustList()){
            if(user.getUsername().equals(cust.getUserName())){
                cust.setVaccinationStatus("Not Vaccinated");
            }
        }
    }//GEN-LAST:event_DonotVaccineButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
                    Object selectedVaccine = jComboBox1.getSelectedItem();
                    
            JOptionPane.showMessageDialog(null,"You selected "+selectedVaccine,"Vaccine",JOptionPane.WARNING_MESSAGE);
            jDateChooser1.setVisible(true);
            jComboBox2.setVisible(true);


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void popupMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupMenu1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                 Object selectedLoc = jComboBox3.getSelectedItem();

                 Object selectedTime = jComboBox2.getSelectedItem();
                                      	ZoneId defaultZoneId = ZoneId.systemDefault();

             LocalDate localDate = java.time.LocalDate.now();
                     Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

            jDateChooser1.getJCalendar().setMinSelectableDate(date);
                        String strDate = DateFormat.getDateInstance().format(date);

            Date appDate = jDateChooser1.getDate();
   JOptionPane.showMessageDialog(null,"You selected "+selectedLoc +"Date"+ strDate+"Time"+selectedTime,"Appointment",JOptionPane.WARNING_MESSAGE);
      for(Person cust:system.getPersonDirectory().getCustList()){
            if(user.getUsername().equals(cust.getUserName())){
                cust.setVaccinationStatus("Yet to get Vaccinated");
            }
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(true);

           
    }//GEN-LAST:event_jComboBox2ActionPerformed

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

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        
        
                    Object selectedLocation = jComboBox3.getSelectedItem();
                    
            JOptionPane.showMessageDialog(null,"You selected "+selectedLocation," Vaccine ",JOptionPane.WARNING_MESSAGE);
            jDateChooser1.setVisible(true);
            jComboBox2.setVisible(true);

    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JRadioButton DonotVaccineButton;
    private javax.swing.JRadioButton getWHORadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
