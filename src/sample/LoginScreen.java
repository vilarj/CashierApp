package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginScreen extends Application {
    private static Image image;
    private static Stage stage;
    private static VBox layout;
    private static Scene scene;
    private static Label access = new Label();
    private static Label username, password;
    private static TextField user;
    private static PasswordField pass;
    private static Button enter;

    public LoginScreen () throws IOException {
        stage = new Stage();
        layout = new VBox(15);
        username = new Label("Username");
        password = new Label("Password");
        user = new TextField();
        pass = new PasswordField();
        enter = new Button("Enter");

//        image = new Image(getClass().getResourceAsStream("icons8-customer-100.png"));
//        username.setGraphic(new ImageView(image));
        username.setMaxWidth(100);
        username.setMaxHeight(100);

        username.setTextAlignment(TextAlignment.LEFT);
        password.setTextAlignment(TextAlignment.LEFT);

        user.setText("");
        pass.setText("");

        layout.getChildren().addAll(username, password, user, pass);
        enter.setTextAlignment(TextAlignment.CENTER);
        layout.getChildren().add(enter);

        enter.setOnAction(e -> {
            if (user.getText().equals("daniel") ) {
                if (pass.getText().equals("daniel123")) {
                    new Menu();
                }

                else {
                    access.setText("Incorrect password");
                    GrantAccess();
                }
            }
            else {
                access.setText("The username does not exist");
            }
        });

        scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.setTitle("Bank of America");
        stage.show();
    }

    // TODO: Finish the implementation
    public static void GrantAccess () {
        scene = new Scene(layout, 300, 250);

    }
    @Override
    public void start(Stage stage) throws Exception {

    }
}
