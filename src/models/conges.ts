import { Employe } from './employe';
import { EtatConges } from './etatConges.enum';

export class Conges {

    public idConges: number;
    public dateDebut: Date;
    public dateFin: Date;
    public commentaire: string;
    public etatConges: EtatConges;

    public employe: Employe;

    constructor(dateDebut: Date, dateFin: Date, commentaire: string, etatConges: EtatConges, employe: Employe) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.commentaire = commentaire;
        this.etatConges = etatConges;
        this.employe = employe;
    }

}
