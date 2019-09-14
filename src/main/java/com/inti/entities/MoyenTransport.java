package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MoyenTransport {
	
	private int idMoyenTransport;
	private TypeMoyenTransport typeMoyenTransport;
	private String immatriculation;
	private String vetuste;
	@Temporal(TemporalType.DATE)
	private Date dateDerniereRevision;
	
	public MoyenTransport() {
		super();
	}

	public MoyenTransport(TypeMoyenTransport typeMoyenTransport, String immatriculation, String vetuste,
			Date dateDerniereRevision) {
		super();
		this.typeMoyenTransport = typeMoyenTransport;
		this.immatriculation = immatriculation;
		this.vetuste = vetuste;
		this.dateDerniereRevision = dateDerniereRevision;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdMoyenTransport() {
		return idMoyenTransport;
	}

	public void setIdMoyenTransport(int idMoyenTransport) {
		this.idMoyenTransport = idMoyenTransport;
	}

	@Column
	public TypeMoyenTransport getTypeMoyenTransport() {
		return typeMoyenTransport;
	}

	public void setTypeMoyenTransport(TypeMoyenTransport typeMoyenTransport) {
		this.typeMoyenTransport = typeMoyenTransport;
	}

	@Column
	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	@Column
	public String getVetuste() {
		return vetuste;
	}

	public void setVetuste(String vetuste) {
		this.vetuste = vetuste;
	}

	@Column
	public Date getDateDerniereRevision() {
		return dateDerniereRevision;
	}

	public void setDateDerniereRevision(Date dateDerniereRevision) {
		this.dateDerniereRevision = dateDerniereRevision;
	}
	
	@ManyToMany(mappedBy = "listMoyenTransport")
	private List<Chauffeur> listChauffeur = new ArrayList<Chauffeur> ();
	
	@ManyToMany(mappedBy = "listMoyenTransport")
	private List<Technicien> listTechnicien = new ArrayList<Technicien> ();

}
