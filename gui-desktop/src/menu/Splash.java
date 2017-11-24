package menu;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * This is to handle an optional splash screen add on
 * for hnadling preprocessing data (i.e. TCP connections)
 * implementing runnable for threading
 *
 * @author Perry Jonathan
 */
public class Splash implements Runnable{

    private Stage stage;
    private Scene scene;
    @FXML private ImageView image;
    @FXML private Pane pane;


    /**
     * This constructor will handle the setup for the splash screen stage
     *
     * @param stage to handle the current scene
     * @throws Exception excep. for file loaders
     */
    public Splash(Stage stage) throws Exception {
        this.stage = stage;
        splashScreen();
    }

    /**
     * splashscreen method handles the bulk of setup
     * transparent BG's for a freefloating splash
     * preprocessor placeholder
     *
     * @throws Exception excep. for file loaders
     */
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

    /***
     * primary use of runnable
     *
     * @Override used to override norm. thread methods
     */
    @Override
    public void run() {
        this.stage.show();
    }
}
