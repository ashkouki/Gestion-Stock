package com.ams.entities;

public class Etudiant {
	private  String nom;
	private int age;
	private String email;
	private String tel;
	private String adresse;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public Etudiant(String nom, int age, String email, String tel, String adresse) {
		this.nom = nom;
		this.age = age;
		this.email = email;
		this.tel = tel;
		this.adresse = adresse;
	}
	




}
