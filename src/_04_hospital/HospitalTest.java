package _04_hospital;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

import junit.framework.TestCase;

/* requirements:
 * 1. hospital has doctors and patients
 * 2. doctors can be GeneralPractictioner or Surgeon
 * 3. patients can be assigned to doctors
 * 4. doctors can have no more than 3 patients
 */

public class HospitalTest extends TestCase {

	Hospital testHospital = new Hospital();

	public void testAddDoctor() {
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new Surgeon());
		assertEquals(3, testHospital.getDoctors().size());
	}

	public void testAddPatient() throws Exception {
		testHospital.addPatient(new Patients());
		testHospital.addPatient(new Patients());
		testHospital.addPatient(new Patients());
		assertEquals(3, testHospital.getPatients().size());
	
	}

	/* Fix asserts one at a time */
	public void testDoctorsHaveSpecialties() throws Exception {
	Doctor testDoctor = new Doctor();
		assertEquals(false, testDoctor.performsSurgery());

		Doctor testSurgeon = new Surgeon();
		assertEquals(true, testSurgeon.performsSurgery());

		GeneralPractitioner testGP = new GeneralPractitioner();
		assertEquals(true, testGP.makesHouseCalls());
		assertEquals(false, testSurgeon.makesHouseCalls());
		assertEquals(false, testDoctor.makesHouseCalls());
	}

	/* A doctor has a list of patients */
	public void testAssignDoctor() throws Exception {
		Doctor testDoctor = new GeneralPractitioner();
		testDoctor.assignPatients(new Patients());
		assertEquals(1, testDoctor.getPatients().size());
		testDoctor.assignPatients(new Patients());
		assertEquals(2, testDoctor.getPatients().size());
		testDoctor.assignPatients(new Patients());
		assertEquals(3, testDoctor.getPatients().size());
	}

//	/* When you check a patient's pulse, they feel cared for */
//	public void testCheckPulse() throws Exception {
//		Patients testPatient = new Patients();
//		assertEquals(false, testPatient.feelsCaredFor());
//		testPatient.checkPulse();
//		assertEquals(true, testPatient.feelsCaredFor());
//	}
//
//	/* Doctors work on their Patients by checking their pulses. */
//	public void testDoctorsWork() throws Exception {
//		Doctor testDoctor = new GeneralPractitioner();
//		Patients max = new Patients();
//		Patients macky = new Patients();
//		testDoctor.assignPatient(max);
//		testDoctor.assignPatient(macky);
//		assertEquals(false, max.feelsCaredFor());
//		assertEquals(false, macky.feelsCaredFor());
//		testDoctor.doMedicine();
//		assertEquals(true, max.feelsCaredFor());
//		assertEquals(true, macky.feelsCaredFor());
//	}
//
//	/* test calling assignPatient when doctor is full throws exception */
//	public void testDoctorsCanOnlyHandle3Patients() throws Exception {
//		Doctor testDoctor = new Doctor();
//		testDoctor.assignPatient(new Patients());
//		testDoctor.assignPatient(new Patients());
//		testDoctor.assignPatient(new Patients());
//		testDoctor.assignPatient(new Patients());
//		assertTrue(false);
//assertTrue(testDoctor.getPatients().size() == 3);
//	}
//
//	public void test8Patients() throws Exception {
//		// TODO: add 3 doctors to hospital
//Surgeon one = new Surgeon();
//GeneralPractitioner g = new GeneralPractitioner();
//Surgeon s = new Surgeon();
//Hospital h = new Hospital();
//h.addDoctor(one);
//h.addDoctor(g);
//h.addDoctor(s);
//		// TODO: add 8 patients to hospital
//for (int i = 0; i < 8; i++) {
//	Patients p = new Patients();
//	h.addPatient(p);;
//}
//
//		// hospital assigns patients to doctors
//		testHospital.assignPatientsToDoctors();
//		// hospital.getDoctors shows doctors have 3, 3, 2 patients
//		List<Doctor> testDoctors = testHospital.getDoctors();
//		assertEquals(3, testDoctors.get(0).getPatients().size());
//		assertEquals(3, testDoctors.get(1).getPatients().size());
//		assertEquals(2, testDoctors.get(2).getPatients().size());
//	}



}
