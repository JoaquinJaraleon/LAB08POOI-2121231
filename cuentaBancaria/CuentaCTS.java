/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaBancaria;

/**
 *
 * @author ivann
 */
public class CuentaCTS extends CuentaBancaria{
    private static final double tasaInteresAnual = 0.07; 
    private double puntos;
    
    //Constructor con parametros
    public CuentaCTS() {
        super(); 
        this.puntos = 50000; 
    }
    
    //Constructor sin parametros

    public CuentaCTS(double puntos) {
        super(); 
        this.puntos = puntos;
    }
    
    //Metodos

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }
    
    @Override
    public String toString() {
        return "CuentaCTS - Saldo: " + getSaldo() + " - Puntos: " + puntos;
    }
    
    public void calcularSaldoDisponible() {
        double interesMensual = (getSaldo() * tasaInteresAnual) / 12;
        setSaldo(getSaldo() + interesMensual);
    }
    
}
