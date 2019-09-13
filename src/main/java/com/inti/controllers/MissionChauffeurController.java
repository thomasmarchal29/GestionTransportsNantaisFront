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

import com.inti.entities.MissionChauffeur;
import com.inti.services.interfaces.IMissionChauffeurService;

@RestController
public class MissionChauffeurController {
	
	@Autowired
	IMissionChauffeurService missionChauffeurService;
	
	@GetMapping(value = "/missionChauffeur")
	public List<MissionChauffeur> findAll() {
		return missionChauffeurService.findAll();
	}
	
	@GetMapping(value = "/missionChauffeur/{id}")
	public MissionChauffeur findById(@PathVariable("id") int idMissionChauffeur) {
		return missionChauffeurService.findById(idMissionChauffeur);
	}
	
	@PostMapping(value = "/missionChauffeur")
	public void save(@RequestBody MissionChauffeur missionChauffeur) {
		missionChauffeurService.save(missionChauffeur);
	}
	
	@PutMapping(value = "/missionChauffeur/{id}")
	public void update(@PathVariable("id") int idMissionChauffeur, @RequestBody MissionChauffeur missionChauffeur) {
		MissionChauffeur mc = missionChauffeurService.findById(idMissionChauffeur);
		mc.setDateMission(mc.getDateMission());
		mc.setHoraireMission(mc.getHoraireMission());
		missionChauffeurService.save(mc);
	}
	
	@DeleteMapping(value = "/missionChauffeur/{id}")
	public void deleteById(@PathVariable("id") int idMissionChauffeur) {
		missionChauffeurService.deleteById(idMissionChauffeur);
	}

}
