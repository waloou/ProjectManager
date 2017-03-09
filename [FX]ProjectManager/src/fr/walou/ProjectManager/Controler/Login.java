package fr.walou.ProjectManager.Controler;

import fr.walou.ProjectManager.View.FenLogin;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Login 
{
	private Stage stage = new Stage();
	private Group root = new Group();
	private Scene scene = new Scene(root, 600, 500);
	private FenLogin login = new FenLogin();
	
	public Login()
	{
		gestionSplit();
		gestionButton();
		
		root.getChildren().add(login);	
		stage.setScene(scene);
		stage.show();
	}
	
	public void gestionButton()
	{
		login.getConnect().setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent arg0) {
				System.out.println("Faire une verif avec la base de donne");
				MainPage main = new MainPage();
			}
		});
	}
	
	public void gestionSplit()
	{
		login.getNewsPane().setPrefSize(scene.getWidth() * 40 / 100, scene.getHeight());
		login.getBanniere().setPrefSize(scene.getWidth(), scene.getHeight() * 25 / 100);
		
		scene.widthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				login.getNewsPane().setPrefHeight(scene.getHeight());
				login.getBanniere().setPrefWidth(scene.getWidth());
			}
		});
		
		scene.heightProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				login.getNewsPane().setPrefHeight(scene.getHeight());
				login.getBanniere().setPrefWidth(scene.getWidth());
			}
		});
	
	}
}
