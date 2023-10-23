import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String dni;
    private List<CuentaBancaria> cuentas;
    private List<EventoBancario> eventoBancarios;

    public Cliente(int idCliente, String nombre, String apellido, String direccion, String telefono, String dni) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.cuentas = new ArrayList<>();
        this.eventoBancarios = new ArrayList<>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public List<EventoBancario> getEventoBancarios() {
        return eventoBancarios;
    }

    public void setEventoBancarios(List<EventoBancario> eventoBancarios) {
        this.eventoBancarios = eventoBancarios;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void agregarEventoBancario(EventoBancario evento) {
        eventoBancarios.add(evento);
    }

    @Override
    public String toString() {
        return "Cliente [IdCliente: " + idCliente + ", Nombre: " + nombre + ", Apellido: " + apellido +
               ", Dirección: " + direccion + ", Teléfono: " + telefono + ", DNI: " + dni + "]";
    }
}

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Número de Cuenta: " + numeroCuenta + ", Saldo: " + saldo + "]";
    }
}
