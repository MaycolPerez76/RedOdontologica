package com.odontologia.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {

    private LocalDate fecha;
    private LocalTime hora;
    private String motivo;
    private EstadoCita estado;
    private LocalTime horaLlegadaPaciente;
    private CitaView citaView;

    // Constructor vacío
    public Cita() {
    }

    // Constructor con parámetros
    public Cita(LocalDate fecha, LocalTime hora, String motivo, EstadoCita estado, LocalTime horaLlegadaPaciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.horaLlegadaPaciente = horaLlegadaPaciente;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    public LocalTime getHoraLlegadaPaciente() {
        return horaLlegadaPaciente;
    }

    public void setHoraLlegadaPaciente(LocalTime horaLlegadaPaciente) {
        this.horaLlegadaPaciente = horaLlegadaPaciente;
    }

    // Métodos del diagrama
    public void confirmar() {
        System.out.println("Método confirmar no implementado");
    }

    public void cancelar() {
        System.out.println("Método cancelar no implementado");
    }

    public void reprogramar(LocalDate nuevaFecha, LocalTime nuevaHora) {
        System.out.println("Método reprogramar no implementado");
    }

    public void registrarLlegada(LocalTime horaLlegada) {
        System.out.println("Método registrarLlegada no implementado");
    }

    public void evaluarAsistencia() {
        System.out.println("Método evaluarAsistencia no implementado");
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", motivo='" + motivo + '\'' +
                ", estado=" + estado +
                ", horaLlegadaPaciente=" + horaLlegadaPaciente +
                '}';
    }
}
