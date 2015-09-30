/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoker;

import command.Command;

/**
 *
 * @author ghiggi
 */
public class GamePadController {
    Command buttonAction;
    
    public void setCommand(Command command){
        buttonAction = command;
    }
    
    public void buttonWasPressed(){
        buttonAction.execute();
    }
    
}
