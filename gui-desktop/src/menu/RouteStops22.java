package menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RouteStops22 {
    private Stage prevStage;
    private FXMLLoader loader;
    private Stage stage;

    public RouteStops22(Stage stage) {
        this.stage = new Stage();
        this.prevStage = stage;
        setupRouteStops22();
    }
    private void setupRouteStops22(){
        this.loader = new FXMLLoader(getClass().getResource("FXML/Route22.fxml"));
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

    public void showRoutes(){
        this.stage.show();
        this.prevStage.close();
    }
}
