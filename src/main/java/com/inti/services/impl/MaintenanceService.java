package com.inti.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.MaintenanceRepository;
import com.inti.services.interfaces.IMaintenanceService;

@Service
public class MaintenanceService implements IMaintenanceService {
	
	@Autowired
	MaintenanceRepository maintenanceRepository;

}
