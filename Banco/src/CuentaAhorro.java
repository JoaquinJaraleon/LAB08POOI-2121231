/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class CuentaAhorro {

    private double tasaInteresAnual = 0.03;

    private String[] beneficios;

    public CuentaAhorro(double tasaInteresAnual, String[] beneficios) {
        this.tasaInteresAnual = tasaInteresAnual;
        this.beneficios = beneficios;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public String[] getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "Cuenta de Ahorro - Tasa de Interés Anual: " + tasaInteresAnual + "%, Beneficios: " + Arrays.toString(beneficios);
    }
}



