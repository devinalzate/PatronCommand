package Vista;


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

import Gerencia.gerencia;
import Manejos_concretos.Contabilidad;
import Manejos_concretos.Personal;

public class Informacion extends JPanel{
    private JLabel manejo1;
    private JLabel manejo2;
    private JLabel manejo3;
    private Integer[] opciones = {1,2,3};
    private JComboBox<Integer> desplegable;
    private JButton confirmacion;
    private JPanel panelCentrado;
    private JPanel panelTexto;
    private Contabilidad obj2 = null;
    
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

        manejo1 = new JLabel("1. Para Contabilidad");
        manejo2 = new JLabel("2. Para Personal");
        manejo3 = new JLabel("3. Para Gerencia");
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
                if (obj2 != null) { // Si el programa detecta que ya se han creado los objetos, no los creara si no que simplemente accedera a metodos de los objetos ya creados
                    int op = getOP();
                    JOptionPane.showMessageDialog(null, obj2.getManejo(op));                    
                }else{
                    gerencia obj =new gerencia();       //Crea un objeto de gerencia
                    Personal obj1 = new Personal(obj);      //Crea un objeto de personal
                    Contabilidad obj2 =new Contabilidad(obj1);      //Crea un objeto de contabilidad
                    int op = getOP();
                    JOptionPane.showMessageDialog(null, obj2.getManejo(op));  
                }
                
            } 
        });
    }

    public Integer getOP(){
        return (Integer) desplegable.getSelectedItem();
    }
}
