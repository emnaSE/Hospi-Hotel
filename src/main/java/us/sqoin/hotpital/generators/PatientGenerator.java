package us.sqoin.hotpital.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import us.sqoin.hotpital.modal.Medecin;
import us.sqoin.hotpital.modal.Patient;



public class PatientGenerator {

	
	private static Patient P1;
	private static Patient P2;
	private static Patient P3;
	
	private static List<Patient> ListPat = new ArrayList<Patient>();
	
	
	static
	{
		P1 = new Patient(1L, "Foulen", "Ben foulen", "Bardo", 55123456l, new Date());
		P2 = new Patient(2L, "Sami", "Sami", "ARIANA", 58123456l, new Date());
		ListPat.add(P1);
		ListPat.add(P2);

	}
	
	
	
	public static List<Patient> getDefaultsPatient() {
	  return ListPat;
	}
	public static Patient addPatient(Patient e)
	{
		ListPat.add(e);
		return e;
	}

	


	public static Patient getP1() {
		return P1;
	}

	public static void setP1(Patient p1) {
		P1 = p1;
	}

	public static Patient getP2() {
		return P2;
	}

	public static void setP2(Patient p2) {
		P2 = p2;
	}
	
	
	
	
}
