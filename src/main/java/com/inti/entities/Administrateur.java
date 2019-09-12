package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

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

	public int getIdAdministrateur() {
		return idAdministrateur;
	}

	public void setIdAdministrateur(int idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}

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
