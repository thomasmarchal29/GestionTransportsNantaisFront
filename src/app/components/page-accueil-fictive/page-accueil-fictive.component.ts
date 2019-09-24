import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-page-accueil-fictive',
  templateUrl: './page-accueil-fictive.component.html',
  styleUrls: ['./page-accueil-fictive.component.css']
})
export class PageAccueilFictiveComponent implements OnInit {

  constructor(private router: Router) { }

  goAccueilEmployePressed(): void {
    this.router.navigateByUrl('/accueilEmploye');
  }

  goAccueilAdministrateurPressed(): void {
    this.router.navigateByUrl('/accueilAdministrateur');
  }

  ngOnInit() {
  }

}
