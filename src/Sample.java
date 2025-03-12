import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World App");

        Label label = new Label("Enter something:");
        TextField textField = new TextField();
        Button button = new Button("Submit");
        Label outputLabel = new Label();

        button.setOnAction(e -> {
            String input = textField.getText();
            outputLabel.setText("Hello, " + input + "!");
        });

        VBox vbox = new VBox(10, label, textField, button, outputLabel);
        vbox.setPadding(new Insets(10));
        
        primaryStage.setScene(new Scene(vbox, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
