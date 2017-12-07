package menu;

import menu.Model.MainMenu;
import javafx.application.Application;
import javafx.stage.Stage;
import menu.Model.MainMenu;

public class Launcher extends Application{

    /**
     * Main method will be used to init the Application
     * calling launch which is extended by Application class
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     *
     * @param primaryStage the primary stage passed in from Application Class
     * @throws Exception excep. handling for loaders
     */
    public void start(Stage primaryStage) throws Exception {
        MainMenu menu = new MainMenu(primaryStage);
        menu.showStage();
    }
}
