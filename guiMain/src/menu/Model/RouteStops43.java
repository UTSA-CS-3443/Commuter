<<<<<<< HEAD
package menu.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * handle the display setup with the route 43 FXML file
 * template and display once it is ready
 *
 * @author Perry Jonathan
 */
public class RouteStops43 {
    private Stage prevStage;
    private FXMLLoader loader;
    private Stage stage;

    /**
     * route setup constructor for stage transitions
     *
     * @param stage the previous stage
     */
    public RouteStops43(Stage stage) {
        this.stage = stage;
        setupRouteStops43();
    }

    /**
     * setting up the bulk of the stage and loader file information
     * prep for showing the stage
     */
    private void setupRouteStops43(){
        this.loader = new FXMLLoader(getClass().getResource("../View/Route43.fxml"));
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
=======
package menu.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * handle the display setup with the route 43 FXML file
 * template and display once it is ready
 *
 * @author Perry Jonathan
 */
public class RouteStops43 {
    private Stage prevStage;
    private FXMLLoader loader;
    private Stage stage;

    /**
     * route setup constructor for stage transitions
     *
     * @param stage the previous stage
     */
    public RouteStops43(Stage stage) {
        this.stage = stage;
        setupRouteStops43();
    }

    /**
     * setting up the bulk of the stage and loader file information
     * prep for showing the stage
     */
    private void setupRouteStops43(){
        this.loader = new FXMLLoader(getClass().getResource("../View/Route43.fxml"));
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
>>>>>>> 3d23d977f5da8e3e2052b71db2f70d30276b5dfc
