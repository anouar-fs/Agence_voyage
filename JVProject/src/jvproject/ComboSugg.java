
package jvproject;

import jvproject.ComboSuggUI;
import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;


public class ComboSugg<E> extends JComboBox<E>{
    public ComboSugg(){
        setUI(new ComboSuggUI());
        
    }
}
