package bancolombia.com.negocio;

import java.util.ArrayList;

public abstract class Cuenta {

    private int numero;
    private String fechaApertura;
    private double saldo;
    private String fechaCancelacion;


    public Cuenta(int numero, String fechaApertura, double saldo, String fechaCancelacion) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.fechaCancelacion = fechaCancelacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public void abono(double cantidad){
        this.saldo += cantidad;
        System.out.println("Se realizo un abono por: = " + cantidad + "su nuevo saldo es:" + saldo );
    }
    public void retiro(double cantidad){
        if (cantidad <= this.saldo){
            this.saldo -= cantidad;
            System.out.println("Se realizo un retiro por: =" + cantidad + "su nuevo saldo es:" + saldo);
        }else{
            System.out.println("Saldo insuficiente, Saldo actual es: " + saldo );

        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" + saldo +
                ", fechaCancelacion='" + fechaCancelacion + '\'' +
                '}';
    }
}
