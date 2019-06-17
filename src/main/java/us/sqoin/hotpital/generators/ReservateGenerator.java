package us.sqoin.hotpital.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import us.sqoin.hotpital.modal.Medecin;
import us.sqoin.hotpital.modal.Reservation;

public class ReservateGenerator {

	private static Reservation reservation1;
	private static Reservation reservation2;
	private static ArrayList<Reservation> listResev = new ArrayList<Reservation>();
	
	static {
		
		reservation1 = new Reservation(2l, "Booking 1", new Date(), MedecinGenerator.getMedecin(2), HotelGenerator.getHotel1(), 8);

	}
	
	
	public static List<Reservation> getDefaultReservations() {
		return Arrays.asList(reservation1,reservation2);
	}

}
