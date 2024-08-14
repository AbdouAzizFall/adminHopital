package com.example.formulaire;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField mail;

    @FXML
    private PasswordField password;

    public void getLogin(ActionEvent event){
        String emailTxt = mail.getText();
        String passwordTxt = password.getText();
        String info = "Adresse mail :"+emailTxt + "     Mot de passe :" + passwordTxt;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message d'information");
        alert.setContentText(info);
        alert.show();
    }

}