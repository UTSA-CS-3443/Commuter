package Routes;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.awt.*;
import java.io.IOException;

public class routesController extends Application {

   private Stage stage;
   private Scene scene;

   public static void main(String[] args) {

       launch(args);
   }

   public void start(Stage pStage) throws IOException{

       Parent root = FXMLLoader.load(getClass(). getResource("routes.fxml"));
       this.stage = pStage;
       this.scene = new Scene(root);

       this.stage.setScene(this.scene);

       this.stage.setFullScreen(true);
       this.stage.show();
   }
}
