package us.sqoin.hotpital.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import us.sqoin.hotpital.modal.Hotel;
import us.sqoin.hotpital.modal.Medecin;
import us.sqoin.hotpital.modal.Patient;

public class MedecinGenerator {
	
	private static Medecin MD1;
	private static Medecin MD2;
	private static Medecin MD3;
	
	private static ArrayList<Hotel> m = new ArrayList<Hotel>();
	private static ArrayList<Patient> p = new ArrayList<Patient>();
	private static ArrayList<Medecin> Medecins = new ArrayList<Medecin>();
	
    
	static {
		m.add(HotelGenerator.getHotel1());
		p.add(PatientGenerator.getP1());
		//System.out.print(p);

		MD1 = new Medecin(BaseUsersGenerator.getUser1(),"Zarrouk", "Souhail", "Cardiologie",m,p);
	    MD2 = new Medecin(BaseUsersGenerator.getUser5(),"kochbati", "Mourad", "Chirurgie générale pédiatrique",m,p);
	    Medecins.add(MD1);
	    Medecins.add(MD2);
		
		
		
	//	((Hotel) hotel1).setIdM(Md1.getIdM());
	}
	

	public static List<Hotel> getHotelByIdMed(int id) {
		
		List<Medecin> arf = getDefaultMedecins();
		List<Hotel> bingo = new ArrayList<Hotel>();
		for (Medecin s : arf) {
			if(s.getId()==id )
			{
				bingo.addAll(s.getHotels());
				return bingo;
			}
		}	
		return null;	
	}
	
	public static List<Medecin> getDefaultMedecins() {
		return Medecins;
	}
	
	//add patient to mdecin
	public static Medecin addPatientToMedecin(Patient Pa,int id)
	{
		
		
		List<Medecin> arf = getDefaultMedecins();
		Medecin r=null;
		for (Medecin s : arf) {
			if(s.getId()==id )
			{
			//resoudre le probleme d'ajout patient
				r=s;
			 s.getPatients().add(Pa);
				System.out.print(s.getPatients());

			}
		}
		return r;
	}

	public static Medecin getMedecin(int id) {
		List<Medecin> arf = getDefaultMedecins();
		Medecin r=null;
		for (Medecin s : arf) {
			if(s.getId()==id )
			{
			//	System.out.println("Medecin Connected");
				//System.out.print(id+"*****");
				//System.out.print(s.getId());
				r=s;
				//System.out.println(r);
			 return r;
			}
		}
		//System.out.print("Medecin Not Connected");
		return r;
	}
	public static Medecin getMedecinByname(String name)
	{
		List<Medecin> am = getDefaultMedecins();
		Medecin la=null;
		for (Medecin s : am)
		{
			if(s.getUsername().equals(name))
			{
				la=s;
				return la;
				
			}
		}
		return la;
	}
	public static Medecin addPatient(int idM,Patient e)
	{
		List<Medecin> Me = getDefaultMedecins();
		Medecin r=null;

		for(Medecin ar : Me)
		{
			if(ar.getId().longValue()==(long) idM) {
				//System.out.print(idM);
				//System.out.print(ar.getId());
				List<Patient> X=ar.getPatients();
				//System.out.print(X);
				X.add(e);
				r=ar;
				return r;
			}
			else{
				r=null;
			}
			
		}
		//System.out.print(r);

		return r;
	}
	public static ArrayList<Hotel> getM() {
		return m;
	}
	public static void setM(ArrayList<Hotel> m) {
		MedecinGenerator.m = m;
	}
	public static ArrayList<Patient> getP() {
		return p;
	}
	public static void setP(ArrayList<Patient> p) {
		MedecinGenerator.p = p;
	}
	public static ArrayList<Medecin> getMedecins() {
		return Medecins;
	}
	public static void setMedecins(ArrayList<Medecin> medecins) {
		Medecins = medecins;
	}
	
	
	
}
