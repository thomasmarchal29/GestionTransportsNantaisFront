import { MissionChauffeur } from './missionChauffeur';
import { Maintenance } from './maintenance';
import { TypeMoyenTransport } from './typeMoyenTransport.enum';

export class MoyenTransport {

    public idMoyenTransport: number;
    public typeMoyenTransport: TypeMoyenTransport;
    public immatriculation: string;
    public vetuste: string;
    public dateDerniereRevision: Date;

    public missionChauffeur: MissionChauffeur[];
    public maintenance: Maintenance[];

    constructor(typeMoyenTransport: TypeMoyenTransport, immatriculation: string, vetuste: string, dateDerniereRevision: Date) {
        this.typeMoyenTransport = typeMoyenTransport;
        this.immatriculation = immatriculation;
        this.vetuste = vetuste;
        this.dateDerniereRevision = dateDerniereRevision;
    }

}
