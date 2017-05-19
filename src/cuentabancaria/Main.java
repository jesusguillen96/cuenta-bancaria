
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author Jesus 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a BANSISTEM");
        System.out.println("Acción que desea realizar: ");
        System.out.println("1 = CuentaBancaria de JESUS");
        System.out.println("2 = CuentaDeAhorro de JESUS");
        System.out.println("3 = CuentaDeCheques de JESUS");
        System.out.println("4 = Infarmacion del Cliente");
        int Cuenta= entrada.nextInt();
             
        
        if (Cuenta == 1){    
        CuentaBancaria misAhorros = new CuentaBancaria(1,"JESUS1");
        System.out.println("saldo:" + misAhorros.getSaldo());
        misAhorros.depositar(1000.0);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.depositar(1500.0);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.retirar(200);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.depositar(300);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.retirar(1000);
        System.out.println("saldo:"+ misAhorros.getSaldo());  
        }
        
        if(Cuenta == 2){
        CuentaDeAhorro miCuentaDeAhorro = new CuentaDeAhorro(2, "JESUS2");
        System.out.println("Saldo: " + miCuentaDeAhorro.getSaldo());
        miCuentaDeAhorro.depositar(1000.0);
        System.out.println("Saldo" + miCuentaDeAhorro.getSaldo());
        miCuentaDeAhorro.retirar(200.0);
        System.out.println("Saldo: " + miCuentaDeAhorro.getSaldo());
        miCuentaDeAhorro.retirar(1000.0);
        System.out.println("Saldo: " + miCuentaDeAhorro.getSaldo);
        }
        
        if (Cuenta == 3){    
        CuentaDeCheques miCuentaDeCheques = new CuentaDeCheques(3, "JESUS3");
        System.out.println("Saldo cuenta de cheques: " + miCuentaDeCheques.getSaldo());
        miCuentaDeCheques.depositar (1000.0);
        
    }
        System.out.println ("Saldo: " + miCuentaDeCheques.getSaldo());
        miCuentaDeCheques.retirar(2000.0);
        System.out.println ("Saldo: " + miCuentaDeCheques.getSaldo());
        miCuentaDeCheques.retirar(100.0);
        System.out.println ("Saldo: " + miCuentaDeCheques.getSaldo());
       }
        
        if (Cuenta == 4){ 
     
        CuentaBancaria datosCliente = new CuentaBancaria(4,"JESUS","GUILLEN");
        Cliente cliente = datosCliente.getCliente();
        cliente.setnombre("JOSE");
        System.out.println("Su Nombre Es:" + cliente.getnombre());
        cliente.setapellido("CHI");
        System.out.println("Su Apellido Es : " + cliente.getapellido());
        cliente.setfecha("06/06/06");
        System.out.println("Su fecha de nacimiento es:"+ cliente.getfecha());
        cliente.setdireccion(" Avenida ECUADOR 742");
        System.out.println("Su direccion es: "+ cliente.getdireccion());
        cliente.setocupacion("Trabajador de una CESAVECAM");
        System.out.println("Su ocupacion es:" + cliente.getocupacion());
        cliente.setemail("homero.JOSE@gmail.com");
        System.out.println("Su correo electonico es :" + cliente.getemail());
       }

    private static class miCuentaDeCheques{

        private static void retirar(double d) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static String getSaldo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public miCuentaDeCheques() {
        }
    }

    private static class Cuenta {

        public Cuenta() {
        }
    }

  
        }


