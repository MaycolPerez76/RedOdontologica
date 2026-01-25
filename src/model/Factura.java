package model;

public class Factura {

    private double monto;
    private Cita cita;

    // Constructor vacío
    public Factura() {
    }

    // Constructor con parámetros
    public Factura(double monto, Cita cita) {
        this.monto = monto;
        this.cita = cita;
    }

    // Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    // Método del diagrama
    public void generar() {
        System.out.println("Método generar no implementado");
    }

    @Override
    public String toString() {
        return "Factura{" +
                "monto=" + monto +
                ", cita=" + cita +
                '}';
    }
}
