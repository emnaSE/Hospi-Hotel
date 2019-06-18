package us.sqoin.hotpital;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import us.sqoin.hotpital.generators.PatientGenerator;
import us.sqoin.hotpital.modal.Patient;



@RestController
public class PatientWebService {
	
	@GetMapping("/ShowAllPatients")
	public List<Patient> getAllPatients () {
	
		return PatientGenerator.getDefaultsPatient();
	}
	
	@GetMapping("/addPatient")
	public Patient AddPatient (Patient p) {
	
		p.setId( (long) (PatientGenerator.getDefaultsPatient().size()+1));
		getAllPatients().add(p);
		return p;
	}
	
	

}
