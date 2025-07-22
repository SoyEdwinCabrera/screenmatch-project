package com.project.java.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DatosSerie {
    private String titulo;
    private double evalucion;
    private int totalDeTemporadas;
    private String year; // Agregar este atributo si necesitas el campo "Year"

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getEvalucion() {
        return evalucion;
    }

    public void setEvalucion(double evalucion) {
        this.evalucion = evalucion;
    }

    public int getTotalDeTemporadas() {
        return totalDeTemporadas;
    }

    public void setTotalDeTemporadas(int totalDeTemporadas) {
        this.totalDeTemporadas = totalDeTemporadas;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}