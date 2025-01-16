/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;
import Interface.Command;
import Reproductor.MiMusica;
/**
 *
 * @author DEVIN ALZATE
 */
public class ActionReproducir implements Command {

    private MiMusica repro;

    public ActionReproducir(MiMusica repro) {
        this.repro = repro;
    }
    
    @Override
    public void execute() {
        repro.reproducir();
    }
}
