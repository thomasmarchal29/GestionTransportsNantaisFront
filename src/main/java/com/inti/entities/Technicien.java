package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("technicien")
public class Technicien extends Employe {
	
	private int idTechnicien;
	private String diplome;
	private String habilitationTechnique;
	
	private MoyenTransport moyenTransport;
	private Maintenance maintenance;
	
	public Technicien() {
		super();
	}

	public Technicien(String diplome, String habilitationTechnique) {
		super();
		this.diplome = diplome;
		this.habilitationTechnique = habilitationTechnique;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdTechnicien() {
		return idTechnicien;
	}

	public void setIdTechnicien(int idTechnicien) {
		this.idTechnicien = idTechnicien;
	}

	@Column
	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	@Column
	public String getHabilitationTechnique() {
		return habilitationTechnique;
	}

	public void setHabilitationTechnique(String habilitationTechnique) {
		this.habilitationTechnique = habilitationTechnique;
	}
	
	public MoyenTransport getMoyenTransport() {
		return moyenTransport;
	}

	public void setMoyenTransport(MoyenTransport moyenTransport) {
		this.moyenTransport = moyenTransport;
	}

	public Maintenance getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(Maintenance maintenance) {
		this.maintenance = maintenance;
	}
	
	@ManyToMany
	@JoinTable(name = "", joinColumns = @JoinColumn(name = "idTechnicien"),
			inverseJoinColumns = @JoinColumn(name = "idMoyenTransport"))
	private List<MoyenTransport> listMoyenTransport = new ArrayList<MoyenTransport> ();
	
	@ManyToMany
	@JoinTable(name = "", joinColumns = @JoinColumn(name = "idTechnicien"),
			inverseJoinColumns = @JoinColumn(name = "idMaintenance"))
	private List<Maintenance> listMaintenance = new ArrayList<Maintenance> ();
	
}
