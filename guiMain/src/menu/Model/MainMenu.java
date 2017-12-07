package menu.Model;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * This main menu class will be used to handle the runnable
 * seq. of the initial scene/stage
 *
 * @author Perry Jonathan
 */
public class MainMenu{

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
    public MainMenu(Stage stage){
        stage.close();
        this.stage = new Stage();
        setStage(this.stage);
    }

    public Stage getStage() {
        return this.stage;
    }

    /**
     * Thiis method will handle the bulk of setting up the menu stage/window
     * adds the needed style sheets and fxml design templates and creates the window
     * to have the attribute of a full screen window
     *
     * @param stage Stage for the current scene/display window
     * @throws IOException
     */
    public void setStage(Stage stage){
        this.stage = stage;
        this.loader = new FXMLLoader(getClass().getResource("../View/main.fxml"));
        Parent root = null;
        try {
            root = this.loader.load();
        } catch (IOException e) {
            e.getCause().getMessage();
        }
        this.scene = new Scene(root);
        this.scene.getStylesheets().add("menu/View/styles.css");
        this.stage.setScene(this.scene);
        this.stage.setFullScreen(true);
        this.stage.setFullScreenExitHint(null);
        this.stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        this.stage.setAlwaysOnTop(true);
    }

    public void showStage(){
        this.stage.show();
    }
}