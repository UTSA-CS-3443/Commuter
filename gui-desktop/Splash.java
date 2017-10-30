import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * This is the init class of the java fx side of the program
 * this class will encapsulate all the requirements of the init
 * process to begin the application
 *
 * @author Jonathan Perry
 */
public class Splash extends Application{

    private Stage stage;
    private Scene scene;

    @FXML
    public ImageView image;
    public Pane pane;

    /**
     * the main method to start the process
     * this will be only used to launch the javafx
     *
     * @param args
     */
    public static void main(String[] args){
        launch(args);
    }

    /**
     * This method is to start the javafx program
     * the program will start with a splash screen logo
     * it will be used as a placeholder while connection is estab.
     *
     * @param primaryStage
     * @throws Exception
     */
    public void start(Stage primaryStage) throws Exception{
        this.pane = new Pane();
        Image img = new Image(getClass().getResource("splash.png").toString());
        image = new ImageView(img);
        pane.getChildren().add(image);
        this.stage=primaryStage;
        this.stage.setAlwaysOnTop(true);
        this.scene = new Scene(pane, 300, 200);
        this.scene.setFill(Color.TRANSPARENT);
        this.stage.initStyle(StageStyle.TRANSPARENT);
        this.stage.setScene(this.scene);
        this.stage.show();
    }


}
