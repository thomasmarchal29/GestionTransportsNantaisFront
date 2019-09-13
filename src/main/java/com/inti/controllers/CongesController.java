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

import com.inti.entities.Conges;
import com.inti.services.interfaces.ICongesService;

@RestController
public class CongesController {
	
	@Autowired
	ICongesService congesService;
	
	@GetMapping(value = "/conges")
	public List<Conges> findAll() {
		return congesService.findAll();
	}
	
	@GetMapping(value = "/conges/{id}")
	public Conges findById(@PathVariable("id") int idConges) {
		return congesService.findById(idConges);
	}
	
	@PostMapping(value = "/conges")
	public void save(@RequestBody Conges conges) {
		congesService.save(conges);
	}
	
	@PutMapping(value = "/conges/{id}")
	public void update(@PathVariable("id") int idConges, @RequestBody Conges conges) {
		Conges c = congesService.findById(idConges);
		c.setDateDebut(c.getDateDebut());
		c.setDateFin(c.getDateFin());
		c.setEtatConges(c.getEtatConges());
		congesService.save(c);
	}
	
	@DeleteMapping(value = "/conges/{id}")
	public void deleteById(@PathVariable("id") int idConges) {
		congesService.deleteById(idConges);
	}

}
