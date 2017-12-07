package menu.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

public class RouteStops20 {
    private Stage prevStage;
    private FXMLLoader loader;
    private Stage stage;

    public RouteStops20(Stage stage) {
        this.stage = stage;
        setupRouteStops20();
    }
    private void setupRouteStops20(){
        this.loader = new FXMLLoader(getClass().getResource("../View/Route20.fxml"));
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
