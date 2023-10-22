/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaBancaria;

/**
 *
 * @author ivann
 */
public class CuentaCorriente {
    
    private static final double tasaInteresAnual = 0.02; // 2% en forma decimal
    private static final double COMISION_FIJA = 2.0;
    private int maxRetiro = 5;
    
    // Constructor 
    public CuentaCorriente(int maxRetiro) {
        super(); 
        this.maxRetiro = maxRetiro;
    }
    
    // Métodos 
    public int getMaxRetiro() {
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }

    @Override
    public String toString() {
        return "CuentaCorriente - Saldo: " + getSaldo() + " - Máximo de retiros en cajero: " + maxRetiro;
    }
    
    public void calcularSaldoDisponible() {
        double interesMensual = (getSaldo() * tasaInteresAnual) / 12;
        setSaldo(getSaldo() + interesMensual);
    }

}
