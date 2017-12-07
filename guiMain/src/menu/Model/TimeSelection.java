package menu.Model;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * this will be the java file to handle
 * scene/stage creation for the time selection window
 *
 * @author Perry Jonathan
 */
public class TimeSelection {

    private Stage stage;
    private FXMLLoader loader;

    /**
     * This is the constructor to setup the stage/window
     *
     * @param stage
     */
    public TimeSelection(Stage stage){
        this.stage = stage;
        setupTimeSelection();
    }

    /**
     * the method to handle the bulk of the
     * stage setup and file loader.
     *
     */
    private void setupTimeSelection(){
        this.loader = new FXMLLoader(getClass().getResource("../View/TimeSelection.fxml"));
        Parent root = null;
        try {
            root = this.loader.load();
        } catch (IOException e) {
            e.getCause().getMessage();
        }
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
        this.stage.setFullScreen(true);
        this.stage.setFullScreenExitHint(null);
        this.stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
    }
}