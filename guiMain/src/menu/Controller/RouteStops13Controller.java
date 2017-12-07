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

public class RouteStops13Controller {

    @FXML
    private Button btnECampL2;
    @FXML
    private Button btnECampL1;

    private void writeString(String info) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            Files.write(Paths.get("newCommuter.txt"), info.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleBtnL2(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("2,");
        new TimeSelection((Stage)this.btnECampL2.getScene().getWindow());
    }

    public void handleBtnL1(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("1,");
        new TimeSelection((Stage)this.btnECampL1.getScene().getWindow());
    }
}
