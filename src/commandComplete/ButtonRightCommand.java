/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandComplete;

import Receivers.GameCommands;
import command.Command;

/**
 *
 * @author ghiggi
 */
public class ButtonRightCommand implements Command {
    GameCommands buttonRight;
    
    public ButtonRightCommand(GameCommands buttonRight){
        this.buttonRight = buttonRight;
    }

    @Override
    public void execute() {
        buttonRight.PressRight();
    }
    
}
