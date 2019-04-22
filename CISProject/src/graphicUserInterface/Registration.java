package graphicUserInterface;

import businessLogicLayer.Account.*;
import businessLogicLayer.Account;
import databaseInterfaceLayer.LoginDBO;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
	Label city;
	Label username;
	Label email;
	Label passwords;
	Label confirmPasswords;
	Label SSN;
	Label SecurityQuestion;
	Label SecurityAnswer;
	TextField firstNameInput;
	TextField lastNameInput;
	TextField addressInput;
	TextField zipCodeInput;
	TextField stateInput;
	TextField cityInput;
	TextField userNameInput;
	TextField emailInput;
	PasswordField passwordInput;
	PasswordField confirmPasswordInput;
	TextField SSNInput;
	TextField SecurityQuestionInput;
	TextField SecurityAnswerInput;
	Button submitButton;
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		

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
		GridPane.setConstraints(zipCode, 0, 10);
		zipCodeInput = new TextField();
		zipCodeInput.setPromptText(" Enter Zip Code ");
		GridPane.setConstraints(zipCodeInput, 0, 11);
	
		// UserName
		username = new Label("Enter Username:");
		GridPane.setConstraints(username, 1, 0);
		userNameInput = new TextField();
		userNameInput.setPromptText(" Enter Username ");
		GridPane.setConstraints(userNameInput, 1, 1);
		
		//Passwords
		passwords = new Label(" Password: ");
		GridPane.setConstraints(passwords, 1, 2);
		passwordInput = new PasswordField();
		passwordInput.setPromptText("Enter you passwords ");
		GridPane.setConstraints(passwordInput,1, 3);
		
		//Confirm Passwords
		confirmPasswords = new Label(" Confrim Passwords: ");
		GridPane.setConstraints(confirmPasswords, 1, 4);
		confirmPasswordInput = new PasswordField();
		confirmPasswordInput.setPromptText(" EnterConfirm Password ");
		GridPane.setConstraints(confirmPasswordInput, 1, 5);
		
		//Email
		email = new Label("Email: ");
		GridPane.setConstraints(email, 2, 0);
		emailInput = new TextField();
		emailInput.setPromptText("Enter Email Address: ");
		GridPane.setConstraints(emailInput, 2, 1);
		
		// SSN
		SSN = new Label(" Soical security number: ");
		GridPane.setConstraints(SSN, 1, 6);
		SSNInput = new TextField();
		SSNInput.setPromptText(" Enter SSN ");
		GridPane.setConstraints(SSNInput, 1, 7 );
		
		// Security Question 
		SecurityQuestion = new Label (" Security Question ");
		GridPane.setConstraints(SecurityQuestion,1, 8);
		SecurityQuestionInput = new TextField();
		SecurityQuestionInput.setPromptText(" Favorite vication place ");
		GridPane.setConstraints(SecurityQuestionInput, 1, 9);
		
		SecurityAnswer = new Label (" Security Answer ");
		GridPane.setConstraints(SecurityAnswer,1, 10);
		SecurityAnswerInput = new TextField();
		SecurityAnswerInput.setPromptText(" Answer ");
		GridPane.setConstraints(SecurityAnswerInput, 1, 11);
		
		city = new Label("City:");
		GridPane.setConstraints(city, 0, 8);
		cityInput = new TextField();
		cityInput.setPromptText(" Enter City: ");
		GridPane.setConstraints(cityInput, 0, 9);
		
		
		submitButton = new Button(" Submit Registration ");
	    GridPane.setConstraints(submitButton, 0, 12);
		//Need to add Security Answer
		
		grid.getChildren().addAll(firstName, firstNameInput, lastName, lastNameInput, address,
				                 addressInput, zipCode, zipCodeInput,email,emailInput
				                  ,state, stateInput,username, userNameInput, 
				                  passwords, passwordInput, confirmPasswords, 
				                  confirmPasswordInput, SSN, SSNInput,
				                  SecurityQuestion, SecurityQuestionInput,SecurityAnswer,
				                  SecurityAnswerInput,submitButton,city,cityInput);
		
		
		
		scene = new Scene(grid, 600,600);
		primaryStage.setTitle("Registration");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		submitButton.setOnAction(e->{
			
		try {
				Account.generateAccount(firstNameInput.getText(),lastNameInput.getText(),addressInput.getText(),
				emailInput.getText(),stateInput.getText(),cityInput.getText(),Integer.parseInt(zipCodeInput.getText()),
				Integer.parseInt(SSNInput.getText()), userNameInput.getText(), passwordInput.getText(), 
				SecurityQuestionInput.getText(),SecurityAnswerInput.getText());
				
				MainMenu mainMenu = new MainMenu();
				 
				 try {
					 mainMenu.start(primaryStage);
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
				
			
		}catch(Exception ex) {
			System.out.println("An account with this email address already exists");
		}
			
			

		});
		
		
	
	}
}

	
