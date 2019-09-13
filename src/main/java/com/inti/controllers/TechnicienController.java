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

import com.inti.entities.Technicien;
import com.inti.services.interfaces.ITechnicienService;

@RestController
public class TechnicienController {
	
	@Autowired
	ITechnicienService technicienService;
	
	@GetMapping(value = "/technicien")
	public List<Technicien> findAll() {
		return technicienService.findAll();
	}
	
	@GetMapping(value = "/technicien/{id}")
	public Technicien findById(@PathVariable("id") int idTechnicien) {
		return technicienService.findById(idTechnicien);
	}
	
	@PostMapping(value = "/technicien")
	public void save(@RequestBody Technicien technicien) {
		technicienService.save(technicien);
	}
	
	@PutMapping(value = "/technicien/{id}")
	public void update(@PathVariable("id") int idTechnicien, @RequestBody Technicien technicien) {
		Technicien e = technicienService.findById(idTechnicien);
		e.setNom(e.getNom());
		e.setPrenom(e.getPrenom());
		e.setDateNaissance(e.getDateNaissance());
		e.setNumeroTelephone(e.getNumeroTelephone());
		e.setAdresseMail(e.getAdresseMail());
		e.setUsername(e.getUsername());
		e.setPassword(e.getPassword());
		technicienService.save(e);
	}
	
	@DeleteMapping(value = "/technicien/{id}")
	public void deleteById(@PathVariable("id") int idTechnicien) {
		technicienService.deleteById(idTechnicien);
	}

}
