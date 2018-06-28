/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrespena
 */
public  class Serializa_Deserializa implements Serializable{
    
    public static ArrayList<Tarjeta> deserealiza() throws FileNotFoundException, IOException {
        ArrayList<Tarjeta> lista_Tarjetas = new ArrayList<Tarjeta>();
        FileInputStream fis = new FileInputStream("Cuentas.txt");
        ObjectInputStream entrada = new ObjectInputStream(fis);
        try {
            lista_Tarjetas = (ArrayList<Tarjeta>) entrada.readObject();
            entrada.close();
            fis.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR-499");
        }
        return lista_Tarjetas;
    }
    
    public static  void serializa(ArrayList<Tarjeta> tarjeta) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("Cuentas.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tarjeta);
        oos.close();
        fos.close();
    }
}
