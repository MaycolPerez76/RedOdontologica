package main;

import view.MenuPrincipalView;
import view.PacienteView;
import view.OdontologoView;
import view.CitaView;
import view.FacturaView;

public class Main {

    public static void main(String[] args) {

        MenuPrincipalView menu = new MenuPrincipalView();
        PacienteView paciente = new PacienteView();
        OdontologoView odontologo = new OdontologoView();
        CitaView cita = new CitaView();
        FacturaView factura = new FacturaView();

        int opcion;

        do {
            opcion = menu.mostrarMenu();

            switch (opcion) {
                case 1 -> paciente.mostrarMenuPaciente();
                case 2 -> odontologo.mostrarMenuOdontologo();
                case 3 -> cita.mostrarMenuCita();
                case 4 -> factura.mostrarFactura();
                case 0 -> System.exit(0);
                default -> {}
            }
        } while (true);
    }
}
