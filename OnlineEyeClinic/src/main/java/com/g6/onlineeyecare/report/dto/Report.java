package com.g6.onlineeyecare.report.dto;

import java.time.LocalDateTime;

import com.g6.onlineeyecare.patient.dto.Patient;
import com.g6.onlineeyecare.test.dto.Test;


public class Report {
	private int reportId;
	private LocalDateTime dateOfReport;
	private String descriptionOfReport;
	private String visualAcuity;
	private String visualAcuityNear;
	private String visualAcuityDistance;
	private Test    typeOfTest;
	private Patient patient;
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public LocalDateTime getDateOfReport() {
		return dateOfReport;
	}
	public void setDateOfReport(LocalDateTime dateOfReport) {
		this.dateOfReport = dateOfReport;
	}
	public String getDescriptionOfReport() {
		return descriptionOfReport;
	}
	public void setDescriptionOfReport(String descriptionOfReport) {
		this.descriptionOfReport = descriptionOfReport;
	}
	public String getVisualAcuity() {
		return visualAcuity;
	}
	public void setVisualAcuity(String visualAcuity) {
		this.visualAcuity = visualAcuity;
	}
	public String getVisualAcuityNear() {
		return visualAcuityNear;
	}
	public void setVisualAcuityNear(String visualAcuityNear) {
		this.visualAcuityNear = visualAcuityNear;
	}
	public String getVisualAcuityDistance() {
		return visualAcuityDistance;
	}
	public void setVisualAcuityDistance(String visualAcuityDistance) {
		this.visualAcuityDistance = visualAcuityDistance;
	}
	public Test getTypeOfTest() {
		return typeOfTest;
	}
	public void setTypeOfTest(Test typeOfTest) {
		this.typeOfTest = typeOfTest;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Report(int reportId, LocalDateTime dateOfReport, String descriptionOfReport, String visualAcuity,
			String visualAcuityNear, String visualAcuityDistance, Test typeOfTest, Patient patient) {
		super();
		this.reportId = reportId;
		this.dateOfReport = dateOfReport;
		this.descriptionOfReport = descriptionOfReport;
		this.visualAcuity = visualAcuity;
		this.visualAcuityNear = visualAcuityNear;
		this.visualAcuityDistance = visualAcuityDistance;
		this.typeOfTest = typeOfTest;
		this.patient = patient;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfReport == null) ? 0 : dateOfReport.hashCode());
		result = prime * result + ((descriptionOfReport == null) ? 0 : descriptionOfReport.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + reportId;
		result = prime * result + ((typeOfTest == null) ? 0 : typeOfTest.hashCode());
		result = prime * result + ((visualAcuity == null) ? 0 : visualAcuity.hashCode());
		result = prime * result + ((visualAcuityDistance == null) ? 0 : visualAcuityDistance.hashCode());
		result = prime * result + ((visualAcuityNear == null) ? 0 : visualAcuityNear.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		if (dateOfReport == null) {
			if (other.dateOfReport != null)
				return false;
		} else if (!dateOfReport.equals(other.dateOfReport))
			return false;
		if (descriptionOfReport == null) {
			if (other.descriptionOfReport != null)
				return false;
		} else if (!descriptionOfReport.equals(other.descriptionOfReport))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (reportId != other.reportId)
			return false;
		if (typeOfTest == null) {
			if (other.typeOfTest != null)
				return false;
		} else if (!typeOfTest.equals(other.typeOfTest))
			return false;
		if (visualAcuity == null) {
			if (other.visualAcuity != null)
				return false;
		} else if (!visualAcuity.equals(other.visualAcuity))
			return false;
		if (visualAcuityDistance == null) {
			if (other.visualAcuityDistance != null)
				return false;
		} else if (!visualAcuityDistance.equals(other.visualAcuityDistance))
			return false;
		if (visualAcuityNear == null) {
			if (other.visualAcuityNear != null)
				return false;
		} else if (!visualAcuityNear.equals(other.visualAcuityNear))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", dateOfReport=" + dateOfReport + ", descriptionOfReport="
				+ descriptionOfReport + ", visualAcuity=" + visualAcuity + ", visualAcuityNear=" + visualAcuityNear
				+ ", visualAcuityDistance=" + visualAcuityDistance + ", typeOfTest=" + typeOfTest + ", patient="
				+ patient + "]";
	}
	
	
	
}
