package fr.walou.ProjectManager.View;

import java.io.File;

import fr.walou.ProjectManager.Controler.Login;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class FenMainPage extends Parent 
{
	public FenMainPage()
	{
		TreeItem<String> root = gestionTreeView(".");
		
		TreeView<String> root1 = new  TreeView<String>(root);
		root1.setPrefSize(300, 500);
		
		this.getChildren().add(root1);
	}

	public TreeItem<String> gestionTreeView(String path)
	{
		File file = new File(path);
		TreeItem<String> root = null;
		if (path != ".")
			root = new TreeItem<String>(file.getName());
		else
			root = new TreeItem<String>("WorkSpace");
			

		File[] list = file.listFiles();
		
		TreeView<String> root1 = new  TreeView<String>(root);
		for(File l : list)
		{
			if (l.isDirectory() == false)
			{
				root.getChildren().add(new TreeItem<>(l.getName()));
			}
			else
				root.getChildren().add(gestionTreeView(l.getAbsolutePath()));

		}
		
		root.setExpanded(true);
		
		return root;
		
		
	}

}
