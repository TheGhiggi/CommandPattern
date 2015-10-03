/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import Invoker.GamePadController;
import Receivers.GameCommands;
import commandComplete.ButtonDownCommand;
import commandComplete.ButtonLeftCommand;
import commandComplete.ButtonRightCommand;
import commandComplete.ButtonUpCommand;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ghiggi
 * 
 * Essa classe é o cliente. Ela é responsável por criar o comando concreto e pela definição do receptor.
 * No caso deste exemplo, o receptor é a classe GameCommands, que contem todos os metodos de comandos do jogo.
 * Os métodos desta classe foram encapsulados como Comandos completos, para que o nosso cliente possa executalos mesmo sem conhece-los.
 */
public class GamePadDesign extends JFrame {
    
    //Receiver
    GameCommands gpcommands = new GameCommands();
    
    //Command complete
    ButtonDownCommand btnDownCommand = new ButtonDownCommand(gpcommands);
    ButtonUpCommand btnUpCommand = new ButtonUpCommand(gpcommands);
    ButtonLeftCommand btnLeftCommand = new ButtonLeftCommand(gpcommands);
    ButtonRightCommand btnRightCommand = new ButtonRightCommand(gpcommands);
    
    JButton buttonA, buttonB, buttonUp, buttonDown, buttonLeft, buttonRight, buttonStart, buttonSelect, buttonSpecial;
            
    public GamePadDesign(){
        setSize(500,220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        
        buttonA = getJbutton(340, 90, 55, 55, "A");
        buttonB = getJbutton(410, 90, 55, 55, "B");
        buttonSpecial = getJbutton(80, 75, 40, 40, null);
        
        buttonUp = getJbutton(80, 28, 40, 47, "/\\");
        buttonDown = getJbutton(80, 115, 40, 47, "\\/");
        buttonLeft = getJbutton(35, 75, 45, 40, "<");
        buttonRight = getJbutton(120, 75, 45, 40, ">");
        buttonSelect = getJbutton(260, 100, 40, 20, null);
        buttonStart = getJbutton(205, 100, 40, 20, null);
        
        
        //invoker
        buttonDown.addActionListener( new GamePadController(btnDownCommand));
        buttonUp.addActionListener( new GamePadController(btnUpCommand));
        buttonLeft.addActionListener( new GamePadController(btnLeftCommand));
        buttonRight.addActionListener( new GamePadController(btnRightCommand));
        
        setVisible(true);
    }
    
    private JButton getJbutton(int x, int y, int height, int width, String text){
        JButton jb = new JButton();
        jb.setBounds(x, y, height, width);
        jb.setFont(new Font(null, 2, 10));
        jb.setText(text);
        getContentPane().add(jb);
        return jb;
    }
    
    public static void main(String[] args) {
        System.out.println("yo nigga! i'm running!");
        GamePadDesign gpd = new GamePadDesign();
    }
    
}


