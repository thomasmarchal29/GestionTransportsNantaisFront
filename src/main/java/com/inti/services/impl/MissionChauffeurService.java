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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MissionChauffeur findById(int idMissionChauffeur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(MissionChauffeur missionChauffeur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int idMissionChauffeur) {
		// TODO Auto-generated method stub
		
	}

}
