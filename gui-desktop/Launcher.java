import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception {
        Splash splash = new Splash(primaryStage);
    }
}
