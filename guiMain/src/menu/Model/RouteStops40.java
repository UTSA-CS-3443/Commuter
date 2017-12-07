<<<<<<< HEAD
package menu.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 *
 */
public class RouteStops40 {

    private FXMLLoader loader;
    private Stage stage;

    /**
     *
     *
     * @param stage previous stage passed in
     */
    public RouteStops40(Stage stage) {
        this.stage = stage;
        setupRouteStops40();
    }
    private void setupRouteStops40(){
        this.loader = new FXMLLoader(getClass().getResource("../View/Route40.fxml"));
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
 *
 *
 */
public class RouteStops40 {

    private FXMLLoader loader;
    private Stage stage;

    /**
     *
     *
     * @param stage previous stage passed in
     */
    public RouteStops40(Stage stage) {
        this.stage = stage;
        setupRouteStops40();
    }
    private void setupRouteStops40(){
        this.loader = new FXMLLoader(getClass().getResource("../View/Route40.fxml"));
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
