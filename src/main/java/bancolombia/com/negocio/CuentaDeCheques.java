package bancolombia.com.negocio;

public class CuentaDeCheques extends Cuenta{

    private double costoManejoMensual;

    public CuentaDeCheques(int numero, String fechaApertura, double saldo, String fechaCancelacion, double costoManejoMensual) {
        super(numero, fechaApertura, saldo, fechaCancelacion);
        this.costoManejoMensual = costoManejoMensual;
    }

    public double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeCheques{" +
                "costoManejoMensual=" + costoManejoMensual +
                '}';
    }
}
