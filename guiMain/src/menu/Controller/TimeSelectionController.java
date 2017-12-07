package menu.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import menu.Model.Client;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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


    private void writeString(String info) throws FileNotFoundException, UnsupportedEncodingException {
        try {
            Files.write(Paths.get("newCommuter.txt"), info.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleTimes(MouseEvent mouseEvent) throws IOException {
        String hr = this.hour.getValue().toString();
        int hours = Integer.parseInt(hr);
        if(pm.isSelected())
            hours+=12;
        hr = String.valueOf(hours);
        writeString(hr+","+this.min.getValue().toString());
        BufferedReader br = new BufferedReader(new FileReader("newCommuter.txt"));
        new Client(br.readLine().toString());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.TOD = new ToggleGroup();
        hour.getItems().addAll(
                "1" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        min.getItems().addAll(
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
                "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
                "30", "31", "32", "33", "34", "35", "36", "37", "38", "39",
                "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
                "50", "51", "52", "53", "54", "55", "56", "57", "58", "59");
        this.am.setToggleGroup(this.TOD);
        this.pm.setToggleGroup(this.TOD);
    }
}
