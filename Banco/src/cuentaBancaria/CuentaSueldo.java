/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaBancaria;

import MovimientoCuenta.MovimientoCuenta;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author PC
 */
public class CuentaSueldo extends CuentaAhorro{
    private String nombreEmpresa;

    public CuentaSueldo(String nombreEmpresa, List<String> beneficios, String numeroCuenta, String descripcionCuenta, String cuentaCCI, List<MovimientoCuenta> movimientos, double saldoDisponible) {
        super(beneficios, numeroCuenta, descripcionCuenta, cuentaCCI, movimientos, saldoDisponible);
        this.nombreEmpresa = nombreEmpresa;
    }

    
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    @Override
    public void calcularNuevoSaldoDisponible() {
        double interesMensual = (getSaldoDisponible()* tasaInteresAnual) / 12;
        saldoDisponible += interesMensual;
    }
    

    @Override
    public String toString() {
        return "CuentaSueldo{" + "nombreEmpresa=" + nombreEmpresa + ", beneficios=" + beneficios + '}';
    }

    
}
