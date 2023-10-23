/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class CuentaFree {
    private boolean numIlimitadoRetiro;

    public CuentaFree(boolean numIlimitadoRetiro) {
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    public boolean getNumIlimitadoRetiros() {
        return numIlimitadoRetiro;
    }

    public void setNumIlimitadoRetiro(boolean numIlimitado) {
        this.numIlimitadoRetiro = numIlimitado;
    }

    @Override
    public String toString() {
        return "CuentaFree [numIlimitadoRetiro=" + numIlimitadoRetiro + "]";
    }

    }



