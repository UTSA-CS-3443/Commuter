package menu;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application{

    private static String[] arguments;

    public static void main(String[] args) {
        arguments = args;
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception {
        Splash splash = new Splash(new Stage());
        MainMenu menu = new MainMenu(primaryStage);
        Thread t1 = new Thread(splash);
        Thread t2 = new Thread(menu);
        t2.run();
    }
}
