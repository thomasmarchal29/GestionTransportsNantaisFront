import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AccueilEmployeComponent } from './components/accueil-employe/accueil-employe.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AccueilAdministrateurComponent } from './components/accueil-administrateur/accueil-administrateur.component';
import { PagePersoEmployeComponent } from './components/page-perso-employe/page-perso-employe.component';

import { FormsModule } from '@angular/forms';
import { AffectationMissionComponent } from './components/affectation-mission/affectation-mission.component';
import { PageAccueilFictiveComponent } from './components/page-accueil-fictive/page-accueil-fictive.component';
import { PageDemandeCongesComponent } from './components/page-demande-conges/page-demande-conges.component';
import { PageValidationCongesComponent } from './components/page-validation-conges/page-validation-conges.component';

@NgModule({
  declarations: [
    AppComponent,
    AccueilEmployeComponent,
    AccueilAdministrateurComponent,
    PagePersoEmployeComponent,
    AffectationMissionComponent,
    PageAccueilFictiveComponent,
    PageDemandeCongesComponent,
    PageValidationCongesComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {
        path: 'accueilFictif',
        component: PageAccueilFictiveComponent,
      },
      {
        path: 'accueilEmploye',
        component: AccueilEmployeComponent,
      },
      {
        path: 'accueilAdministrateur',
        component: AccueilAdministrateurComponent,
      },
      {
        path: 'affectationMission',
        component: AffectationMissionComponent,
      },
      {
        path: 'pagePersoEmploye/:idEmploye',
        component: PagePersoEmployeComponent,
      },
      {
        path: 'demandeConges/:idEmploye',
        component: PageDemandeCongesComponent,
      },
      {
        path: 'validationConges',
        component: PageValidationCongesComponent,
      },
      {
        path: '',
        redirectTo: 'accueilFictif',
        pathMatch: 'full'
      },
    ]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
