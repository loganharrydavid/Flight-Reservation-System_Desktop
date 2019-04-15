package graphicUserInterface;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.time.LocalDate;

public class flightSearch extends Application {

	Scene scene;
	GridPane grid;
	Label depatureCity;
	Label destinationCity;
	Label depatureDate;
	Label returnDate;
	Label passanger;
	Button searchButton;
	Button depatureButton;
	Button destinationButton;
	LocalDate ld;
	TextField passangerInput;
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		depatureCity = new Label(" From* ");
		GridPane.setConstraints(depatureCity,0,0);
		Button button1 = new Button(" From ");
		GridPane.setConstraints(depatureCity, 0, 2);
		
		ChoiceBox<String> choicebox = new ChoiceBox<>();
		GridPane.setConstraints(choicebox, 1, 2);

		
		// getitems returns observablelist object which you can add item to.
		choicebox.getItems().add(" Atlanta ");
		choicebox.getItems().add(" Winterfell ");
		choicebox.getItems().add(" Kings landings ");
		choicebox.getItems().add(" High Garden ");
		choicebox.getItems().add(" Sun Spear ");
		choicebox.getItems().add(" Summer Hall ");		
		destinationCity = new Label(" To* ");
		GridPane.setConstraints(destinationCity, 1, 3);
		
		
		ChoiceBox<String> choicebox1 = new ChoiceBox<>();
		GridPane.setConstraints(choicebox1, 2, 2);
		
		choicebox1.getItems().add(" Atlanta ");
		choicebox1.getItems().add(" Winterfell ");
		choicebox1.getItems().add(" Kings landings ");
		choicebox1.getItems().add(" High Garden ");
		choicebox1.getItems().add(" Sun Spear ");
		choicebox1.getItems().add(" Summer Hall ");
		
		
		depatureDate = new Label(" Depart Date ");
		GridPane.setConstraints(depatureDate, 1, 0);
		
		
		DatePicker dp = new DatePicker();
		dp.setOnAction(e -> { ld = dp.getValue();
		             System.out.println(" Date selected " + ld);
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(dp);
		GridPane.setConstraints(dp, 1, 1);
		
		
		returnDate = new Label(" Return Date ");
		GridPane.setConstraints(depatureDate, 2, 0);
		
		
		DatePicker dp1 = new DatePicker();
		dp.setOnAction(e -> { ld = dp.getValue();
		             System.out.println(" Date selected " + ld);
		});
		
		StackPane root1 = new StackPane();
		root.getChildren().add(dp1);
		GridPane.setConstraints(dp1, 2, 1);
		
		
		passanger = new Label(" Travelers* ");
		GridPane.setConstraints(passanger, 0, 3);
		passangerInput = new TextField();
		passangerInput.setPromptText(" number of Travelers ");
		GridPane.setConstraints(passangerInput, 1, 3);
		
	
		
		grid.getChildren().addAll( depatureCity, choicebox,destinationCity,choicebox1,dp,depatureDate,dp1,returnDate
				,passanger,passangerInput);

			
		scene = new Scene(grid, 600,600, Color.DARKBLUE);
		primaryStage.setTitle(" Book Flight ");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
