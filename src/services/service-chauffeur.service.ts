import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Chauffeur } from 'src/models/chauffeur';

const EMPL_SERVER = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class ServiceChauffeurService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  public findAllChauffeur(): Observable<any> {
    return this.http
      .get<Chauffeur>(EMPL_SERVER + '/chauffeur');
  }

  public findByIdChauffeur(id: number): Observable<any> {
    return this.http
      .get<Chauffeur>(EMPL_SERVER + '/chauffeur/' + id);
  }

  public saveChauffeur(chauffeur: Chauffeur): Observable<any> {
    return this.http.post<Chauffeur>(EMPL_SERVER + '/chauffeur', JSON.stringify(chauffeur), this.httpOptions);
  }

  public updateChauffeur(chauffeur: Chauffeur): Observable<any> {
    return this.http.put<Chauffeur>(EMPL_SERVER + '/chauffeur/' + chauffeur.idEmploye, JSON.stringify(chauffeur), this.httpOptions);
  }

  public deleteByIdChauffeur(chauffeur: Chauffeur): Observable<any> {
    return this.http.delete<Chauffeur>(EMPL_SERVER + '/chauffeur/' + chauffeur.idEmploye);
  }

}
