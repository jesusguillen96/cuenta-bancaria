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
public class CuentaDeAhorro extends CuentaBancaria{
   
     private final double TasaDeInteres;
    private final double ComisionPorSaldo;
    String getSaldO;
    String getSaldo;
 
    public CuentaDeAhorro (int numeroDeCuenta, String cliente){
        super(numeroDeCuenta, cliente);
        this.TasaDeInteres = 0.25;
        this.ComisionPorSaldo = 50;
        
    }
   
    public boolean calcularTasaDeInteres (double cantidad){
    boolean seCalculaInteres;
     if (cantidad > 0.0){
            double interes = saldo * TasaDeInteres /100.0;
            seCalculaInteres = true;
        }
        else {
            seCalculaInteres = false;
        }
        return seCalculaInteres;
        }
    public boolean comisionPorSaldo (double cantidad){
        boolean seRealizoComision;
        if (cantidad < 1000.0){
            cantidad = ComisionPorSaldo;
            seRealizoComision = true;
        }
        else{
            cantidad = 0;
           seRealizoComision = false;
        }
        return seRealizoComision;
 
 }

   
    }

