package com.inti.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.TechnicienRepository;
import com.inti.services.interfaces.ITechnicienService;

@Service
public class TechnicienService implements ITechnicienService {
	
	@Autowired
	TechnicienRepository technicienRepository;

}
