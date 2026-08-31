package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainLandingController {
    @FXML
    private Button BinaryButton;
    @FXML
    private Label OutputPanel;

    @FXML
    private TextField Userinput;

    @FXML
    private Button ClearButton;
    @FXML
    private Button exitButton;
    @FXML
    private Button OctalButton;
    @FXML
    private Button HexaDecimalButton;
    @FXML
    private Button NextScreenButton;
    @FXML
    void BinaryButton(ActionEvent event) {
        String input= Userinput.getText();
        try{
            int decimal=Integer.parseInt(input);
            String binary=Integer.toBinaryString(decimal);
            OutputPanel.setText(binary+"");
        }catch(Exception e){
            OutputPanel.setText("Invalid Input!");
        }
    }
    @FXML
    void OctalButton(ActionEvent event) {
        String input= Userinput.getText();
        try{
            int decimal=Integer.parseInt(input);
            String binary=Integer.toOctalString(decimal);
            OutputPanel.setText(binary+"");
        }catch(Exception e){
            OutputPanel.setText("Invalid Input!");
        }
    }
    @FXML
    void HexaDecimalButton(ActionEvent event) {
        String input= Userinput.getText();
        try{
            int decimal=Integer.parseInt(input);
            String binary=Integer.toHexString(decimal);
            OutputPanel.setText(binary+"");
        }catch(Exception e){
            OutputPanel.setText("Invalid Input!");
        }
    }
    @FXML
    void ClearButton(ActionEvent event) {
    Userinput.setText("");
    OutputPanel.setText("No Input");
    }
    @FXML
    void Userinput(ActionEvent event) {

    }
    @FXML
    void exitButton(ActionEvent event) {
    System.exit(0);
    }
    @FXML
    void NextScreenButton(ActionEvent event) {
     try{
         Parent root= FXMLLoader.load(getClass().getResource("NextScreen-view.fxml"));
         NextScreenButton.getScene().setRoot(root);
     }catch(Exception e){
         System.out.println("Error!cant load netx page!");
     }
    }

}
