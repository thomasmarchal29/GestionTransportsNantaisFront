import { Employe } from './employe';
import { MissionChauffeur } from './missionChauffeur';
import { Maintenance } from './maintenance';

export class Administrateur extends Employe {

    public grade: string;

    public missionChauffeur: MissionChauffeur[];
    public maintenance: Maintenance[];

    constructor(nom: string, prenom: string, dateNaissance: Date, numeroTelephone: string, adresseMail: string,
                username: string, password: string, grade: string) {
        super(nom, prenom, dateNaissance, numeroTelephone, adresseMail, username, password);
        this.grade = grade;
    }

}
