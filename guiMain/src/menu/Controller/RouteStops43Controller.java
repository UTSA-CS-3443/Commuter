package menu.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import menu.Model.TimeSelection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * The controller to handle the button selections
 * for the route 43 stops
 *
 * @author Perry Jonathan
 */
public class RouteStops43Controller {

    @FXML private Button btnBarLot2;
    @FXML private Button btnBarLot1;
    @FXML private Button btnBrackLot4 ;
    @FXML private Button btnBrackLot5;
    @FXML private Button btnBrackLot3;

    private void writeString(String info) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            Files.write(Paths.get("newCommuter.txt"), info.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Handle Mouse Events for buttons on the route 43 stops
     *
     * @param mouseEvent for mouse events from the fxml scenes
     */
    public void handleBarshopLot2(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("1,");
        new TimeSelection((Stage)this.btnBarLot2.getScene().getWindow());
    }

    public void handleBarshopLot1(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("2,");
        new TimeSelection((Stage)this.btnBarLot1.getScene().getWindow());
    }

    public void handleBrackenridgeLot4(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("3,");
        new TimeSelection((Stage)this.btnBrackLot4.getScene().getWindow());
    }

    public void handleBrackenridgeLot5(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("4,");
        new TimeSelection((Stage)this.btnBrackLot5.getScene().getWindow());
    }

    public void handleBrackenridgeLot3(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("5,");
        new TimeSelection((Stage)this.btnBrackLot3.getScene().getWindow());
    }
}
