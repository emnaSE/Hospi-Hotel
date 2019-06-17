package us.sqoin.hotpital.modal;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Date bookDate;
	private Medecin nomMed;
	private Hotel nomHotel;
	private int nb_Lits;
	
	
	public Reservation() {
	}

	public Reservation(Long id, String name, Date bookDate) {
		super();
		this.id = id;
		this.name = name;
		this.bookDate = bookDate;
	}
	
	

	public Reservation(Long id, String name, Date bookDate, Medecin nomMed, Hotel nomHotel, int nb_Lits) {
		super();
		this.id = id;
		this.name = name;
		this.bookDate = bookDate;
		this.nomMed = nomMed;
		this.nomHotel = nomHotel;
		this.nb_Lits = nb_Lits;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public Medecin getNomMed() {
		return nomMed;
	}

	public void setNomMed(Medecin nomMed) {
		this.nomMed = nomMed;
	}

	public Hotel getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(Hotel nomHotel) {
		this.nomHotel = nomHotel;
	}

	public int getNb_Lits() {
		return nb_Lits;
	}

	public void setNb_Lits(int nb_Lits) {
		this.nb_Lits = nb_Lits;
	}
	
	
	
	

}
