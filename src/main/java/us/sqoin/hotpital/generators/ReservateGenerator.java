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
	private static int i=0;
	
	static {
		reservation1 = new Reservation(1l, HotelGenerator.getHotel1().getName(), PatientGenerator.getP1().getFirstName(), "Zarrouk", 2, new Date(),new Date(),0);
	    reservation2 = new Reservation(2l, "Mouradi", "Fathi", "Zarrouk", 1, new Date(), new Date(), 0);

	    listResev.add(reservation1);
		listResev.add(reservation2);
	}
	
	
	public static List<Reservation> getDefaultReservations() {
		
		return listResev;
	}
	
	public static Reservation getReservationById(int id) {
		List<Reservation> arf = getDefaultReservations();

		Reservation r=null;
		for (Reservation s : arf) {
			if(s.getId()==id )
			{
				
			
				//System.out.print(id+"*****");
				//System.out.print(s.getId());
				r=s;
				
				//System.out.println(r);
			 return r;
			}
		}
		return r;
	}
	public static Reservation getReservationByName(String name)
	{
		List<Reservation> arf = getDefaultReservations();
		Reservation r=null;
		for (Reservation s : arf) {
			if(s.getNomMed().equals(name) )
			{
			
			
				r=s;
				System.out.println(r);
			 return r;
			}
		}
		return r;
		
	}

	
	
	public static Reservation addReservation(Reservation v,int typenotif,String content) {
		listResev.add(v);
	NotificationGenerator.addNewNotification(v, typenotif,content);

		return v;
	}



	public static Reservation getReservation1() {
		return reservation1;
	}



	public static void setReservation1(Reservation reservation1) {
		ReservateGenerator.reservation1 = reservation1;
	}



	public static Reservation getReservation2() {
		return reservation2;
	}



	public static void setReservation2(Reservation reservation2) {
		ReservateGenerator.reservation2 = reservation2;
	}



	private static Object generateNotificationFromReservation(Reservation v) {
		// TODO Auto-generated method stub
		return null;
	}
}
