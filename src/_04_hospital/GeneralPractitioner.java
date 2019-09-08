package _04_hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor{
ArrayList<Patients> ps;
	public boolean makesHouseCalls() {
		return true;
	}
	public boolean doesSurgery() {
		return false;
	}
ArrayList<Patients> assignPatient(Patients p) {
	for (int i = 0; i < ps.size(); i++) {
		ps.get(i).addPatient(p);
	}
	return ps;
}
}
