package graphicUserInterface;

import businessLogicLayer.Account;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

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
	Label confirmPasswords;
	Label SSN;
	Label SecurityQuestion;
	TextField firstNameInput;
	TextField lastNameInput;
	TextField addressInput;
	TextField zipCodeInput;
	TextField stateInput;
	TextField userNameInput;
	TextField emailInput;
	TextField passwordInput;
	TextField confirmPasswordInput;
	TextField SSNInput;
	TextField SecurityQuestionInput;
	Button submitButton;

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		

		grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		// First name
		firstName = new Label("First Name:");
		GridPane.setConstraints(firstName, 0, 0);
		firstNameInput = new TextField();
		firstNameInput.setPromptText(" Enter First Name ");
		GridPane.setConstraints(firstNameInput, 0, 1);
		
		// Last Name
		lastName = new Label("Last Name:");
		GridPane.setConstraints(lastName, 0, 2);
		lastNameInput = new TextField();
		lastNameInput.setPromptText(" Enter Last Name ");
		GridPane.setConstraints(lastNameInput, 0, 3);
		
		// Address
		address = new Label(" Address: ");
		GridPane.setConstraints(address, 0, 4);
		addressInput = new TextField();
		addressInput.setPromptText(" Enter the Address ");
		GridPane.setConstraints(addressInput, 0, 5);
		
		// State
		state = new Label(" State: ");
		GridPane.setConstraints(state, 0, 6);
		stateInput= new TextField();
		stateInput.setPromptText(" Enter the State ");
		GridPane.setConstraints(stateInput, 0, 7);
				
		// Zip Code
		zipCode = new Label(" Zip Code: ");
		GridPane.setConstraints(zipCode, 0, 8);
		zipCodeInput = new TextField();
		zipCodeInput.setPromptText(" Enter Zip Code ");
		GridPane.setConstraints(zipCodeInput, 0, 9);
	
		// UserName
		username = new Label("Enter Username:");
		GridPane.setConstraints(username, 1, 0);
		userNameInput = new TextField();
		userNameInput.setPromptText(" Enter Username ");
		GridPane.setConstraints(userNameInput, 1, 1);
		
		//Passwords
		passwords = new Label(" Password: ");
		GridPane.setConstraints(passwords, 1, 2);
		passwordInput = new TextField();
		passwordInput.setPromptText("Enter you passwords ");
		GridPane.setConstraints(passwordInput,1, 3);
		
		//Confirm Passwords
		confirmPasswords = new Label(" Confrim Passwords: ");
		GridPane.setConstraints(confirmPasswords, 1, 4);
		confirmPasswordInput = new TextField();
		confirmPasswordInput.setPromptText(" Enter Confirm Password ");
		GridPane.setConstraints(confirmPasswordInput, 1, 5);
		
		// SSN
		SSN = new Label(" Soical sercurity number: ");
		GridPane.setConstraints(SSN, 1, 6);
		SSNInput = new TextField();
		SSNInput.setPromptText(" Enter SSN ");
		GridPane.setConstraints(SSNInput, 1, 7 );
		
		// Security Question 
		SecurityQuestion = new Label (" Sequrity Question ");
		GridPane.setConstraints(SecurityQuestion,1, 8);
		SecurityQuestionInput = new TextField();
		SecurityQuestionInput.setPromptText(" Favorite vication place ");
		GridPane.setConstraints(SecurityQuestionInput, 1, 9);
		
		submitButton = new Button(" Submit Registration ");
	    GridPane.setConstraints(submitButton, 0, 2);
		
		
		grid.getChildren().addAll(firstName, firstNameInput, lastName, lastNameInput, address,
				                  addressInput, zipCode, zipCodeInput
				                  ,state, stateInput,username, userNameInput, 
				                  passwords, passwordInput, confirmPasswords, 
				                  confirmPasswordInput, SSN, SSNInput,
				                  SecurityQuestion, SecurityQuestionInput,submitButton);
		
		
		
		scene = new Scene(grid, 600,600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		submitButton.setOnAction(e->{
			Account acct = new Account(firstNameInput);
			//Here we will call instance of a new javaFX class that displays "Thank you for registering"
			//And whatever the next options are, like BOOK FLIGHT, or LOOK UP FLIGHT
			try {
				reg.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
	
	}
	
	

}
