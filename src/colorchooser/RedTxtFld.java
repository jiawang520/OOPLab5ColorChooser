/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import javax.swing.JTextField;

/**
 *
 * @author JiaLenovo
 */
public class RedTxtFld extends JTextField implements ColorListener {
   
    @Override
    public void changeColor(ColorEvent ce) {
        setText(Integer.toString(ce.getColor().getRed()));

    }
    
    
    public RedTxtFld(){
        super();
        
        setText("111");
    }
}
