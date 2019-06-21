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
	private static Hotel hotel3;
	private static Hotel hotel4;
	
	private static Medecin Md1;
	
	private static List<Hotel> ListHo= new ArrayList<Hotel>();
	
	static {
		hotel1 = new Hotel(1L, "Hôtel du Lion",48.833401, 2.331943, 3, 110);
		hotel2 = new Hotel(2L, "Hôtel FIAP Jean Monnet",48.830467, 2.338070, 3, 3);
		
		hotel3 = new Hotel(3L, "Hôtel Boulevard Saint-Jacques",48.831605,2.339771, 1, 22);
		hotel4 = new Hotel(4L, "Hôtel Ibis",48.827423, 2.321030, 4, 43);
	
		ListHo.add(hotel1);
		ListHo.add(hotel2);
		ListHo.add(hotel3);
		ListHo.add(hotel4);
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

	
	public static Hotel getHotel3() {
		return hotel3;
	}

	public static void setHotel3(Hotel hotel3) {
		HotelGenerator.hotel3 = hotel3;
	}

	public static Hotel getHotel4() {
		return hotel4;
	}

	public static void setHotel4(Hotel hotel4) {
		HotelGenerator.hotel4 = hotel4;
	}

	public static List<Hotel> getListHo() {
		return ListHo;
	}

	public static void setListHo(List<Hotel> listHo) {
		ListHo = listHo;
	}

	public static List<Hotel> getDefaultsHotels() {
		return ListHo;
	}
	
	

	
	

}
