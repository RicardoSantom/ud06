/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.sauces.ud06;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author daw1
 */
public class LineaMovil {
    private String numero;
    private Tarifa tarifa;
    private String titular;
    private int datosDisponibles;
    private List<Consumo> consumos;

    public LineaMovil(String numero, Tarifa tarifa, String titular, int datosDisponibles, List<Consumo> consumos) {
        this.numero = numero;
        this.tarifa = tarifa;
        this.titular = titular;
        this.datosDisponibles = datosDisponibles;
        this.consumos = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public int getDatosDisponibles() {
        return datosDisponibles;
    }
    public int iniciarDatosDisponibles(){
        return datosDisponibles;
    }
    public float registrarLlamada(LocalDateTime fechaHora,String numero, int duracion){
        
        
        return ;
    }
    public float registrarSms(LocalDateTime fechaHora, String numero){
        
    }
    public int registrarConsumoDatos(LocalDateTime fechaHora,int volumen){
        
    }
    public String getConsumo( ){
        
    }
    public List<Consumo> getConsumos() {
        return consumos;
    }
    
}
