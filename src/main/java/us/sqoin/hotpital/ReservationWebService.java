package us.sqoin.hotpital;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import us.sqoin.hotpital.generators.ReservateGenerator;
import us.sqoin.hotpital.modal.Reservation;

@RestController
public class ReservationWebService {

	
	@GetMapping("/getReservation")
	public List<Reservation> getReservation() {
	
		return ReservateGenerator.getDefaultReservations();
		
	}
	

	
}
