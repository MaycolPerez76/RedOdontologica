package model;

import java.time.LocalTime;

public class Recepcion {


    // Constructor vacío
    public Recepcion() {
    }




   public void crearCita(Paciente paciente, Odontologo odontologo, Horario horario) {
    if (horario.isDisponible()) {
        Cita nuevaCita = new Cita();
        nuevaCita.setFecha(horario.getFecha());
        nuevaCita.setHora(horario.getHora());
        nuevaCita.setEstado(EstadoCita.PENDIENTE);
        
        // Marcamos el horario como ocupado
        horario.marcarOcupado();
        
        System.out.println("Cita creada para el paciente " + paciente.getNombre() + " con el Dr/a. " + odontologo.getNombre());
    } else {
        System.out.println("El horario seleccionado no está disponible.");
    }
}


    public void cancelarCita(Cita cita) {
    cita.cancelar();
}

 public void registrarLlegadaPaciente(Cita cita, LocalTime horaLlegada) {
    cita.setHoraLlegadaPaciente(horaLlegada);
    
    //Definimos el límite (Hora de la cita menos 15 minutos)
    LocalTime limiteCita = cita.getHora().minusMinutes(15);

    if (horaLlegada.isAfter(limiteCita)) {
        cita.setEstado(EstadoCita.CANCELADA);
        System.out.println("Su estado de cita ha sido cancelada");
    } else {
        System.out.println("Llegada registrada a tiempo.");
    }
}

public void buscarDisponibilidad(Odontologo odontologo) {
    // En una implementación real, aquí buscarías en una lista de horarios
    // asociados al ID del odontólogo.
    System.out.println("Buscando espacios libres para el odontólogo: " + odontologo.getNombre());
}


    @Override
    public String toString() {
        return "Recepcion{}";
    }
}
