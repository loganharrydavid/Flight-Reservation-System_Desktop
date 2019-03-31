package graphicUserInterface;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class helloWorldWindow extends Application{
	
	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        Label label = new Label("Welcome to Flight Booker Pro");
	        label.setAlignment(Pos.CENTER);
	        primaryStage.setScene(new Scene(label, 300, 250));
	        primaryStage.setTitle("Flight Booker Pro");
	        primaryStage.show();
	    }
	    public static void main(String[] args){
	    	launch(args);
	    
	    }
	}


