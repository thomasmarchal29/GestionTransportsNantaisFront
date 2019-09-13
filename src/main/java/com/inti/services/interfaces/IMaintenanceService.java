package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Maintenance;

public interface IMaintenanceService {
	
	public List<Maintenance> findAll();
	public Maintenance findById(int idMaintenance);
	public void save(Maintenance maintenance);
	public void deleteById(int idMaintenance);

}
