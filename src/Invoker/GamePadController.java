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
 * 
 * Essa classe é o invoker, que é responsável por executar um comando solicitado. Ela não conhece o que o comando solicitado faz, mas faz 
 * este ser entregue a quem saiba.
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
