package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


import java.awt.*;
import java.io.IOException;

public class Controller {

    @FXML
    TextField txtNumberControl;

    @FXML
    TextField txtPassword;

    //accion del login
    public void ingresar(){
        String usuario=txtNumberControl.getText();
        String password=txtPassword.getText();
        if(usuario.equals("19CG0063")  && password.equals("201201")){
            try {
                Parent root = FXMLLoader.load(getClass().getResource("notas.fxml"));
                Scene scene=new Scene(root);
                Main.stage.setScene(scene);
                Main.stage.setMaximized(false);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Agenda 2020-2021");
            alert.setContentText("Datos invalidos, intenta nuevamente en Sing Up");
            alert.show();

        }
    }//login
    public void login(ActionEvent event){
        txtNumberControl.setEditable(false);
        txtPassword.setEditable(false);
        txtPassword.setVisible(false);
        txtNumberControl.setVisible(false);
        ingresar();
    }//Registro habilitado
    public void registro(ActionEvent event){
        txtPassword.setEditable(true);
        txtNumberControl.setEditable(true);
        txtNumberControl.setVisible(true);
        txtPassword.setVisible(true);
        txtPassword.clear();
        txtNumberControl.clear();
    }




}//controller
