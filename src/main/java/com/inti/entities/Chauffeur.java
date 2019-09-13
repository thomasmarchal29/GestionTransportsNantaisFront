package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("chauffeur")
public class Chauffeur extends Employe {
	
	private String habilitationTransport;
	private String permis;
	
	public Chauffeur() {
		super();
	}

	public Chauffeur(String habilitationTransport, String permis) {
		super();
		this.habilitationTransport = habilitationTransport;
		this.permis = permis;
	}

	@Column
	public String getHabilitationTransport() {
		return habilitationTransport;
	}

	public void setHabilitationTransport(String habilitationTransport) {
		this.habilitationTransport = habilitationTransport;
	}

	@Column
	public String getPermis() {
		return permis;
	}

	public void setPermis(String permis) {
		this.permis = permis;
	}
	
	@ManyToMany
	@JoinTable(name = "ChauffeurMoyenTransport", joinColumns = @JoinColumn(name = "idChauffeur"),
			inverseJoinColumns = @JoinColumn(name = "idMoyenTransport"))
	private List<MoyenTransport> listMoyenTransport = new ArrayList<MoyenTransport> ();

	@ManyToMany
	@JoinTable(name = "ChauffeurMissionChauffeur", joinColumns = @JoinColumn(name = "idChauffeur"),
			inverseJoinColumns = @JoinColumn(name = "idMissionChauffeur"))
	private List<MissionChauffeur> listMissionChauffeur = new ArrayList<MissionChauffeur> ();
	
}
