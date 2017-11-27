package menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RouteStops12 {

    private Stage prevStage;
    private Stage stage;
    private FXMLLoader loader;

    public RouteStops12(Stage stage){
        this.prevStage = stage;
        this.stage = new Stage();
        setupRouteStops12();
    }

    private void setupRouteStops12(){
        this.loader = new FXMLLoader(getClass().getResource("FXML/Route12.fxml"));
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
        this.prevStage.setAlwaysOnTop(false);
        this.stage.show();
        this.prevStage.close();
    }
}
