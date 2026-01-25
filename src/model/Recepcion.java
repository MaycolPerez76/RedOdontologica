package com.odontologia.model;

import java.time.LocalTime;

public class Recepcion {

    // Constructor vacío
    public Recepcion() {
    }

    // Métodos del diagrama
    public void crearCita(Paciente paciente, Odontologo odontologo, Horario horario) {
        System.out.println("Método crearCita no implementado");
    }

    public void cancelarCita(Cita cita) {
        System.out.println("Método cancelarCita no implementado");
    }

    public void registrarLlegadaPaciente(Cita cita, LocalTime horaLlegada) {
        System.out.println("Método registrarLlegadaPaciente no implementado");
    }

    public void buscarDisponibilidad(Odontologo odontologo) {
        System.out.println("Método buscarDisponibilidad no implementado");
    }

    @Override
    public String toString() {
        return "Recepcion{}";
    }
}
