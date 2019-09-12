package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employe {
	
	private int idEmploye;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private int numeroTelephone;
	private String adresseMail;
	
	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, Date dateNaissance, int numeroTelephone, String adresseMail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numeroTelephone = numeroTelephone;
		this.adresseMail = adresseMail;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}

	@Column
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column
	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Column
	public int getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(int numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	@Column
	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	
	@OneToMany(mappedBy = "employe")
	private List<Conges> listConges = new ArrayList<Conges>();

}
