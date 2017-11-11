import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class Splash extends Application{

    public Stage stage, stage2;
    public Scene scene;

    @FXML
    public ImageView image;
    @FXML
    public Pane pane;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        pane = new Pane();
        Image img = new Image(getClass().getResource("splash.png").toString());
        image = new ImageView(img);
        pane.getChildren().add(image);
        this.stage=primaryStage;
        this.stage.setAlwaysOnTop(true);
        this.scene = new Scene(pane, 300, 200);
        this.scene.setFill(Color.TRANSPARENT);
        this.stage.initStyle(StageStyle.TRANSPARENT);
        this.stage.setScene(scene);
        this.stage.show();
       // this.stage.setAlwaysOnTop(false);
        MainMenu menu = new MainMenu();
        this.stage2 = menu.getStage();
        this.stage.close();
        this.stage2.show();
    }



}
