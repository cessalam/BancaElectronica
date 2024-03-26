package bancolombia.com.negocio;

import java.util.ArrayList;

public class Cliente implements Comparable<Cliente>, IServicioCuentas {

    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuenta;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuenta= new ArrayList<>();
    }

    public Cliente(int numero, String nombre, String calle, int numeroDomicilio, String colonia, String estado, int codigoPostal, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = new Domicilio(calle, numeroDomicilio, colonia, estado, codigoPostal);
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuenta= new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cuenta> getCuenta() {
        return cuenta;
    }

    public void setCuenta(ArrayList<Cuenta> cuenta) {
        this.cuenta = cuenta;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuenta=" + cuenta +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cliente cliente) {
        return this.getNombre().compareTo(cliente.getNombre()); //-1
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        this.cuenta.add(cuenta);
        return true;
    }

    @Override
    public boolean cancelarCuenta(int numero) {
//        this.cuenta.remove(numero);
//        System.out.println("Se ha eliminado la cuenta: " + numero);
        return true;

    }

    @Override
    public void abonarCuenta(int numero, double abono) {

        for(Cuenta abonoCuenta: this.cuenta) {
            if (abonoCuenta.getNumero() == numero) {
                abonoCuenta.setSaldo(abono);
            }
        }

    }

    @Override
    public void retirar(int numero, double retiro) {

    }

    @Override
    public ArrayList<Cuenta> obtenerCuentas() {
        return this.cuenta;
    }
}
