/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaBancaria;

import MovimientoCuenta.MovimientoCuenta;
import java.util.List;

/**
 *
 * @author ivann
 */
public class CuentaCorriente extends CuentaBancaria{
    
    private static final double tasaInteresAnual = 0.02; // 2% en forma decimal
    private static final double comisionFija = 2.0;
    private int maxRetiro;

    public CuentaCorriente(int maxRetiro, String numeroCuenta, String descripcionCuenta, String cuentaCCI, List<MovimientoCuenta> movimientos, double saldoDisponible) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, movimientos, saldoDisponible);
        this.maxRetiro = maxRetiro;
    }
    
    // Métodos 
    public int getMaxRetiro() {
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }
    
    public void calcularNuevoSaldoDisponible() {
        double interesMensual = (getSaldoDisponible()* tasaInteresAnual) / 12;
        saldoDisponible += interesMensual + comisionFija;
    }
    
    @Override
    public String toString() {
        return "" + maxRetiro;
    }

}
