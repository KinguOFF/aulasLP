/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author u09285835112
 */
public class Util {
    public static void habilitar(boolean ver, JComponent...comp) {
        for(int i = 0; i < comp.length;i++){
        comp[i].setEnabled(ver);
        }
    }
    public static void limpar(JComponent ... comp) {
        for(int i = 0; i < comp.length; i++){
         if(comp[i] instanceof JTextField){
        ((JTextField) comp[i]).setText("");
         }
         if(comp[i] instanceof JComboBox){
        ((JComboBox)comp[i]).setSelectedIndex(-1);}
         
         if(comp[i] instanceof JCheckBox){
        ((JCheckBox)comp[i]).setSelected(false);}
        }
    }
   
}
