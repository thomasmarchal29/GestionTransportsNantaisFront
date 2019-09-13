package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class MissionChauffeur {
	
	private int idMissionChauffeur;
	private Date dateMission;
	private Date horaireMission;
	
	private Administrateur administrateur;
	
	public MissionChauffeur() {
		super();
	}

	public MissionChauffeur(Date dateMission, Date horaireMission) {
		super();
		this.dateMission = dateMission;
		this.horaireMission = horaireMission;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdMissionChauffeur() {
		return idMissionChauffeur;
	}

	public void setIdMissionChauffeur(int idMissionChauffeur) {
		this.idMissionChauffeur = idMissionChauffeur;
	}

	@Column
	public Date getDateMission() {
		return dateMission;
	}

	public void setDateMission(Date dateMission) {
		this.dateMission = dateMission;
	}

	@Column
	public Date getHoraireMission() {
		return horaireMission;
	}

	public void setHoraireMission(Date horaireMission) {
		this.horaireMission = horaireMission;
	}

	@ManyToOne
	@JoinColumn(name = "AdminResponsableAjout")
	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}
	
	@ManyToMany(mappedBy = "missionChauffeur")
	private List<MissionChauffeur> listMissionChauffeur = new ArrayList<MissionChauffeur> ();

}
