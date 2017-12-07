<<<<<<< HEAD
package menu.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

public class RouteStops13 {

    private FXMLLoader loader;
    private Stage stage;

    public RouteStops13(Stage stage) {
        this.stage = stage;
        setupRouteStops13();
    }

    private void setupRouteStops13(){
        this.loader = new FXMLLoader(getClass().getResource("../View/Route13.fxml"));
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

public class RouteStops13 {

    private FXMLLoader loader;
    private Stage stage;

    public RouteStops13(Stage stage) {
        this.stage = stage;
        setupRouteStops13();
    }

    private void setupRouteStops13(){
        this.loader = new FXMLLoader(getClass().getResource("../View/Route13.fxml"));
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
