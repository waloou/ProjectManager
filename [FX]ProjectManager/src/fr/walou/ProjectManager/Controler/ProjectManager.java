package fr.walou.ProjectManager.Controler;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class ProjectManager extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		Login login = new Login();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
