package com.xworkz.collection1.dto;
import java.io.Serializable;

public class HRDto implements Serializable {
	private String name;
	private String qualification;
	private double totalExp;
	private String location;
	public HRDto() {

	}

	public HRDto(String name, String qualification, int totalExp, String location) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.totalExp = totalExp;
		this.location = location;
	}

	@Override
	public String toString() {
		return "HRDTO [name=" + name + ", qualification=" + qualification + ", totalExp=" + totalExp + ", location="
				+ location + "]";
	}

	public String getName() {
		return name;
	}

	public String getQualification() {
		return qualification;
	}

	public double getTotalExp() {
		return totalExp;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qualification == null) ? 0 : qualification.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalExp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		HRDto other = (HRDto) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qualification == null) {
			if (other.qualification != null)
				return false;
		} else if (!qualification.equals(other.qualification))
			return false;
		if (Double.doubleToLongBits(totalExp) != Double.doubleToLongBits(other.totalExp))
			return false;
		return true;
	}

	

	
	
}
	
	


