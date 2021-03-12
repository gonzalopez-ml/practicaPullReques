package com.metrosCuadrados;

import java.util.ArrayList;
import java.util.List;

public class MetrosCuadrados {
    private double total;
    private double value;
    private String cuartoGrande;
    private List<String> metrosCuadradosXCuarto = new ArrayList<>();

    public MetrosCuadrados(CasaDTO casaDTO) {
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCuartoGrande() {
        return cuartoGrande;
    }

    public void setCuartoGrande(String cuartoGrande) {
        this.cuartoGrande = cuartoGrande;
    }

    public List<String> getMetrosCuadradosXCuarto() {
        return metrosCuadradosXCuarto;
    }

    public void setMetrosCuadradosXCuarto(List<String> metrosCuadradosXCuarto) {
        this.metrosCuadradosXCuarto = metrosCuadradosXCuarto;
    }

    public void MetrosCuadrados(CasaDTO casaDto){

        double largo = 0;
        total = 0.0;

        for (HabitacionDTO h : casaDto.getHabitaciones()){
            double metrosCu = h.getCalculoMetrosCuadrados();
            total = total + metrosCu;

            if(metrosCu > largo){
                largo = metrosCu;
                this.cuartoGrande = h.getNombre();
            }
            metrosCuadradosXCuarto.add(String.format("%s $.2f m2",cuartoGrande,metrosCu));
        }
        value = total * 800;
    }

}
