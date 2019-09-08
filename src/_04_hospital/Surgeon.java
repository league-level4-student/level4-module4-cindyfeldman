package _04_hospital;

public class Surgeon extends Doctor{
private boolean surgery;
	Surgeon(){
	
	}
	boolean performsSurgery() {
	
		return true;
	}
	boolean makesHouseCalls() {
		return false;
	}
}
