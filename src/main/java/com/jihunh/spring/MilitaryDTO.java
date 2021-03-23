package com.jihunh.spring;

public class MilitaryDTO {
	
	private String military;
	private String dept;
	private String add;
	private String longtime;
	
	public MilitaryDTO() {}

	public MilitaryDTO(String military, String dept, String add, String longtime) {
		super();
		this.military = military;
		this.dept = dept;
		this.add = add;
		this.longtime = longtime;
	}

	public String getMilitary() {
		return military;
	}

	public void setMilitary(String military) {
		this.military = military;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getLongtime() {
		return longtime;
	}

	public void setLongtime(String longtime) {
		this.longtime = longtime;
	}

	@Override
	public String toString() {
		return "MilitaryDTO [military=" + military + ", dept=" + dept + ", add=" + add + ", longtime=" + longtime + "]";
	}
	
}
