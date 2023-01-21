package com.persistencia;

import java.util.Date;

public class Resena {

  Date fecha;
  char nivel;
  int puntuacion;

  public Resena(Date fecha, char nivel, int puntuacion) {
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

  public char getNivel() {
    return nivel;
  }

  public void setNivel(char nivel) {
    this.nivel = nivel;
  }

  public int getPuntuacion() {
    return puntuacion;
  }

  public void setPuntuacion(int puntuacion) {
    this.puntuacion = puntuacion;
  }
}
