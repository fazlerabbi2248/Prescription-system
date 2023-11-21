package com.example.PrescriptionSystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.PrescriptionSystem.entity.Prescription;
import com.example.PrescriptionSystem.repository.PrescriptionRepository;
import com.example.PrescriptionSystem.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{
    private PrescriptionRepository  prescriptionRepository;
	
	public PrescriptionServiceImpl(com.example.PrescriptionSystem.repository.PrescriptionRepository prescriptionRepository) {
		super();
		this.prescriptionRepository = prescriptionRepository;
	}

	@Override
	public List<Prescription> getAllPrescription() {
	
		return prescriptionRepository.findAll();
	}
	@Override
	public Prescription savePrescription(Prescription prescription) {
		return prescriptionRepository.save(prescription);
	}

	@Override
	public Prescription getPrescriptionById(Long id) {
		return prescriptionRepository.findById(id).get();
	}

	@Override
	public Prescription updatePrescription(Prescription prescription) {
		return prescriptionRepository.save(prescription);
	}

	@Override
	public void deletePrescriptionById(Long id) {
		prescriptionRepository.deleteById(id);
		
	}

}
