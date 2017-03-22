package fr.walou.ProjectManager.Model;

public class Project 
{
	private int	idProject;
	private String titre;
	private String path;
	
	public Project(int idProject, String titre, String path) 
	{
		this.idProject = idProject;
		this.titre = titre;
		this.path = path;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
