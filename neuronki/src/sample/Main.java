package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("Hello World");
        SampleController cont = loader.getController();
        cont.generatePoints(50);
        primaryStage.setScene(new Scene(root, 669, 531));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
