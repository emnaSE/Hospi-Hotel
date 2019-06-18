package us.sqoin.hotpital.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import us.sqoin.hotpital.modal.Hotel;
import us.sqoin.hotpital.modal.Medecin;
import us.sqoin.hotpital.modal.Reservation;



public class HotelGenerator {

	private static Hotel hotel1;
	private static Hotel hotel2;
	
	private static Medecin Md1;
	
	private static List<Hotel> ListHo= new ArrayList<Hotel>();
	
	static {
		hotel1 = new Hotel(2L, "Hotel Mouradi",36.880968, 10.188843, 3, 9);
		hotel2 = new Hotel(3L, "Hotel Marhba",36.882129, 10.191244, 3, 3);
	
		ListHo.add(hotel1);
		ListHo.add(hotel2);
		//Md1 = new Medecin(4L, "Zarrouk", "Moncef", "Cardiologie");
		
	//	((Hotel) hotel1).setIdM(Md1.getIdM());

		}

	public static Hotel getHotel1() {
		return hotel1;
	}

	public static void setHotel1(Hotel hotel1) {
		HotelGenerator.hotel1 = hotel1;
	}

	public static Hotel getHotel2() {
		return hotel2;
	}

	public static void setHotel2(Hotel hotel2) {
		HotelGenerator.hotel2 = hotel2;
	}

	public static List<Hotel> getListHotel1() {
		return Arrays.asList(hotel1);
	}
	
	public static List<Hotel> getListHotel2() {
		return Arrays.asList(hotel2);
	}

	public static List<Hotel> getDefaultsHotels() {
		return ListHo;
	}
	
	

	
	

}
