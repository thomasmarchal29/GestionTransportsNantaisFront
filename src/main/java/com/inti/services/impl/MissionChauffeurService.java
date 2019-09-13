package com.inti.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.MissionChauffeurRepository;
import com.inti.services.interfaces.IMissionChauffeurService;

@Service
public class MissionChauffeurService implements IMissionChauffeurService {
	
	@Autowired
	MissionChauffeurRepository missionChauffeurRepository;

}
