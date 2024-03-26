package bancolombia.com.negocio;

import java.util.ArrayList;

public interface IServicioCuentas {

    public abstract boolean agregarCuenta(Cuenta cuenta);
    public abstract boolean cancelarCuenta(int numero);
    public abstract void abonarCuenta (int numero, double abono);
    public abstract void retirar (int numero, double retiro);
    ArrayList<Cuenta> obtenerCuentas();
}
