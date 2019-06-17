package us.sqoin.hotpital.modal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Medecin  extends BaseUser   implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Long idM;
	private String FirstName;
	private String LastName;
	private String Specialite;
	private List<Hotel> hotels = new ArrayList<Hotel>();
	private List<Patient> Patients = new ArrayList<Patient>();
	
	


	public Medecin(BaseUser B,String firstName, String lastName, String specialite, List<Hotel> hotels, List<Patient> patients) {
		super(B.getId(),B.getUsername(),B.getPassword(),B.getRole(),B.getStateLog());
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Specialite = specialite;
		this.hotels = hotels;
		Patients = patients;
	}



	public Medecin( String firstName, String lastName, String specialite) {
		super();
		//idM = idM;
		FirstName = firstName;
		LastName = lastName;
		Specialite = specialite;
	}



	public Medecin(BaseUser B, String firstName, String lastName, String specialite, List<Hotel> defaultHotels) {
		super(B.getId(),B.getUsername(),B.getPassword(),B.getRole(),B.getStateLog());		
		FirstName = firstName;
		LastName = lastName;
		Specialite = specialite;
		this.hotels = defaultHotels;
	}



	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getSpecialite() {
		return Specialite;
	}

	public void setSpecialite(String specialite) {
		Specialite = specialite;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}



	@Override
	public String toString() {
		return "Medecin [FirstName=" + FirstName + ", LastName=" + LastName + ", Specialite=" + Specialite + ", hotels="
				+ hotels + ", Patients=" + Patients + "]";
	}



	public List<Patient> getPatients() {
		return Patients;
	}



	public void setPatients(List<Patient> patients) {
		Patients = patients;
	}
	
	




	
	
	
	

}
