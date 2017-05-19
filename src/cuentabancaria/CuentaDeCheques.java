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
public class CuentaDeCheques extends CuentaBancaria {
    private int chequesEmitidos;
    private int chequesRebotados;
    
    public CuentaDeCheques (int numeroDeCuenta, String cliente) {
        super(numeroDeCuenta, cliente);
        super.depositar(2000.0);
        chequesEmitidos = 0;
        chequesRebotados = 0;
    }
    
    @Override
    public boolean retirar(double cantidad) {
        boolean seRealizaRetiro = super.retirar(cantidad);
        if (seRealizaRetiro == true) {
            chequesEmitidos = chequesEmitidos ++;
        }
        else {
            chequesRebotados ++
;
        }
        return seRealizaRetiro;
    }
    public double CalcularComisionPorChequesEmitidos() {
        chequesEmitidos = 0;
        double comision = (chequesEmitidos - 5.0) * 5.0;
        return comision;
    }
    
    public double CalcularComisionPorChequesRebotados() {
        return chequesRebotados * 100.0;
    }
   
    }



