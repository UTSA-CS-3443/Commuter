package menu.Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

public class RouteSelection{

    private FXMLLoader loader;
    private Stage stage;

    public RouteSelection(Stage stage){
        this.stage = stage;
        setupRouteSelection();
    }

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
