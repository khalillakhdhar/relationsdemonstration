package com.relations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Person extends BaseEntity {
	private String nom;
	private String prenom;
	@OneToOne(mappedBy = "person")
	private Adresse adresse;
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
	

}
