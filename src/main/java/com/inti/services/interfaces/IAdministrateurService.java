package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Administrateur;

public interface IAdministrateurService {
	
	public List<Administrateur> findAll();
	public Administrateur findById(int idAdministrateur);
	public void save(Administrateur administrateur);
	public void deleteById(int idAdministrateur);

}
