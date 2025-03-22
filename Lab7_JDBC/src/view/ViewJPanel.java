/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.HeadlessException;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;
import utility.DatabaseConnector;

/**
 *
 * @author User
 */
public class ViewJPanel extends javax.swing.JPanel {

    private User userObject;
    private ArrayList<User>users;
    /**
     * Creates new form NewJPanel
     */
    public ViewJPanel() {
        initComponents();
        populateTable();
    }
    public ViewJPanel(User userObject){
        initComponents();
        this.userObject = userObject;
        setAllFields();
    }
    
   public void setAllFields(){
       this.nameTextField.setText(userObject.getName());
       this.lastNameTextField.setText(userObject.getLastname());
       this.genderComboBox.setSelectedItem(userObject.getGender());
      // this.emailTextField.setToolTipText(userObject.getEmail());
       //this.phoneTextField.setText(userObject.getPhonenumber());
       this.ageTextField.setText(String.valueOf(userObject.getAge()));
       this.hobbiesTextArea.setText(userObject.getHobby());
       this.imgeLabel1.setIcon(userObject.getPicture());
       
    
       
   } 

   public void populateTable(){
      this.users = DatabaseConnector.getUsers();
     
      DefaultTableModel model = (DefaultTableModel) this.userJTable.getModel();
       model.setRowCount(0);
      for(User u1: users){
          Object[] row = new Object[6];
          row[0] = u1.getUserId();
          row[1] = u1.getName();
          row[2] = u1.getLastname();
          row[3] = u1.getGender();
          row[4] = u1.getAge();
          row[5] = u1.getHobby();
          model.addRow(row);
          
      }
   }
   public void enableAll(){
       this.nameTextField.setEnabled(true);
       this.lastNameTextField.setEnabled(true);
       this.genderComboBox.setEnabled(true);
       this.ageTextField.setEnabled(true);
       this.hobbiesTextArea.setEnabled(true);
   }
    public void disbleAll(){
        this.nameTextField.setEnabled(false);
       this.lastNameTextField.setEnabled(false);
       this.genderComboBox.setEnabled(false);
       this.ageTextField.setEnabled(false);
       this.hobbiesTextArea.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        ageTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        hobbiesLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hobbiesTextArea = new javax.swing.JTextArea();
        lastNameTextField = new javax.swing.JTextField();
        imgeLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        editjButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        submitEditButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));

        nameTextField.setEnabled(false);
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        ageLabel.setText("AGE");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        genderComboBox.setSelectedIndex(-1);
        genderComboBox.setEnabled(false);

        ageTextField.setEnabled(false);

        genderLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        genderLabel.setText("GENDER");

        userLabel.setFont(new java.awt.Font("High Tower Text", 3, 24)); // NOI18N
        userLabel.setText("USER DETAILS");

        nameLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        nameLabel.setText("NAME");

        hobbiesLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        hobbiesLabel.setText("HOBBIES");

        lastNameLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        lastNameLabel.setText("LAST NAME");

        hobbiesTextArea.setColumns(20);
        hobbiesTextArea.setRows(5);
        hobbiesTextArea.setEnabled(false);
        jScrollPane1.setViewportView(hobbiesTextArea);

        lastNameTextField.setEnabled(false);

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Last Name", "Gender", "Age", "Hobbies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(userJTable);

        editjButton.setText("Edit");
        editjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editjButtonActionPerformed(evt);
            }
        });

        deletejButton.setText("Delete");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        submitEditButton1.setText("Submit");
        submitEditButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitEditButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hobbiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editjButton)
                                .addGap(27, 27, 27)
                                .addComponent(deletejButton)
                                .addGap(33, 33, 33)
                                .addComponent(submitEditButton1)))
                        .addGap(0, 730, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(imgeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(imgeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hobbiesLabel)
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editjButton)
                                    .addComponent(deletejButton)
                                    .addComponent(submitEditButton1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = this.userJTable.getSelectedRow();
        
        try{
     this.userObject = this.users.get(selectedRowIndex);
       DatabaseConnector.deleteUser(userObject);
       System.out.println("Student Deleted");
       
       JOptionPane.showMessageDialog(this,"Record Updated" ,"Success",HEIGHT);
               
       populateTable();
       
       
}catch (HeadlessException e){
    System.out.println("Please Select");
        }

  
    }//GEN-LAST:event_deletejButtonActionPerformed

    private void editjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editjButtonActionPerformed
        // TODO add your handling code here:
           int selectedRowIndex = this.userJTable.getSelectedRow();
           
           try{
               
           this.userObject = this.users.get(selectedRowIndex);
             setAllFields();
             enableAll();
           }catch (Exception e){
               
           }
    }//GEN-LAST:event_editjButtonActionPerformed

    private void submitEditButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitEditButton1ActionPerformed
        // TODO add your handling code here:
        User updatedUser = new User();
        updatedUser.setName(this.nameTextField.getText());
        updatedUser.setLastname(this.lastNameTextField.getText());
        
        updatedUser.setgender(this.genderComboBox.getSelectedItem().toString());
        updatedUser.setAge(Integer.parseInt(this.ageTextField.getText()));
        updatedUser.setHobby(this.hobbiesTextArea.getText());
        
        
        try{
            DatabaseConnector.updateUser(userObject, updatedUser);
            System.out.println("Record Updated");
            populateTable();
        }catch (Exception e){
        
    }//GEN-LAST:event_submitEditButton1ActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton deletejButton;
    private javax.swing.JButton editjButton;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel hobbiesLabel;
    private javax.swing.JTextArea hobbiesTextArea;
    private javax.swing.JLabel imgeLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton submitEditButton1;
    private javax.swing.JTable userJTable;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
