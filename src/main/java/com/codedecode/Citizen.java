package com.codedecode;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="citizen")
public class Citizen 
{
	
	public Citizen() {
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	@Basic(optional = false)
	@Column(name="name")
	String name;
	
	@Basic(optional = false)
	@Column(name="vaccinationcenterid")
	int vaccinationCenterId ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVaccinationCenterId() {
		return vaccinationCenterId;
	}

	public void setVaccinationCenterId(int vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", vaccinationCenterId=" + vaccinationCenterId + "]";
	}
	
	
	
		
	

}
