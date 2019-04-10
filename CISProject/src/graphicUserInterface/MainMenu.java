package graphicUserInterface;

import businessLogicLayer.Account;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class MainMenu extends Application {

	Scene scene;
	GridPane grid;
	Label whatNext;
	Button bookFlight;
	
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		Label whatNext = new Label("What would you like to do next?");
		GridPane.setConstraints(whatNext,0,0);  
		
		Button bookFlight = new Button("Book A Flight");
		GridPane.setConstraints(bookFlight,1,1);
		
		
		grid.getChildren().addAll(whatNext,bookFlight);
		
		
		scene = new Scene(grid, 600,600);
		primaryStage.setTitle("Main Menu");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}