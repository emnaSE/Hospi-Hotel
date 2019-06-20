package us.sqoin.hotpital;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
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
	public List<Reservation> getResevationbyName(String name) {
	
		return ReservateGenerator.getReservationByNameMed(name);
	}
	
	@GetMapping("/addReserv")
	public Reservation AddReservation(String nomHotel,String nomPatient,String nomMed,int nb_lits_res,String date_Deb, String date_Fin) throws ParseException {	
	// System.out.print( ReservateGenerator.getDefaultReservations().size());
	// v.setId((long) (ReservateGenerator.getDefaultReservations().size()+1));
	 //  PatientGenerator.addPatient(v.getId());
		return ReservateGenerator.addReservation(nomHotel, nomPatient, nomMed, nb_lits_res, date_Deb, date_Fin);
		

	}
	
	/*
	public Reservation AddReservation(Reservation v,int typeofnotif,String content) {	
	 System.out.print( ReservateGenerator.getDefaultReservations().size());
	 v.setId((long) (ReservateGenerator.getDefaultReservations().size()+1));
	   PatientGenerator.addPatient(v.getId());
		return ReservateGenerator.addReservation(v,typeofnotif,content);
	
	*/
	
	@GetMapping("/getReservationByNameHotel")
	public List<Reservation> getResevationbyNameHotel(String name) {
	
		return ReservateGenerator.getReservationByNameHotel(name);
	}
	
	@GetMapping("/getReservationByNamePatient")
	public List<Reservation> getResevationbyPatientName(String name) {
	
		return ReservateGenerator.getReservationByNamePatient(name);
	}
	
	@GetMapping("/getReservationsorderbyAsc")
	public List<Reservation> getOrderedResbyAsc() {
		
   return  ReservateGenerator.SortListReservationsByDateAsc();

	}
	
	@GetMapping("/getReservationsorderbyDesc")
	public List<Reservation> getOrderedResbyDesc() {
		
   return  ReservateGenerator.SortListReservationsByDateDesc();
		
		
	}
	@GetMapping("/EtatCancelled")
	public boolean switchetattocancel(int id) {
		
   return  ReservateGenerator.ReservationCancelledByMed(id);
		
		
	}
	
	@GetMapping("/EtatAccepted")
	public boolean switchetattoaccept(int id) {
		
   return  ReservateGenerator.ReservationAcceptedByHot(id);
		
		
	}
	
	@GetMapping("/EtatRefused")
	public boolean switchetattorefuse(int id) {
		
   return  ReservateGenerator.ReservationRefusedByHot(id);
		
		
	}

	
}
