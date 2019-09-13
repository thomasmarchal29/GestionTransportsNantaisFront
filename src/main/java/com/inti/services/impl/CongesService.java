package com.inti.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.CongesRepository;
import com.inti.services.interfaces.ICongesService;

@Service
public class CongesService implements ICongesService {
	
	@Autowired
	CongesRepository congesRepository;

}
