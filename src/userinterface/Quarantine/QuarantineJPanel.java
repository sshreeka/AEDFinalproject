/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Quarantine;

import Business.EcoSystem;
import Business.HealthCheck.DocVisit;
import Business.HealthCheck.DocVisitHistory;
import Business.HealthCheck.VitalSignCheck;
import Business.HealthCheck.VitalSigns;
import Business.Person.Person;
import Business.Quarantine.Quarantine;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import javax.swing.JOptionPane;
import userinterface.TestingCenter.doTestJPanel;

/**
 *
 * @author Nikhil
 */
public class QuarantineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuarantineJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    
    public QuarantineJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
       // populateTable();
                   // populateTable();
                        //populateNTable();
      polulateDischargeTable();
      populatePositiveTable();
       populateNegativeTable();

        }

         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        networkTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        networkTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        networkTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        networkTable3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        networkTable4 = new javax.swing.JTable();

        networkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Body Temp", "Oxygen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkTable);

        jLabel1.setText("Quarantine Hall");

        jButton1.setText("Positive Patients Vital Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        networkTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Vaccination", "Test Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(networkTable1);

        jButton2.setText("Check for Critical");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Negative Quarantine");

        jLabel5.setText("Positive Quarantine");

        networkTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Vaccination", "Test Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(networkTable2);

        jButton3.setText("Negative Patients Vital Check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        networkTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Body Temp", "Oxygen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(networkTable3);

        jButton4.setText("Check for Non Critical");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Test Positive Patients");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Test Negative Patients");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Refresh");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Discharge Patients");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        networkTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Vaccination", "Travelling", "Status", "Discharge date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(networkTable4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 521, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jButton8)))
                .addGap(646, 646, 646))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(990, 990, 990)
                        .addComponent(jButton7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jButton7)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton3)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jButton1)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = networkTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            
           DefaultTableModel model = (DefaultTableModel) networkTable1.getModel();

           Person person = (Person)model.getValueAt(selectedRow, 0);
           
          doVitalCheckJPanel doVital =new doVitalCheckJPanel(userProcessContainer, userAccount,business,person);
            userProcessContainer.add("Perform Vital check",doVital);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }                           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) networkTable.getModel();
        
        model.setRowCount(0);
        
        for(Person cust:business.getPersonDirectory().getCustList()){       
                    
            if ( (cust.getO2()< 90) && (cust.getTemp()> 103)){
                cust.setCritical("Critical");
                cust.setStatus("Admitted");
           Object[] row = new Object[3];
           row[0] = cust;
 row[1] =  cust.getTemp();
row[2] =  cust.getO2();
                            
                            model.addRow(row);
              
                    
        }}
        populatePositiveTable();
               populateNegativeTable();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
                
        int selectedRow = networkTable2.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            
           DefaultTableModel model = (DefaultTableModel) networkTable2.getModel();

           Person person = (Person)model.getValueAt(selectedRow, 0);
           
          doVitalCheckJPanel doVital =new doVitalCheckJPanel(userProcessContainer, userAccount,business,person);
            userProcessContainer.add("Perform Vital check",doVital);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
                DefaultTableModel model = (DefaultTableModel) networkTable3.getModel();
        
        model.setRowCount(0);
        
        for(Person cust:business.getPersonDirectory().getCustList()){       

if ( ((cust.getO2()> 90) && (cust.getO2()<= 94 )) && ((cust.getTemp()>= 101) && (cust.getTemp()<= 103))){

               cust.setCritical("Non Critical");
    cust.setStatus("Admitted");
Object[] row = new Object[3];
row[0] = cust;
row[1] =  cust.getTemp();
row[2] =  cust.getO2();
model.addRow(row);
              
                    
        }}
        
        populatePositiveTable();
        populateNegativeTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int selectedRow = networkTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            DefaultTableModel model = (DefaultTableModel) networkTable1.getModel();
            Person person = (Person)model.getValueAt(selectedRow, 0);
            doTestQuarantineJPanel doTest =new doTestQuarantineJPanel(userProcessContainer, business,person);
            userProcessContainer.add("Manage Covid test",doTest);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        populateTable();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
                int selectedRow = networkTable2.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            DefaultTableModel model = (DefaultTableModel) networkTable2.getModel();
            Person person = (Person)model.getValueAt(selectedRow, 0);
            doTestQuarantineJPanel doTest =new doTestQuarantineJPanel(userProcessContainer, business,person);
            userProcessContainer.add("Manage Covid test",doTest);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        populateNTable();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
