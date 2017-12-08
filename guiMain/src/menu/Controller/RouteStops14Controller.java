<<<<<<< HEAD
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

public class RouteStops14Controller {

    @FXML private Button btnParq;
    @FXML private Button btnBroadstone;
    @FXML private Button btnLuxx;

    private void writeString(String info) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            Files.write(Paths.get("newCommuter.txt"), info.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleBtnParq(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("1,");
        new TimeSelection((Stage)this.btnParq.getScene().getWindow());

    }

    public void handleBtnBroadstone(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("2,");
        new TimeSelection((Stage)this.btnBroadstone.getScene().getWindow());
    }

    public void handleBtnLuxx(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("3,");
        new TimeSelection((Stage)this.btnLuxx.getScene().getWindow());
    }
}
=======
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

public class RouteStops14Controller {

    @FXML private Button btnParq;
    @FXML private Button btnBroadstone;
    @FXML private Button btnLuxx;

    private void writeString(String info) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            Files.write(Paths.get("newCommuter.txt"), info.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleBtnParq(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("1,");
        new TimeSelection((Stage)this.btnParq.getScene().getWindow());

    }

    public void handleBtnBroadstone(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("2,");
        new TimeSelection((Stage)this.btnBroadstone.getScene().getWindow());
    }

    public void handleBtnLuxx(MouseEvent mouseEvent) throws FileNotFoundException, UnsupportedEncodingException {
        writeString("3,");
        new TimeSelection((Stage)this.btnLuxx.getScene().getWindow());
    }
}
>>>>>>> 3d23d977f5da8e3e2052b71db2f70d30276b5dfc
