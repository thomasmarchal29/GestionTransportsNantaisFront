package com.inti.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.inti.services.interfaces.IMissionChauffeurService;

@RestController
public class MissionChauffeurController {
	
	@Autowired
	IMissionChauffeurService missionChauffeurService;

}
