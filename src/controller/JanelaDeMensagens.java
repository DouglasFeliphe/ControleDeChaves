/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class JanelaDeMensagens {
    
    
    public static void alterarCorDoTexto(){
        
        UIManager.put("OptionPane.messageForeground", Color.BLUE);
        
    }
    
    public static void aumentarTamanhoTexto(){
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("", Font.BOLD, 13)));
    }
    
    public static void mudarCorDeFundo(){
        UIManager.put("OptionPane.background", Color.BLUE);
    }

public static void mudarCorDeFundoPainel(){
    UIManager.put("Panel.background", Color.BLUE);
}
    
    
}
