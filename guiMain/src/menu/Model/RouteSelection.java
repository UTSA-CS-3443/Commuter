package menu.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * this class is for the second scene in the application
 *
 * @author Jonathan Perry
 */
public class RouteSelection{

    private FXMLLoader loader;
    private Stage stage;

    /**
     * the route slection contructor to generate a new scne
     * for the primary stage window
     *
     * @param stage the primary stage passed from scene to scene
     */
    public RouteSelection(Stage stage){
        this.stage = stage;
        setupRouteSelection();
    }

    /**
     * this method will handle the bulk of setting up
     * the stage for route selections, it will load the fxml
     * which will be hnadled through the controller
     */
    private void setupRouteSelection(){
        this.loader = new FXMLLoader(getClass().getResource("../View/routes.fxml"));
        Parent root = null;
        try {
            root = this.loader.load();
        } catch (IOException e) {
            e.getCause().getMessage();
        }
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
        this.stage.setFullScreenExitHint(null);
        this.stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        this.stage.setFullScreen(true);
    }
}
