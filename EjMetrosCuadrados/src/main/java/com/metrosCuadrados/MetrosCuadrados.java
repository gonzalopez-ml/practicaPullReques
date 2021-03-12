package com.metrosCuadrados;

import java.util.ArrayList;
import java.util.List;

public class MetrosCuadrados {
    private double total;
    private double valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        valor = total * 800;
    }

}
