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

import com.inti.entities.Chauffeur;
import com.inti.services.interfaces.IChauffeurService;

@RestController
public class ChauffeurController {
	
	@Autowired
	IChauffeurService chauffeurService;
	
	@GetMapping(value = "/chauffeur")
	public List<Chauffeur> findAll() {
		return chauffeurService.findAll();
	}
	
	@GetMapping(value = "/chauffeur/{id}")
	public Chauffeur findById(@PathVariable("id") int idChauffeur) {
		return chauffeurService.findById(idChauffeur);
	}
	
	@PostMapping(value = "/chauffeur")
	public void save(@RequestBody Chauffeur chauffeur) {
		chauffeurService.save(chauffeur);
	}
	
	@PutMapping(value = "/chauffeur/{id}")
	public void update(@PathVariable("id") int idChauffeur, @RequestBody Chauffeur chauffeur) {
		Chauffeur e = chauffeurService.findById(idChauffeur);
		e.setNom(e.getNom());
		e.setPrenom(e.getPrenom());
		e.setDateNaissance(e.getDateNaissance());
		e.setNumeroTelephone(e.getNumeroTelephone());
		e.setAdresseMail(e.getAdresseMail());
		e.setUsername(e.getUsername());
		e.setPassword(e.getPassword());
		chauffeurService.save(e);
	}
	
	@DeleteMapping(value = "/chauffeur/{id}")
	public void deleteById(@PathVariable("id") int idChauffeur) {
		chauffeurService.deleteById(idChauffeur);
	}

}
