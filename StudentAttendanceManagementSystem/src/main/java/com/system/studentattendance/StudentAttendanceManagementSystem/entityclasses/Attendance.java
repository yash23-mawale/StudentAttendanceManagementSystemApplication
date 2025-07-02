package com.system.studentattendance.StudentAttendanceManagementSystem.entityclasses;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="attendance")
public class Attendance {

	@Id
	@Column(name="aid")
	@GeneratedValue
	private int aid;
	
	@ManyToOne
	@JoinColumn(name = "frn")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "sid")
	private Subject subject;
	
	@Column(name="date")
	private LocalDate date;
	
	@Column(name="pastatus")
	private String pastatus;
	
	public Attendance() {
		// TODO Auto-generated constructor stub
	}

	public Attendance(int aid, Student student, Subject subject, LocalDate date, String pastatus) {
		super();
		this.aid = aid;
		this.student = student;
		this.subject = subject;
		this.date = date;
		this.pastatus = pastatus;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getPastatus() {
		return pastatus;
	}

	public void setPastatus(String pastatus) {
		this.pastatus = pastatus;
	}

	@Override
	public String toString() {
		return "Attendance [aid=" + aid + ", student=" + student + ", subject=" + subject + ", date=" + date
				+ ", pastatus=" + pastatus + "]";
	}
	
}
