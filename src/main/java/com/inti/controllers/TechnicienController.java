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
		Technicien t = technicienService.findById(idTechnicien);
		t.setNom(t.getNom());
		t.setPrenom(t.getPrenom());
		t.setDateNaissance(t.getDateNaissance());
		t.setNumeroTelephone(t.getNumeroTelephone());
		t.setAdresseMail(t.getAdresseMail());
		t.setUsername(t.getUsername());
		t.setPassword(t.getPassword());
		t.setDiplome(t.getDiplome());
		t.setHabilitationTechnique(t.getHabilitationTechnique());
		technicienService.save(t);
	}
	
	@DeleteMapping(value = "/technicien/{id}")
	public void deleteById(@PathVariable("id") int idTechnicien) {
		technicienService.deleteById(idTechnicien);
	}

}
