package fr.walou.ProjectManager.Controler;

import fr.walou.ProjectManager.View.FenMainPage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

public class MainPage 
{
	private Stage stage = new Stage();
	private Group root = new Group();
	private Scene scene = new Scene(root, 1200	, 900);
	FenMainPage fen = new FenMainPage();
	
	public MainPage()
	{
		
		root.getChildren().add(fen);
		stage.setScene(scene);
		stage.show();
	}
	
}
