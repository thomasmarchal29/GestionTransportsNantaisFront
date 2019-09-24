import { Employe } from './employe';
import { Maintenance } from './maintenance';
import { HabilitationMoyenTransport } from './habilitationMoyenTransport.enum';

export class Technicien extends Employe {

    public diplome: string;
    public habilitationMoyenTransport: HabilitationMoyenTransport;

    public maintenances: Maintenance[];

    constructor(nom: string, prenom: string, dateNaissance: Date, numeroTelephone: string, adresseMail: string,
                username: string, password: string, diplome: string, habilitationMoyenTransport: HabilitationMoyenTransport) {
        super(nom, prenom, dateNaissance, numeroTelephone, adresseMail, username, password);
        this.diplome = diplome;
        this.habilitationMoyenTransport = habilitationMoyenTransport;
    }

}
