package graphicUserInterface;

import businessLogicLayer.Flight;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FlightTable extends Application {
	
	Stage window;
	TableView<Flight> table;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 window = primaryStage;
		 window.setTitle(" Availiable Flights ");
		 
		 // Name colloum
		 TableColumn<Flight, String> nameColumn = new TableColumn<>(" Destination ");
		 nameColumn.setMinWidth(200);
		 nameColumn.setCellValueFactory(new PropertyValueFactory<>(" name "));
		 
		 //Price column
	     TableColumn<Flight, Double> priceColumn = new TableColumn<>(" Price ");
	     priceColumn.setMinWidth(100);
	     priceColumn.setCellValueFactory(new PropertyValueFactory<>(" price "));
	     
	     // Quantity column
	     TableColumn<Flight, String>quantityColumn = new TableColumn<>(" Quantity ");
	     quantityColumn.setMaxWidth(100);
	     quantityColumn.setCellValueFactory(new PropertyValueFactory<>(" quantity "));
	     
	     table = new TableView<>();
	     table.setItems(getFlight());
	     table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
	     
	     VBox vBox = new VBox();
	     vBox.getChildren().addAll(table);
	     
	     Scene scene = new Scene(vBox);
	     window.setScene(scene);
	     window.show();
	     
	}
	// Get all of the products
	 public ObservableList<Flight> getProduct(){
	        ObservableList<Flight> products = FXCollections.observableArrayList();
	        products.add(new Flight("Laptop", 859.00, 20));
	        products.add(new Flight("Bouncy Ball", 2.49, 198));
	        products.add(new Flight("Toilet", 99.00, 74));
	        products.add(new Flight("The Notebook DVD", 19.99, 12));
	        products.add(new Flight("Corn", 1.49, 856));
	        return products;
	    }
	

}
