import { Employe } from './employe';
import { MissionChauffeur } from './missionChauffeur';
import { HabilitationMoyenTransport } from './habilitationMoyenTransport.enum';

export class Chauffeur extends Employe {

    public habilitationMoyenTransport: HabilitationMoyenTransport;
    public permis: string;

    public missionChauffeur: MissionChauffeur[];

    constructor(nom: string, prenom: string, dateNaissance: Date, numeroTelephone: string, adresseMail: string,
                username: string, password: string, habilitationMoyenTransport: HabilitationMoyenTransport, permis: string) {
        super(nom, prenom, dateNaissance, numeroTelephone, adresseMail, username, password);
        this.habilitationMoyenTransport = habilitationMoyenTransport;
        this.permis = permis;
    }

}
