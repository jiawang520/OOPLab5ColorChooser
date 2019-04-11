/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import javax.swing.JSlider;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author JiaLenovo
 */
public class MyDocumentListener implements DocumentListener {
    private JIntegerField jintegerfield;
    private JSlider jslider;

    public MyDocumentListener(JIntegerField jintegerfield, JSlider jslider) {
        this.jintegerfield = jintegerfield;
        this.jslider = jslider;
    }
    
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        if (jintegerfield.getText().equals("")) {
            jslider.setValue(0);
        }
        else {
            jslider.setValue(Integer.parseInt(
                jintegerfield.getText()));
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        if (jintegerfield.getText().equals("")) {
            jslider.setValue(0);
        }
        else {
            jslider.setValue(Integer.parseInt(
                jintegerfield.getText()));
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
