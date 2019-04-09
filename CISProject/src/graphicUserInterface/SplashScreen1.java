package graphicUserInterface;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx .scene.layout.StackPane;
import javafx.stage.Stage;


/*when we click on the item we want some sort of action which
 * are the events to do so we have to implement event handler. 
 *
 */
public class SplashScreen1 extends Application  {

	Button button;// we create the new button object.
	
	public static void main(String[] args) {
		launch(args); 
		// we call this method from application to make your code into javafx.
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle(" Title of the window ");
		//now we label the window on the top right corner of the window.
		 
		button = new Button(); // now we indicate this new button
		button.setText(" Click Here ");
		// now we got button but we need the layout to show that button
		button.setOnAction(e -> {
			
		System.out.println(" Welcome to J.J airline "); 
		System.out.println(" Lets explore the World !!");});
		// we will use lambda expression instead of implement the handler method.
		// you can write multiple lines of codes using lambda.
		StackPane layout = new StackPane();
		//to position the layout
		layout.getChildren().add(button);
		// now we got stages so we have to create the scenes.
		
		Scene scene = new Scene( layout, 300, 240);
		primaryStage.setScene(scene);
		// now we have set the scene.
		primaryStage.show();
		//which display the GUI.
		
		
	}

	
		
	}


