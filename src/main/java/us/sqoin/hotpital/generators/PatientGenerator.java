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
	
	
	
	static
	{
		P1 = new Patient(null, "Foulen", "Ben foulen", "Bardo", 55123456l, new Date());
		P1 = new Patient(null, "Sami", "Sami", "ARIANA", 58123456l, new Date());

	}
	
	
	
	public static List<Patient> getDefaultMedecins() {
		return Arrays.asList(P1,P2);
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
