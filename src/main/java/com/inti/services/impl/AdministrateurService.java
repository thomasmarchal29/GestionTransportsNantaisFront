package com.inti.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.AdministrateurRepository;
import com.inti.services.interfaces.IAdministrateurService;

@Service
public class AdministrateurService implements IAdministrateurService {
	
	@Autowired
	AdministrateurRepository administrateurRepository;

}
