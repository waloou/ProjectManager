package fr.walou.ProjectManager.View;

import javafx.scene.Parent;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.GridPane;

public class FenLogin extends Parent 
{
	SplitPane newsPane = new SplitPane();
	SplitPane banniere = new SplitPane();
	
	public FenLogin()
	{
		
		
		newsPane.setVisible(true);
		banniere.setVisible(true);
	
		
		GridPane grid = new GridPane();
		this.getChildren().add(banniere);
		this.getChildren().add(newsPane);
		
		System.out.println("fenetre login");
		
	}
	
	public SplitPane getNewsPane() {
		return newsPane;
	}

	public SplitPane getBanniere() {
		return banniere;
	}
	
	
}
