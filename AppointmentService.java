/*
 * CS 320 Project One
 * JT Bolton
 * SNHU
 */
package module3;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
	
	// List containing all appointments
	List<Appointment> appointments = new ArrayList<>();
	
	// Appointment list search based on appointment ID
	private Appointment appointmentSearch(String appointmentID) throws Exception{
		
		int i = 0;
		while (i < appointments.size()) {
			// If current task ID matches, return this task
			if (appointmentID.equals(appointments.get(i).getAppointmentID())) {
				return appointments.get(i);
			}
			// Increment index for next comparison
			i++;
		}
		// Exception thrown if no matching ID found
		throw new Exception("Task not found");
	}

	// Create new appointment with all information, add to list
	public void addAppointment(String appointmentID, String description, Date appointmentDate) {
		
		Appointment appointment = new Appointment(appointmentID, description, appointmentDate);
		appointments.add(appointment);
	}
	
	// Searches for appointment and removes from list
	public void deleteAppointment(String appointmentID) throws Exception{
		appointments.remove(appointmentSearch(appointmentID));		
	}
}
