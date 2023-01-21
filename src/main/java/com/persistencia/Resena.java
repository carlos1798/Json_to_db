package com.persistencia;

import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Resena {

 

  Date fecha;
  String nivel;
  int puntuacion;

  public Resena(Date fecha, String nivel, int puntuacion) {
    this.fecha = fecha;
    this.nivel = nivel;

    this.puntuacion = puntuacion;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getNivel() {
    return nivel;
  }

  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  public int getPuntuacion() {
    return puntuacion;
  }

  public void setPuntuacion(int puntuacion) {
    this.puntuacion = puntuacion;
  }

@Override
public String toString() {
    return "Resena [fecha=" + fecha + ", nivel=" + nivel + ", puntuacion=" + puntuacion + "]";
}

  
}
