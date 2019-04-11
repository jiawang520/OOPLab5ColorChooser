/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import javax.swing.JTextField;
import javax.swing.text.Document;

/**
 *
 * @author JiaLenovo
 */
public class JIntegerField extends JTextField {
    public JIntegerField(){
        super();
    }
    
    @Override
    protected Document createDefaultModel(){
       
        String[] accept = new String[256];
          
        for (int i =0; i < 256; i++){
            accept[i] = Integer.toString(i);
        }
        
        return new RestrictedDocument(accept);
    }
}
