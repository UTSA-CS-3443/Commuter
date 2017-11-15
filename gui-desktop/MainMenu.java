import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class MainMenu{

    private Stage stage;
    private Scene scene;

    @FXML
    private ImageView image;
    @FXML
    private Pane pane;
    @FXML
    private PasswordField bannerID;

    public MainMenu() throws IOException, InterruptedException {
        this.stage = new Stage();
        setStage(this.stage);
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
        //double bannerIDHeight = this.bannerID.getHeight();
       // double bannerIDWidth = this.bannerID.getWidth();
        //this.bannerID.setPrefWidth((this.stage.getWidth()/2) - bannerIDWidth);
        //this.bannerID.setPrefHeight((this.stage.getHeight()/2) - bannerIDHeight);
        this.stage.setAlwaysOnTop(true);
    }
}