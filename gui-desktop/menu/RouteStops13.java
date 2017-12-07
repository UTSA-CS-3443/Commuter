package menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RouteStops13 {
    private Stage prevStage;
    private FXMLLoader loader;
    private Stage stage;

    public RouteStops13(Stage stage) {
        this.prevStage = stage;
        this.stage = new Stage();
        setupRouteStops13();
    }

    private void setupRouteStops13(){
        this.loader = new FXMLLoader(getClass().getResource("FXML/Route13.fxml"));
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
        this.stage.setAlwaysOnTop(true);
        this.stage.initStyle(StageStyle.TRANSPARENT);
        showRoutes();
    }

    private void showRoutes() {
        this.stage.show();
        this.prevStage.close();
    }
}
