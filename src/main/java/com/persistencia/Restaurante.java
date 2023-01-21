package com.persistencia;

import java.util.Arrays;

public class Restaurante {
    String nombre;
    int restaurant_id;
    Direccion direccion;
    String distrito;
    String cocina;
    Resena[] resenas;
    public Restaurante(String nombre, int restaurant_id, Direccion direccion, String distrito, String cocina,
            Resena[] resenas) {
        this.nombre = nombre;
        this.restaurant_id = restaurant_id;
        this.direccion = direccion;
        this.distrito = distrito;
        this.cocina = cocina;
        this.resenas = resenas;
    }
    @Override
    public String toString() {
        return "Restaurante [nombre=" + nombre + ", restaurant_id=" + restaurant_id + ", direccion=" + direccion.toString()
                + ", distrito=" + distrito + ", cocina=" + cocina + ", resenas=" + Arrays.toString(resenas) + "]";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getRestaurant_id() {
        return restaurant_id;
    }
    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public String getCocina() {
        return cocina;
    }
    public void setCocina(String cocina) {
        this.cocina = cocina;
    }
    public Resena[] getResenas() {
        return resenas;
    }
    public void setResenas(Resena[] resenas) {
        this.resenas = resenas;
    }


    
}
