package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Chauffeur extends Employe {
	
	private int idChauffeur;
	private String habilitationTransport;
	private String permis;
	
	private MoyenTransport moyenTransport;
	private MissionChauffeur missionChauffeur;
	
	public Chauffeur() {
		super();
	}

	public Chauffeur(String habilitationTransport, String permis) {
		super();
		this.habilitationTransport = habilitationTransport;
		this.permis = permis;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdChauffeur() {
		return idChauffeur;
	}

	public void setIdChauffeur(int idChauffeur) {
		this.idChauffeur = idChauffeur;
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
	
	public MoyenTransport getMoyenTransport() {
		return moyenTransport;
	}

	public void setMoyenTransport(MoyenTransport moyenTransport) {
		this.moyenTransport = moyenTransport;
	}

	public MissionChauffeur getMissionChauffeur() {
		return missionChauffeur;
	}

	public void setMissionChauffeur(MissionChauffeur missionChauffeur) {
		this.missionChauffeur = missionChauffeur;
	}
	
	@ManyToMany
	@JoinTable(name = "", joinColumns = @JoinColumn(name = "idChauffeur"),
			inverseJoinColumns = @JoinColumn(name = "idMoyenTransport"))
	private List<MoyenTransport> listMoyenTransport = new ArrayList<MoyenTransport> ();

	@ManyToMany
	@JoinTable(name = "", joinColumns = @JoinColumn(name = "idChauffeur"),
			inverseJoinColumns = @JoinColumn(name = "idMissionChauffeur"))
	private List<MissionChauffeur> listMissionChauffeur = new ArrayList<MissionChauffeur> ();
	
}
