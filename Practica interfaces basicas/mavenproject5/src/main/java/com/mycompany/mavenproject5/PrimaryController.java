package com.mycompany.mavenproject5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtAlimentacion;
    @FXML
    private TextField txtRefrigerios;
    @FXML
    private TextField txtTransporte;
    @FXML
    private TextField txtTelefonia;
    @FXML
    private TextField txtOtros;

    @FXML
    private Label lblTotal;
    @FXML
    private Label lblMayor;

    @FXML
    private void calcular() {
        int alimentacion =
                Integer.parseInt(txtAlimentacion.getText());
        int refrigerios =
                Integer.parseInt(txtRefrigerios.getText());
        int transporte =
                Integer.parseInt(txtTransporte.getText());
        int telefonia =
                Integer.parseInt(txtTelefonia.getText());
        int otros =
                Integer.parseInt(txtOtros.getText());

        int total = alimentacion + refrigerios
                + transporte + telefonia + otros;

        lblTotal.setText("" + total);

        int mayor = alimentacion;
        String concepto = "Alimentación";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            concepto = "Refrigerios";
        }

        if (transporte > mayor) {
            mayor = transporte;
            concepto = "Transporte";
        }

        if (telefonia > mayor) {
            mayor = telefonia;
            concepto = "Telefonía";
        }

        if (otros > mayor) {
            mayor = otros;
            concepto = "Otros";
        }

        lblMayor.setText(concepto);
    }

    @FXML
    private void limpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();

        lblTotal.setText("");
        lblMayor.setText("");
    }
}