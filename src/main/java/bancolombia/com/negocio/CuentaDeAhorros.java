package bancolombia.com.negocio;

public class CuentaDeAhorros extends Cuenta implements  Comparable<Cuenta>{

    private double tasaInteresMensual;


    public CuentaDeAhorros(int numero, String fechaApertura, double saldo, String fechaCancelacion, double tasaInteresMensual) {
        super(numero, fechaApertura, saldo, fechaCancelacion);
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double calcularIntereses(){
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +  "CuentaDeAhorros{" +
                "tasaInteresMensual=" + tasaInteresMensual +
                '}';
    }

    @Override
    public int compareTo(Cuenta cuenta) {
        int res = 0;
        if (this.getNumero() <= cuenta.getNumero()) {
            return 1;
        } else if (this.getNumero() > cuenta.getNumero()){
            return 1;
        }else
            return 0;
    }
}
