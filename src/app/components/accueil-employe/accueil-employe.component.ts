import { Component, OnInit } from '@angular/core';
import { Maintenance } from 'src/models/maintenance';
import { MissionChauffeur } from 'src/models/missionChauffeur';
import { Router } from '@angular/router';
import { ServiceMaintenanceService } from 'src/services/service-maintenance.service';
import { ServiceMissionChauffeurService } from 'src/services/service-mission-chauffeur.service';

import { Location } from '@angular/common';

@Component({
  selector: 'app-accueil-employe',
  templateUrl: './accueil-employe.component.html',
  styleUrls: ['./accueil-employe.component.css']
})
export class AccueilEmployeComponent implements OnInit {

  maintenances: Maintenance[];
  missionChauffeurs: MissionChauffeur[];

  constructor(private router: Router, private maintenanceService: ServiceMaintenanceService,
              private missionChauffeurService: ServiceMissionChauffeurService, private location: Location) {
    this.findAllMaintenance();
    this.findAllMissionChauffeur();
  }

  public findAllMaintenance(): void {
    this.maintenanceService.findAllMaintenance().subscribe((response) => {
      this.maintenances = response;
    });
  }

  public findAllMissionChauffeur(): void {
    this.missionChauffeurService.findAllMissionChauffeur().subscribe((response) => {
      this.missionChauffeurs = response;
    });
  }

  ngOnInit() {
  }

  goBackButtonPressed(): void {
    this.location.back();
  }

  goPagePersoEmployePressed(): void {
    this.router.navigateByUrl('pagePersoEmploye/:idEmploye');
  }

  goHome(): void {
    this.router.navigateByUrl('');
  }

}
