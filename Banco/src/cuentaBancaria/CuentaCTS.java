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
public class CuentaCTS extends CuentaBancaria{
    private static final double tasaInteresAnual = 0.07; 
    private double puntos;

    public CuentaCTS(double puntos, String numeroCuenta, String descripcionCuenta, String cuentaCCI, List<MovimientoCuenta> movimientos, double saldoDisponible) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, movimientos, saldoDisponible);
        this.puntos = puntos;
    }
    
    
    //Metodos

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }
    
    public double getPuntos() {
        return puntos;
    }
    
    public void calcularNuevoSaldoDisponible() {
        double interesMensual = (getSaldoDisponible()* tasaInteresAnual) / 12;
        saldoDisponible += interesMensual;
    }
    
    @Override
    public String toString() {
        return "CuentaCTS - Saldo: " + saldoDisponible + " - Puntos: " + puntos;
    }
    
    public String mostrarPuntos() {
        return "Los puntos son : " + puntos;
    }
    
    
}
