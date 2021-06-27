/*
 * CS 320 Project One
 * JT Bolton
 * SNHU
 */
package module3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Date;

class AppointmentServiceTest {
	
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
		System.out.println("AppointmentService tests beginning...");
		System.out.println("-------------------------------------");
	}

	// Test addAppointment() with all parameters
	@Test
	void testAddAppointment() {
		
		// Create AppointmentService, add appointment
		AppointmentService testService = new AppointmentService();
		testService.addAppointment(testID, testDesc, testDate);
		
		// Test each parameter of default constructor
		assertNotNull(testService.appointments.get(0));
		assertEquals(testID, testService.appointments.get(0).getAppointmentID());
		assertEquals(testDesc, testService.appointments.get(0).getDescription());
		assertEquals(testDate, testService.appointments.get(0).getAppointmentDate());
		
		System.out.println("addAppointment successful...");
	}
	
	// Test deleteAppointment() by appointment ID
	@Test
	void testDeleteAppointment() throws Exception{
		
		// Create AppointmentService, add appointment
		AppointmentService testService = new AppointmentService();
		testService.addAppointment(testID, testDesc, testDate);
		
		// Delete appointment, test that appointment list is empty
		testService.deleteAppointment(testID);
		assertTrue(testService.appointments.isEmpty());
		
		System.out.println("deleteAppointment successful...");
	}

}
