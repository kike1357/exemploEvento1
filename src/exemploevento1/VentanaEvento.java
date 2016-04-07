package exemploevento1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author epastorizalorenzo
 */
public class VentanaEvento implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    
public void crearventana(){
    marco = new JFrame("*** evento 1**");
    panel = new JPanel();
    boton= new JButton("PREME");
    boton.setBackground(Color.YELLOW);
    etiqueta = new JLabel();
    marco.setSize(600, 600);
    //monitorizamos o botón
    boton.addActionListener(this);
    panel.add(boton);
    panel.add(etiqueta);
    marco.add(panel);
    
    marco.setVisible(true);
  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("pulsa al botón");
    }
    }
