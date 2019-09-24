import { Conges } from './conges';

export class Employe {

    public idEmploye: number;
    public nom: string;
    public prenom: string;
    public dateNaissance: Date;
    public numeroTelephone: string;
    public adresseMail: string;

    public username: string;
    public password: string;

    public conges: Conges[];

    constructor(nom: string, prenom: string, dateNaissance: Date, numeroTelephone: string, adresseMail: string,
                username: string, password: string) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numeroTelephone = numeroTelephone;
        this.adresseMail = adresseMail;
        this.username = username;
        this.password = password;
    }

}
