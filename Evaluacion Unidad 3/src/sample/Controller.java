package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    TextField txtUsuario;
    @FXML
    PasswordField txtPassword;
    //Sitio de registro


    public void login(ActionEvent event){
        ingrear();

    }
    public void enter(KeyEvent event){
       if (event.getCode()== KeyCode.ENTER){
           ingrear();

       }
    }
    public void ingrear(){
        String u=txtUsuario.getText();
        String u1=txtPassword.getText();
        if (u.equals("19CG0063") && u1.equals("201201")){
            try {
                Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
                Scene scene=new Scene(root);
                Main.stage.setScene(scene);
                Main.stage.setMaximized(true);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Agenta 2020-2021");
            alert.setContentText("Datos Invalidos");
            alert.show();
        }
    }




}
