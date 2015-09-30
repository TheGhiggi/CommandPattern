/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receivers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ghiggi
 * 
 * Essa classe é o receptor. O receptor conhece todas as ações para que o jogo funcione. As ações serão executadas nele.
 */
public class GameCommands {
    
    public void PressUp(){
        System.out.println("Your character is going up.");
    }
    
    public void PressDown(){
        System.out.println("Your character is going down.");
    }
    
    public void PressLeft(){
        System.out.println("Your character is going to the left.");
    }
    
    public void PressRight(){
        System.out.println("Your character is going to the right.");
    }
    
}
