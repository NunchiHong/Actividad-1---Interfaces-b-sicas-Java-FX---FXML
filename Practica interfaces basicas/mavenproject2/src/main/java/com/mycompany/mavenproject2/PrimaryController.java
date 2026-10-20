package com.mycompany.mavenproject2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;

    @FXML
    private Label lbl500;
    @FXML
    private Label lbl200;
    @FXML
    private Label lbl100;
    @FXML
    private Label lbl50;
    @FXML
    private Label lbl20;
    @FXML
    private Label lbl10;
    @FXML
    private Label lbl5;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl1;

    @FXML
    private void desglosar() {
        int dinero = Integer.parseInt(txtDinero.getText());

        int cantidad;

        cantidad = dinero / 500;
        lbl500.setText("" + cantidad);
        dinero = dinero % 500;

        cantidad = dinero / 200;
        lbl200.setText("" + cantidad);
        dinero = dinero % 200;

        cantidad = dinero / 100;
        lbl100.setText("" + cantidad);
        dinero = dinero % 100;

        cantidad = dinero / 50;
        lbl50.setText("" + cantidad);
        dinero = dinero % 50;

        cantidad = dinero / 20;
        lbl20.setText("" + cantidad);
        dinero = dinero % 20;

        cantidad = dinero / 10;
        lbl10.setText("" + cantidad);
        dinero = dinero % 10;

        cantidad = dinero / 5;
        lbl5.setText("" + cantidad);
        dinero = dinero % 5;

        cantidad = dinero / 2;
        lbl2.setText("" + cantidad);
        dinero = dinero % 2;

        cantidad = dinero;
        lbl1.setText("" + cantidad);
    }

    @FXML
    private void limpiar() {
        txtDinero.clear();

        lbl500.setText("");
        lbl200.setText("");
        lbl100.setText("");
        lbl50.setText("");
        lbl20.setText("");
        lbl10.setText("");
        lbl5.setText("");
        lbl2.setText("");
        lbl1.setText("");
    }
}