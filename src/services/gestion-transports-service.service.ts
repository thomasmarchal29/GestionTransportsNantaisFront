import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employe } from 'src/models/employe';

const EMPL_SERVER = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class GestionTransportsServiceService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };
  constructor(private http: HttpClient) { }

  public findAllEmploye(): Observable<any> {
    return this.http
    .get<Employe>(EMPL_SERVER + '/employe');
  }
  public findByIdEmploye(id: number): Observable<any> {
    return this.http
      .get<Employe>(EMPL_SERVER + '/employe/{id}' + id);
  }
  public saveEmploye(employe: Employe): Observable<any> {
    return this.http.post<Employe>(EMPL_SERVER + '/employe', JSON.stringify(employe), this.httpOptions);
  }
  public updateEmploye(employe: Employe): Observable<any> {
    return this.http.put<Employe>(EMPL_SERVER + '/employe/{id}' + employe.idEmploye, JSON.stringify(employe), this.httpOptions);
  }
  public deleteByIdEmploye(employe: Employe): Observable<any> {
    return this.http.delete<Employe>(EMPL_SERVER + '/employe' + employe.idEmploye);
  }

}
