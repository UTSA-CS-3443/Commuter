package commuterRoutes;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class Main extends Application {

    @FXML
    // Route 12
    Button btnHillCP;

    // Route 13
    Button btnECampL1;
    Button btnECampL2;

    // Route 14
    Button btnParq;
    Button btnLuxx;
    Button btnBroadstone;

    // Route 20
    Button btnOutpost;
    Button btnAvalonPlace;

    // Route 22
    Button btnVillBab;
    Button btnReserve;

    // Route 40
    Button btnTetVill;

    // Route 42
    Button btnHiViewP;
    Button btnMavCr;

    // Route 43
    Button btnBarLot1;
    Button btnBarLot2;
    Button btnBrackLot3;
    Button btnBrackLot4;
    Button btnBrackLot5;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Route13.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
