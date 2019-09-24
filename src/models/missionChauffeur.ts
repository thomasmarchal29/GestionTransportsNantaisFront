import { Time } from '@angular/common';
import { Administrateur } from './administrateur';
import { MoyenTransport } from './moyenTransport';
import { Chauffeur } from './chauffeur';
import { LigneNantes } from './ligneNantes.enum';

export class MissionChauffeur {

    public idMissionChauffeur: number;
    public dateMission: Date;
    public horaireMission: Time;
    public ligneNantes: LigneNantes;

    public administrateur: Administrateur;
    public moyenTransport: MoyenTransport;
    public chauffeur: Chauffeur;

    constructor(dateMission: Date, horaireMission: Time, ligneNantes: LigneNantes, moyenTransport: MoyenTransport,
                chauffeur: Chauffeur) {
        this.dateMission = dateMission;
        this.horaireMission = horaireMission;
        this.ligneNantes = ligneNantes;
        this.moyenTransport = moyenTransport;
        this.chauffeur = chauffeur;
    }

}
