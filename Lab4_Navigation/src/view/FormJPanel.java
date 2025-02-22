/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;

/**
 *
 * @author User
 */
public class FormJPanel extends javax.swing.JPanel {

    JPanel bottomPanel2;
    ImageIcon picture;
    /**
     * Creates new form NewJPanel1
     */
    public FormJPanel() {
        initComponents();
        
    }
    
    public FormJPanel(JPanel bottomPanel2){
      initComponents();  
      this.bottomPanel2 = bottomPanel2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        ageTextField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        hobbiesLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hobbiesTextArea = new javax.swing.JTextArea();
        emailTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        photoButton = new javax.swing.JButton();
        imageLabel1 = new javax.swing.JLabel();
        imgLabel1 = new javax.swing.JLabel();
        picLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 102, 255));

        userLabel.setFont(new java.awt.Font("High Tower Text", 3, 24)); // NOI18N
        userLabel.setText("USER DETAILS");

        nameLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        nameLabel.setText("NAME");

        lastNameLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        lastNameLabel.setText("LAST NAME");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        ageLabel.setText("AGE");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        genderComboBox.setSelectedIndex(-1);

        genderLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        genderLabel.setText("GENDER");

        phoneLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        phoneLabel.setText("PHONE NUMBER");

        emailLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        emailLabel.setText("EMAIL");

        hobbiesLabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        hobbiesLabel.setText("HOBBIES");

        hobbiesTextArea.setColumns(20);
        hobbiesTextArea.setRows(5);
        jScrollPane1.setViewportView(hobbiesTextArea);

        submitButton.setText("ADD");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        photoButton.setText("PHOTO");
        photoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoButtonActionPerformed(evt);
            }
        });

        imageLabel1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        imageLabel1.setText("IMAGE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hobbiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(picLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                            .addComponent(phoneTextField)
                            .addComponent(emailTextField)
                            .addComponent(nameTextField)
                            .addComponent(lastNameTextField)
                            .addComponent(ageTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submitButton)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(photoButton)
                                .addGap(96, 96, 96)
                                .addComponent(imgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hobbiesLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(photoButton)
                    .addComponent(imageLabel1))
                .addGap(1, 1, 1)
                .addComponent(picLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        try{
            User userObject = new User();

            userObject.setName(this.nameTextField.getText());
            userObject.setLastname(this.lastNameTextField.getText());
            userObject.setEmail(this.emailTextField.getText());
            userObject.setPhonenumber(this.phoneTextField.getText());
            userObject.setHobby(this.hobbiesTextArea.getText());
            userObject.setGender(this.genderComboBox.getSelectedItem().toString());
            userObject.setAge(Integer.parseInt(this.ageTextField.getText()));
            userObject.setPicture(this.picture);

            System.out.println(userObject.getName());
            System.out.println(userObject.getLastname());
            System.out.println(userObject.getGender());
            System.out.println(userObject.getAge());
            System.out.println(userObject.getPhonenumber());
            System.out.println(userObject.getEmail());
            System.out.println(userObject.getHobby());

            if(userObject.getName().isBlank()){
                JOptionPane.showMessageDialog(this, "Please ENTER USERNAME","OOPS", JOptionPane.HEIGHT);
            }else if (userObject.getLastname().isBlank()){
                JOptionPane.showMessageDialog(this,"Please enter last name" + userObject.getLastname(), "OOPS!",HEIGHT);
            }else if(userObject.getEmail().isBlank()){
                JOptionPane.showMessageDialog(this,"Please enter Email" + userObject.getEmail(), "oops!",HEIGHT);
            }else if(userObject.getPhonenumber().isBlank()){
                JOptionPane.showMessageDialog(this,"Please enter phone number" + userObject.getPhonenumber(),"oops",HEIGHT);
            }else if(userObject.getGender().isBlank()){
                JOptionPane.showMessageDialog(this,"Please select Gender" + userObject.getGender(),"oops",HEIGHT);
            }else if(userObject.getAge()<18){
                JOptionPane.showMessageDialog(this,"AGE SHOULD BE ABOVE 18" ,"oops",HEIGHT);
            }else if(userObject.getHobby().isBlank()){
                JOptionPane.showMessageDialog(this,"Please enter hobbies","oops",HEIGHT);
            }else{
                JOptionPane.showMessageDialog(this,"SUCCESSFULY ADDAED"+ userObject.getName() +"Age" + userObject.getAge() + "Gender" + userObject.getGender()+ "Hobbies" + userObject.getHobby(),"Success",HEIGHT,picture);
              ViewJPanel viewJPanelObject = new ViewJPanel(userObject);
              this.bottomPanel2.add(viewJPanelObject);
              CardLayout layout =(CardLayout) this.bottomPanel2.getLayout();
        layout.next(bottomPanel2);
            }
        }catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"select gender","Error",HEIGHT);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this,"enter age","Error",HEIGHT);
        }

    }//GEN-LAST:event_submitButtonActionPerformed

    private void photoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoButtonActionPerformed
        // TODO add your handling code here:
            JFileChooser file = new JFileChooser();
    if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
    try {
    BufferedImage img = ImageIO.read(file.getSelectedFile());
    Image edited_image = img.getScaledInstance(60, 80,Image.SCALE_SMOOTH);
    if (edited_image != null) {
   // picLabel1.setText(file.getSelectedFile().getAbsolutePath());
    this.picture = new ImageIcon(edited_image);
    picLabel1.setIcon(picture);
    //this.userInfo.setPic(new ImageIcon(edited_image));
    }
    }catch(IOException ex) {
    JOptionPane.showMessageDialog(this, "Please upload imagecorrectly.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();
}
}
    }//GEN-LAST:event_photoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel hobbiesLabel;
    private javax.swing.JTextArea hobbiesTextArea;
    private javax.swing.JLabel imageLabel1;
    private javax.swing.JLabel imgLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton photoButton;
    private javax.swing.JLabel picLabel1;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
