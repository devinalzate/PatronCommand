/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

import Interface.Command;
/**
 *
 * @author DEVIN ALZATE
 */
public class Controller {
    private Command comando;

    public void setCommand(Command comando) {
        this.comando = comando;
    }
    
    public void setButton(){
        comando.execute();
    }
}
