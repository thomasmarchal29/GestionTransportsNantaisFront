package com.inti.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.ChauffeurRepository;
import com.inti.services.interfaces.IChauffeurService;

@Service
public class ChauffeurService implements IChauffeurService {
	
	@Autowired
	ChauffeurRepository chauffeurRepository;

}
