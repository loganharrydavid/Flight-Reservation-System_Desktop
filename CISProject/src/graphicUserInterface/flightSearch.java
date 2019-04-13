package graphicUserInterface;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
		
		ChoiceBox<String> choicebox = new ChoiceBox<>();
		
		// getitems returns observablelist object which you can add item to.
		choicebox.getItems().add(" Atlanta ");
		choicebox.getItems().add(" Winterfell ");
		choicebox.getItems().add(" Kings landings ");
		choicebox.getItems().add(" High Garden ");
		
		grid.getChildren().addAll( depatureCity, choicebox);

			
		scene = new Scene(grid, 600,600);
		primaryStage.setTitle(" Book Flight ");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
