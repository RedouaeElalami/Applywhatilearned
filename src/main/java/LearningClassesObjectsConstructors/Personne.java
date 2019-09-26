package LearningClassesObjectsConstructors;

import java.time.LocalDate;

public class Personne
{
	private int age;
	private String prenom;
	private String nom;
	private String adress;
	private LocalDate birthday;

	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	public Personne(int age, String prenom, String nom, String adress, LocalDate birthday) {
		this.age = age;
		this.prenom = prenom;
		this.nom = nom;
		this.adress = adress;
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
