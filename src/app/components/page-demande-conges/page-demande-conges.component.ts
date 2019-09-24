import { Component, OnInit } from '@angular/core';
import { ServiceCongesService } from 'src/services/service-conges.service';
import { Conges } from 'src/models/conges';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';

import { Location } from '@angular/common';
import { ServiceEmployeService } from 'src/services/service-employe.service';

@Component({
  selector: 'app-page-demande-conges',
  templateUrl: './page-demande-conges.component.html',
  styleUrls: ['./page-demande-conges.component.css']
})
export class PageDemandeCongesComponent implements OnInit {

  congess: Conges[];
  conges: Conges;

  modifiableConges = false;

  constructor(private router: Router, private congesService: ServiceCongesService, private route: ActivatedRoute,
              private location: Location, private employeService: ServiceEmployeService) {
    this.conges = new Conges(null, null, null, 0, null);
  }

  public findCongesByIdEmploye(id: number): void {
    this.congesService.findByIdEmploye(id).subscribe
      ((response) => {
        this.congess = response;
      });
  }

  public findEmployeByIdEmploye(id: number): void {
    this.employeService.findByIdEmploye(id).subscribe
      ((response) => {
        this.conges.employe = response;
      });
  }

  public saveConges(): void {
    this.congesService.saveConges(this.conges).subscribe
      ((reponse) => {
        this.route.paramMap.subscribe((params: ParamMap) => {
          this.findCongesByIdEmploye(parseInt(params.get('idEmploye'), 10));
        });
        this.conges = new Conges(null, null, null, 0, null);
      });
  }

  modifyClickedConges(conges: Conges) {
    this.modifiableConges = true;
    this.conges = conges;
  }

  public updateConges(conges: Conges): void {
    this.congesService.updateConges(this.conges).subscribe(
      (response) => {
        this.modifiableConges = false;
        this.conges = new Conges(null, null, null, 0, null);
      }
    );
  }

  public deleteConges(conges: Conges): void {
    this.congesService.deleteByIdConges(conges).subscribe(
      (response) => {
        this.route.paramMap.subscribe((params: ParamMap) => {
          this.findCongesByIdEmploye(parseInt(params.get('idEmploye'), 10));
        });
      });
  }

  ngOnInit() {
    this.route.paramMap.subscribe((params: ParamMap) => {
      this.findCongesByIdEmploye(parseInt(params.get('idEmploye'), 10));
      this.findEmployeByIdEmploye(parseInt(params.get('idEmploye'), 10));
    });
  }

  goBackButtonPressed(): void {
    this.location.back();
  }

  goHome(): void {
    this.router.navigateByUrl('');
  }

}
