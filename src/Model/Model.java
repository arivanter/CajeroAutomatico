/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static Model.Serializa_Deserializa.deserealiza;
import java.util.Set;
import jdk.nashorn.internal.ir.Symbol;

/**
 *
 * @author Andrespena
 */
public class Model {

    private static Tarjeta T = new Tarjeta();
    private static ArrayList<Tarjeta> ListaTarjetas = new ArrayList<>();
    
    public static boolean validar(int noTarjeta, int NIP) throws IOException {
        if (T.getNo_tarjeta() == noTarjeta && T.getNIP() == NIP) {
            return true;
        }
        return false;

    }

    public static boolean EncontrarTarjeta(int noTarjeta) throws IOException {
        ListaTarjetas = deserealiza();
        for (Tarjeta ListaT : ListaTarjetas) {
            if (ListaT.getNo_tarjeta() == noTarjeta) {
                T = ListaT;
                return true;

            }
        }
        return false;
    }

    public static boolean VertificarRetiro(int no_tarjeta, float cantidad) {
        if (T.getNo_tarjeta() == no_tarjeta && T.getSaldo() >= cantidad) {
            return true;
        }
        return false;

    }

    public static void ActualizarCuenta(int no_tarjeta, float cantidad) {

        for (Tarjeta ListaT : ListaTarjetas) {
            if (T.getNo_tarjeta() == ListaT.getNo_tarjeta()) {
                float c;
                c = T.getSaldo() - cantidad;
                ListaT.setSaldo(c);
                T = ListaT;
            }
        }

    }
}
