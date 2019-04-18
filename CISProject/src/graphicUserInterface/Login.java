package graphicUserInterface;

import businessLogicLayer.loginObject;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Login extends Application {

	GridPane grid;
	Scene scene;
	Label username;
	Label password;
	TextField usernameInput;
	PasswordField passwordInput;
	Button loginButton;
	Color color;
	Button SignUpButton;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	     
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	grid = new GridPane();
	grid.setAlignment(Pos.CENTER);
	
	username = new Label(" Username : ");
	GridPane.setConstraints(username, 0, 0);
	
	password = new Label(" Password : ");
	GridPane.setConstraints(password, 0, 1);
	
	usernameInput = new TextField();
	usernameInput.setPromptText(" Enter username "); // this will display gray line in the box
	GridPane.setConstraints(usernameInput, 1, 0);
	
	passwordInput = new PasswordField();
	passwordInput.setPromptText(" Enter Password ");
	GridPane.setConstraints(passwordInput, 1, 1);
	
	loginButton = new Button(" Login ");
	GridPane.setConstraints(loginButton,1, 2);
	
	SignUpButton = new Button(" Sign up ");
    GridPane.setConstraints(SignUpButton, 0, 2);
	
	grid.getChildren().addAll(username,usernameInput,password,passwordInput,loginButton,SignUpButton);
	
	
	scene = new Scene(grid, 500,500);
	
	
	primaryStage.setScene(scene);
	primaryStage.show();
	
	loginButton.setOnAction(e->{

		loginObject login = new loginObject(usernameInput.getText(),passwordInput.getText());
		
		if(login.executeLogin() == true) {
				try {
					MainMenu nextScreen = new MainMenu();
					nextScreen.start(primaryStage);
				} catch (Exception ex) {
						ex.printStackTrace();	
				}
			
		}});
	
	
	SignUpButton.setOnAction(e->{
		
		Registration reg = new Registration();
	
		try {
			reg.start(primaryStage);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	
	
	
	}
    
}