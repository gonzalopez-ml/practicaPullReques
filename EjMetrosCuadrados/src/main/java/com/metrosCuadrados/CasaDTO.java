package com.metrosCuadrados;

import java.util.List;

public class CasaDTO {
    String nombre;
    String direccion;
    List<HabitacionDTO> habitaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<HabitacionDTO> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<HabitacionDTO> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
