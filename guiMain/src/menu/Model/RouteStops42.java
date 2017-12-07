package menu.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * route 42 class to setup route 42 stage/window
 * this will handle the file laoder for the FXML
 *
 * @author Perry Jonathan
 */
public class RouteStops42 {

    private Stage prevStage;
    private FXMLLoader loader;
    private Stage stage;

    /**
     *Constructor
     *
     * @param stage
     */
    public RouteStops42(Stage stage) {
        this.stage = stage;
        setupRouteStops42();
    }

    /**
     * the method to handle the bulk of the
     * stage setup and file loader information
     * for route 42
     */
    private void setupRouteStops42(){
        this.loader = new FXMLLoader(getClass().getResource("../View/Route42.fxml"));
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
