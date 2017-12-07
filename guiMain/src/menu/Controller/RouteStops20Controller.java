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

public class RouteStops20Controller {


    @FXML private Button btnOutpost;
    @FXML private Button btnAvalonPlace;

    private void writeString(String info) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            Files.write(Paths.get("newCommuter.txt"), info.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleBtnOutpost(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("1,");
        new TimeSelection((Stage)this.btnOutpost.getScene().getWindow());
    }

    public void handleBtnAvalonPlace(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("2,");
        new TimeSelection((Stage)this.btnAvalonPlace.getScene().getWindow());
    }
}
