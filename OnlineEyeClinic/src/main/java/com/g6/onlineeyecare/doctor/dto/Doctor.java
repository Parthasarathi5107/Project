package com.g6.onlineeyecare.doctor.dto;

import com.g6.onlineeyecare.user.User;

public class Doctor extends User{

private String doctorConsultationTime;
private long doctorMobile;
private String doctorEmail;
private String address;


public String getDoctorConsultationTime() {
	return doctorConsultationTime;
}
public void setDoctorConsultationTime(String doctorConsultationTime) {
	this.doctorConsultationTime = doctorConsultationTime;
}
public long getDoctorMobile() {
	return doctorMobile;
}
public void setDoctorMobile(long doctorMobile) {
	this.doctorMobile = doctorMobile;
}
public String getDoctorEmail() {
	return doctorEmail;
}
public void setDoctorEmail(String doctorEmail) {
	this.doctorEmail = doctorEmail;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public Doctor(  String doctorConsultationTime, long doctorMobile, String doctorEmail,
		String address) {
	super();
	
	
	this.doctorConsultationTime = doctorConsultationTime;
	this.doctorMobile = doctorMobile;
	this.doctorEmail = doctorEmail;
	this.address = address;
}


@Override
public String toString() {
	return "Doctor [doctorConsultationTime=" + doctorConsultationTime + ", doctorMobile=" + doctorMobile
			+ ", doctorEmail=" + doctorEmail + ", address=" + address + "]";
}


}
