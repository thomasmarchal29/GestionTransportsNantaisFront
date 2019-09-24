import { MoyenTransport } from './moyenTransport';
import { Administrateur } from './administrateur';
import { Technicien } from './technicien';

export class Maintenance {

    public idMaintenance: number;
    public dateMaintenance: Date;

    public administrateur: Administrateur;
    public moyenTransport: MoyenTransport;
    public techniciens: Technicien[];

    constructor(dateMaintenance: Date, moyenTransport: MoyenTransport, techniciens: Technicien[]) {
        this.dateMaintenance = dateMaintenance;
        this.moyenTransport = moyenTransport;
        this.techniciens = techniciens;
    }

}
