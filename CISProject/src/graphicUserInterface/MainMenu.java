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
	Button bookFlight;
	
public static void main(String[] args) {
	launch(args);
}


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		
		
		grid.getChildren().addAll();
		
		
		scene = new Scene(grid, 600,600);
		primaryStage.setTitle("Main Menu");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}