package us.sqoin.hotpital;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import us.sqoin.hotpital.generators.MedecinGenerator;
import us.sqoin.hotpital.modal.Hotel;
import us.sqoin.hotpital.modal.Medecin;
import us.sqoin.hotpital.modal.Patient;



@RestController
public class MedecinWebService {

	@GetMapping("/getMedecin")
	public Medecin getMedcin(int id)
	{
		return MedecinGenerator.getMedecin(id);
		
	}
	
	@GetMapping("/getMedecinByname")
	public Medecin getMedcinByname(String name)
	{
		return MedecinGenerator.getMedecinByname(name);
		
	}
	
	
	@GetMapping("/allmedecins")
	public List<Medecin> showall()
	{
		return MedecinGenerator.getDefaultMedecins();
		
	}
//	
//	@GetMapping("/Reserve")
//	public Medecin Reserve(int id,int idHotel , Patient p)
//	{
//		//Patient p2 = new Patient(id);
//		//p2.setId(id);
//		//System.out.print(p2);
//	//	System.out.print(MedecinGenerator.addPatient(id, p));
//		return MedecinGenerator.addPatient(id, p);
//	}
	@GetMapping("/AffectPatientToMed")
	public Medecin AffectPatient(int id,Patient p)
	{
		p.setId((long) (MedecinGenerator.getP().size()+1));
		return MedecinGenerator.addPatientToMedecin(p, id);
	}
	
	
	
	
}
