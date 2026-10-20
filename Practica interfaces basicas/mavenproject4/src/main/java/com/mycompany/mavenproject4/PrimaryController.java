package com.mycompany.mavenproject4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextArea txtTabla;

    @FXML
    private void calcular() {
        int numero = Integer.parseInt(txtNumero.getText());

        txtTabla.clear();

        for (int i = 1; i <= 10; i++) {
            txtTabla.appendText(
                    numero + "x" + i + " = " + (numero * i) + "\n");
        }
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtTabla.clear();
    }
}