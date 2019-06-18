package us.sqoin.hotpital.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import us.sqoin.hotpital.modal.BaseUser;
import us.sqoin.hotpital.modal.Medecin;
import us.sqoin.hotpital.modal.Notification;
import us.sqoin.hotpital.modal.Reservation;

public class NotificationGenerator {
	
	private static Notification Notif1;
	private static Notification Notif2;
	
	private static List<Notification> listnotifs = new ArrayList<Notification>();

	
	static
	{
		Notif1 = new Notification(1l, ReservateGenerator.getReservation1(), 1, "New  Reservation has been sent");
		Notif2 = new Notification(2l, ReservateGenerator.getReservation2(), 0, "New Reservation has been received");
		listnotifs.add(Notif1);
		listnotifs.add(Notif2);
		
	}
	
	
	public static List<Notification> getDefaultNotifications() {
		return listnotifs;
		
	}
	
	public static Notification addNewNotification(Reservation x, int typNotif,String content)
	{
		Long id= (long) (getDefaultNotifications().size()+1);
		Notification nr= new Notification(id, x, typNotif, content);
		listnotifs.add(nr);
		return nr;
		
	}
	/*
	public static Notification generateNotificationFromReservation(Reservation r)
	{
	return listnotifs.add(r);
		
	}
	*/

	

	
	


}
