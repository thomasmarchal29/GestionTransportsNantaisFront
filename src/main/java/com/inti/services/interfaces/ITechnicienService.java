package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Technicien;

public interface ITechnicienService {
	
	public List<Technicien> findAll();
	public Technicien findById(int idTechnicien);
	public void save(Technicien technicien);
	public void deleteById(int idTechnicien);

}
