package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Maintenance {
	
	private int idMaintenance;
	private Date dateMaintenance;
	
	@ManyToOne
	private Administrateur administrateur;

	public Maintenance() {
		super();
	}

	public Maintenance(Date dateMaintenance) {
		super();
		this.dateMaintenance = dateMaintenance;
	}

	public Date getDateMaintenance() {
		return dateMaintenance;
	}

	public void setDateMaintenance(Date dateMaintenance) {
		this.dateMaintenance = dateMaintenance;
	}

	public int getIdMaintenance() {
		return idMaintenance;
	}

	public void setIdMaintenance(int idMaintenance) {
		this.idMaintenance = idMaintenance;
	}

	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}
	
	@ManyToMany(mappedBy = "maintenance")
	private List<Maintenance> listMaintenance = new ArrayList<Maintenance> ();

}
