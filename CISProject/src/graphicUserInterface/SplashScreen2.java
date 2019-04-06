package graphicUserInterface;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class SplashScreen2 extends Application {
	
// as for next step we will rename the stage window.
	Stage window;
	Scene scene1, scene2, scene3;

	public static void main (String[] args) {
		launch(args); // its call launch method from application class make your class javafx
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;// now we name the stage as window

		Label label1 = new Label(" Welcome to the first place ");// its the chuck of text appear on the window
		// next we will create button to switch the scenes
		Button button1 = new Button();
		button1.setText(" login ");
		
		button1.setOnAction(e -> window.setScene(scene2));
		
		// we use lambda to switch from on scene to another scene
		
		// layout 1 = children are laid out in vertical column;
		VBox layout1 = new VBox(20); // <- you can also passing the vlaue.
		// we use VBox layout to stack all the objects top on each others.
		layout1.getChildren().addAll(label1,button1);
		// we have multiple stuff to add so we will do add all.
		Scene scene1 = new Scene(layout1, 700, 700);// we created the scene.
		
		// button 2 for the second scene.
		Button button2 = new Button(" User name Enter ");
		button2.setOnAction(e -> window.setScene(scene1));
		// layout2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene (layout2, 600, 600);
		
		window.setScene(scene1);
		window.setTitle(" Welcome !");
		window.show();
		
	}
	

}
