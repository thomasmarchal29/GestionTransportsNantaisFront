package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Maintenance {
	
	private int idMaintenance;
	@Temporal(TemporalType.DATE)
	private Date dateMaintenance;
	
	private Administrateur administrateur;
	private MoyenTransport moyenTransport;

	public Maintenance() {
		super();
	}

	public Maintenance(Date dateMaintenance) {
		super();
		this.dateMaintenance = dateMaintenance;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdMaintenance() {
		return idMaintenance;
	}

	public void setIdMaintenance(int idMaintenance) {
		this.idMaintenance = idMaintenance;
	}

	@Column
	public Date getDateMaintenance() {
		return dateMaintenance;
	}

	public void setDateMaintenance(Date dateMaintenance) {
		this.dateMaintenance = dateMaintenance;
	}

	@ManyToOne
	@JoinColumn(name = "AdminResponsableAjout")
	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}
	
	@ManyToOne
	@JoinColumn(name = "idMoyenTransport")
	public MoyenTransport getMoyenTransport() {
		return moyenTransport;
	}

	public void setMoyenTransport(MoyenTransport moyenTransport) {
		this.moyenTransport = moyenTransport;
	}
	
	@ManyToMany(mappedBy = "listMaintenance")
	private List<Technicien> listTechnicien = new ArrayList<Technicien>();

}
