import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Administrateur } from 'src/models/administrateur';

const EMPL_SERVER = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class ServiceAdministrateurService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };
  constructor(private http: HttpClient) { }

  public findAllAdministrateur(): Observable<any> {
    return this.http
    .get<Administrateur>(EMPL_SERVER + '/administrateur');
  }
  public findByIdAdministrateur(id: number): Observable<any> {
    return this.http
      .get<Administrateur>(EMPL_SERVER + '/administrateur/' + id);
  }
  public saveAdministrateur(administrateur: Administrateur): Observable<any> {
    return this.http.post<Administrateur>(EMPL_SERVER + '/administrateur', JSON.stringify(administrateur), this.httpOptions);
  }
  public updateAdministrateur(administrateur: Administrateur): Observable<any> {
    return this.http.put<Administrateur>(EMPL_SERVER + '/administrateur/' + administrateur.idEmploye,
    JSON.stringify(administrateur), this.httpOptions);
  }
  public deleteByIdAdministrateur(administrateur: Administrateur): Observable<any> {
    return this.http.delete<Administrateur>(EMPL_SERVER + '/administrateur/' + administrateur.idEmploye);
  }
}