//                populateTable();
//                        populateNTable();
        polulateDischargeTable();

      populatePositiveTable();
       populateNegativeTable();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null,"Discharging patients with good oxygen level with no fever");
        for(Person cust:business.getPersonDirectory().getCustList()){
                if ( (cust.getO2()>= 95 && cust.getTemp()<= 98) && cust.getTestResult().equals("Negative") &&  (cust.getStatus().equals("Quarantined"))){
                    cust.setO2(96);
                    cust.setTemp(97);
                    cust.setTestResult("Negative");
                    cust.setRecovered("yes");
                    cust.setStatus("Can exit Quarantine Facility");
                }}
        polulateDischargeTable();
      populatePositiveTable();
       populateNegativeTable();



    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable networkTable;
    private javax.swing.JTable networkTable1;
    private javax.swing.JTable networkTable2;
    private javax.swing.JTable networkTable3;
    private javax.swing.JTable networkTable4;
    // End of variables declaration//GEN-END:variables

    private void populatePositiveTable() {
                   DefaultTableModel model = (DefaultTableModel) networkTable1.getModel();
     
        model.setRowCount(0);

        for(Person cust:business.getPersonDirectory().getCustList()){    
               if ((cust.getTestResult().equals("Positive")) && (cust.getStatus().equals("Quarantined"))){                    
                Object[] row = new Object[10];
                row[0] = cust;
                row[1] = cust.getAddress();
                row[2] = cust.getVaccinationStatus();
                row[3] = cust.getTestResult();
                model.addRow(row);
   
                  }
    }
    }
//
    private void populateNegativeTable() {
                   DefaultTableModel model = (DefaultTableModel) networkTable2.getModel();
    
        model.setRowCount(0);

        for(Person cust:business.getPersonDirectory().getCustList()){    
               if ((cust.getTestResult().equals("Negative")) && (cust.getTravelling().equals("International")) && (cust.getStatus().equals("Quarantined")) ){
                    
                Object[] row = new Object[4];
                row[0] = cust;
                row[1] = cust.getAddress();
                row[2] = cust.getVaccinationStatus();
                row[3] = cust.getTestResult();
                model.addRow(row);
   
                  }
    }
    }

  private void populateTable() {
                   DefaultTableModel model = (DefaultTableModel) networkTable1.getModel();
     
        model.setRowCount(0);
        Random rand = new Random();

        for(Person cust:business.getPersonDirectory().getCustList()){    
            int  room_num = 0;
               if (cust.getTestResult() == "Positive"){
          
                Object[] row = new Object[10];
                row[0] = cust;
                row[1] = cust.getAddress();
                row[2] = cust.getVaccinationStatus();
                row[3] = cust.getTestResult();
                row[4] = cust.getCritical();
                model.addRow(row);
                  }
        }}    
      private void populateNTable() {
                   DefaultTableModel model = (DefaultTableModel) networkTable2.getModel();
     
        model.setRowCount(0);
        Random rand = new Random();

        for(Person cust:business.getPersonDirectory().getCustList()){    
            int  room_num = 0;
               if (cust.getTestResult() == "Negative"){
          
                Object[] row = new Object[10];
                row[0] = cust;
                row[1] = cust.getAddress();
                row[2] = cust.getVaccinationStatus();
                row[3] = cust.getTestResult();
                row[4] = cust.getCritical();
                model.addRow(row);
                  }
        }}    

    private void polulateDischargeTable() {
        DefaultTableModel model = (DefaultTableModel) networkTable4.getModel();
        
        model.setRowCount(0);
           Date date = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        for(Person cust:business.getPersonDirectory().getCustList()){       
                  if (cust.getStatus().equals("Can exit Quarantine Facility")){
                        Object[] row = new Object[6];
                        row[0] = cust;
                row[1] = cust.getAddress();
                row[2] = cust.getVaccinationStatus();
                row[3] = cust.getTravelling();
                row[4] = cust.getStatus();
                row[5] = formatter.format(date);
                             model.addRow(row);
    }
        }
    }
    
}