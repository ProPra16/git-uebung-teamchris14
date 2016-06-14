package de.hhu.propra16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtonsController {
	
	@FXML 
	protected void handleAlarmButtonAction(ActionEvent event) {
        FiveButtons.starteAlarm();
    }
	
}
