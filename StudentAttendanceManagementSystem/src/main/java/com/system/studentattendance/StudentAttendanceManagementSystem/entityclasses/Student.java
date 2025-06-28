package com.system.studentattendance.StudentAttendanceManagementSystem.entityclasses;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="frn")
	private int frn;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="semail")
	private String semail;
	
	@Column(name="smobno")
	private String smobno;
	
	@Column(name="pmobno")
	private String pmobno;
	
	@Column(name="batch_id")
	private int batch_id;
	
	@Column(name="aistatus")
	private String aistatus;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int frn, String sname, String semail, String smobno, String pmobno, int batch_id, String aistatus) {
		super();
		this.frn = frn;
		this.sname = sname;
		this.semail = semail;
		this.smobno = smobno;
		this.pmobno = pmobno;
		this.batch_id = batch_id;
		this.aistatus = aistatus;
	}

	public int getFrn() {
		return frn;
	}

	public void setFrn(int frn) {
		this.frn = frn;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSmobno() {
		return smobno;
	}

	public void setSmobno(String smobno) {
		this.smobno = smobno;
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

	public String getAistatus() {
		return aistatus;
	}

	public void setAistatus(String aistatus) {
		this.aistatus = aistatus;
	}
	
}
