package us.sqoin.hotpital.modal;

import java.io.Serializable;

public class Notification  implements Serializable {
	
	private Long id;
	private Reservation rev;
	private int typeNotif;
	private String Content ;
	
	
	public Notification()
	{
		
	}
	public Notification(Long id, Reservation rev) {
		super();
		this.id = id;
		this.rev = rev;
	}
	
	
	public Notification(Long id, Reservation rev, int typeNotif, String content) {
		super();
		this.id = id;
		this.rev = rev;
		this.typeNotif = typeNotif;
		Content = content;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Reservation getRev() {
		return rev;
	}
	public void setRev(Reservation rev) {
		this.rev = rev;
	}
	public int getTypeNotif() {
		return typeNotif;
	}
	public void setTypeNotif(int typeNotif) {
		this.typeNotif = typeNotif;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	
	
	
	
	

}
