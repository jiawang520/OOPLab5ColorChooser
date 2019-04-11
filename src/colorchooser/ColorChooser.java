/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
/**
 *
 * @author 00220682
 */
public class ColorChooser extends javax.swing.JPanel implements ChangeListener, ColorListener {
    private Vector listeners;

    /**
     * Creates new form ColorChooser
     */
        Color color;
    public ColorChooser() {
        initComponents();
        sldRed.addChangeListener(this);
        sldGreen.addChangeListener(this);
        sldBlue.addChangeListener(this);
        listeners = new Vector();
        Document docRed = redFld1.getDocument();
        docRed.addDocumentListener(new MyDocumentListener(redFld1, sldRed));
        Document docGreen = greenFld2.getDocument();
        docGreen.addDocumentListener(new MyDocumentListener(greenFld2, sldGreen));
        Document docBlue = blueFld3.getDocument();
        docBlue.addDocumentListener(new MyDocumentListener(blueFld3, sldBlue));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        sldRed = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        sldGreen = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        sldBlue = new javax.swing.JSlider();
        TxtFldRed = new javax.swing.JTextField();
        TxtFldGreen = new javax.swing.JTextField();
        TxtFldBlue = new javax.swing.JTextField();
        redFld1 = new colorchooser.RedFld();
        greenFld2 = new colorchooser.RedFld();
        blueFld3 = new colorchooser.RedFld();

        jLabel1.setText("Red");

        sldRed.setMajorTickSpacing(50);
        sldRed.setMaximum(255);
        sldRed.setMinorTickSpacing(10);
        sldRed.setPaintLabels(true);
        sldRed.setPaintTicks(true);
        sldRed.setValue(0);

        jLabel2.setText("Green");

        sldGreen.setMajorTickSpacing(50);
        sldGreen.setMaximum(255);
        sldGreen.setMinorTickSpacing(10);
        sldGreen.setPaintLabels(true);
        sldGreen.setPaintTicks(true);
        sldGreen.setValue(0);

        jLabel3.setText("Blue");

        sldBlue.setMajorTickSpacing(50);
        sldBlue.setMaximum(255);
        sldBlue.setMinorTickSpacing(10);
        sldBlue.setPaintLabels(true);
        sldBlue.setPaintTicks(true);
        sldBlue.setValue(0);

        TxtFldRed.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sldRed, org.jdesktop.beansbinding.ELProperty.create("${value}"), TxtFldRed, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TxtFldRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFldRedActionPerformed(evt);
            }
        });
        TxtFldRed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtFldRedKeyReleased(evt);
            }
        });

        TxtFldGreen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sldGreen, org.jdesktop.beansbinding.ELProperty.create("${value}"), TxtFldGreen, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TxtFldGreen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtFldGreenKeyReleased(evt);
            }
        });

        TxtFldBlue.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sldBlue, org.jdesktop.beansbinding.ELProperty.create("${value}"), TxtFldBlue, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TxtFldBlue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtFldBlueKeyReleased(evt);
            }
        });

        redFld1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                redFld1KeyReleased(evt);
            }
        });

        greenFld2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                greenFld2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                greenFld2KeyTyped(evt);
            }
        });

        blueFld3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                blueFld3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFldGreen, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redFld1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtFldRed)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greenFld2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtFldBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(blueFld3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sldBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(sldGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sldRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(TxtFldRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sldRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(redFld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TxtFldGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sldGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(greenFld2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(TxtFldBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sldBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(blueFld3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFldRedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFldRedKeyReleased
        String red = TxtFldRed.getText();
        try {
                Integer.parseInt(red);
            } catch (Exception e) {
                TxtFldRed.setText("");
            }
        if(Integer.parseInt(red)<0 || Integer.parseInt(red)>255){
            TxtFldRed.setText("");
        }
    }//GEN-LAST:event_TxtFldRedKeyReleased

    private void TxtFldGreenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFldGreenKeyReleased
        String green = TxtFldGreen.getText();
        try {
                Integer.parseInt(green);
            } catch (Exception e) {
                TxtFldGreen.setText("");
            }
        if(Integer.parseInt(green)<0 || Integer.parseInt(green)>255){
            TxtFldGreen.setText("");
        }
    }//GEN-LAST:event_TxtFldGreenKeyReleased

    private void TxtFldBlueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFldBlueKeyReleased
        String blue = TxtFldBlue.getText();
        try {
                Integer.parseInt(blue);
            } catch (Exception e) {
                TxtFldBlue.setText("");
            }
        if(Integer.parseInt(blue)<0 || Integer.parseInt(blue)>255){
            TxtFldBlue.setText("");
        }
    }//GEN-LAST:event_TxtFldBlueKeyReleased

    private void TxtFldRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFldRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFldRedActionPerformed

    private void redFld1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_redFld1KeyReleased
        if(Integer.parseInt(redFld1.getText())<0 || Integer.parseInt(redFld1.getText())>255){
            redFld1.setText("");
        }
    }//GEN-LAST:event_redFld1KeyReleased

    private void greenFld2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_greenFld2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_greenFld2KeyTyped

    private void greenFld2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_greenFld2KeyReleased
        if(Integer.parseInt(greenFld2.getText())<0 || Integer.parseInt(greenFld2.getText())>255){
            greenFld2.setText("");
        }
    }//GEN-LAST:event_greenFld2KeyReleased

    private void blueFld3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blueFld3KeyReleased
        if(Integer.parseInt(blueFld3.getText())<0 || Integer.parseInt(blueFld3.getText())>255){
            blueFld3.setText("");
        }
    }//GEN-LAST:event_blueFld3KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtFldBlue;
    private javax.swing.JTextField TxtFldGreen;
    private javax.swing.JTextField TxtFldRed;
    private colorchooser.RedFld blueFld3;
    private colorchooser.RedFld greenFld2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private colorchooser.RedFld redFld1;
    private javax.swing.JSlider sldBlue;
    private javax.swing.JSlider sldGreen;
    private javax.swing.JSlider sldRed;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent ce) {
        JSlider source = (JSlider)ce.getSource();
        if (source.getValueIsAdjusting()){
            if (source == sldRed){
                redFld1.setText(Integer.toString(sldRed.getValue()));
            } else if (source == sldGreen){
                greenFld2.setText(Integer.toString(sldGreen.getValue()));
            } else if (source == sldBlue){
                blueFld3.setText(Integer.toString(sldBlue.getValue()));
            }
        }
        int r = sldRed.getValue();
        int g = sldGreen.getValue();
        int b = sldBlue.getValue();
        color = new Color(r,g,b);
        fireColorEvent(new ColorEvent(this,color));
        

       
    }

 

    public Color getColor() {
        return color;
    }
    
    public void addColorListener(ColorListener colorListener){
        listeners.addElement(colorListener);
    }
    
    public void removeColorListener(ColorListener colorListener){
        listeners.removeElement(colorListener);
    }

    public JTextField getTxtFldBlue() {
        return TxtFldBlue;
    }

    public JTextField getTxtFldGreen() {
        return TxtFldGreen;
    }

    public JTextField getTxtFldRed() {
        return TxtFldRed;
    }

    public JSlider getSldBlue() {
        return sldBlue;
    }

    public JSlider getSldGreen() {
        return sldGreen;
    }

    public JSlider getSldRed() {
        return sldRed;
    }
    
    private void fireColorEvent(ColorEvent colorEvent){
        Vector v;
        synchronized(this){
            v = (Vector)listeners.clone();
        }
        int size = v.size();
        for(int i=0; i<size; i++){
            ColorListener colorListener = (ColorListener)v.elementAt(i);
            colorListener.changeColor(colorEvent);
        }
    }

    @Override
    public void changeColor(ColorEvent ce) {
       
    }

    public void setSldBlue(JSlider sldBlue) {
        this.sldBlue = sldBlue;
    }

    public void setSldGreen(JSlider sldGreen) {
        this.sldGreen = sldGreen;
    }

    public void setSldRed(JSlider sldRed) {
        this.sldRed = sldRed;
    }

   

  
}
