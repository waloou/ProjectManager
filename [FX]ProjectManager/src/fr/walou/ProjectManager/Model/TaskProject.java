package fr.walou.ProjectManager.Model;

public class TaskProject 
{
	private int idTaskProject;
	private String taskTitre;
	private String taskCommentaire;
	
	public TaskProject(int idTaskProject, String taskTitre, String taskCommentaire) 
	{
		this.idTaskProject = idTaskProject;
		this.taskTitre = taskTitre;
		this.taskCommentaire = taskCommentaire;
	}

	public int getIdTaskProject() {
		return idTaskProject;
	}

	public void setIdTaskProject(int idTaskProject) {
		this.idTaskProject = idTaskProject;
	}

	public String getTaskTitre() {
		return taskTitre;
	}

	public void setTaskTitre(String taskTitre) {
		this.taskTitre = taskTitre;
	}

	public String getTaskCommentaire() {
		return taskCommentaire;
	}

	public void setTaskCommentaire(String taskCommentaire) {
		this.taskCommentaire = taskCommentaire;
	}
}
