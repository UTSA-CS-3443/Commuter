import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Splash{

    private Stage stage, stage2;
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
        this.stage.show();
       // this.stage.setAlwaysOnTop(false);
        //MainMenu menu = new MainMenu();
        //this.stage2 = menu.getStage();

        //this.stage2.initStyle(StageStyle.TRANSPARENT);
        //this.stage2.show();
    }



}
