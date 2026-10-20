package com.dmd.calcularedad;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtFecha;
    @FXML private Label lblResultado;

    private Persona p;

    @FXML
    public void calcularEdad() {
        String fecha = txtFecha.getText();
        
        String[] partes = fecha.split("/");
        
        int mesNacimiento = Integer.parseInt(partes[1]);
        int anioNacimiento = Integer.parseInt(partes[2]);
        
        int mesActual = 10;
        int anioActual = 2026;
        
        int calculoAnios = anioActual - anioNacimiento;
        int calculoMeses = 0;
        
        if (mesActual >= mesNacimiento) {
            calculoMeses = mesActual - mesNacimiento;
        } else {
            calculoAnios = calculoAnios - 1;
            calculoMeses = (12 - mesNacimiento) + mesActual;
        }
        
        p = new Persona(fecha, calculoAnios, calculoMeses);
        
        lblResultado.setText(p.toString());
    }

    @FXML
    public void limpiar() {
        txtFecha.setText("");
        lblResultado.setText("");
        p = null;
    }
}