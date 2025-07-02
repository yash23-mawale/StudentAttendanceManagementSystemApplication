package com.system.studentattendance.StudentAttendanceManagementSystem.entityclasses;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	
	@Column(name="aistatus")
	private String aistatus;
	
	@ManyToOne
	@JoinColumn(name="batchid")
	private Batch batch;
	
	@OneToMany(mappedBy = "student")
	private List<Attendance> attendanceList;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int frn, String sname, String semail, String smobno, String pmobno, String aistatus, Batch batch,
			List<Attendance> attendanceList) {
		super();
		this.frn = frn;
		this.sname = sname;
		this.semail = semail;
		this.smobno = smobno;
		this.pmobno = pmobno;
		this.aistatus = aistatus;
		this.batch = batch;
		this.attendanceList = attendanceList;
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

	public String getAistatus() {
		return aistatus;
	}

	public void setAistatus(String aistatus) {
		this.aistatus = aistatus;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public List<Attendance> getAttendanceList() {
		return attendanceList;
	}

	public void setAttendanceList(List<Attendance> attendanceList) {
		this.attendanceList = attendanceList;
	}

	@Override
	public String toString() {
		return "Student [frn=" + frn + ", sname=" + sname + ", semail=" + semail + ", smobno=" + smobno + ", pmobno="
				+ pmobno + ", aistatus=" + aistatus + ", batch=" + batch + ", attendanceList=" + attendanceList + "]";
	}
	
	
}
