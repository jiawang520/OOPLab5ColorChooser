/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

/**
 *
 * @author JiaLenovo
 */
public class RedFld extends JIntegerField implements ColorListener {

    @Override
    public void changeColor(ColorEvent ce) {
//        setText(Integer.toString(Integer.parseInt(ce.getColor().getRed())));
    }
    
}
