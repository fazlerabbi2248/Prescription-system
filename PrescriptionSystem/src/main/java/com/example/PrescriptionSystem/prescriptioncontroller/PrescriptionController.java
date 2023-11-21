package com.example.PrescriptionSystem.prescriptioncontroller;

import java.util.List;

import org.springframework.boot.web.servlet.error.ErrorController;

import com.example.PrescriptionSystem.entity.Prescription;
import com.example.PrescriptionSystem.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class PrescriptionController {

	private PrescriptionService prescriptionService;

	public PrescriptionController(PrescriptionService prescriptionService) {
		super();
		this.prescriptionService = prescriptionService;
	}

	@GetMapping("/prescriptions")
	public String listPrescriptions(Model model) {
		model.addAttribute("prescriptions", prescriptionService.getAllPrescription());
		return "prescriptions";
	}

	@GetMapping("/presecriptions/new")
	public String createStudentForm(Model model) {

		Prescription prescription = new Prescription();
		model.addAttribute("prescription", prescription);
		return "createprescription";

	}

	@PostMapping("/prescriptions")
	public String savePrescriptions(@ModelAttribute("prescriptions") Prescription prescriptions) {
		prescriptionService.savePrescription(prescriptions);
		return "redirect:/prescriptions";
	}

	@GetMapping("/prescriptions/edit/{id}")
	public String editPrescriptionsForm(@PathVariable Long id, Model model) {
		model.addAttribute("prescription", prescriptionService.getPrescriptionById(id));
		return "editprescription";
	}

	@PostMapping("/prescriptions/{id}")
	public String updatePrescriptions(@PathVariable Long id, @ModelAttribute("prescription") Prescription prescription,
			Model model) {

		Prescription existingprescription = prescriptionService.getPrescriptionById(id);
		existingprescription.setId(id);
		existingprescription.setDate(prescription.getDate());
		existingprescription.setFname(prescription.getFname());
		existingprescription.setAge(prescription.getAge());
		existingprescription.setGender(prescription.getGender());
		existingprescription.setDiagnosis(prescription.getDiagnosis());
		existingprescription.setMedicines(prescription.getMedicines());
		existingprescription.setVisit(prescription.getVisit());

		prescriptionService.updatePrescription(existingprescription);
		return "redirect:/prescriptions";
	}

	@GetMapping("/prescriptions/delete/{id}")
	public String showDeleteConfirmation(@PathVariable Long id, Model model) {
	    Prescription prescriptionToDelete = prescriptionService.getPrescriptionById(id);
	    model.addAttribute("prescription", prescriptionToDelete);
	    return "deleteconfirmation";
	}

	@PostMapping("/prescriptions/delete/{id}")
	public String deletePrescription(@PathVariable Long id) {
	    prescriptionService.deletePrescriptionById(id);
	    return "redirect:/prescriptions";
	}
	
	
    @GetMapping("/api/v1/prescription")
    public List<Prescription> getAllPrescriptions() {
        return prescriptionService.getAllPrescription();
    }
	@GetMapping("/tabular")
	public String tabular() {
		return "tabulardprescription";
	}
	@GetMapping("/interaction")
	public String interaction() {
		return "interaction";
	}

	@GetMapping("/home")
	public String home() {
		return "/home";
	}
}
