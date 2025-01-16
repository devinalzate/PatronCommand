package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Vista extends JFrame{

    private Titulo titulo;
    private Informacion informacion;

    public Vista(){
        setTitle("Chain of responsability");
        setLayout(new BorderLayout());


        titulo = new Titulo();
        informacion = new Informacion();
        informacion.setSize(new Dimension(100,100));
        add(titulo, BorderLayout.PAGE_START);
        add(informacion, BorderLayout.CENTER);
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
