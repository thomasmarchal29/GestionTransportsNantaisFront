package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("chauffeur")
public class Administrateur extends Employe {
	
	private int idAdministrateur;
	private String grade;
	
	public Administrateur() {
		super();
	}

	public Administrateur(String grade) {
		super();
		this.grade = grade;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdAdministrateur() {
		return idAdministrateur;
	}

	public void setIdAdministrateur(int idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}

	@Column
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@OneToMany(mappedBy = "administrateur")
	private List<MissionChauffeur> listMissionChauffeur = new ArrayList<MissionChauffeur> ();
	
	@OneToMany(mappedBy = "administrateur")
	private List<Maintenance> listMaintenance = new ArrayList<Maintenance> ();

}
