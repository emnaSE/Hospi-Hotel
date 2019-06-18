package us.sqoin.hotpital;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import us.sqoin.hotpital.generators.PatientGenerator;
import us.sqoin.hotpital.generators.ReservateGenerator;
import us.sqoin.hotpital.modal.Patient;
import us.sqoin.hotpital.modal.Reservation;

@RestController
public class ReservationWebService {

	
	@GetMapping("/getReservations")
	public List<Reservation> getReservation() {
	
		return ReservateGenerator.getDefaultReservations();
		
	}
	
	@GetMapping("/getOnlyoneReservation")
	public Reservation getResevationbyID(int id) {
	
		return ReservateGenerator.getReservationById(id);
	}
	
	@GetMapping("/getOnlyoneReservationbyname")
	public Reservation getResevationbyName(String name) {
	
		return ReservateGenerator.getReservationByName(name);
	}
	
	@GetMapping("/addReserv")
	public Reservation AddReservation(Reservation v,int typeofnotif,String content) {	
	// System.out.print( ReservateGenerator.getDefaultReservations().size());
	 v.setId((long) (ReservateGenerator.getDefaultReservations().size()+1));
	 //  PatientGenerator.addPatient(v.getId());
		return ReservateGenerator.addReservation(v,typeofnotif,content);
	}
	
	
	
	
	
	

	
}
