package us.sqoin.hotpital;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import us.sqoin.hotpital.generators.MedecinGenerator;
import us.sqoin.hotpital.modal.Medecin;
import us.sqoin.hotpital.modal.Patient;



@RestController
public class MedecinWebService {

	@GetMapping("/getMedecin")
	public Medecin getMedcin(int id)
	{
		return MedecinGenerator.getMedecin(id);
		
	}
	
	@GetMapping("/allmedecins")
	public List<Medecin> showall()
	{
		return MedecinGenerator.getDefaultMedecins();
		
	}
	
	@GetMapping("/Reserve")
	public Medecin Reserve(int id,Patient p)
	{
		//Patient p2 = new Patient(id);
		//p2.setId(id);
		//System.out.print(p2);
	//	System.out.print(MedecinGenerator.addPatient(id, p));
		return MedecinGenerator.addPatient(id, p);
	}
	
	
	
}
