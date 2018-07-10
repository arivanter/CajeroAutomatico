/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author devel
 */
public class View {
    
    public View() {
        
    }
    
    public static void startup(){
        new ui_1().setVisible(true);
    }

    public static void launch_UI_1(){
        new ui_2().setVisible(true);
    }
    
    public static void main(String[] args) {
        startup();
    }


}
