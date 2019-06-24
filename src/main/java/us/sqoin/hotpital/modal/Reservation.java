package us.sqoin.hotpital.modal;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;



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
    private Date x;
    private Date y;
    private int etat=0;
    
    private String Date_Deb;
    private String Date_Fin;
   
    
    
    public Reservation()
    {
    	
    }

	public Reservation(Long id, String nomHotel, String nomPatient, String nomMed, int nb_lits_res, Date x,
			Date y ,int etat) {
/*
		super();
		this.id = id;
		this.nomHotel = nomHotel;
		this.nomPatient = nomPatient;
		this.nomMed = nomMed;
		this.nb_lits_res = nb_lits_res;
		Date_Deb = date_Deb;
		Date_Fin = date_Fin;
		this.etat = etat;
*/
		super();
		this.id = id;
		this.nomHotel = nomHotel;
		this.nomPatient = nomPatient;
		this.nomMed = nomMed;
		this.nb_lits_res = nb_lits_res;
		this.x = x;
		this.y = y;
		this.etat = etat;
	}

	public Reservation(Long id2, String nomHotel2, String nomPatient2, String nomMed2, int nb_lits_res2, Date x,
			Date y) {
		super();
		this.id = id2;
		this.nomHotel = nomHotel2;
		this.nomPatient = nomPatient2;
		this.nomMed = nomMed2;
		this.nb_lits_res = nb_lits_res2;
		this.x = x;
		this.y = y;
		etat =0;


	}
	

	public Reservation(Long id, String nomHotel, String nomPatient, String nomMed, int nb_lits_res, Date x,
			Date y , int etat, String Date_Deb, String Date_Fin) {
		super();
		this.id = id;
		this.nomHotel = nomHotel;
		this.nomPatient = nomPatient;
		this.nomMed = nomMed;
		this.nb_lits_res = nb_lits_res;
		this.x = x;
		this.y = y;
		this.etat = etat;
		this.Date_Deb = Date_Deb;
		this.Date_Fin = Date_Fin;
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



	
	public Date getX() {
		return x;
	}

	public void setX(Date x) {
		this.x = x;
	}

	public Date getY() {
		return y;
	}

	public void setY(Date y) {
		this.y = y;
	}

	public String getDate_Deb() {
		return Date_Deb;
	}

	public void setDate_Deb(String date_Deb) {
		Date_Deb = date_Deb;
	}

	public String getDate_Fin() {
		return Date_Fin;
	}

	public void setDate_Fin(String date_Fin) {
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
