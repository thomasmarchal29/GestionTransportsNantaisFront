package com.inti.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Conges {
	
	private int idConges;
	private Date dateDebut;
	private Date dateFin;
	private EtatConges etatConges;
	
	@ManyToOne
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

	public EtatConges getEtatConges() {
		return etatConges;
	}

	public void setEtatConges(EtatConges etatConges) {
		this.etatConges = etatConges;
	}

}