package com.odontologia.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {

    private LocalDate fecha;
    private LocalTime hora;
    private boolean disponible;

    // Constructor vacío
    public Horario() {
    }

    // Constructor con parámetros
    public Horario(LocalDate fecha, LocalTime hora, boolean disponible) {
        this.fecha = fecha;
        this.hora = hora;
        this.disponible = disponible;
    }

    // Getters y Setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos del diagrama
    public void marcarOcupado() {
        System.out.println("Método marcarOcupado no implementado");
        this.disponible = false;
    }

    public void marcarDisponible() {
        System.out.println("Método marcarDisponible no implementado");
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", disponible=" + disponible +
                '}';
    }
}
