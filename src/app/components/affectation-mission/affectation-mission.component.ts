import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Maintenance } from 'src/models/maintenance';
import { MissionChauffeur } from 'src/models/missionChauffeur';
import { ServiceMissionChauffeurService } from 'src/services/service-mission-chauffeur.service';
import { ServiceMaintenanceService } from 'src/services/service-maintenance.service';

import { Location } from '@angular/common';
import { ServiceChauffeurService } from 'src/services/service-chauffeur.service';
import { ServiceTechnicienService } from 'src/services/service-technicien.service';
import { ServiceMoyenTransportService } from 'src/services/service-moyen-transport.service';
import { Chauffeur } from 'src/models/chauffeur';
import { MoyenTransport } from 'src/models/moyenTransport';
import { Technicien } from 'src/models/technicien';
import { LigneNantes } from '../../../models/ligneNantes.enum';

@Component({
  selector: 'app-affectation-mission',
  templateUrl: './affectation-mission.component.html',
  styleUrls: ['./affectation-mission.component.css']
})
export class AffectationMissionComponent implements OnInit {

  keys = Object.keys;
  LigneNantes = LigneNantes;

  missionChauffeurs: MissionChauffeur[];
  missionChauffeur: MissionChauffeur;
  maintenances: Maintenance[];
  maintenance: Maintenance;
  chauffeurs: Chauffeur[];
  techniciens: Technicien[];
  moyenTransports: MoyenTransport[];

  modifiableMissionChauffeur = false;
  modifiableMaintenance = false;

  constructor(private router: Router, private missionChauffeurService: ServiceMissionChauffeurService,
              private maintenanceService: ServiceMaintenanceService, private chauffeurService: ServiceChauffeurService,
              private technicienService: ServiceTechnicienService,
              private moyenTransportService: ServiceMoyenTransportService, private location: Location) {
    this.findAllMissionChauffeur();
    this.findAllMaintenance();
    this.missionChauffeur = new MissionChauffeur(null, null, null, null, null);
    this.maintenance = new Maintenance(null, null, []);
    this.findAllChauffeur();
    this.findAllTechnicien();
    this.findAllMoyenTransport();
  }

  public findAllMissionChauffeur(): void {
    this.missionChauffeurService.findAllMissionChauffeur().subscribe
      ((response) => {
        this.missionChauffeurs = response;
      });
  }

  public saveMissionChauffeur(): void {
    this.missionChauffeurService.saveMissionChauffeur(this.missionChauffeur).subscribe
      ((reponse) => {
        this.findAllMissionChauffeur();
        this.missionChauffeur = new MissionChauffeur(null, null, null, null, null);
      });
  }

  modifyClickedMissionChauffeur(missionChauffeur: MissionChauffeur) {
    this.modifiableMissionChauffeur = true;
    this.missionChauffeur = missionChauffeur;
  }

  public updateMissionChauffeur(missionChauffeur: MissionChauffeur): void {
    this.missionChauffeurService.updateMissionChauffeur(this.missionChauffeur).subscribe(
      (response) => {
        this.modifiableMissionChauffeur = false;
        this.missionChauffeur = new MissionChauffeur(null, null, null, null, null);
      }
    );
  }

  public deleteMissionChauffeur(missionChauffeur: MissionChauffeur): void {
    this.missionChauffeurService.deleteByIdMissionChauffeur(missionChauffeur).subscribe(
      (response) => {
        this.findAllMissionChauffeur();
      });
  }

  public findAllMaintenance(): void {
    this.maintenanceService.findAllMaintenance().subscribe((response) => {
      this.maintenances = response;
    });
  }

  public saveMaintenance(): void {
    this.maintenanceService.saveMaintenance(this.maintenance).subscribe(
      (reponse) => {
        this.findAllMaintenance();
        this.maintenance = new Maintenance(null, null, []);
      });
  }

  modifyClickedMaintenance(maintenance: Maintenance) {
    this.modifiableMaintenance = true;
    this.maintenance = maintenance;
  }

  public updateMaintenance(maintenance: Maintenance): void {
    this.maintenanceService.updateMaintenance(this.maintenance).subscribe(
      (response) => {
        this.modifiableMaintenance = false;
        this.maintenance = new Maintenance(null, null, []);
      }
    );
  }

  public deleteMaintenance(maintenance: Maintenance): void {
    this.maintenanceService.deleteByIdMaintenance(maintenance).subscribe(
      (response) => {
        this.findAllMaintenance();
      });
  }

  public findAllChauffeur(): void {
    this.chauffeurService.findAllChauffeur().subscribe((response) => {
      this.chauffeurs = response;
    });
  }

  public findAllTechnicien(): void {
    this.technicienService.findAllTechnicien().subscribe((response) => {
      this.techniciens = response;
    });
  }

  public findAllMoyenTransport(): void {
    this.moyenTransportService.findAllMoyenTransport().subscribe((response) => {
      console.log(response);
      this.moyenTransports = response;
    });
  }

  ngOnInit() {
  }

  goBackButtonPressed(): void {
    this.location.back();
  }

  goHome(): void {
    this.router.navigateByUrl('');
  }

}
