/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandComplete;

import command.Command;
import Receivers.GameCommands;

/**
 *
 * @author ghiggi
 */
public class ButtonUpCommand implements Command {
    GameCommands buttonUp;
    
    public ButtonUpCommand(GameCommands buttonUp){
        this.buttonUp = buttonUp;
    }

    @Override
    public void execute() {
        buttonUp.PressUp();
    }
    
}
