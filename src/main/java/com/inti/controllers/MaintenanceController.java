package com.inti.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.inti.services.interfaces.IMaintenanceService;

@RestController
public class MaintenanceController {
	
	@Autowired
	IMaintenanceService maintenanceService;

}
