package com.g6.onlineeyecare.appointment.dao;

import java.time.LocalDate;
import java.util.List;

import com.g6.onlineeyecare.appointment.dto.Appointment;
import com.g6.onlineeyecare.exceptions.AppointmentIdNotFoundException;
import com.g6.onlineeyecare.exceptions.InvalidAppointmentException;

public interface IAppointmentRepository {
	Appointment bookAppointment(Appointment appointment);
	Appointment updateAppointment(Appointment appointment)throws InvalidAppointmentException;
	Appointment cancelAppointment(int appointmentId)throws AppointmentIdNotFoundException;
	Appointment viewAppointment(int appointmentId)throws AppointmentIdNotFoundException;
	List<Appointment> viewAllAppointments();
	List<Appointment> viewAppointments(LocalDate date);
}
