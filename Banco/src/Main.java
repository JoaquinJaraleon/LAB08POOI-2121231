
import Cliente.Cliente;
import Cliente.EventoBancario;
import MovimientoCuenta.MovimientoCuenta;
import cuentaBancaria.CuentaAhorro;
import cuentaBancaria.CuentaBancaria;
import cuentaBancaria.CuentaCTS;
import cuentaBancaria.CuentaCorriente;
import cuentaBancaria.CuentaFree;
import cuentaBancaria.CuentaSueldo;
import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        List<MovimientoCuenta> movimientosCuentaCTS1 = new ArrayList<>();
        List<MovimientoCuenta> movimientosCuentaCorriente1 = new ArrayList<>();
        List<MovimientoCuenta> movimientosCuentaCorriente2 = new ArrayList<>();
        List<MovimientoCuenta> movimientosCuentaSueldo1 = new ArrayList<>();
        List<MovimientoCuenta> movimientosCuentaFree1 = new ArrayList<>();
        
        List<String> beneficiosSueldo = new ArrayList<>();
        List<String> beneficiosFree = new ArrayList<>();
        List<CuentaBancaria> CuentasCliente= new ArrayList<>();
        List<EventoBancario> EventosBancarios = new ArrayList<>();
        
        
        CuentaBancaria CuentaCTS1 = new CuentaCTS(50000,"9874-9678-6548-7841","","016479873202356987645",movimientosCuentaCTS1, 200);
        CuentasCliente.add(CuentaCTS1);
        CuentaBancaria CuentaCorriente1 = new CuentaCorriente(5,"9874-5152-9845-3218","","987414236797648245672",movimientosCuentaCorriente1,500);
        CuentasCliente.add(CuentaCorriente1);
        CuentaBancaria CuentaCorriente2 = new CuentaCorriente(5,"8574-4552-3215-5418","","627415657412417978745",movimientosCuentaCorriente2,500);
        CuentasCliente.add(CuentaCorriente2);
        
        
        CuentaAhorro CuentaSueldo = new CuentaSueldo("Inka SAC", beneficiosSueldo,"6547-3242-2172-4672","","62317452654132049647",movimientosCuentaSueldo1,1500);
        CuentasCliente.add(CuentaSueldo);
        CuentaAhorro CuentaFree = new CuentaFree(true, beneficiosFree, "1482-6124-5627-3217", "", "59547626146296745976", movimientosCuentaFree1, 20000);
        CuentasCliente.add(CuentaFree);
        
        //Cliente
        Cliente Pablo = new Cliente(0001,"Pablo","Loayza","Santa Anita", "996412741","76451632",CuentasCliente, EventosBancarios);
        
        
        
        System.out.println("El cliente " + Pablo.getNombre() + " tiene "+ CuentasCliente.size() + " cuentas.");
        
        System.out.println("Los puntos de la CuentaCTS es : " + CuentaCTS1.toString());
        
        CuentaSueldo.setSaldoDisponible(1500);
        CuentaSueldo.calcularNuevoSaldoDisponible();
        System.out.println("El nuevo saldo de la Cuenta Sueldo es : " + CuentaSueldo.getSaldoDisponible());
        
        CuentaFree.setSaldoDisponible(20000);
        CuentaFree.calcularNuevoSaldoDisponible();
        System.out.println("El nuevo saldo de la Cuenta Free es : " + CuentaFree.getSaldoDisponible());
        
        System.out.println("La cuenta corriente tiene como maximo " + CuentaCorriente1.toString() + " retiros");
        
        System.out.println("El saldo de la Cuenta Sueldo por todo el año es : " + CuentaSueldo.getSaldoDisponible()*12);
        
        System.out.println("El saldo de la Cuenta Free por todo el año es : " + CuentaFree.getSaldoDisponible()*12);
        
        beneficiosSueldo.add("Smart Fit , 30%");
        beneficiosSueldo.add("Saga Falabella , 10%");
        beneficiosSueldo.add("AirBnb , 10%");
        beneficiosSueldo.add("La Central , 5%");
        beneficiosSueldo.add("Ripley, 5%");
        
        System.out.println("Los beneficios de la cuenta Sueldo son : " + CuentaSueldo.getBeneficios());
        
        beneficiosFree.add("Platzi , 5%");
        beneficiosFree.add("La Central , 7%");
        beneficiosFree.add("Teatro Canout , 5%");
        
        System.out.println("Los beneficios de la cuenta Free son : " + CuentaFree.getBeneficios());
        
        
        
    }
}
