import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { MoyenTransport } from 'src/models/moyenTransport';

const EMPL_SERVER = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class ServiceMoyenTransportService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };
  constructor(private http: HttpClient) { }

  public findAllMoyenTransport(): Observable<any> {
    return this.http
      .get<MoyenTransport>(EMPL_SERVER + '/moyenTransport');
  }

  public findByIdMoyenTransport(id: number): Observable<any> {
    return this.http
      .get<MoyenTransport>(EMPL_SERVER + '/moyenTransport/' + id);
  }

  public saveMoyenTransport(moyenTransport: MoyenTransport): Observable<any> {
    return this.http.post<MoyenTransport>(EMPL_SERVER + '/moyenTransport', JSON.stringify(moyenTransport), this.httpOptions);
  }

  public updateMoyenTransport(moyenTransport: MoyenTransport): Observable<any> {
    return this.http.put<MoyenTransport>(EMPL_SERVER + '/moyenTransport/' + moyenTransport.idMoyenTransport,
      JSON.stringify(moyenTransport), this.httpOptions);
  }

  public deleteByIdMoyenTransport(moyenTransport: MoyenTransport): Observable<any> {
    return this.http.delete<MoyenTransport>(EMPL_SERVER + '/moyenTransport/' + moyenTransport.idMoyenTransport);
  }

}
