package menu;

import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

import javax.swing.event.DocumentEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class MenuControls implements Initializable{

    @FXML private PasswordField bannerID;
    @FXML private TextFlow login;
    @FXML private ImageView logInBtn;
    @FXML private Pane twitter;
    @FXML private WebView webView;
    private Text wrong = new Text();
    private Text passwordPromt = new Text();

    private boolean bVal;
    public void handleKeys(KeyEvent event){
        this.login.getChildren().remove(this.passwordPromt);
        if (getPassword().length() < 7) {
            this.login.getChildren().remove(wrong);
            this.wrong.setText("The BannerID Does Not Meet Requirements");
            this.wrong.setId("errorMsg");
            this.login.getChildren().add(this.wrong);
            this.bVal = false;
            return;
        }
        this.login.getChildren().remove(wrong);
        this.bVal = true;
    }

    public void handleLogIn(MouseEvent event) throws InterruptedException {
        String password = getPassword();
        this.bannerID.clear();
        this.login.getChildren().remove(this.wrong);
        this.login.getChildren().remove(this.passwordPromt);
        if (this.bVal == false) {
            this.login.getChildren().add(this.passwordPromt);
           return;
        } else {
            System.out.println(password);
        }
    }

    public void tweets(){
        WebEngine webEngine = this.webView.getEngine();
        webEngine.javaScriptEnabledProperty().setValue(true);
        webEngine.loadContent(
                "<a class=\"twitter-timeline\" href=\"https://twitter.com/TotalTrafficSAT?ref_src=twsrc%5Etfw\">Tweets by TotalTrafficSAT</a>"
                +
                "<script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"> </script>"
        );
    }

    public String getPassword() {
        String bannerID = this.bannerID.getText();
        return bannerID;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.passwordPromt.setText("Enter your bannerID");
        this.passwordPromt.setId("prompt");
        this.login.getChildren().add(this.passwordPromt);
        tweets();
    }

}
