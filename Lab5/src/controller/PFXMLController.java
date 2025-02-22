/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import static java.awt.image.ImageObserver.HEIGHT;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import model.User;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    TextField nameTextField;
    
    @FXML
    TextField emailTextField;
    
   @FXML
   TextField AgeTextField;
    
    public void submit(){
      
          try{
              
            
    
        User userObject = new User();
        
        userObject.setName(this.nameTextField.getText());
        userObject.setEmail(this.emailTextField.getText());
        userObject.setAge(Integer.parseInt(this.AgeTextField.getText()));
        
        
        String name = nameTextField.getText();
        String email = emailTextField.getText();
       int age = Integer.parseInt(this.AgeTextField.getText());
        System.out.println("Tank you for submitting");
        
        if(userObject.getName().isEmpty()){       
        Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("error");
        userAlert.setHeaderText("Please type name");
        userAlert.showAndWait();             
    }
    else if(userObject.getEmail().isEmpty()){ 
            Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("error");
        userAlert.setHeaderText("Please type email");
        userAlert.showAndWait();   
    }  
        else if(userObject.getAge()<18){
            Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("error");
        userAlert.setHeaderText("Please enter age a+bove 18");
        userAlert.showAndWait();   
}
        else{
        Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("Success");
        userAlert.setHeaderText("Thanks");
        userAlert.setContentText(name+email+age);
        userAlert.showAndWait();  
        
      }
          }catch(RuntimeException rte){ 
            Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("Error");
        userAlert.setHeaderText("Complete All Information");
        userAlert.showAndWait();  
              }
    }
        }
    
        