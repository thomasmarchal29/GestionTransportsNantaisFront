import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Maintenance } from 'src/models/maintenance';

const EMPL_SERVER = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class ServiceMaintenanceService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  constructor(private http: HttpClient) { }

  public findAllMaintenance(): Observable<any> {
    return this.http
      .get<Maintenance>(EMPL_SERVER + '/maintenance');
  }

  public findByIdMaintenance(id: number): Observable<any> {
    return this.http
      .get<Maintenance>(EMPL_SERVER + '/maintenance/' + id);
  }

  public saveMaintenance(maintenance: Maintenance): Observable<any> {
    return this.http.post<Maintenance>(EMPL_SERVER + '/maintenance', JSON.stringify(maintenance), this.httpOptions);
  }

  public updateMaintenance(maintenance: Maintenance): Observable<any> {
    return this.http.put<Maintenance>(EMPL_SERVER + '/maintenance/' + maintenance.idMaintenance,
      JSON.stringify(maintenance), this.httpOptions);
  }

  public deleteByIdMaintenance(maintenance: Maintenance): Observable<any> {
    return this.http.delete<Maintenance>(EMPL_SERVER + '/maintenance/' + maintenance.idMaintenance);
  }

  public findByIdEmployeMaintenance(id: number): Observable<any> {
    return this.http
      .get<Maintenance>(EMPL_SERVER + '/maintenance/ParEmploye/' + id);
  }

}
