/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandComplete;

import Receivers.GameCommands;
import command.Command;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author ghiggi
 */
public class ButtonDownCommand implements Command {
    GameCommands buttonDown;
    
    public ButtonDownCommand(GameCommands buttonUp){
        this.buttonDown = buttonUp;
    }

    @Override
    public void execute() {
        buttonDown.PressDown();
    }
    
}
