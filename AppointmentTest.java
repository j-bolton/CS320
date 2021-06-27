/*
 * CS 320 Project One
 * JT Bolton
 * SNHU
 */
package module3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.*;


class AppointmentTest {
	
	// Testing variables
	private String testID = "1234567890";
	private String testDesc = "A brief test description";
	/* java.util.Date is deprecated and would not normally be used here.
	 * The assignment prompt specifically asks that it be used, but
	 * java.time would be used in real-world applications. Warnings are
	 * suppressed for the purpose of following assignment prompt.
	 */
	@SuppressWarnings("deprecation")
	private Date testDate = new Date(2022, 6, 1);


	@BeforeAll
	static void setUpBeforeClass() {
		System.out.println("-------------------------------------");
		System.out.println("    Appointment tests beginning...   ");
		System.out.println("-------------------------------------");
	}

	// Test appointment default constructor
	@Test
	void testAppointment() {
		// Create new appointment
		Appointment testAppointment = new Appointment(testID, testDesc, testDate);
		
		// Test each parameter
		assertEquals(testID, testAppointment.getAppointmentID());
		assertEquals(testDesc, testAppointment.getDescription());
		assertEquals(testDate, testAppointment.getAppointmentDate());
		
		System.out.println("Default constructor successful...");
	}

	// Test setters
	@Test
	void testSetDescription() {
		// Create new appointment
		Appointment testAppointment = new Appointment(testID, testDesc, testDate);
		
		// Set description to arbitrary different description, test that it has changed
		testAppointment.setDescription("Different");
		assertEquals("Different", testAppointment.getDescription());
		
		System.out.println("setDescription successful...");
	}

	@SuppressWarnings("deprecation")
	@Test
	void testSetAppointmentDate() {
		// Create new appointment
		Appointment testAppointment = new Appointment(testID, testDesc, testDate);
		
		// Set date to arbitrary different date, test that it has changed
		testAppointment.setAppointmentDate(new Date(2022, 12, 25));
		assertEquals(new Date(2022, 12, 25), testAppointment.getAppointmentDate());
		
		System.out.println("setAppointment successful...");
	}

	// Test getters
	@Test
	void testGetAppointmentID() {
		// Create new appointment
		Appointment testAppointment = new Appointment(testID, testDesc, testDate);
		
		// Test that getAppointmentID returns testID
		assertEquals(testID, testAppointment.getAppointmentID());
		
		System.out.println("getAppointmentID successful...");
	}

	@Test
	void testGetDescription() {
		// Create new appointment
		Appointment testAppointment = new Appointment(testID, testDesc, testDate);
		
		// Test that getDescription returns testDesc
		assertEquals(testDesc, testAppointment.getDescription());
		
		System.out.println("getDescription successful...");
	}

	@Test
	void testGetAppointmentDate() {
		// Create new appointment
		Appointment testAppointment = new Appointment(testID, testDesc, testDate);
		
		// Test that getAppointmentDate returns testDate
		assertEquals(testDate, testAppointment.getAppointmentDate());
		
		System.out.println("getAppointmentDate successful...");
	}

}
