package com.relations.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class Adresse {
	@Id
	private long id;

private String ville;
private String pays;
@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
@MapsId
@JoinColumn(name = "id")
private Person person;

public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public String getPays() {
	return pays;
}
public void setPays(String pays) {
	this.pays = pays;
}




}
