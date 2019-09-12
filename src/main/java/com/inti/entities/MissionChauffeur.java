package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class MissionChauffeur {
	
	private int idMissionChauffeur;
	private Date dateMission;
	private Date horaireMission;
	
	@ManyToOne
	private Administrateur administrateur;
	
	public MissionChauffeur() {
		super();
	}

	public MissionChauffeur(Date dateMission, Date horaireMission) {
		super();
		this.dateMission = dateMission;
		this.horaireMission = horaireMission;
	}

	public Date getDateMission() {
		return dateMission;
	}

	public void setDateMission(Date dateMission) {
		this.dateMission = dateMission;
	}

	public Date getHoraireMission() {
		return horaireMission;
	}

	public void setHoraireMission(Date horaireMission) {
		this.horaireMission = horaireMission;
	}

	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

	public int getIdMissionChauffeur() {
		return idMissionChauffeur;
	}

	public void setIdMissionChauffeur(int idMissionChauffeur) {
		this.idMissionChauffeur = idMissionChauffeur;
	}
	
	@ManyToMany(mappedBy = "missionChauffeur")
	private List<MissionChauffeur> listMissionChauffeur = new ArrayList<MissionChauffeur> ();

}
