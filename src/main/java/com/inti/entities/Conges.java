package com.inti.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Conges {
	
	private int idConges;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private EtatConges etatConges;
	
	private Employe employe;
	
	public Conges() {
		super();
	}

	public Conges(Date dateDebut, Date dateFin, EtatConges etatConges) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatConges = etatConges;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdConges() {
		return idConges;
	}

	public void setIdConges(int idConges) {
		this.idConges = idConges;
	}

	@Column
	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	@Column
	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	@Column
	public EtatConges getEtatConges() {
		return etatConges;
	}

	public void setEtatConges(EtatConges etatConges) {
		this.etatConges = etatConges;
	}

	@ManyToOne
	@JoinColumn(name = "idEmploye")
	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

}
