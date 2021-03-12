package com.metrosCuadrados;

public class HabitacionDTO {
    String nombre;
    double ancho;
    double alto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return alto;
    }

    public void setLargo(double largo) {
        this.alto = largo;
    }

    public double getCalculoMetrosCuadrados(){
        return ancho * alto;
    }
}
