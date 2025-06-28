package com.system.studentattendance.StudentAttendanceManagementSystem.entityclasses;

public class Student {

	private int frn;
	private String name;
	private String email;
	private String mobno;
	private String pmobno;
	private int batch_id;
	private String status;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int frn, String name, String email, String mobno, String pmobno, int batch_id, String status) {
		super();
		this.frn = frn;
		this.name = name;
		this.email = email;
		this.mobno = mobno;
		this.pmobno = pmobno;
		this.batch_id = batch_id;
		this.status = status;
	}

	public int getFrn() {
		return frn;
	}

	public void setFrn(int frn) {
		this.frn = frn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getPmobno() {
		return pmobno;
	}

	public void setPmobno(String pmobno) {
		this.pmobno = pmobno;
	}

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [frn=" + frn + ", name=" + name + ", email=" + email + ", mobno=" + mobno + ", pmobno=" + pmobno
				+ ", batch_id=" + batch_id + ", status=" + status + "]";
	}
	
}
