package menu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class RouteController implements Initializable{

    @FXML private ImageView newRoute12;
    @FXML private ImageView newRoute13;
    @FXML private ImageView newRoute14;
    @FXML private ImageView newRoute20;
    @FXML private ImageView newRoute22;
    @FXML private ImageView newRoute40;
    @FXML private ImageView newRoute42;
    @FXML private ImageView newRoute43;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void handleRoute43(MouseEvent mouseEvent) {
        new RouteStops43((Stage)this.newRoute43.getScene().getWindow());
    }

    public void handleRoute42(MouseEvent mouseEvent) {
        new RouteStops42((Stage)this.newRoute42.getScene().getWindow());
    }

    public void handleRoute40(MouseEvent mouseEvent) {
        new RouteStops40((Stage)this.newRoute40.getScene().getWindow());
    }

    public void handleRoute22(MouseEvent mouseEvent) {
        new RouteStops22((Stage)this.newRoute22.getScene().getWindow());
    }

    public void handleRoute20(MouseEvent mouseEvent) {
        new RouteStops20((Stage)this.newRoute20.getScene().getWindow());
    }

    public void handleRoute14(MouseEvent mouseEvent) {
        new RouteStops14((Stage)this.newRoute14.getScene().getWindow());
    }
    public void handleRoute13(MouseEvent mouseEvent) {
        new RouteStops13((Stage)this.newRoute13.getScene().getWindow());
    }

    public void handleRoute12(MouseEvent mouseEvent){
        new RouteStops12((Stage)this.newRoute12.getScene().getWindow());
    }


}
