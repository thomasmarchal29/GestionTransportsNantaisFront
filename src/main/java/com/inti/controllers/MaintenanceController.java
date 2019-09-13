package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Maintenance;
import com.inti.services.interfaces.IMaintenanceService;

@RestController
public class MaintenanceController {
	
	@Autowired
	IMaintenanceService maintenanceService;
	
	@GetMapping(value = "/maintenance")
	public List<Maintenance> findAll() {
		return maintenanceService.findAll();
	}
	
	@GetMapping(value = "/maintenance/{id}")
	public Maintenance findById(@PathVariable("id") int idMaintenance) {
		return maintenanceService.findById(idMaintenance);
	}
	
	@PostMapping(value = "/maintenance")
	public void save(@RequestBody Maintenance maintenance) {
		maintenanceService.save(maintenance);
	}
	
	@PutMapping(value = "/maintenance/{id}")
	public void update(@PathVariable("id") int idMaintenance, @RequestBody Maintenance maintenance) {
		Maintenance m = maintenanceService.findById(idMaintenance);
		m.setDateMaintenance(m.getDateMaintenance());
		maintenanceService.save(m);
	}
	
	@DeleteMapping(value = "/maintenance/{id}")
	public void deleteById(@PathVariable("id") int idMaintenance) {
		maintenanceService.deleteById(idMaintenance);
	}

}
