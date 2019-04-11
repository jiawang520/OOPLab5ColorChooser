/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import javax.swing.JLabel;
/**
 *
 * @author 00220682
 */
public class ColorLabel extends JLabel implements ColorListener {
    public String hex;

    public String getHex() {
        return hex;
    }
    @Override
    public void changeColor(ColorEvent ce) {
        
        hex = Integer.toHexString(ce.getColor().getRGB() & 0xffffff);
        while (hex.length() < 6){
            hex = "0" + hex;
            setText("Color in Hex: 0" + hex);
        }
        setText("Color in Hex: #" + hex);
    }
    
    public ColorLabel(){
        super();
        setText("Color in hex: #000000");
    }
    
}
