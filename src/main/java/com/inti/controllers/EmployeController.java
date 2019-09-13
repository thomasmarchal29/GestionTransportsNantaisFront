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

import com.inti.entities.Employe;
import com.inti.services.interfaces.IEmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	IEmployeService employeService;
	
	@GetMapping(value = "/employe")
	public List<Employe> findAll() {
		return employeService.findAll();
	}
	
	@GetMapping(value = "/employe/{id}")
	public Employe findById(@PathVariable("id") int idEmploye) {
		return employeService.findById(idEmploye);
	}
	
	@PostMapping(value = "/employe")
	public void save(@RequestBody Employe employe) {
		employeService.save(employe);
	}
	
	@PutMapping(value = "/employe/{id}")
	public void update(@PathVariable("id") int idEmploye, @RequestBody Employe employe) {
		Employe e = employeService.findById(idEmploye);
		e.setNom(e.getNom());
		e.setPrenom(e.getPrenom());
		e.setDateNaissance(e.getDateNaissance());
		e.setNumeroTelephone(e.getNumeroTelephone());
		e.setAdresseMail(e.getAdresseMail());
		e.setUsername(e.getUsername());
		e.setPassword(e.getPassword());
		employeService.save(e);
	}
	
	@DeleteMapping(value = "/employe/{id}")
	public void deleteById(@PathVariable("id") int idEmploye) {
		employeService.deleteById(idEmploye);
	}

}
