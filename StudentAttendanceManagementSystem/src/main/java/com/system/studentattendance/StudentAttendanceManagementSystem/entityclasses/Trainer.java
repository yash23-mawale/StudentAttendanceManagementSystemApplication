package com.system.studentattendance.StudentAttendanceManagementSystem.entityclasses;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer {

	@Id
	@Column(name="tid")
	private int tid;
	
	@Column(name="tname")
	private String tname;
	
	@Column(name="tph")
	private String tph;

	@Column(name="temail")
	private String temail;
	
	@ManyToMany(mappedBy = "trainers")
	private List<Batch> batches;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public Trainer(int tid, String tname, String tph, String temail, List<Batch> batches) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tph = tph;
		this.temail = temail;
		this.batches = batches;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTph() {
		return tph;
	}

	public void setTph(String tph) {
		this.tph = tph;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public List<Batch> getBatches() {
		return batches;
	}

	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}

	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + ", tph=" + tph + ", temail=" + temail + ", batches="
				+ batches + "]";
	}
	
}
