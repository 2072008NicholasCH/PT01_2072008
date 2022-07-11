package com.example.pt01a_2072008;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField bil1;
    @FXML
    private TextField bil2;
    @FXML
    private TextField hasil;

    private int num1 = Integer.parseInt(bil1.getText());
    private int num2 = Integer.parseInt(bil2.getText());

    @FXML
    protected void tambah(){
        int totalVal = num1 + num2;
        String total = String.valueOf(totalVal);
        hasil.setText(total);
    }
    @FXML
    protected void kurang() {
        int totalVal = num1 - num2;
        String total = String.valueOf(totalVal);
        hasil.setText(total);
    }
    @FXML
    protected void kali() {
        int totalVal = num1 * num2;
        String total = String.valueOf(totalVal);
        hasil.setText(total);
    }
    @FXML
    protected void bagi() {
        int totalVal = num1 / num2;
        String total = String.valueOf(totalVal);
        hasil.setText(total);
    }
}