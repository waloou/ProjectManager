package fr.walou.ProjectManager.Model;

public class Langage 
{
	private int		idLangage;
	private String	nomLangage;
	private boolean	objet;
	
	public Langage(int idLangage, String nomLangage, boolean objet) 
	{
		this.idLangage = idLangage;
		this.nomLangage = nomLangage;
		this.objet = objet;
	}

	public int getIdLangage() {
		return idLangage;
	}

	public void setIdLangage(int idLangage) {
		this.idLangage = idLangage;
	}

	public String getNomLangage() {
		return nomLangage;
	}

	public void setNomLangage(String nomLangage) {
		this.nomLangage = nomLangage;
	}

	public boolean isObjet() {
		return objet;
	}

	public void setObjet(boolean objet) {
		this.objet = objet;
	}
}
