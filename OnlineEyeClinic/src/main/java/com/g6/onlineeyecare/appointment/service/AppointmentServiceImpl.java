package com.g6.onlineeyecare.appointment.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.g6.onlineeyecare.appointment.dao.IAppointmentRepository;
import com.g6.onlineeyecare.appointment.dto.Appointment;
import com.g6.onlineeyecare.exceptions.AppointmentIdNotFoundException;
import com.g6.onlineeyecare.exceptions.InvalidAppointmentException;

@Service
public class AppointmentServiceImpl implements IAppointmentService {

	@Autowired
	IAppointmentRepository repository;

	@Override
	@Transactional
	public Appointment bookAppointment(Appointment appointment) {
		try {
			repository.save(appointment);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return appointment;
	}

	@Override
	@Transactional
	public Appointment updateAppointment(Appointment appointment) throws InvalidAppointmentException {
		Optional<Appointment>optional=null;
			optional=repository.findById(appointment.getAppointmentId());
			if(optional.isPresent()) {
			repository.save(appointment);
			}
			else {
				throw new InvalidAppointmentException("Invalid Appointment Exception ");
			}
		return optional.get();
	}

	@Override
	@Transactional
	public Appointment cancelAppointment(int appointmentId) throws AppointmentIdNotFoundException {
		Optional<Appointment>optional=null;
			optional = repository.findById(appointmentId);
			if(optional.isPresent()) {
			repository.deleteById(appointmentId);
			}
			else {
				throw new AppointmentIdNotFoundException("Appointment ID not found to cancel appointment");
			}
		return optional.get();
	}

	@Override
	public Appointment viewAppointment(int appointmentId) throws AppointmentIdNotFoundException {
		Optional<Appointment>optional=null;

			optional=repository.findById(appointmentId);
			if(optional.isPresent()) {
				repository.findById(appointmentId);
			}
			else {
				throw new AppointmentIdNotFoundException("Appointment ID not found to view appointment");
			}
		return optional.get();
	}

	@Override
	public List<Appointment> viewAllAppointments() {
		List<Appointment> appointmentList = null;
		try {
			appointmentList = repository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return appointmentList;
	}

	@Override
	public List<Appointment> viewAppointments(LocalDate date) {
		 List<Appointment> dateList = new ArrayList<>();
	        try {
	            dateList=repository.viewAppointmentByDate(date);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return dateList;

	}
}
