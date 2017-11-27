package menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RouteSelection{

    private Stage prevStage;
    private FXMLLoader loader;
    private Stage stage;

    public RouteSelection(Stage stage){
        this.prevStage = stage;
        this.stage = new Stage();
        setupRouteSelection();
    }

    private void setupRouteSelection(){
        this.loader = new FXMLLoader(getClass().getResource("FXML/routes.fxml"));
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
        this.stage.initStyle(StageStyle.TRANSPARENT);
        showRoutes();
    }

    private void showRoutes() {
        this.stage.show();
        this.prevStage.close();
    }
}
