package com.example.PrescriptionSystem.prescriptioncontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PrescriptionSystem.entity.Prescription;
import com.example.PrescriptionSystem.service.PrescriptionService;

@RestController
@RequestMapping("/api/v1")
public class RestPrescriptionController {
	private PrescriptionService prescriptionService;

	public RestPrescriptionController(PrescriptionService prescriptionService) {
		super();
		this.prescriptionService = prescriptionService;
	}

	@GetMapping("/prescriptions")
	public List<Prescription> getAllPrescriptions() {
		return prescriptionService.getAllPrescription();
	}


}
