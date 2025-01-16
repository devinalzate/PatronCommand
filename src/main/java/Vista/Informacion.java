package Vista;


import Commands.ActionAvanzar;
import Commands.ActionPausar;
import Commands.ActionReproducir;
import Reproductor.MiMusica;
import com.mycompany.command.Controller;
import Interface.Command;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Informacion extends JPanel{
    private JLabel manejo1;
    private JLabel manejo2;
    private JLabel manejo3;
    private Integer[] opciones = {1,2,3};
    private JComboBox<Integer> desplegable;
    private JButton confirmacion;
    private JPanel panelCentrado;
    private JPanel panelTexto;
    
    public Informacion(){
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        setPreferredSize(new Dimension(100,100));
        setBorder(BorderFactory.createLineBorder(Color.black));
        panelCentrado = new JPanel();
        panelCentrado.setLayout(new FlowLayout());
        panelTexto = new JPanel();
        panelTexto.setLayout(new BoxLayout(panelTexto,BoxLayout.Y_AXIS));
        panelTexto.setBorder(BorderFactory.createMatteBorder(
            1, 5, 1, 1, Color.red));

        manejo1 = new JLabel("1. Para Reproducir");
        manejo2 = new JLabel("2. Para Avanzar");
        manejo3 = new JLabel("3. Para Pausar");
/* 
        manejo1.setAlignmentX(CENTER_ALIGNMENT);
        manejo2.setAlignmentX(CENTER_ALIGNMENT);
        manejo3.setAlignmentX(CENTER_ALIGNMENT);
*/        

        desplegable = new JComboBox<>(opciones);
        desplegable.setSize(new Dimension(100,25));
        confirmacion = new JButton("Confirmar");

        panelTexto.add(manejo1);
        panelTexto.add(manejo2);
        panelTexto.add(manejo3);
        panelCentrado.add(panelTexto);
        panelCentrado.add(desplegable);
        panelCentrado.add(confirmacion);

        add(panelCentrado);
        
        confirmacion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MiMusica repro = new MiMusica();
                Controller control = new Controller();
                
                Command reproducir = new ActionReproducir(repro);
                Command pausar = new ActionPausar(repro);
                Command avanzar = new ActionAvanzar(repro);
                
                if(desplegable.getSelectedItem().equals(1)){
                    control.setCommand(reproducir);
                    control.setButton();
                }else if(desplegable.getSelectedItem().equals(2)){
                    control.setCommand(pausar);
                    control.setButton();
                }else{
                    control.setCommand(avanzar);
                    control.setButton();
                }
            } 
        });
    }
}
