package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ManyToMany;

public class MoyenTransport {
	
	private int idMoyenTransport;
	private String type;
	private String immatriculation;
	private String vetuste;
	private Date dateDerniereRevision;
	
	public MoyenTransport() {
		super();
	}

	public MoyenTransport(String type, String immatriculation, String vetuste, Date dateDerniereRevision) {
		super();
		this.type = type;
		this.immatriculation = immatriculation;
		this.vetuste = vetuste;
		this.dateDerniereRevision = dateDerniereRevision;
	}

	public int getIdMoyenTransport() {
		return idMoyenTransport;
	}

	public void setIdMoyenTransport(int idMoyenTransport) {
		this.idMoyenTransport = idMoyenTransport;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getVetuste() {
		return vetuste;
	}

	public void setVetuste(String vetuste) {
		this.vetuste = vetuste;
	}

	public Date getDateDerniereRevision() {
		return dateDerniereRevision;
	}

	public void setDateDerniereRevision(Date dateDerniereRevision) {
		this.dateDerniereRevision = dateDerniereRevision;
	}
	
	@ManyToMany(mappedBy = "moyenTransport")
	private List<Chauffeur> listChauffeur = new ArrayList<Chauffeur> ();
	
	@ManyToMany(mappedBy = "moyenTransport")
	private List<Technicien> listTechnicien = new ArrayList<Technicien> ();

}
