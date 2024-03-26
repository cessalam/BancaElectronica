package bancolombia.com;

import bancolombia.com.negocio.*;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola Mundo");

//        CuentaDeAhorros cA1= new CuentaDeAhorros(58,"Enero 5 2024",50000,"Febrero 15 2015",1.5);
//        System.out.println(cA1);

        Banco banco1 = new Banco("Banco Prueba","Calle 45",155,"Colonia Prueba","Bogota",11501,"Rfc prueba","41877");
        System.out.println(banco1);

        Cliente cliente1 = new Cliente(1000,"Falcao","Calle 48",289,"Colonia Prueba 2","Barranquilla",1158,"Prueba RFC 2","48949","Octubre 1980");
        Cliente cliente2 = new Cliente(2000,"Borre","Calle 48",289,"Colonia Prueba 2","Barranquilla",1158,"Prueba RFC 2","48949","Octubre 1980");
        Cliente cliente3 = new Cliente(7000,"Cuesta","Calle 48",289,"Colonia Prueba 2","Barranquilla",1158,"Prueba RFC 2","48949","Octubre 1980");
        Cliente cliente4 = new Cliente(5000,"Yaser","Calle 48",289,"Colonia Prueba 2","Barranquilla",1158,"Prueba RFC 2","48949","Octubre 1980");
        Cliente cliente5 = new Cliente(3000,"Diaz","Calle 48",289,"Colonia Prueba 2","Barranquilla",1158,"Prueba RFC 2","48949","Octubre 1980");

        Cuenta cA1 = new CuentaDeAhorros(25,"Julio 2020",40000,"Agosto 2021",1.8);
        Cuenta cA2 = new CuentaDeAhorros(26,"Julio 2022",50000,"Agosto 2021",1.9);
        Cuenta cA3 = new CuentaDeAhorros(27,"Julio 2023",80000,"Agosto 2021",1.10);


        banco1.agregarCliente(cliente1);
        banco1.agregarCliente(cliente3);
        banco1.agregarCliente(cliente5);
        banco1.agregarCliente(cliente2);
        banco1.agregarCliente(cliente4);
        banco1.listarClientes();
        banco1.consultarCliente(5);
        banco1.consultarCliente(3000);
        banco1.eliminarCliente(2000);
        banco1.eliminarCliente(9);
        banco1.buscarClientePorRfc("Prueba RFC 2");
        banco1.buscarClientePorRfc("Prueba RFC 20");

        cliente1.agregarCuenta(cA1);
        cliente1.cancelarCuenta(26);
        cliente1.abonarCuenta(25,100000);
        cliente1.retirar(26,50000);
        cliente1.obtenerCuentas();

        System.out.println(cA1);
        System.out.println(cA2);


//        CompararNumero cn = new CompararNumero();
//        System.out.println(cn.compare(cliente1,cliente2));


//        Set<Cliente> conjunto = new TreeSet<>(cn);
//        conjunto.add(cliente4);
//        conjunto.add(cliente1);
//        conjunto.add(cliente2);
//        conjunto.add(cliente3);
//
//        for (Cliente c:conjunto){
//            System.out.println(c);
//        }


//        //clase anonima
//        Comparator<Cliente> ctel = new Comparator<Cliente>() {
//            @Override
//            public int compare(Cliente o1, Cliente o2) {
//                return o1.getTelefono().compareTo(o2.getTelefono());
//            }
//        };




    }
}
