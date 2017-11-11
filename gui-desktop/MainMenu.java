import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class MainMenu{

    private Stage stage;
    private Scene scene;

    @FXML
    public ImageView image;
    @FXML
    public Pane pane;

    public MainMenu() throws IOException, InterruptedException {
        this.stage = new Stage();
        setStage(stage);
    }

    public Stage getStage(){
        return this.stage;
    }

    public void setStage(Stage stage) throws InterruptedException, IOException {
        this.stage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        this.scene = new Scene(root);
        this.stage.setScene(this.scene);
        this.stage.setFullScreen(true);
        this.stage.setAlwaysOnTop(true);
    }
}