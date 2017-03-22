		package fr.walou.ProjectManager.Model;

public class Utilisateur 
{
	private int	idUtilisateur;
	private String	nom;
	private String	prenom;
	private String	mail;
	private String	region;
	private String	pseudo;
	private String	pwd;
	

	public Utilisateur(int idUtilisateur, String nom, String prenom, String mail, String region, String pseudo,
			String pwd) 
	{
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.region = region;
		this.pseudo = pseudo;
		this.pwd = pwd;
	}
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}	
}
