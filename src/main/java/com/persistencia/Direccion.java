package com.persistencia;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Direccion{

    int numero;
    double[] coordenadas;
    String calle;
    int cod_postal;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCod_postal() {
        return cod_postal;
    }

    public Direccion(
            int numero,
            double[] coordenadas,
            String calle,
            int cod_postal) {
        this.numero = numero;
        this.coordenadas = coordenadas;
        this.calle = calle;
        this.cod_postal = cod_postal;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }

    @Override
    public String toString() {
        return "Direccion [numero=" + numero + ", coordenadas=" + Arrays.toString(coordenadas) + ", calle=" + calle
                + ", cod_postal=" + cod_postal + "]";
    }
}
