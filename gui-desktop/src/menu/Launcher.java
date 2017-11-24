package menu;

import javafx.application.Application;
import javafx.stage.Stage;

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
        Splash splash = new Splash(new Stage());
        MainMenu menu = new MainMenu(primaryStage);
        Thread t1 = new Thread(splash);
        Thread t2 = new Thread(menu);
        t2.setDaemon(true);
        t2.run();
    }
}
