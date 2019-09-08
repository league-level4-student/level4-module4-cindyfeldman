package _04_hospital;

import java.util.ArrayList;

public class Patients extends Hospital{
	
	private boolean pulse;
boolean checkPulse() {
	return pulse;
}
	boolean feelsCaredFor() {
		if(checkPulse()) {
			return true;
		}
	return false;
	}
	private int numberOfPatients;
	private ArrayList<Doctor> Doctors ;
	private ArrayList<Patients> Patients;
	private Surgeon s;
		Patients(){
			Patients = new ArrayList<Patients>();
		
		}

		public void addDoctor(GeneralPractitioner generalPractitioner) {
			generalPractitioner = new GeneralPractitioner();
			Doctors.add(generalPractitioner);
			
		}
		public void addDoctor(Surgeon surgeon) {
		surgeon = new Surgeon();
		Doctors.add(surgeon);
		}
		public void addPatient(Patients p) {
			p = new Patients();
			Patients.add(p);
		}
		ArrayList<Doctor> getDoctors() {
			return Doctors;
		}
		ArrayList<Patients> getPatients(){
		Patients = new ArrayList<Patients>();
		
			return Patients;
		}
		void assignPatientsToDoctors() {
			
		}
}
