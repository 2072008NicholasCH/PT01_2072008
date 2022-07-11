package com.example.pt01b_2072008;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private TextField view;
    @FXML
    private TextField hasil;


    public String sim = "";
    public String number = "";
    public Integer bil1;
    public Integer bil2;

    public void inputan(ActionEvent ae){
        number = ((Button)ae.getSource()).getText();
        hasil.setText(hasil.getText()+number);
    }

    public void simbol(ActionEvent ae){
        sim = ((Button)ae.getSource()).getText();
        view.setText(hasil.getText()+sim);
        bil1 = Integer.parseInt(hasil.getText());
        number = "";
        hasil.setText("");
    }

    public void hitung(){
        bil2 = Integer.parseInt(hasil.getText());
        view.setText(String.valueOf(bil1) + sim + String.valueOf(bil2));
        switch (sim){
            case"+":
                hasil.setText(String.valueOf(bil1+bil2));
                break;
            case"-":
                hasil.setText(String.valueOf(bil1-bil2));
                break;
            case"*":
                hasil.setText(String.valueOf(bil1*bil2));
                break;
            case"/":
                hasil.setText(String.valueOf(bil1/bil2));
                break;
        }
    }
    public void hapus(){
        view.setText("");
        hasil.setText("");
        number = "";
        sim = "";
    }
}