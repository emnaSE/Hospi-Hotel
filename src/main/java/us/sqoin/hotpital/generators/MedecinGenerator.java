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
	
    
	static {
		m.add(HotelGenerator.getHotel1());
		p.add(PatientGenerator.getP1());
		//System.out.print(p);

		MD1 = new Medecin(BaseUsersGenerator.getUser1(),"Zarrouk", "Souhail", "Cardiologie",m,p);
	    MD2 = new Medecin(BaseUsersGenerator.getUser1(),"kochbati", "Mourad", "Chirurgie générale pédiatrique",m,p);
		
		
		
	//	((Hotel) hotel1).setIdM(Md1.getIdM());
	}
	

	public static List<Medecin> getDefaultMedecins() {
		return Arrays.asList(MD1,MD2);
	}

	public static Medecin getMedecin(int id) {
		List<Medecin> arf = getDefaultMedecins();
		Medecin r=null;
		for (Medecin s : arf) {
			if(s.getId()==id )
			{
			//	System.out.println("Medecin Connected");
				System.out.print(id+"*****");
				System.out.print(s.getId());
				r=s;
				System.out.println(r);
			 return r;
			}
		}
		//System.out.print("Medecin Not Connected");
		return r;
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
	
	
	
}
