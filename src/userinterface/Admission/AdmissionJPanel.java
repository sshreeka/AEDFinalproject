/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Admission;

import Business.EcoSystem;
import Business.HealthCheck.DocVisit;
import Business.HealthCheck.DocVisitHistory;
import Business.HealthCheck.VitalSignCheck;
import Business.HealthCheck.VitalSigns;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Quarantine.doVitalCheckJPanel;
import userinterface.TestingCenter.doTestJPanel;

/**
 *
 * @author sshreeka sshreeka
 */
public class AdmissionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdmissionJPanel
     */
    
      private JPanel userProcessContainer;

    private UserAccount account;
   
    EcoSystem system;
    public AdmissionJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem system) {
        initComponents();
        
    this.account=account;
    this.userProcessContainer = userProcessContainer;
    this.system=system;
    populateDischargeTable();

    populateNonCriticalPatients();

    populateCriticalpatients();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        networkTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        networkTable3 = new javax.swing.JTable();

        setBackground(new java.awt.Color(234, 230, 251));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setText("Covid Admission Center");

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton3.setText("Discharge Patients");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton4.setText("Vital Check");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton6.setText("Vital Check");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton7.setText("Do test");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton8.setText("Do test");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        networkTable1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        networkTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Vaccination", "Travelling", "Status", "Discharge Date"
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
        jScrollPane1.setViewportView(networkTable1);

        jButton9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton9.setText("Check for Non Critical");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton2.setText("Check for Critical");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        networkTable.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
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
        jScrollPane3.setViewportView(networkTable);

        networkTable3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addGap(26, 26, 26)
                                .addComponent(jButton6)
                                .addGap(35, 35, 35)
                                .addComponent(jButton7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(496, 496, 496)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton8)
                            .addComponent(jButton2))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(146, 146, 146)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
          JOptionPane.showMessageDialog(null,"Discharging patients with good oxygen level with no fever");
                  for(Person cust:system.getPersonDirectory().getCustList()){

                if ( (cust.getO2()>= 95 && cust.getTemp() <= 98 ) && (cust.getTestResult().equals("Negative"))  && (cust.getStatus().equals("Admitted"))){
                    cust.setStatus("Discharged");
                    cust.setTemp(98);
                    cust.setO2(95);
                    
                }
                else if ( (cust.getO2()>= 95 && cust.getTemp() <= 98 ) && (cust.getTestResult().equals("Positive") ) && (cust.getStatus().equals("Admitted") ))
                        {
                                                cust.setStatus("Quarantined");

                        }
                else if ( (cust.getO2()>= 95 && cust.getTemp() <= 98 ) && (cust.getTestResult().equals("Negative") ) && (cust.getStatus().equals("Discharged") ))
                        {
                                      System.out.println("");

                        }}
         
            populateDischargeTable();
    
        populateNonCriticalPatients();
        
        populateCriticalpatients();
    }//GEN-LAST:event_jButton3ActionPerformed
//
    private void populateDischargeTable(){
        DefaultTableModel model = (DefaultTableModel) networkTable1.getModel();
        
        model.setRowCount(0);
        Date date = new Date(); 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        for(Person cust:system.getPersonDirectory().getCustList()){       
                  if (cust.getStatus().equals("Discharged")){
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
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        int selectedRow = networkTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            DefaultTableModel model = (DefaultTableModel) networkTable.getModel();

            Person person = (Person)model.getValueAt(selectedRow, 0);
            doVitalCheckJPanel doVital =new doVitalCheckJPanel(userProcessContainer, account,system,person);
            userProcessContainer.add("Perform Vital check",doVital);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        populateNonCriticalPatients();
        
        populateCriticalpatients();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void populateNonCriticalPatients(){
        
      DefaultTableModel model = (DefaultTableModel) networkTable3.getModel();

        model.setRowCount(0);

        for(Person cust:system.getPersonDirectory().getCustList()){

if ( ((cust.getO2()> 90) && (cust.getO2()<= 94 )) && ((cust.getTemp()>= 99) && (cust.getTemp()<= 103)) &&  cust.getStatus().equals("Admitted")){

                Object[] row = new Object[3];
                row[0] = cust;
                row[1] =  cust.getTemp();
                row[2] =  cust.getO2();
                model.addRow(row);

            }}
    }
    
    private void populateCriticalpatients(){
        
        DefaultTableModel model = (DefaultTableModel) networkTable.getModel();

        model.setRowCount(0);

        for(Person cust:system.getPersonDirectory().getCustList()){

            
            if ( (cust.getO2()< 90) && (cust.getTemp()> 103) && cust.getStatus().equals("Admitted")){
                
                Object[] row = new Object[3];
                row[0] = cust;
                row[1] =  cust.getTemp();
                row[2] =  cust.getO2();

                model.addRow(row);

            }}
        
        
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
                int selectedRow = networkTable3.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            DefaultTableModel model = (DefaultTableModel) networkTable3.getModel();

            Person person = (Person)model.getValueAt(selectedRow, 0);
            doVitalCheckJPanel doVital =new doVitalCheckJPanel(userProcessContainer, account,system,person);
            userProcessContainer.add("Perform Vital check",doVital);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
        populateCriticalpatients();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int selectedRow = networkTable3.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            DefaultTableModel model = (DefaultTableModel) networkTable3.getModel();
            Person person = (Person)model.getValueAt(selectedRow, 0);
            doTestAdmittedPanel doTest =new doTestAdmittedPanel(userProcessContainer, system,person);
            userProcessContainer.add("Manage Covid test",doTest);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
                int selectedRow = networkTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            DefaultTableModel model = (DefaultTableModel) networkTable.getModel();
            Person person = (Person)model.getValueAt(selectedRow, 0);
            doTestAdmittedPanel doTest =new doTestAdmittedPanel(userProcessContainer, system,person);
            userProcessContainer.add("Manage Covid test",doTest);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

       populateNonCriticalPatients();

           
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

populateCriticalpatients();

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable networkTable;
    private javax.swing.JTable networkTable1;
    private javax.swing.JTable networkTable3;
    // End of variables declaration//GEN-END:variables
}