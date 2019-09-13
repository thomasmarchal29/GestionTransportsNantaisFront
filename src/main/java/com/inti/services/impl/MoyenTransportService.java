package com.inti.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.MoyenTransportRepository;
import com.inti.services.interfaces.IMoyenTransportService;

@Service
public class MoyenTransportService implements IMoyenTransportService {
	
	@Autowired
	MoyenTransportRepository moyenTransportRepository;

}
