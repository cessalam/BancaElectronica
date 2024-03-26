package bancolombia.com.negocio;

import java.util.ArrayList;

public interface IServicioClientes {

    public abstract boolean agregarCliente(Cliente cliente);
    public abstract boolean eliminarCliente(int numero);
    public Cliente consultarCliente (int numero);
    ArrayList<Cliente> obtenerClientes();
    Cliente buscarClientePorRfc (String rfc);
    public void listarClientes();


}
