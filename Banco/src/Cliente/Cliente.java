package Cliente;

import cuentaBancaria.CuentaBancaria;
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

    public Cliente(int idCliente, String nombre, String apellido, String direccion, String telefono, String dni, List<CuentaBancaria> cuentas, List<EventoBancario> eventoBancarios) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.cuentas = cuentas;
        this.eventoBancarios = eventoBancarios;
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
    
    public void setEventoBancarios(List<EventoBancario> eventoBancarios) {
        this.eventoBancarios = eventoBancarios;
    }
    
    
    @Override
    public String toString() {
        return "Cliente [IdCliente: " + idCliente + ", Nombre: " + nombre + ", Apellido: " + apellido +", Dirección: " + direccion + ", Teléfono: " + telefono + ", DNI: " + dni + "]";
    }
}


