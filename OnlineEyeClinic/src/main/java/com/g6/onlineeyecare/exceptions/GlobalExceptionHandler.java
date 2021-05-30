package com.g6.onlineeyecare.exceptions;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(AppointmentIdNotFoundException.class)
	public ResponseEntity<String> handleAppointmentException(AppointmentIdNotFoundException ex)
	{
		
		HttpHeaders header = new HttpHeaders();
		header.add("Description", "Trying to get Appointment");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
		
	}
	
	@ExceptionHandler(DoctorIdNotFoundException.class)
	public ResponseEntity<String> handleDoctorException(DoctorIdNotFoundException ex)
	{
		HttpHeaders header = new HttpHeaders();
		header.add("Description", "Trying to get Doctor");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
	
	@ExceptionHandler(InvalidAppointmentException.class)
	public ResponseEntity<String> handleInvalidAppointmentException(InvalidAppointmentException ex)
	{
		HttpHeaders header = new HttpHeaders();
		header.add("Description", "Trying to get Appointment");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
	
	@ExceptionHandler(PatientIdFoundNotException.class)
	public ResponseEntity<String> handlePatientException(PatientIdFoundNotException ex)
	{
		HttpHeaders header = new HttpHeaders();
		header.add("Description", "Trying to get Patient");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
	
	@ExceptionHandler(ReportIdNotFoundException.class)
	public ResponseEntity<String> handleReportException(ReportIdNotFoundException ex)
	{
		HttpHeaders header = new HttpHeaders();
		header.add("Description", "Trying to get Report");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
	
	@ExceptionHandler(SpectaclesIdNotFoundException.class)
	public ResponseEntity<String> handleSpectaclesException(SpectaclesIdNotFoundException ex)
	{
		HttpHeaders header = new HttpHeaders();
		header.add("Description", "Trying to get Spectacles");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
	
	@ExceptionHandler(TestIdNotFoundException.class)
	public ResponseEntity<String> handleTestException(TestIdNotFoundException ex)
	{
		HttpHeaders header = new HttpHeaders();
		header.add("Description", "Trying to get Test");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
	
	@ExceptionHandler(UserIdNotFoundException.class)
	public ResponseEntity<String> handleUserException(UserIdNotFoundException ex)
	{
		HttpHeaders header = new HttpHeaders();
		header.add("Description", "Trying to get User");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(header).body(ex.getMessage());
	}
}
