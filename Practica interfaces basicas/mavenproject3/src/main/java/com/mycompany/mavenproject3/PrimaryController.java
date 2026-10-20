package com.mycompany.mavenproject3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtCantidad;
    @FXML
    private TextField txtImpares;
    @FXML
    private TextField txtPares;
    @FXML
    private TextField txtSuma;
    @FXML
    private TextField txtMayor;
    @FXML
    private TextField txtMenor;
    @FXML
    private ListView<String> listaDivisores;

    @FXML
    private void analizar() {
        int numero = Integer.parseInt(txtNumero.getText());
        int n = Math.abs(numero);

        String cifras = String.valueOf(n);
        int cantidad = cifras.length();
        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int mayor = 0;
        int menor = 9;

        for (int i = 0; i < cifras.length(); i++) {
            int cifra = Character.getNumericValue(cifras.charAt(i));

            sumaTotal += cifra;

            if (cifra % 2 == 0) {
                sumaPares += cifra;
            } else {
                sumaImpares += cifra;
            }

            if (cifra > mayor) {
                mayor = cifra;
            }

            if (cifra < menor) {
                menor = cifra;
            }
        }

        txtCantidad.setText("" + cantidad);
        txtImpares.setText("" + sumaImpares);
        txtPares.setText("" + sumaPares);
        txtSuma.setText("" + sumaTotal);
        txtMayor.setText("" + mayor);
        txtMenor.setText("" + menor);

        listaDivisores.getItems().clear();

        for (int i = 1; i <= n; i++) {
            if (i != 0 && n % i == 0) {
                listaDivisores.getItems().add("" + i);
            }
        }
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtCantidad.clear();
        txtImpares.clear();
        txtPares.clear();
        txtSuma.clear();
        txtMayor.clear();
        txtMenor.clear();
        listaDivisores.getItems().clear();
    }
}