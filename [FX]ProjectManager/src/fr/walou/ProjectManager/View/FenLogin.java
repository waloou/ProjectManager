package fr.walou.ProjectManager.View;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.layout.GridPane;

public class FenLogin extends Parent 
{
	SplitPane	newsPane = new SplitPane();
	SplitPane	banniere = new SplitPane();
	GridPane	grid = new GridPane();
	TextField	login = new TextField();
	TextField	pwd = new TextField();
	Button		connect = new Button("Login");
	
	public FenLogin()
	{
		newsPane.setVisible(true);
		banniere.setVisible(true);

		grid.add(new Label("Login"), 0, 0);
		grid.add(new Label("Passeword"), 0, 1);
		grid.add(login, 1, 0);
		grid.add(pwd, 1, 1);
		grid.add(connect, 1, 2);
		
		grid.setHgap(10);
		grid.setVgap(5);
		grid.setLayoutX(300);
		grid.setLayoutY(200);
		
		
		this.getChildren().add(banniere);
		this.getChildren().add(newsPane);
		this.getChildren().add(grid);
	}
	
	public SplitPane getNewsPane() {
		return newsPane;
	}

	public SplitPane getBanniere() {
		return banniere;
	}	

	public GridPane getGrid() {
		return grid;
	}

	public TextField getLogin() {
		return login;
	}

	public TextField getPwd() {
		return pwd;
	}

	public Button getConnect() {
		return connect;
	}
	
	
}
