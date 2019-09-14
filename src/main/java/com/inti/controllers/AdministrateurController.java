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

import com.inti.entities.Administrateur;
import com.inti.services.interfaces.IAdministrateurService;

@RestController
public class AdministrateurController {
	
	@Autowired
	IAdministrateurService administrateurService;
	
	@GetMapping(value = "/administrateur")
	public List<Administrateur> findAll() {
		return administrateurService.findAll();
	}
	
	@GetMapping(value = "/administrateur/{id}")
	public Administrateur findById(@PathVariable("id") int idAdministrateur) {
		return administrateurService.findById(idAdministrateur);
	}
	
	@PostMapping(value = "/administrateur")
	public void save(@RequestBody Administrateur administrateur) {
		administrateurService.save(administrateur);
	}
	
	@PutMapping(value = "/administrateur/{id}")
	public void update(@PathVariable("id") int idAdministrateur, @RequestBody Administrateur administrateur) {
		Administrateur a = administrateurService.findById(idAdministrateur);
		a.setNom(a.getNom());
		a.setPrenom(a.getPrenom());
		a.setDateNaissance(a.getDateNaissance());
		a.setNumeroTelephone(a.getNumeroTelephone());
		a.setAdresseMail(a.getAdresseMail());
		a.setUsername(a.getUsername());
		a.setPassword(a.getPassword());
		a.setGrade(a.getGrade());
		administrateurService.save(a);
	}
	
	@DeleteMapping(value = "/administrateur/{id}")
	public void deleteById(@PathVariable("id") int idAdministrateur) {
		administrateurService.deleteById(idAdministrateur);
	}

}
