package menu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * The menu controller is tied to the menu fxml file
 * this will handle all needed events for this stage
 *
 * @author Perry Jonathan
 */
public class MenuControls implements Initializable{

    @FXML private PasswordField bannerID;
    @FXML private TextFlow login;
    @FXML private WebView webView;
    private Text wrong = new Text();
    private Text passwordPromt = new Text();

    private boolean bVal;

    /**
     * this method will be called by the passwordField in the fxml file
     * it will handle checking the field at each keystroke for correctness
     *
     * @param event a keyboard key stroke event
     */
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

    /**
     * This is used for onMouseClick with ImageView in the fxml
     * this method will verify correctness of ID entered and
     * it will prompt incorrect or parse the data to mySQL
     *
     * @param event
     * @throws InterruptedException
     */
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

    /**
     * handles populating the WebView pane with data
     * using WebEngine and WebView to apply a simple script
     * and HTML5 for the header
     */
    public void tweets(){
        WebEngine webEngine = this.webView.getEngine();
        webEngine.javaScriptEnabledProperty().setValue(true);
        webEngine.loadContent(
                "<a class=\"twitter-timeline\" href=\"https://twitter.com/TotalTrafficSAT?ref_src=twsrc%5Etfw\">Tweets by TotalTrafficSAT</a>"
                +
                "<script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"> </script>"
        );
    }

    /**
     * a simple getter to grab a string from text field
     *
     * @return String returns bannerID holding the value of passwordField
     */
    public String getPassword() {
        String bannerID = this.bannerID.getText();
        return bannerID;
    }


    /**
     * this will be the preEvent handler for prior to Window.SHOWN/SHOWING
     *
     * @Override for a new used of Init methods for controller
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.passwordPromt.setText("Enter your bannerID");
        this.passwordPromt.setId("prompt");
        this.login.getChildren().add(this.passwordPromt);
        tweets();
    }

}
