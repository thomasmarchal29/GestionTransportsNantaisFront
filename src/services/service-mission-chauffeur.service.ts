import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { MissionChauffeur } from 'src/models/missionChauffeur';

const EMPL_SERVER = 'http://localhost:8080';


@Injectable({
  providedIn: 'root'
})
export class ServiceMissionChauffeurService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  public findAllMissionChauffeur(): Observable<any> {
    return this.http
      .get<MissionChauffeur>(EMPL_SERVER + '/missionChauffeur');
  }

  public findByIdMissionChauffeur(id: number): Observable<any> {
    return this.http
      .get<MissionChauffeur>(EMPL_SERVER + '/missionChauffeur/' + id);
  }

  public saveMissionChauffeur(missionChauffeur: MissionChauffeur): Observable<any> {
    return this.http.post<MissionChauffeur>(EMPL_SERVER + '/missionChauffeur', JSON.stringify(missionChauffeur), this.httpOptions);
  }

  public updateMissionChauffeur(missionChauffeur: MissionChauffeur): Observable<any> {
    return this.http.put<MissionChauffeur>(EMPL_SERVER + '/missionChauffeur/' + missionChauffeur.idMissionChauffeur,
      JSON.stringify(missionChauffeur),
      this.httpOptions);
  }

  public deleteByIdMissionChauffeur(missionChauffeur: MissionChauffeur): Observable<any> {
    return this.http.delete<MissionChauffeur>(EMPL_SERVER + '/missionChauffeur/' + missionChauffeur.idMissionChauffeur);
  }

  public findByIdEmployeMissionChauffeur(id: number): Observable<any> {
    return this.http
      .get<MissionChauffeur>(EMPL_SERVER + '/missionChauffeur/ParEmploye/' + id);
  }

}
