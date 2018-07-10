/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.util.ArrayList;
import static Model.Serializa_Deserializa.deserealiza;
import static Model.Serializa_Deserializa.serializa;

/**
 *
 * @author Andrespena
 */
public class Model {

    private static Tarjeta T = new Tarjeta();
    private static ArrayList<Tarjeta> ListaTarjetas = new ArrayList<>();
    
    public static boolean validarNIP(int noTarjeta, int NIP) throws IOException {
        return T.getNo_tarjeta() == noTarjeta && T.getNIP() == NIP;
    }

    public static boolean ValidarTarjeta(int noTarjeta) throws IOException {
        ListaTarjetas = deserealiza();
        for (Tarjeta ListaT : ListaTarjetas) {
            if (ListaT.getNo_tarjeta() == noTarjeta) {
                T = ListaT;
                return true;

            }
        }
        return false;
    }

    public static int ValidarCantidad(float cantidad) throws IOException {
        if(cantidad % 50 == 0 && cantidad <= T.getSaldo()){
            ActualizarCuenta(cantidad);
            serializa(ListaTarjetas);
            return 1;
        }
        if(cantidad % 50 == 0 && cantidad > T.getSaldo()){
            return 2;
        }
        if(cantidad % 50 != 0 && cantidad <= T.getSaldo()){
            return 3;
        }
        return 4;
        
    }

    public static void ActualizarCuenta(float cantidad) {

        for (Tarjeta ListaT : ListaTarjetas) {
            if (T.getNo_tarjeta() == ListaT.getNo_tarjeta()) {
                float c;
                c = T.getSaldo() - cantidad;
                ListaT.setSaldo(c);
                T = ListaT;
            }
        }

    }
    
    public static double consultaSaldo(int noTarjeta){
        if(noTarjeta == T.getNo_tarjeta()){
            return T.getSaldo();
        }
        return -1;
    }
}
