package com.system.studentattendance.StudentAttendanceManagementSystem.entityclasses;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "batch")
public class Batch {

	@Id
	@Column(name= "batchid")
	private int batchid;
	
	@Column(name = "batchname")
	private String batchname;
	
	@Column(name ="batchcoid")
	private int batchcoid;
	
	@OneToMany(mappedBy = "batch")
	private List<Student> students;
	
	@ManyToOne
	@JoinColumn(name = "coid")
	private Co_ordinator co_ordinator;
	
	@ManyToMany
	@JoinTable(name = "student_course",
	joinColumns = @JoinColumn(name = "batchid"), inverseJoinColumns = @JoinColumn(name = "tid"))
	private List<Trainer> trainers;
	
	public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(int batchid, String batchname, int batchcoid, List<Student> students, Co_ordinator co_ordinator,
			List<Trainer> trainers) {
		super();
		this.batchid = batchid;
		this.batchname = batchname;
		this.batchcoid = batchcoid;
		this.students = students;
		this.co_ordinator = co_ordinator;
		this.trainers = trainers;
	}

	public int getBatchid() {
		return batchid;
	}

	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}

	public String getBatchname() {
		return batchname;
	}

	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}

	public int getBatchcoid() {
		return batchcoid;
	}

	public void setBatchcoid(int batchcoid) {
		this.batchcoid = batchcoid;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Co_ordinator getCo_ordinator() {
		return co_ordinator;
	}

	public void setCo_ordinator(Co_ordinator co_ordinator) {
		this.co_ordinator = co_ordinator;
	}

	public List<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}

	@Override
	public String toString() {
		return "Batch [batchid=" + batchid + ", batchname=" + batchname + ", batchcoid=" + batchcoid + ", students="
				+ students + ", co_ordinator=" + co_ordinator + ", trainers=" + trainers + "]";
	}
	
}
