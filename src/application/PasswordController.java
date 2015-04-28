import java.awt.Label;
import java.awt.event.ActionEvent;


import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class PasswordController {
	

public pass == String("bugaboo");
	
pass.setOnAction( new EventHandler<ActionEvent>()){
	public void handle(ActionEvent a){
		if (pass.getText()== "bugaboo"){
			Label message;
			message.setText("password correct");
		} else {
			Label message;
			message.setText("password is incorrect");
		}
	}
	
		
}
