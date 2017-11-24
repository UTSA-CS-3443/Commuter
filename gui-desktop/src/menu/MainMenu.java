package menu;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sun.applet.Main;
import twitter4j.TwitterException;
import menu.MenuControls;
import java.io.IOException;
import java.net.URL;


public class MainMenu implements Runnable{

    private Stage stage;
    private Scene scene;
    private FXMLLoader loader;
    private String szID;

    @FXML
    private ImageView image;
    @FXML
    private WebView webView;
    @FXML
    private PasswordField bannerID;

    public MainMenu(Stage stage) throws IOException, InterruptedException {
        this.stage = stage;
        setStage(this.stage);
    }

    public Stage getStage(){
        return this.stage;
    }

    public void setStage(Stage stage) throws InterruptedException, IOException {
        this.stage = stage;
        this.loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = this.loader.load();
        this.scene = new Scene(root);
        this.scene.getStylesheets().add("menu/styles.css");
        this.stage.setScene(this.scene);
        this.stage.setFullScreen(true);
        this.stage.setAlwaysOnTop(true);
    }

    public void showMenu(){
        this.getStage().show();
    }

    @Override
    public void run() {
        showMenu();
    }
}