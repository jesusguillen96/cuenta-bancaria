/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author Jesus
 */
public class CuentaBancaria {
   private int numeroDeCuenta;
   private String cliente;
   double saldo;
   
   public CuentaBancaria(int numeroDeCuenta, String cliente){
       this.numeroDeCuenta=numeroDeCuenta;
       this.cliente=cliente;
       this.saldo= 0.0;
   }
   CuentaBancaria(int i, String jesus,String guillen){
       throw new UnsupportedOperationException("notNot supported yet."); //To change body of generated methods, choose Tools | Templates
   }
   public boolean depositar(double cantidad){
       boolean seRealizaDeposito;
       if (cantidad > 0.0){
           saldo = saldo + cantidad;
           seRealizaDeposito = true;
       }
       else{
           seRealizaDeposito = false;
       }
       return seRealizaDeposito;
   }
   public boolean retirar (double cantidad){
       boolean seRealizaRetiro;
       if(cantidad > 0.0){
           saldo = saldo - cantidad;
           seRealizaRetiro = true;
       }
       else{
       seRealizaRetiro = false;
       
       }
       return seRealizaRetiro;
   }
   public double getSaldo(){
       return saldo;
   }
   cliente getcliente(){
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Cliente getCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class cliente {

        public cliente() {
        }
    }
       
           
       }
        
    
    

