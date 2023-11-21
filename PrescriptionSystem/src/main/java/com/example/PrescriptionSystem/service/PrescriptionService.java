package com.example.PrescriptionSystem.service;

import java.util.List;

import com.example.PrescriptionSystem.entity.Prescription;
import com.example.PrescriptionSystem.entity.UserInfo;



public interface PrescriptionService {
	List<Prescription> getAllPrescription();
	
	Prescription savePrescription(Prescription prescription);
	
	Prescription getPrescriptionById(Long id);
	
	Prescription updatePrescription(Prescription prescription);
	
	void deletePrescriptionById(Long id);
	 
	

}
