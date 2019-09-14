package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("technicien")
public class Technicien extends Employe {
	
	private String diplome;
	private String habilitationTechnique;
	
	public Technicien() {
		super();
	}

	public Technicien(String diplome, String habilitationTechnique) {
		super();
		this.diplome = diplome;
		this.habilitationTechnique = habilitationTechnique;
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
	
	@ManyToMany
	private List<MoyenTransport> listMoyenTransport = new ArrayList<MoyenTransport>();
	
	@ManyToMany
	private List<Maintenance> listMaintenance = new ArrayList<Maintenance>();
	
}
