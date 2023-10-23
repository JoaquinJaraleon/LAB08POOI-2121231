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
public class CuentaFree extends CuentaAhorro{
    private boolean numIlimitadoRetiro;

    public CuentaFree(boolean numIlimitadoRetiro, List<String> beneficios, String numeroCuenta, String descripcionCuenta, String cuentaCCI, List<MovimientoCuenta> movimientos, double saldoDisponible) {
        super(beneficios, numeroCuenta, descripcionCuenta, cuentaCCI, movimientos, saldoDisponible);
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    public boolean getNumIlimitadoRetiro() {
        return numIlimitadoRetiro;
    }

    public void setNumIlimitadoRetiro(boolean numIlimitado) {
        this.numIlimitadoRetiro = numIlimitado;
    }

    @Override
    public String toString() {
        return "CuentaFree{" + "numIlimitadoRetiro=" + numIlimitadoRetiro + ", beneficios=" + beneficios + '}';
    }

    
    
}
