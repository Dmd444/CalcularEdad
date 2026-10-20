package com.dmd.calcularedad;

public class Persona {
    
    private String fechaDeNacimiento;
    private int anios;
    private int meses;

    public Persona() {
    }

    public Persona(String fechaDeNacimiento, int anios, int meses) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.anios = anios;
        this.meses = meses;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public int getAnios() {
        return anios;
    }
    public void setAnios(int anios) {
        this.anios = anios;
    }
    public int getMeses() {
        return meses;
    }
    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "Usted tiene " + anios + " años" + " con meses " + meses ;
    }
 
}
