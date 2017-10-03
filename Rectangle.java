//*Author: Patrick Nguyen
//Purpose: CSC200
//Liscense: Public


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
	
	//Creates JFX height input 
	TextInputDialog heightDialog = new TextInputDialog();
	heightDialog.setTitle("Height");
	heightDialog.setContentText("Enter the Height of your Rectangle");
	Optional<String> Height = heightDialog.showAndWait();
	//creates JFX width input 
	TextInputDialog widthDialog = new TextInputDialog();
	widthDialog.setTitle("Width");
	widthDialog.setContentText("Enter the Width of you Rectangle");
	Optional<String> Width = widthDialog.showAndWait();
	
	//takes input values 
	int heightVar = Integer.parseInt(Height.get());
	int widthVar = Integer.parseInt(Width.get());
	//Math for perimeter and area
	int perim = (heightVar*2) + (widthVar*2);
	int area = (heightVar*widthVar);
	
	//Creates JFX Output 
	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setTitle("Rectagle Perimeter and Area");
	alert.setContentText("The Perimeter of your Rectangle is " + perim + " and the area is " + area);
	alert.show();
	}
}
