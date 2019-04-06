package graphicUserInterface;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Registration extends Application {
	
	Scene scene;
	GridPane grid;
	Label firstName;
	Label lastName;
	Label address;
	Label zipCode;
	Label state;
	Label username;
	Label email;
	Label passwords;
	Label SSN;
	Label SequrityQuestion;
	TextField firstNameInput;
	TextField lastNameInput;
	TextField addressInput;
	TextField zipCodeInput;
	TextField stateInput;
	TextField userNameInput;
	TextField emailInput;
	PasswordField passwordInput;
	TextField SSNInput;
	TextField SequrityQuestionZInput;

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		

		grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		firstName = new Label("First Name:");
		GridPane.setConstraints(firstName, 0, 0);
		
		firstNameInput = new TextField();
		firstNameInput.setPromptText(" Enter First Name ");
		GridPane.setConstraints(firstNameInput, 0, 1);
		
		lastName = new Label("Last Name:");
		GridPane.setConstraints(lastName, 0, 2);
		
		lastNameInput = new TextField();
		lastNameInput.setPromptText(" Enter Last Name ");
		GridPane.setConstraints(lastNameInput, 0, 3);
		
		address = new Label(" Address ");
		GridPane.setConstraints(address, 0, 4);
	    
		addressInput = new TextField();
		addressInput.setPromptText(" Enter Last Name ");
		GridPane.setConstraints(addressInput, 0, 5);
		
		
		
		grid.getChildren().addAll(firstName, firstNameInput, lastName, lastNameInput, address, addressInput );
		
		
		
		scene = new Scene(grid, 500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	
	}
	
	

}
