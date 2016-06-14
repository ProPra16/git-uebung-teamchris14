package de.hhu.propra16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Created by Tobias Witt on 06.06.16.
 */
public class FiveButtons extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/five_buttons" +
                ".fxml"));
        final FileChooser chooser = new FileChooser();
        final Button btnb = new Button("b");
        btnb.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent arg0) {
				chooser.setTitle("FileChooser");
			}
		});
        btnb.setOnAction(
        		e -> chooser.setTitle("FileChooser")
        		);
        primaryStage.setTitle("Five Buttons");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
