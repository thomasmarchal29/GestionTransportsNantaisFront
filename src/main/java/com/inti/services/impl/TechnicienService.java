package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Technicien;
import com.inti.repositories.TechnicienRepository;
import com.inti.services.interfaces.ITechnicienService;

@Service
public class TechnicienService implements ITechnicienService {
	
	@Autowired
	TechnicienRepository technicienRepository;

	@Override
	public List<Technicien> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Technicien findById(int idTechnicien) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Technicien technicien) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int idTechnicien) {
		// TODO Auto-generated method stub
		
	}

}
