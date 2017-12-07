package menu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class TimeSelectionController implements Initializable{

    //ComboBox<Integer> comboBox;
    @FXML
    private ComboBox hour;
    @FXML
    private ComboBox min;
    @FXML
    private ToggleButton am;
    @FXML
    private ToggleButton pm;
    @FXML
    private ToggleGroup TOD;

    am.setToggleGroup(TOD);
    pm.setToggleGroup(TOD);


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hour.getItems().addAll(
                "1" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        min.getItems().addAll(
                "00", "01", "02", "03", "04", "05", "06", "07", "08", "09",
                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
                "30", "31", "32", "33", "34", "35", "36", "37", "38", "39",
                "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
                "50", "51", "52", "53", "54", "55", "56", "57", "58", "59");

}
}
