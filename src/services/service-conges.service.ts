import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Conges } from 'src/models/conges';

const EMPL_SERVER = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})

export class ServiceCongesService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  public findAllConges(): Observable<any> {
    return this.http
      .get<Conges>(EMPL_SERVER + '/conges');
  }

  public findByIdConges(id: number): Observable<any> {
    return this.http
      .get<Conges>(EMPL_SERVER + '/conges/' + id);
  }

  public saveConges(conges: Conges): Observable<any> {
    return this.http.post<Conges>(EMPL_SERVER + '/conges', JSON.stringify(conges), this.httpOptions);
  }

  public updateConges(conges: Conges): Observable<any> {
    return this.http.put<Conges>(EMPL_SERVER + '/conges/' + conges.idConges,
      JSON.stringify(conges), this.httpOptions);
  }

  public deleteByIdConges(conges: Conges): Observable<any> {
    return this.http.delete<Conges>(EMPL_SERVER + '/conges/' + conges.idConges);
  }

  public findByIdEmploye(id: number): Observable<any> {
    return this.http
      .get<Conges>(EMPL_SERVER + '/conges/ParEmploye/' + id);
  }

}
