package graphicUserInterface;

import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  
import javafx.stage.Stage;

public class SplashScreen extends Application {

	@Override
	public void start(Stage stage) throws FileNotFoundException {
		// this next line will create the image.
		Image image = new Image(new FileInputStream("SplashScreen.jpg"));
		
		// setting image view
		ImageView imageView = new ImageView(image); 
		
		//Setting the postion of the image
		imageView.setX(50);
		imageView.setY(25);
		
		// setting the fit height and width of the image view\
		imageView.setFitHeight(445);
		imageView.setFitWidth(500);
		
		// setting the preserve ratio of the image view
		imageView.setPreserveRatio(true);
		
		// creating group object 
		Group root = new Group(imageView);
		
		// creating scene object
		Scene scene = new Scene(root, 600, 500);
		
		// Setting the tittle of the stage
		stage.setTitle("Loading Image");
		
		//Adding scene to stage
		stage.setScene(scene);
		
		stage.show();	
	}	
	public static void main(String args []) {
		launch(args);
	}
	
	

}
