package menu;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * This main menu class will be used to handle the runnable
 * seq. of the initial scene/stage
 *
 * @author Perry Jonathan
 */
public class MainMenu implements Runnable{

    private Stage stage;
    private Scene scene;
    private FXMLLoader loader;

    /**
     * This method is the contructor to init
     * the stage and scene for the main menu log in page
     *
     * @param stage for the current stage
     * @throws IOException for the file loader
     *
     */
    public MainMenu(Stage stage) throws IOException{
        this.stage = stage;
        setStage(this.stage);
    }

    /**
     * Thiis method will handle the bulk of setting up the menu stage/window
     * adds the needed style sheets and fxml design templates and creates the window
     * to have the attribute of a full screen window
     *
     * @param stage Stage for the current scene/display window
     * @throws IOException
     */
    public void setStage(Stage stage) throws IOException {
        this.stage = stage;
        this.loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = this.loader.load();
        this.scene = new Scene(root);
        this.scene.getStylesheets().add("menu/styles.css");
        this.stage.setScene(this.scene);
        this.stage.setFullScreen(true);
        this.stage.setAlwaysOnTop(true);
    }

    /**
     * to finalize menu and display the stage
     *
     * @Override this will override the library method of runnable
     */
    @Override
    public void run() {
        this.stage.show();
    }
}