package com.g6.onlineeyecare.doctor.dao;

import java.util.List;

import com.g6.onlineeyecare.appointment.dto.Appointment;
import com.g6.onlineeyecare.doctor.dto.Doctor;
import com.g6.onlineeyecare.exceptions.AppointmentIdNotFoundException;
import com.g6.onlineeyecare.exceptions.DoctorIdNotFoundException;
import com.g6.onlineeyecare.test.dto.Test;

public interface IDoctorRepository {
	Doctor addDoctor(Doctor doctor);
	Doctor updateDoctor(Doctor doctor);
	Doctor deleteDoctor(int doctorId)throws DoctorIdNotFoundException;
	Doctor viewDoctor(int doctorId)throws DoctorIdNotFoundException;
	List<Doctor> viewDoctorsList();
	List<Appointment> viewAppointments();
	Test createTest(Test test);
}
