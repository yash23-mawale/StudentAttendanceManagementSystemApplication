package com.system.studentattendance.StudentAttendanceManagementSystem.entityclasses;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "co_ordinator")
public class Co_ordinator {

	@Id
	@Column(name="coid")
	private int coid;
	
	@Column(name="coemail")
	private String coemail;

	@Column(name="coph")
	private String coph;
	     
	@OneToMany(mappedBy = "co_ordinator")
	private List<Batch> batches;
	
	public Co_ordinator() {
		// TODO Auto-generated constructor stub
	}

	public Co_ordinator(int coid, String coemail, String coph, List<Batch> batches) {
		super();
		this.coid = coid;
		this.coemail = coemail;
		this.coph = coph;
		this.batches = batches;
	}

	public int getCoid() {
		return coid;
	}

	public void setCoid(int coid) {
		this.coid = coid;
	}

	public String getCoemail() {
		return coemail;
	}

	public void setCoemail(String coemail) {
		this.coemail = coemail;
	}

	public String getCoph() {
		return coph;
	}

	public void setCoph(String coph) {
		this.coph = coph;
	}

	public List<Batch> getBatches() {
		return batches;
	}

	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}

	@Override
	public String toString() {
		return "Co_ordinator [coid=" + coid + ", coemail=" + coemail + ", coph=" + coph + ", batches=" + batches + "]";
	}
	
}
