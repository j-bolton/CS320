/*
 * CS 320 Project One
 * JT Bolton
 * SNHU
 */
package module3;

import java.util.Date;

public class Appointment {

	private String appointmentID;
	private String description;
	/* java.util.Date is deprecated and would not normally be used here.
	 * The assignment prompt specifically asks that it be used, but
	 * java.time would be used in real-world applications.
	 */
	private Date appointmentDate;
	
	// Constructor
	Appointment(String appointmentID, String description, Date appointmentDate) {
		setAppointmentID(appointmentID);
		setDescription(description);
		setAppointmentDate(appointmentDate);
	}
	
	// Setters
	private void setAppointmentID(String appointmentID) {
		
		// Only accepts 1-10 characters
		if (appointmentID == null || appointmentID.length() > 10) {
			System.out.println("Error - Appointment ID must be between 1 and 10 characters.");
		}
		else {
			this.appointmentID = appointmentID;
		}
	}
	
	public void setDescription(String description) {
		
		// Only accepts 1-50 characters
		if (description == null || description.length() > 50) {
			System.out.println("Error - Description must be between 1 and 50 characters.");
		}
		else {
			this.description = description;
		}
	}
	
	public void setAppointmentDate(Date appointmentDate) {
		
		// Only accepts valid dates that are not in the past
		if (appointmentDate == null || appointmentDate.before(new Date())) {
			System.out.println("Error - Date cannot be null or in the past.");
		}
		else {
			this.appointmentDate = appointmentDate;
		}
	}
	
	// Getters
	public String getAppointmentID() {
		return appointmentID;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
}
