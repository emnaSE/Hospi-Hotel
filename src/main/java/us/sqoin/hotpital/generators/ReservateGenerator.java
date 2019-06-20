package us.sqoin.hotpital.generators;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

		reservation1 = new Reservation(1l, HotelGenerator.getHotel1().getName(), PatientGenerator.getP1().getFirstName(), "Zarrouk", 2, new Date(),new Date(),0,"2019-06-24","2019-06-27");
	    reservation2 = new Reservation(2l, "Mouradi", "Fathi", "Zarrouk", 1, new Date(), new Date(), 0,"2019-07-29","2019-07-09");

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
	public static List<Reservation> getReservationByNameMed(String name)
	{
		List<Reservation> arf = getDefaultReservations();
		List<Reservation>  ListReser = new ArrayList<Reservation>();
		
		for (Reservation s : arf) {
			if(s.getNomMed().equals(name) )
			{
				ListReser.add(s);

			}
		}
		return ListReser;
		
	}
	
	
	public static List<Reservation> getReservationByNameHotel(String name)
	{
		List<Reservation> arf = getDefaultReservations();
		List<Reservation>  ListHot = new ArrayList<Reservation>();
		
		for (Reservation s : arf) {
			if(s.getNomHotel().equals(name) )
			{
				ListHot.add(s);

			}
		}
		return ListHot;
		
	}
	
	
	public static List<Reservation> getReservationByNamePatient(String name)
	{
		List<Reservation> arf = getDefaultReservations();
		List<Reservation>  ListPa = new ArrayList<Reservation>();
		
		for (Reservation s : arf) {
			if(s.getNomPatient().equals(name) )
			{
				ListPa.add(s);

			}
		}
		return ListPa;
		
	}

	
	
/*
	public static Reservation addReservation(Reservation v,int typenotif,String content) {
		listResev.add(v);
	NotificationGenerator.addNewNotification(v, typenotif,content);

		return v;
*/
//	public static Reservation addReservation(Reservation v) {
//		listResev.add(v);
////	NotificationGenerator.addNewNotification(v, typenotif,content);
//
//		return v;
//	}
	public static Reservation  addReservation(String nomHotel,String nomPatient,String nomMed,int nb_lits_res,String date_Deb, String date_Fin) throws ParseException {
		Long id = (long) (getDefaultReservations().size()+1);
		//Date dd =new SimpleDateFormat("yyyy-MM-dd").parse(date_Deb);
		//Date ff =new SimpleDateFormat("yyyy-MM-dd").parse(date_Fin);
		
	       DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
           Date d1 = df2.parse(date_Deb);
           Date f1 = df2.parse(date_Fin);
           
         //  System.out.print(df2.format(d1));


		//String pattern = "yyyy-MM-dd";
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		// String dd1 = simpleDateFormat.format(date_Deb);
		//String ff = simpleDateFormat.format(date_Fin);
       // DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       // Date date = sdf.parse(dd1);

  
		//System.out.println(dd);

    
		//DateTimeFormatter formatter = DateTimeFormat.forPattern( "yyyy-MM-dd");
		

		Reservation r = new Reservation(id, nomHotel, nomPatient, nomMed, nb_lits_res , d1 , f1);
		r.setDate_Deb(df2.format(d1));
		r.setDate_Fin(df2.format(f1));
		System.out.println(df2.format(f1));
		listResev.add(r);
		return r;
	

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
