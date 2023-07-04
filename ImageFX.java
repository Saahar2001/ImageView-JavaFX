package imagefx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ImageFX extends Application {

    VBox vbox = new VBox(20);

    @Override
    public void start(Stage primaryStage) {
        Image img = new Image("imagefx/A.jpg");
        ImageView IV = new ImageView(img);
        IV.setFitWidth(150);
        IV.setFitHeight(100);
        vbox.setAlignment(Pos.CENTER);
        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.CENTER);

        Button btn = new Button("Show - Hide");
        btn.setPrefSize(100, 30);
        btn.setAlignment(Pos.CENTER);
        btn.setOnAction(e -> {
            if (IV.isVisible() == true) {
                IV.setVisible(false);
            } else {
                IV.setVisible(true);
            }
        });

        Button btn2 = new Button("close");
        btn2.setPrefSize(100, 30);
        btn2.setAlignment(Pos.CENTER);

        btn2.setOnAction(e -> {
            primaryStage.close();
        });

        hbox.getChildren().addAll(btn, btn2);
        vbox.getChildren().addAll(hbox, IV);

        HBox b = new HBox(20);
        b.setPadding(new Insets(5, 5, 5, 5));
        b.setAlignment(Pos.CENTER);
        b.setStyle("-fx-border-width:5px;-fx-border-color:pink;");
        RadioButton RB = new RadioButton("Red");
        RadioButton RB2 = new RadioButton("Blue");
        b.getChildren().addAll(RB, RB2);
        vbox.getChildren().add(b);

        ToggleGroup T = new ToggleGroup();
        RB.setToggleGroup(T);
        RB2.setToggleGroup(T);

        RB.setOnAction(e -> {
            red();
        });

        RB2.setOnAction(e -> {
            blue();
        });

        Scene scene = new Scene(vbox, 350, 350);

        primaryStage.setTitle("Final Lab Exam");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    void red() {
        vbox.setStyle("-fx-background-color:red;");
    }

    void blue() {
        vbox.setStyle("-fx-background-color:blue;");
    }

}
