package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.MoyenTransport;
import com.inti.repositories.MoyenTransportRepository;
import com.inti.services.interfaces.IMoyenTransportService;

@Service
public class MoyenTransportService implements IMoyenTransportService {
	
	@Autowired
	MoyenTransportRepository moyenTransportRepository;

	@Override
	public List<MoyenTransport> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoyenTransport findById(int idMoyenTransport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(MoyenTransport moyenTransport) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int idMoyenTransport) {
		// TODO Auto-generated method stub
		
	}

}
