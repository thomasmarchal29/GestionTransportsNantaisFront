import { Component, OnInit } from '@angular/core';
import { ServiceCongesService } from 'src/services/service-conges.service';
import { Conges } from 'src/models/conges';

import { EtatConges } from '../../../models/etatConges.enum';
import { Router } from '@angular/router';

import { Location } from '@angular/common';

@Component({
  selector: 'app-page-validation-conges',
  templateUrl: './page-validation-conges.component.html',
  styleUrls: ['./page-validation-conges.component.css']
})
export class PageValidationCongesComponent implements OnInit {

  keys = Object.keys;
  EtatConges = EtatConges;

  conges: Conges;
  congess: Conges[];

  modifiableConges = false;

  constructor(private router: Router, private congesService: ServiceCongesService, private location: Location) {
    this.findAllConges();
  }

  public findAllConges(): void {
    this.congesService.findAllConges().subscribe
      ((response) => {
        this.congess = response;
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
      }
    );
  }

  goBackButtonPressed(): void {
    this.location.back();
  }

  goHome(): void {
    this.router.navigateByUrl('');
  }

  ngOnInit() {
  }

}
