package _04_hospital;

import java.util.ArrayList;

public class Hospital {
private int numberOfPatients;
private ArrayList<Doctor> Doctors ;
private ArrayList<Patients> Patients;
private Surgeon s;
	Hospital(){
		Doctors = new ArrayList<Doctor>();
		Patients = new ArrayList<Patients>();
		if(numberOfPatients>=3) {
			  numberOfPatients = 3;
		}
	
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
		return Patients;
	}
	void assignPatientsToDoctors() {
		
	}
}
