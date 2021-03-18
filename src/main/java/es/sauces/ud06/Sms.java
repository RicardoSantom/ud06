/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.sauces.ud06;

import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class Sms extends Consumo{
    private String numero;

    public Sms(LocalDateTime fechaHora, float importe,String numero) {
        super(fechaHora, importe);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return  numero;
    }
    
    

    @Override
    public String getTipoConsumo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDuracionVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
