import { Component, OnInit } from '@angular/core';
import { MoyenTransport } from 'src/models/moyenTransport';
import { Router } from '@angular/router';
import { ServiceMoyenTransportService } from 'src/services/service-moyen-transport.service';
import { Chauffeur } from 'src/models/chauffeur';
import { Technicien } from 'src/models/technicien';
import { ServiceChauffeurService } from 'src/services/service-chauffeur.service';
import { ServiceTechnicienService } from 'src/services/service-technicien.service';

import { Location } from '@angular/common';
import { TypeMoyenTransport } from '../../../models/typeMoyenTransport.enum';
import { HabilitationMoyenTransport } from '../../../models/habilitationMoyenTransport.enum';

@Component({
  selector: 'app-accueil-administrateur',
  templateUrl: './accueil-administrateur.component.html',
  styleUrls: ['./accueil-administrateur.component.css']
})
export class AccueilAdministrateurComponent implements OnInit {

  keys = Object.keys;
  TypeMoyenTransport = TypeMoyenTransport;
  HabilitationMoyenTransport = HabilitationMoyenTransport;

  chauffeurs: Chauffeur[];
  techniciens: Technicien[];
  moyenTransports: MoyenTransport[];

  chauffeur: Chauffeur;
  technicien: Technicien;
  moyenTransport: MoyenTransport;

  modifiableChauffeur = false;
  modifiableTechnicien = false;
  modifiableMoyenTransport = false;

  constructor(private router: Router, private chauffeurService: ServiceChauffeurService,
              private technicienService: ServiceTechnicienService, private moyenTransportService: ServiceMoyenTransportService,
              private location: Location) {
    this.findAllChauffeur();
    this.findAllTechnicien();
    this.findAllMoyenTransport();
    this.chauffeur = new Chauffeur('', '', null, null, '', '', '', null, '');
    this.technicien = new Technicien('', '', null, null, '', '', '', '', null);
    this.moyenTransport = new MoyenTransport(null, '', '', null);
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
      this.moyenTransports = response;
    });
  }

  public saveChauffeur(chauffeur: Chauffeur): void {
    this.chauffeurService.saveChauffeur(this.chauffeur).subscribe(
      (response) => {
        this.findAllChauffeur();
        this.chauffeur = new Chauffeur('', '', null, null, '', '', '', null, '');
      });
  }

  public saveTechnicien(technicien: Technicien): void {
    this.technicienService.saveTechnicien(this.technicien).subscribe(
      (response) => {
        this.findAllTechnicien();
        this.technicien = new Technicien('', '', null, null, '', '', '', '', null);
      });
  }

  public saveMoyenTransport(moyenTransport: MoyenTransport): void {
    this.moyenTransportService.saveMoyenTransport(this.moyenTransport).subscribe(
      (response) => {
        this.findAllMoyenTransport();
        this.moyenTransport = new MoyenTransport(null, '', '', null);
      });
  }

  modifyClickedChauffeur(chauffeur: Chauffeur) {
    this.modifiableChauffeur = true;
    this.chauffeur = chauffeur;
  }

  modifyClickedTechnicien(technicien: Technicien) {
    this.modifiableTechnicien = true;
    this.technicien = technicien;
  }

  modifyClickedMoyenTransport(moyenTransport: MoyenTransport) {
    this.modifiableMoyenTransport = true;
    this.moyenTransport = moyenTransport;
  }

  public updateChauffeur(chauffeur: Chauffeur): void {
    this.chauffeurService.updateChauffeur(this.chauffeur).subscribe(
      (response) => {
        this.modifiableChauffeur = false;
        this.chauffeur = new Chauffeur('', '', null, null, '', '', '', null, '');
      }
    );
  }

  public updateTechnicien(technicien: Technicien): void {
    this.technicienService.updateTechnicien(this.technicien).subscribe(
      (response) => {
        this.modifiableTechnicien = false;
        this.technicien = new Technicien('', '', null, null, '', '', '', '', null);
      }
    );
  }

  public updateMoyenTransport(moyenTransport: MoyenTransport): void {
    this.moyenTransportService.updateMoyenTransport(this.moyenTransport).subscribe(
      (response) => {
        this.modifiableMoyenTransport = false;
        this.moyenTransport = new MoyenTransport(null, '', '', null);
      }
    );
  }

  public deleteChauffeur(chauffeur: Chauffeur): void {
    this.chauffeurService.deleteByIdChauffeur(chauffeur).subscribe(
      (response) => {
        this.findAllChauffeur();
      });
  }

  public deleteTechnicien(technicien: Technicien): void {
    this.technicienService.deleteByIdTechnicien(technicien).subscribe(
      (response) => {
        this.findAllTechnicien();
      });
  }

  public deleteMoyenTransport(moyenTransport: MoyenTransport): void {
    this.moyenTransportService.deleteByIdMoyenTransport(moyenTransport).subscribe(
      (response) => {
        this.findAllMoyenTransport();
      });
  }

  addNewMissionPressed(): void {
    this.router.navigateByUrl('/affectationMission');
  }

  goBackButtonPressed(): void {
    this.location.back();
  }

  goHome(): void {
    this.router.navigateByUrl('');
  }

  goValidationConges(): void {
    this.router.navigateByUrl('/validationConges');
  }

  ngOnInit() {
  }

}
