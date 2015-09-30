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
public class ButtonLeftCommand implements Command{
        GameCommands buttonLeft;
    
    public ButtonLeftCommand(GameCommands buttonLeft){
        this.buttonLeft = buttonLeft;
    }

    @Override
    public void execute() {
        buttonLeft.PressLeft();
    }
}
