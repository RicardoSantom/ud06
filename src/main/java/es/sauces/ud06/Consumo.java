/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.sauces.ud06;

import java.time.LocalDateTime;

/**
 *
 * @author daw1
 */
public abstract class Consumo {
    private LocalDateTime fechaHora;
    private float importe;

    public Consumo(LocalDateTime fechaHora, float importe) {
        this.fechaHora = fechaHora;
        this.importe = importe;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public float getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return fechaHora + " " + importe;
    }
    public abstract String getTipoConsumo();
    public abstract int getDuracionVolumen();
}
