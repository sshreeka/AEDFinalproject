/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Person.Person;
import Business.Role.PersonRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nikhil
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanel
     */
    
   
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
 
    public ManagePersonJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
      //  populateUsers();

         populateNetworkTable();

         ConfirmBtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        ConfirmBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTable = new javax.swing.JTable();
        Backbtn = new javax.swing.JButton();

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Person");

        jLabel3.setText("Name");

        jLabel4.setText("Password");

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        ConfirmBtn.setText("Confirm Update");
        ConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Username");

        networkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "User Name", "Password", "Role", "Vaccination", "Travelling", "Address", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkTable);

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(1107, Short.MAX_VALUE)
                        .addComponent(Backbtn))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submit)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(uNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 665, Short.MAX_VALUE)
                    .addComponent(updateBtn)
                    .addGap(82, 82, 82)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addComponent(ConfirmBtn)
                    .addGap(90, 90, 90)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(Backbtn)
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addComponent(submit)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBtn)
                        .addComponent(ConfirmBtn)
                        .addComponent(updateBtn))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String name = nameJTextField.getText();
        String uname=uNameTextField.getText();
        String password=PasswordField.getText();

        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(name.length()<5 || Pattern.matches("^[A-Za-z]+$", name)==false){
                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if(uname==null || uname.isEmpty()){
                throw new NullPointerException("User Name field is Empty");

            }else if(uname.length()<5){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if(password==null || password.isEmpty()){
                throw new NullPointerException("Password field is Empty");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }

        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{

            UserAccount ua1 =system.getUserAccountDirectory().createUserAccount(name,uname,password,null, new PersonRole());
            Person person= system.getPersonDirectory().createCustomer(uname);
   //         person.setName(name);
            populateNetworkTable();
            nameJTextField.setText("");
            uNameTextField.setText("");
            PasswordField.setText("");
            //        ContactField.setText("");
            //        addressField.setText("");
        }
    }//GEN-LAST:event_submitActionPerformed
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkTable.getModel();
        
        model.setRowCount(0);
        
        for (UserAccount uuserr : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.PersonRole".equals(uuserr.getRole().getClass().getName())) {
                
                 for(Person cust:system.getPersonDirectory().getCustList()){
            if(uuserr.getUsername().equals(cust.getUserName())){
        
                Object[] row = new Object[10];
               
                row[0] = uuserr.getName();
                row[1] = uuserr.getUsername();
                row[2] = uuserr.getPassword();
                row[3] = cust.getRole();
                row[4] = cust.getVaccinationStatus();
                row[5] = cust.getTravelling();
                row[6] = cust.getAddress();
                row[7] = cust.getStatus();
                
                model.addRow(row);
            }
                 }}
        }
    
    }
    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = networkTable.getSelectedRow();

        if(selectRow>=0){
            String username= (String) networkTable.getValueAt(selectRow, 1);
            String pwd= (String) networkTable.getValueAt(selectRow, 2);
            user=system.getUserAccountDirectory().authenticateUser(username, pwd);

            nameJTextField.setText(user.getName()+"");
            uNameTextField.setText(user.getUsername()+"");
            PasswordField.setText(user.getPassword()+"");
            // system.getUserAccountDirectory().deleteUserAccount(user);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
       //submitJButton.setEnabled(false);
        deleteBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        ConfirmBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = networkTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) networkTable.getValueAt(selectedRow, 1);
                String pwd= (String) networkTable.getValueAt(selectedRow, 2);
                UserAccount user=system.getUserAccountDirectory().authenticateUser(username, pwd);

                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getPersonDirectory().deleteCustomer(user.getUsername());
                populateNetworkTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void ConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtnActionPerformed
        // TODO add your handling code here:

        String name = nameJTextField.getText();
        String uname=uNameTextField.getText();
        String password=PasswordField.getText();

        try {
            if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");

            }else if(name.length()<5 || Pattern.matches("^[A-Za-z]+$", name)==false){
                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "  Name is invalid");

            return;
        }

        try {
            if(uname==null || uname.isEmpty()){
                throw new NullPointerException("User Name field is Empty");

            }else if(uname.length()<5){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, " User Name is invalid");

            return;
        }

        try {

            if(password==null || password.isEmpty()){
                throw new NullPointerException("Pwd field is Empty");
            }else if(Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){
                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is of invalid pattern");

            return;
        }

        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(uname)==false) {
            JOptionPane.showMessageDialog(null,"  User Name already exists ");
        }else{

            system.getUserAccountDirectory().updateUserAccount(user,name,uname,password);
            populateNetworkTable();
         //   submitJButton.setEnabled(true);
            deleteBtn.setEnabled(true);
            updateBtn.setEnabled(true);
            ConfirmBtn.setEnabled(false);
            nameJTextField.setText("");
            uNameTextField.setText("");
            PasswordField.setText("");
        }
    }//GEN-LAST:event_ConfirmBtnActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkTable;
    private javax.swing.JButton submit;
    private javax.swing.JTextField uNameTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

       private void populateUsers() {
          
              for (int i=0;i < 10; i++) {
                   System.out.println("ENrteing");
                  String userName = firstNames.get(new Random().nextInt(firstNames.size()));
                  String name= lastNames.get(new Random().nextInt(lastNames.size()));
                  UserAccount ua1 =system.getUserAccountDirectory().createUserAccount(userName,name ,"passwd1!",null, new PersonRole());
                  Person cust= system.getPersonDirectory().createCustomer(userName);
                cust.setAddress((houseNum.get(new Random().nextInt(houseNum.size()))+" "+ communityNames.get(new Random().nextInt(communityNames.size())) + " "+ cityNames.get(new Random().nextInt(cityNames.size()))));
                cust.setRole(Role.get(new Random().nextInt(Role.size())));
                if (cust.getRole().equals("Traveller")){
                                    cust.setTravelling(Flight.get(new Random().nextInt(Flight.size())));

                }
                else{
                                                        cust.setTravelling("None");

                }
                
                cust.setDateOfBirth(dateOfBirths.get(new Random().nextInt(dateOfBirths.size())));
                cust.setName(name);
              cust.setAgeGroup();
              cust.setCritical("Non Critical");
              cust.setRecovered("yes");
              cust.setStatus("Yet to get tested");
              
                                 System.out.println("Name is "+cust.getName());

        
    
}
       }
    
    private static List<String> cityNames = Arrays.asList("Boston", "Seattle", "NewYork", "Texas","Sunnyvale","Bangalore","Delhi","Hydrabad","Chennai");
    private static  List<String> communityNames = Arrays.asList("King", "Hudson", "Rockefeller","County", "Bay", "Ridge","Roxbury", "Ruggles", "MissionMain");
    private static List<String> firstNames = Arrays.asList("Bob", "Bruce", "Flash", "Peter","Hank", "Jack", "Robert", "John","Richard", "Daniel", "Matthew", "Donald");
    private static List<String> lastNames = Arrays.asList("Parker", "Wayne", "Catalyst", "Jason","Jonathan", "Larry", "Scott", "Benjamin","Gregory", "Raymond", "Dennis", "Jerry");
    private static List<String> Role = Arrays.asList("Staff","Traveller");
    private static List<String> Flight = Arrays.asList("Domestic","International");


    private static List<LocalDate> dateOfBirths = Arrays.asList(
            LocalDate.parse("1985-12-12"), 
            LocalDate.parse("1999-11-23"),
            LocalDate.parse("2021-01-01"),
            LocalDate.parse("2021-02-15"),
            LocalDate.parse("1956-12-31"), 
            LocalDate.parse("1993-11-01"),
            LocalDate.parse("2021-01-01"),
            LocalDate.parse("2020-02-24"),
            LocalDate.parse("1924-12-31"), 
            LocalDate.parse("1999-11-10"),
            LocalDate.parse("2015-01-09"),
            LocalDate.parse("2021-03-25")
    );
    private static List<Integer> houseNum = Arrays.asList(121,90,49,51,69,70);

    }
