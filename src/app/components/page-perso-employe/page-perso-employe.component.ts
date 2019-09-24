import { Component, OnInit } from '@angular/core';
import { MissionChauffeur } from 'src/models/missionChauffeur';
import { ServiceMissionChauffeurService } from 'src/services/service-mission-chauffeur.service';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { ServiceMaintenanceService } from 'src/services/service-maintenance.service';
import { Maintenance } from 'src/models/maintenance';

import { Location } from '@angular/common';

@Component({
  selector: 'app-page-perso-employe',
  templateUrl: './page-perso-employe.component.html',
  styleUrls: ['./page-perso-employe.component.css']
})
export class PagePersoEmployeComponent implements OnInit {

  missionChauffeurs: MissionChauffeur[];
  maintenances: Maintenance[];

  constructor(private route: ActivatedRoute, private missionChauffeurService: ServiceMissionChauffeurService,
              private maintenanceService: ServiceMaintenanceService, private location: Location, private router: Router) { }

  public findByIdEmployeMissionChauffeur(id: number): void {
    this.missionChauffeurService.findByIdEmployeMissionChauffeur(id).subscribe(
      (response) => {
        this.missionChauffeurs = response;
      });
  }

  public findByIdEmployeMaintenance(id: number): void {
    this.maintenanceService.findByIdEmployeMaintenance(id).subscribe(
      (response) => {
        this.maintenances = response;
      });
  }

  ngOnInit(): void {
    this.route.paramMap.subscribe((params: ParamMap) => {
      this.findByIdEmployeMissionChauffeur(parseInt(params.get('idEmploye'), 10));
      this.findByIdEmployeMaintenance(parseInt(params.get('idEmploye'), 10));
    });
  }

  goBackButtonPressed(): void {
    this.location.back();
  }

  goDemandeCongesPressed(): void {
    this.router.navigateByUrl('/demandeConges/:idEmploye');
  }

  goHome(): void {
    this.router.navigateByUrl('');
  }

}
