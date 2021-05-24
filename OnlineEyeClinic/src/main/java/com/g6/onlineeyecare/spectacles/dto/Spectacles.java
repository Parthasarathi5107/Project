package com.g6.onlineeyecare.spectacles.dto;

import com.g6.onlineeyecare.patient.dto.Patient;

public class Spectacles {
	private int spectaclesId;
	private String spectaclesModel;
	private String spectaclesDescription;
	private double spectaclesCost;
	private Patient patient;
	
	public int getSpectaclesId() {
		return spectaclesId;
	}
	public void setSpectaclesId(int spectaclesId) {
		this.spectaclesId = spectaclesId;
	}
	public String getSpectaclesModel() {
		return spectaclesModel;
	}
	public void setSpectaclesModel(String spectaclesModel) {
		this.spectaclesModel = spectaclesModel;
	}
	public String getSpectaclesDescription() {
		return spectaclesDescription;
	}
	public void setSpectaclesDescription(String spectaclesDescription) {
		this.spectaclesDescription = spectaclesDescription;
	}
	public double getSpectaclesCost() {
		return spectaclesCost;
	}
	public void setSpectaclesCost(double spectaclesCost) {
		this.spectaclesCost = spectaclesCost;
	}
	public Spectacles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Spectacles(int spectaclesId, String spectaclesModel, String spectaclesDescription, double spectaclesCost,
			Patient patient) {
		super();
		this.spectaclesId = spectaclesId;
		this.spectaclesModel = spectaclesModel;
		this.spectaclesDescription = spectaclesDescription;
		this.spectaclesCost = spectaclesCost;
		this.patient = patient;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		long temp;
		temp = Double.doubleToLongBits(spectaclesCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((spectaclesDescription == null) ? 0 : spectaclesDescription.hashCode());
		result = prime * result + spectaclesId;
		result = prime * result + ((spectaclesModel == null) ? 0 : spectaclesModel.hashCode());
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
		Spectacles other = (Spectacles) obj;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (Double.doubleToLongBits(spectaclesCost) != Double.doubleToLongBits(other.spectaclesCost))
			return false;
		if (spectaclesDescription == null) {
			if (other.spectaclesDescription != null)
				return false;
		} else if (!spectaclesDescription.equals(other.spectaclesDescription))
			return false;
		if (spectaclesId != other.spectaclesId)
			return false;
		if (spectaclesModel == null) {
			if (other.spectaclesModel != null)
				return false;
		} else if (!spectaclesModel.equals(other.spectaclesModel))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Spectacles [spectaclesId=" + spectaclesId + ", spectaclesModel=" + spectaclesModel
				+ ", spectaclesDescription=" + spectaclesDescription + ", spectaclesCost=" + spectaclesCost
				+ ", patient=" + patient + "]";
	}
	
	
}
