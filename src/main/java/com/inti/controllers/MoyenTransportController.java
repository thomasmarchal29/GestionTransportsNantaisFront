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

import com.inti.entities.MoyenTransport;
import com.inti.services.interfaces.IMoyenTransportService;

@RestController
public class MoyenTransportController {
	
	@Autowired
	IMoyenTransportService moyenTransportService;
	
	@GetMapping(value = "/moyenTransport")
	public List<MoyenTransport> findAll() {
		return moyenTransportService.findAll();
	}
	
	@GetMapping(value = "/moyenTransport/{id}")
	public MoyenTransport findById(@PathVariable("id") int idMoyenTransport) {
		return moyenTransportService.findById(idMoyenTransport);
	}
	
	@PostMapping(value = "/moyenTransport")
	public void save(@RequestBody MoyenTransport moyenTransport) {
		moyenTransportService.save(moyenTransport);
	}
	
	@PutMapping(value = "/moyenTransport/{id}")
	public void update(@PathVariable("id") int idMoyenTransport, @RequestBody MoyenTransport moyenTransport) {
		MoyenTransport mt = moyenTransportService.findById(idMoyenTransport);
		mt.setTypeMoyenTransport(mt.getTypeMoyenTransport());
		mt.setImmatriculation(mt.getImmatriculation());
		mt.setVetuste(mt.getVetuste());
		mt.setDateDerniereRevision(mt.getDateDerniereRevision());
		moyenTransportService.save(mt);
	}
	
	@DeleteMapping(value = "/moyenTransport/{id}")
	public void deleteById(@PathVariable("id") int idMoyenTransport) {
		moyenTransportService.deleteById(idMoyenTransport);
	}

}
