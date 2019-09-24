import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Technicien } from 'src/models/technicien';

const EMPL_SERVER = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class ServiceTechnicienService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  public findAllTechnicien(): Observable<any> {
    return this.http
      .get<Technicien>(EMPL_SERVER + '/technicien');
  }

  public findByIdTechnicien(id: number): Observable<any> {
    return this.http
      .get<Technicien>(EMPL_SERVER + '/technicien/' + id);
  }

  public saveTechnicien(technicien: Technicien): Observable<any> {
    return this.http.post<Technicien>(EMPL_SERVER + '/technicien', JSON.stringify(technicien), this.httpOptions);
  }

  public updateTechnicien(technicien: Technicien): Observable<any> {
    return this.http.put<Technicien>(EMPL_SERVER + '/technicien/' + technicien.idEmploye, JSON.stringify(technicien), this.httpOptions);
  }

  public deleteByIdTechnicien(technicien: Technicien): Observable<any> {
    return this.http.delete<Technicien>(EMPL_SERVER + '/technicien/' + technicien.idEmploye);
  }

}
