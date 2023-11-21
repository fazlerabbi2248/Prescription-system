package com.example.PrescriptionSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Prescriptions")
public class Prescription {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "date")
	private String date;

	@Column(name = "fname")
	private String fname;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "diagnosis")
	private String diagnosis;

	@Column(name = "medicines")
	private String Medicines;
	
	@Column(name="visit")
	private String visit;

	
	public Prescription() {

	}


	public Prescription(Long id, String date, String fname, int age, String gender, String diagnosis, String medicines,
			String visit) {
		super();
		this.id = id;
		this.date = date;
		this.fname = fname;
		this.age = age;
		this.gender = gender;
		this.diagnosis = diagnosis;
		this.Medicines = medicines;
		this.visit = visit;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDiagnosis() {
		return diagnosis;
	}


	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}


	public String getMedicines() {
		return Medicines;
	}


	public void setMedicines(String medicines) {
		Medicines = medicines;
	}


	public String getVisit() {
		return visit;
	}


	public void setVisit(String visit) {
		this.visit = visit;
	}
	
	

	


	
}
