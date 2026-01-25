package model;

public class Recordatorio {

    private String mensaje;

    // Constructor vacío
    public Recordatorio() {
    }

    // Constructor con parámetros
    public Recordatorio(String mensaje) {
        this.mensaje = mensaje;
    }

    // Getter y Setter
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    // Método del diagrama
    public void enviar(Cita cita) {
        System.out.println("Método enviar no implementado");
    }

    @Override
    public String toString() {
        return "Recordatorio{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
