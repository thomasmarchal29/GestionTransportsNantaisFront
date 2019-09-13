package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends Employe {
	
	private String grade;
	
	public Administrateur() {
		super();
	}

	public Administrateur(String grade) {
		super();
		this.grade = grade;
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
