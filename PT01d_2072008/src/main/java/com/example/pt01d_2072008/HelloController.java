package com.example.pt01d_2072008;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Button antri;

    public int i = 2;


    @FXML
    protected void next(){
        antri.setText(String.valueOf(i++));
    }
    @FXML
    protected void reset(){
        antri.setText("1");
        i = 2;
    }
}