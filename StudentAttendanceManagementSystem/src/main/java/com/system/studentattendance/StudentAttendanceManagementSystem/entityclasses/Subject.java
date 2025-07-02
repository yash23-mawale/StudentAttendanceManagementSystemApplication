package com.system.studentattendance.StudentAttendanceManagementSystem.entityclasses;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="subject")
public class Subject {

	@Id
	@Column(name="sid")
	private int sid;
	
	@Column(name="sname")
	private String sname;
	
	@OneToMany(mappedBy = "subject")
	private List<Attendance> attendanceList;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(int sid, String sname, List<Attendance> attendanceList) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.attendanceList = attendanceList;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Attendance> getAttendanceList() {
		return attendanceList;
	}

	public void setAttendanceList(List<Attendance> attendanceList) {
		this.attendanceList = attendanceList;
	}

	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", sname=" + sname + ", attendanceList=" + attendanceList + "]";
	}
	
}
