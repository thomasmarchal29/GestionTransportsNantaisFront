package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("chauffeur")
public class Chauffeur extends Employe {
	
	private String habilitationMoyenTransport;
	private String permis;
	
	public Chauffeur() {
		super();
	}

	public Chauffeur(String habilitationMoyenTransport, String permis) {
		super();
		this.habilitationMoyenTransport = habilitationMoyenTransport;
		this.permis = permis;
	}

	@Column
	public String getHabilitationMoyenTransport() {
		return habilitationMoyenTransport;
	}

	public void setHabilitationMoyenTransport(String habilitationMoyenTransport) {
		this.habilitationMoyenTransport = habilitationMoyenTransport;
	}

	@Column
	public String getPermis() {
		return permis;
	}

	public void setPermis(String permis) {
		this.permis = permis;
	}
	
	@ManyToMany
	private List<MoyenTransport> listMoyenTransport = new ArrayList<MoyenTransport>();

	@ManyToMany
	private List<MissionChauffeur> listMissionChauffeur = new ArrayList<MissionChauffeur>();
	
}
