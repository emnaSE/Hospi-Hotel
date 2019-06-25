package us.sqoin.hotpital.generators;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import us.sqoin.hotpital.modal.Medecin;
import us.sqoin.hotpital.modal.Reservation;

public class ReservateGenerator {

	private static Reservation reservation1;
	private static Reservation reservation2;
	private static Reservation reservation3; 
	private static ArrayList<Reservation> listResev = new ArrayList<Reservation>();
	private static int i=0;
	
	static {
	
				

		reservation1 = new Reservation(1l, HotelGenerator.getHotel1().getName(), "François", "Alain", 2, new Date(),new Date(),0,"25-06-2019","27-06-2019");
	    reservation2 = new Reservation(2l, "Hôtel Boulevard Saint-Jacques", "Cindy", "Alain", 1, new Date(), new Date(), 1,"30-06-2019","31-06-2019");
	    // reservation3 = new Reservation(2l, "Mouradi", "Fathi", "Zarrouk", 1, new Date(), new Date(), 1,"2019-07-29","2019-07-09");

	    listResev.add(reservation1);
		listResev.add(reservation2);
		//listResev.add(reservation3);
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
			if(s.getNomHotel().trim().equals(name.trim()) )
			{
				//System.out.println("******************"+ name);
				System.out.print("azzaaaaaaaaaaaaaaaaaaaaaaaa"+s.getNomHotel());
				ListHot.add(s);

			}
		}
		System.out.println(ListHot);
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
	     //  df2.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));

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
	    String yyyy = df2.format(d1).substring(0, 4);
	    String mm =  df2.format(d1).substring(5, 7);
	    String dd =  df2.format(d1).substring(8, 10);
	    
	    
	    System.out.println("Year :"+yyyy);
	    System.out.println("Month :"+mm);
	    System.out.println("Day :"+dd);
	    
	    
	    String yyyy1 = df2.format(f1).substring(0, 4);
	    String mm1 =  df2.format(f1).substring(5, 7);
	    String dd1 =  df2.format(f1).substring(8, 10);
	    
		r.setDate_Deb(dd+"-"+mm+"-"+yyyy);
		r.setDate_Fin(dd1+"-"+mm1+"-"+yyyy1);
		//System.out.println(df2.format(f1));
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


	public static List<Reservation> SortListReservationsByDateAsc()
	{
		List<Reservation> reservations =getDefaultReservations() ;
		Collections.sort(reservations, new Comparator<Reservation>() {
			  @Override
			  public int compare(Reservation r1, Reservation r2) {
				  Date parse = null;
				  Date parse2=null;
			        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				  try {
					parse = formatter.parse(r1.getDate_Deb());
					parse2 = formatter.parse(r2.getDate_Deb());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						  
			    return parse.compareTo(parse2);
			  }
			});
		return reservations;
	}
	
	public static List<Reservation> SortListReservationsByDateDesc()
	{
		List<Reservation> reservations =getDefaultReservations() ;
		Collections.sort(reservations, new Comparator<Reservation>() {
			  @Override
			  public int compare(Reservation r1, Reservation r2) {
				  Date parse = null;
				  Date parse2=null;
			        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				  try {
					parse = formatter.parse(r1.getDate_Deb());
					parse2 = formatter.parse(r2.getDate_Deb());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						  
			    return parse.compareTo(parse2);
			  }
			});
		Collections.reverse(reservations);
		return reservations;
	}
	
	public static boolean ReservationCancelledByMed(int id)
	{
		List<Reservation> arf = getDefaultReservations();
		
		for (Reservation s : arf) {
			if(s.getId()==id )
			{
				s.setEtat(3);
				//System.out.println(arf);
				return true;
			}
		
		}
		return false;
		
	}
	
	public static boolean ReservationAcceptedByHot(int id)
	{
		List<Reservation> arf = getDefaultReservations();
		
		for (Reservation s : arf) {
			if(s.getId()==id )
			{
				s.setEtat(1);
				//System.out.println(arf);
				return true;
			}
		
		}
		return false;
		
	}

	
	public static boolean ReservationRefusedByHot(int id)
	{
		List<Reservation> arf = getDefaultReservations();
		
		for (Reservation s : arf) {
			if(s.getId()==id )
			{
				s.setEtat(2);
			//	System.out.println(arf);
				return true;
			}
		
		}
		return false;
		
	}
}
