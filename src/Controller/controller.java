package Controller;

import Model.Model;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import View.View;

/**
 *
 * @author User
 */
public class controller {

    Model model;
    View vista;
    int  tar;
    boolean tarje;
    int interfaz;

    public controller() {
        model = new Model();
        vista = new View();
        interfaz = 0;
    }

    public void tarjetaIngresada(int  tarjeta) {

        tar = tarjeta;
        try {
            tarje = model.ValidarTarjeta(tar);
        } catch (IOException ex) {
            Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (tarje == true) {
            interfaz = 2;
            //mostrar interfaz 2
        } else {
            interfaz = 3;
            //muestra interfaz 3
        }
        vista.MuestraInterfaz(interfaz);
    }

    public void UsuarioIngresaDatos(int Nip) {
        try {
            tarje = model.validarNIP(tar, Nip);
        } catch (IOException ex) {
            Logger.getLogger(controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (tarje == true) {
            interfaz = 5;
            //mostrar interfaz 5
        } else {
            interfaz = 4;
            //muestra interfaz 4
        }
        vista.MuestraInterfaz(interfaz);
    }

    public void tarjetaRetirada() {
        interfaz = 1;
        vista.MuestraInterfaz(interfaz);
        //muestra interfaz 1
    }

    public void UsuarioConfirmaMensaje() {

        switch (interfaz) {
            case 4: //muestra interfaz 2
                interfaz = 2;
                break;
            case 9: //muestra interfaz 8
                interfaz = 3;
                break;
            case 11: //muestra interfaz 8
                interfaz = 8;
                break;
        }
        vista.MuestraInterfaz(interfaz);

    }

    public void UsuarioDecideSalir() {
        interfaz = 6;
        vista.MuestraInterfaz(interfaz);
        //muestra interfaz 6
    }

    public void UsuarioConsultaSaldo() {
        model.consultaSaldo(tar);
        interfaz = 7;
        vista.MuestraInterfaz(interfaz);
        //Interfaz 7
    }

    public void UsuarioDeseaRetirar() {
        interfaz = 8;
        vista.MuestraInterfaz(interfaz);
        //Interfaz 8
    }

    public void TarjetaRetirada() {
        interfaz = 1;
        vista.MuestraInterfaz(interfaz);
        //Interfaz 1
    }

    public void UsuarioRegresa() {
        interfaz = 5;
        vista.MuestraInterfaz(interfaz);
        //Interfaz 5
    }

    public void CantidadIngresada(float cantidad) throws IOException {
        int opcion;
        opcion = model.ValidaCantidad(cantidad);
        switch (opcion) {
            case 1:
                interfaz = 10;
                //Interfaz 10
                break;
            case 2:
                interfaz = 9;
                //Interfaz 9
                break;
            case 3:
                interfaz = 11;
                //Interfaz 11
                break;
            case 4:
                interfaz = 11;
                //Interfaz 11
                break;
        };
        vista.MuestraInterfaz(interfaz);
    }

    public void UsuarioObtieneEfectivo() {
        interfaz = 12;
        vista.MuestraInterfaz(interfaz);
        //Interfaz 12
    }

    public void UsuarioDeseaOtraTransaccion() {
        interfaz = 5;
        vista.MuestraInterfaz(interfaz);
        //Interfaz 5
    }

    public static void main(String[] args) {
        controller c = new controller();

    }
}
