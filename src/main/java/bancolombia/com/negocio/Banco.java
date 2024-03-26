package bancolombia.com.negocio;

import java.util.ArrayList;

public class Banco implements IServicioClientes{
    private String nombre;
    private Domicilio domiclio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> cliente;

    public Banco(String nombre, Domicilio domiclio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domiclio = domiclio;
        this.rfc = rfc;
        this.telefono = telefono;
        cliente = new ArrayList<>();
    }

    public Banco(String nombre,String calle, int numero, String colonia, String estado, int codigoPostal, String rfc, String telefono) {
        this.nombre = nombre;
        this.domiclio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.rfc = rfc;
        this.telefono = telefono;
        cliente = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomiclio() {
        return domiclio;
    }

    public void setDomiclio(Domicilio domiclio) {
        this.domiclio = domiclio;
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

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domiclio=" + domiclio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        this.cliente.add(cliente);
        return true;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        Cliente cliente =consultarCliente(numero);
        if(cliente!=null){
            this.cliente.remove(cliente);
            System.out.println("Se dio de baja al cliente nuemro: " + numero);
            return true;
        }
        return false;
    }

    @Override
    public Cliente consultarCliente(int numero) {
        for(Cliente cliente: this.cliente)
            if (cliente.getNumero()==numero){
                System.out.println("Se encontro el cliente numero; "+ numero);
                return cliente;
            }
        System.out.println("No encontro el cliente numero; "+ numero);
        return null;
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return this.cliente;
    }

    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        for(Cliente cliente: this.cliente)
            if (cliente.getRfc().equals(rfc)){
                System.out.println("Se encontro el cliente con Rfc; "+ rfc);
                return cliente;
            }
        System.out.println("No encontro el cliente con Rfc; "+rfc);
        return null;
    }

    @Override
    public void listarClientes() {
        System.out.println("=".repeat(40*7));
        for (Cliente c: this.cliente) {
            System.out.println(c);

        }
        System.out.println("=".repeat(40*7));
    }
}
