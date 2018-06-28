/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Andrespena
 */
public class Tarjeta {
    private int No_tarjeta;
    private int NIP;
    private int No_seguridad;
    private float saldo;

    public Tarjeta() {
    }

    public Tarjeta(int No_tarjeta, int NIP, int No_seguridad, float saldo) {
        this.No_tarjeta = No_tarjeta;
        this.NIP = NIP;
        this.No_seguridad = No_seguridad;
        this.saldo = saldo;
    }

    public int getNIP() {
        return NIP;
    }

    public int getNo_seguridad() {
        return No_seguridad;
    }

    public int getNo_tarjeta() {
        return No_tarjeta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNo_seguridad(int No_seguridad) {
        this.No_seguridad = No_seguridad;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public void setNo_tarjeta(int No_tarjeta) {
        this.No_tarjeta = No_tarjeta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
}
