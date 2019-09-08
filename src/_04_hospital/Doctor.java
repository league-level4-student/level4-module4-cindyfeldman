package _04_hospital;

import java.util.ArrayList;

public class Doctor {
Doctor d;
Doctor s ;
Patients p=new Patients();
ArrayList<Patients> patient;
GeneralPractitioner gp ;
boolean call = false;
boolean sur = false;

Doctor(){


}
boolean makesHouseCalls() {
return call;
}
boolean performsSurgery() {
	return sur;

}
void assignPatients(Patients p){
	p = new Patients();
	p.addPatient(p);


}
public ArrayList<Patients> getPatients() {
	 patient = new ArrayList<Patients>();
	 patient.add(p);
	for (int i = 0; i < 3; i++) {
		patient.get(i).addPatient(p);
	}
return patient;
	
}
}

