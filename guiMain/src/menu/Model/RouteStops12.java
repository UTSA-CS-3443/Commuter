package menu.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;


public class RouteStops12 {

    private Stage stage;
    private FXMLLoader loader;

    public RouteStops12(Stage stage){
        this.stage = stage;
        setupRouteStops12();
    }

    private void setupRouteStops12(){
        this.loader = new FXMLLoader(getClass().getResource("../View/Route12.fxml"));
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
