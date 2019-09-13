package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Employe;

public interface IEmployeService {
	
	public List<Employe> findAll();
	public Employe findById(int idEmploye);
	public void save(Employe employe);
	public void deleteById(int idEmploye);

}
