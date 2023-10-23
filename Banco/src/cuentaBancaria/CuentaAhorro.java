/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaBancaria;

import MovimientoCuenta.MovimientoCuenta;
import java.util.List;

/**
 *
 * @author PC
 */
public class CuentaAhorro extends CuentaBancaria{
    static final double tasaInteresAnual = 0.03;
    List<String> beneficios;

    public CuentaAhorro(List<String> beneficios, String numeroCuenta, String descripcionCuenta, String cuentaCCI, List<MovimientoCuenta> movimientos, double saldoDisponible) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, movimientos, saldoDisponible);
        this.beneficios = beneficios;
    }

    

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public List<String> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<String> beneficios) {
        this.beneficios = beneficios;
    }

    public double getCuentaAhorro() {
        return 0.0;
    }
    
    public void calcularNuevoSaldoDisponible() {
        double interesMensual = (getSaldoDisponible()* tasaInteresAnual) / 12;
        saldoDisponible += interesMensual;
    }
    
    @Override
    public String toString() {
        return "Cuenta Ahorro - Saldo: " + saldoDisponible;
    }
}
