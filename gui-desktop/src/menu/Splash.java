package menu;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Splash implements Runnable{

    private Stage stage;
    private Scene scene;

    @FXML
    private ImageView image;
    @FXML
    private Pane pane;


    public Splash(Stage stage) throws Exception {
        this.stage = stage;
        splashScreen();
    }

    public void splashScreen() throws Exception{
        pane = new Pane();
        Image img = new Image(getClass().getResource("splash.png").toString());
        image = new ImageView(img);
        this.pane.getChildren().add(image);
        this.stage.setAlwaysOnTop(true);
        this.scene = new Scene(this.pane, 300, 200);
        this.scene.setFill(Color.TRANSPARENT);
        this.stage.initStyle(StageStyle.TRANSPARENT);
        this.stage.setScene(this.scene);
    }

    public Stage getStage() {
        return this.stage;
    }

    @Override
    public void run() {
        this.stage.show();
    }
}
