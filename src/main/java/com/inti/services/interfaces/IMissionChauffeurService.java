package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.MissionChauffeur;

public interface IMissionChauffeurService {
	
	public List<MissionChauffeur> findAll();
	public MissionChauffeur findById(int idMissionChauffeur);
	public void save(MissionChauffeur missionChauffeur);
	public void deleteById(int idMissionChauffeur);

}
