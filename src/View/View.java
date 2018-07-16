/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.controller;

/**
 *
 * @author devel
 */
public class View {

    public controller current_controller;

    public View(controller c) {
        this.current_controller = c;
    }

    public void muestraInterfaz(int interfaz) {
        switch (interfaz) {
            case 1:
                new ui_01(this.current_controller).setVisible(true);
            case 2:
                new ui_02(this.current_controller).setVisible(true);
            case 3:
                new ui_03(this.current_controller).setVisible(true);
            case 4:
                new ui_03(this.current_controller).setVisible(true);
            case 5:
                new ui_05(this.current_controller).setVisible(true);
            case 6:
                new ui_06(this.current_controller).setVisible(true);
            case 7:
                new ui_07(this.current_controller).setVisible(true);
            case 8:
                new ui_08(this.current_controller).setVisible(true);
            case 9:
                new ui_09(this.current_controller).setVisible(true);
            case 10:
                new ui_10(this.current_controller).setVisible(true);
            case 11:
                new ui_11().setVisible(true);
            case 12:
                new ui_12(this.current_controller).setVisible(true);
            case 13:
                new ui_13().setVisible(true);
            case 14:
                new ui_14(this.current_controller).setVisible(true);
            case 16:
                new ui_16(this.current_controller).setVisible(true);
            case 17:
                new ui_17(this.current_controller).setVisible(true);

        }
    }
}
