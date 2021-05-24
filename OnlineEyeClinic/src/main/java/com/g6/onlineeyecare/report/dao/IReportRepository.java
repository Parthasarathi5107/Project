package com.g6.onlineeyecare.report.dao;

import java.time.LocalDate;
import java.util.List;

import com.g6.onlineeyecare.exceptions.PatientIdFoundNotException;
import com.g6.onlineeyecare.exceptions.ReportIdNotFoundException;
import com.g6.onlineeyecare.report.dto.Report;
import com.g6.onlineeyecare.spectacles.dto.Spectacles;

public interface IReportRepository {
	Report addReport(Report report);

	Report updateReport(Report Report);

	Report removeReport(int reportId)throws ReportIdNotFoundException;

	Report viewReport(int reportId, int patientId)throws ReportIdNotFoundException,PatientIdFoundNotException;

	List<Report> viewAllReport(LocalDate date);

	List<Spectacles>  viewSpetacles();
}
