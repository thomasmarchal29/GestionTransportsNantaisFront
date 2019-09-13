package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.MissionChauffeur;
import com.inti.repositories.MissionChauffeurRepository;
import com.inti.services.interfaces.IMissionChauffeurService;

@Service
public class MissionChauffeurService implements IMissionChauffeurService {
	
	@Autowired
	MissionChauffeurRepository missionChauffeurRepository;

	@Override
	public List<MissionChauffeur> findAll() {
		return missionChauffeurRepository.findAll();
	}

	@Override
	public MissionChauffeur findById(int idMissionChauffeur) {
		return missionChauffeurRepository.findById(idMissionChauffeur).orElse(null);
	}
	
	@Override
	public void save(MissionChauffeur missionChauffeur) {
		missionChauffeurRepository.save(missionChauffeur);
	}

	@Override
	public void deleteById(int idMissionChauffeur) {
		missionChauffeurRepository.deleteById(idMissionChauffeur);
	}

}
