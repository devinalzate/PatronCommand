/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.command;
import Vista.Vista;
import javax.swing.*;
/**
 *
 * @author DEVIN ALZATE
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
                public void run() {
                    new Vista();
 }
        });
        
    }
}
