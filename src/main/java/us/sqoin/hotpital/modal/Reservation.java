package us.sqoin.hotpital.modal;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
    private String nomHotel;
    private String nomPatient;
    private String nomMed;
    private int nb_lits_res;
    private Date Date_Deb;
    private Date Date_Fin;
    private int etat=0;
    //to add date debut et datefin 
 	//to function add reservation non compelete elle prend tout l'id return la liste de notification pour un id 
    
    public Reservation()
    {
    	
    }

	public Reservation(Long id, String nomHotel, String nomPatient, String nomMed, int nb_lits_res, Date date_Deb,
			Date date_Fin ,int etat) {
		super();
		this.id = id;
		this.nomHotel = nomHotel;
		this.nomPatient = nomPatient;
		this.nomMed = nomMed;
		this.nb_lits_res = nb_lits_res;
		Date_Deb = date_Deb;
		Date_Fin = date_Fin;
		this.etat = etat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	public String getNomMed() {
		return nomMed;
	}

	public void setNomMed(String nomMed) {
		this.nomMed = nomMed;
	}

	public int getNb_lits_res() {
		return nb_lits_res;
	}

	public void setNb_lits_res(int nb_lits_res) {
		this.nb_lits_res = nb_lits_res;
	}

	public Date getDate_Deb() {
		return Date_Deb;
	}

	public void setDate_Deb(Date date_Deb) {
		Date_Deb = date_Deb;
	}

	public Date getDate_Fin() {
		return Date_Fin;
	}

	public void setDate_Fin(Date date_Fin) {
		Date_Fin = date_Fin;
	}

	
	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", nomHotel=" + nomHotel + ", nomPatient=" + nomPatient + ", nomMed=" + nomMed
				+ ", nb_lits_res=" + nb_lits_res + ", Date_Deb=" + Date_Deb + ", Date_Fin=" + Date_Fin + "]";
	}
    
	
    
    
    
 
	
}
