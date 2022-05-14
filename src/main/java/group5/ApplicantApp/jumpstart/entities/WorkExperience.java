package group5.ApplicantApp.jumpstart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "workexperience")
public class WorkExperience {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long work_id;
	
	@Column(name = "work_compOne", columnDefinition= "VARCHAR(30)")
	private String wrkCompOne;
	
	@Column(name = "workOne_duration", columnDefinition= "VARCHAR(20)")
	private String wrkOne_dur;
	
	@Column(name = "workOne_position", columnDefinition= "VARCHAR(30)")
	private String wrkOne_pos;
	
	@Column(name = "workOne_salary", columnDefinition= "VARCHAR(10)")
	private String wrkOne_sal;
	
	@Column(name = "workOne_directSv", columnDefinition= "VARCHAR(30)")
	private String wrkOne_dirtSV;
	
	@Column(name = "workOne_reasonFL", columnDefinition= "VARCHAR(30)")
	private String wrkOne_reasonfl;
	
	@Column(name = "work_compTwo", columnDefinition= "VARCHAR(30)")
	private String wrkCompTwo;
	
	@Column(name = "workTwo_duration", columnDefinition= "VARCHAR(20)")
	private String wrkTwo_dur;
	
	@Column(name = "workTwo_position", columnDefinition= "VARCHAR(30)")
	private String wrkTwo_pos;
	
	@Column(name = "workTwo_salary", columnDefinition= "VARCHAR(10)")
	private String wrkTwo_sal;
	
	@Column(name = "workTwo_directSv", columnDefinition= "VARCHAR(30)")
	private String wrkTwo_dirtSV;
	
	@Column(name = "workTwo_reasonFL", columnDefinition= "VARCHAR(30)")
	private String wrkTwo_reasonfl;
	
	@Column(name = "work_compThree", columnDefinition= "VARCHAR(30)")
	private String wrkCompThree;
	
	@Column(name = "workThree_duration", columnDefinition= "VARCHAR(20)")
	private String wrkThree_dur;
	
	@Column(name = "workThree_position", columnDefinition= "VARCHAR(30)")
	private String wrkThree_pos;
	
	@Column(name = "workThree_salary", columnDefinition= "VARCHAR(10)")
	private String wrkThree_sal;
	
	@Column(name = "workThree_directSv", columnDefinition= "VARCHAR(30)")
	private String wrkThree_dirtSV;
	
	@Column(name = "workThree_reasonFL", columnDefinition= "VARCHAR(30)")
	private String wrkThree_reasonfl;
	
	@Column(name = "work_carPlanDesc", columnDefinition= "VARCHAR(100)")
	private String wrk_carPlanDesc;
	
	@Column(name = "work_dateAvail", columnDefinition= "VARCHAR(30)")
	private String wrk_dateAvail;
	
	@Column(name = "work_expectedSal", columnDefinition= "VARCHAR(10)")
	private String wrk_expectedSal;
	
	@Column(name = "work_willTT", columnDefinition= "VARCHAR(10)")
	private String wrk_willTT;
	
	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;
	
	public WorkExperience() {
	}

	public WorkExperience(String wrkCompOne, String wrkOne_dur, String wrkOne_pos, String wrkOne_sal,
			String wrkOne_dirtSV, String wrkOne_reasonfl, String wrkCompTwo, String wrkTwo_dur, String wrkTwo_pos,
			String wrkTwo_sal, String wrkTwo_dirtSV, String wrkTwo_reasonfl, String wrkCompThree, String wrkThree_dur,
			String wrkThree_pos, String wrkThree_sal, String wrkThree_dirtSV, String wrkThree_reasonfl,
			String wrk_carPlanDesc, String wrk_dateAvail, String wrk_expectedSal, String wrk_willTT,
			Applicant applicant) {
		super();
		this.wrkCompOne = wrkCompOne;
		this.wrkOne_dur = wrkOne_dur;
		this.wrkOne_pos = wrkOne_pos;
		this.wrkOne_sal = wrkOne_sal;
		this.wrkOne_dirtSV = wrkOne_dirtSV;
		this.wrkOne_reasonfl = wrkOne_reasonfl;
		this.wrkCompTwo = wrkCompTwo;
		this.wrkTwo_dur = wrkTwo_dur;
		this.wrkTwo_pos = wrkTwo_pos;
		this.wrkTwo_sal = wrkTwo_sal;
		this.wrkTwo_dirtSV = wrkTwo_dirtSV;
		this.wrkTwo_reasonfl = wrkTwo_reasonfl;
		this.wrkCompThree = wrkCompThree;
		this.wrkThree_dur = wrkThree_dur;
		this.wrkThree_pos = wrkThree_pos;
		this.wrkThree_sal = wrkThree_sal;
		this.wrkThree_dirtSV = wrkThree_dirtSV;
		this.wrkThree_reasonfl = wrkThree_reasonfl;
		this.wrk_carPlanDesc = wrk_carPlanDesc;
		this.wrk_dateAvail = wrk_dateAvail;
		this.wrk_expectedSal = wrk_expectedSal;
		this.wrk_willTT = wrk_willTT;
		this.applicant = applicant;
	}

	public long getWork_id() {
		return work_id;
	}

	public void setWork_id(long work_id) {
		this.work_id = work_id;
	}

	public String getWrkCompOne() {
		return wrkCompOne;
	}

	public void setWrkCompOne(String wrkCompOne) {
		this.wrkCompOne = wrkCompOne;
	}

	public String getWrkOne_dur() {
		return wrkOne_dur;
	}

	public void setWrkOne_dur(String wrkOne_dur) {
		this.wrkOne_dur = wrkOne_dur;
	}

	public String getWrkOne_pos() {
		return wrkOne_pos;
	}

	public void setWrkOne_pos(String wrkOne_pos) {
		this.wrkOne_pos = wrkOne_pos;
	}

	public String getWrkOne_sal() {
		return wrkOne_sal;
	}

	public void setWrkOne_sal(String wrkOne_sal) {
		this.wrkOne_sal = wrkOne_sal;
	}

	public String getWrkOne_dirtSV() {
		return wrkOne_dirtSV;
	}

	public void setWrkOne_dirtSV(String wrkOne_dirtSV) {
		this.wrkOne_dirtSV = wrkOne_dirtSV;
	}

	public String getWrkOne_reasonfl() {
		return wrkOne_reasonfl;
	}

	public void setWrkOne_reasonfl(String wrkOne_reasonfl) {
		this.wrkOne_reasonfl = wrkOne_reasonfl;
	}

	public String getWrkCompTwo() {
		return wrkCompTwo;
	}

	public void setWrkCompTwo(String wrkCompTwo) {
		this.wrkCompTwo = wrkCompTwo;
	}

	public String getWrkTwo_dur() {
		return wrkTwo_dur;
	}

	public void setWrkTwo_dur(String wrkTwo_dur) {
		this.wrkTwo_dur = wrkTwo_dur;
	}

	public String getWrkTwo_pos() {
		return wrkTwo_pos;
	}

	public void setWrkTwo_pos(String wrkTwo_pos) {
		this.wrkTwo_pos = wrkTwo_pos;
	}

	public String getWrkTwo_sal() {
		return wrkTwo_sal;
	}

	public void setWrkTwo_sal(String wrkTwo_sal) {
		this.wrkTwo_sal = wrkTwo_sal;
	}

	public String getWrkTwo_dirtSV() {
		return wrkTwo_dirtSV;
	}

	public void setWrkTwo_dirtSV(String wrkTwo_dirtSV) {
		this.wrkTwo_dirtSV = wrkTwo_dirtSV;
	}

	public String getWrkTwo_reasonfl() {
		return wrkTwo_reasonfl;
	}

	public void setWrkTwo_reasonfl(String wrkTwo_reasonfl) {
		this.wrkTwo_reasonfl = wrkTwo_reasonfl;
	}

	public String getWrkCompThree() {
		return wrkCompThree;
	}

	public void setWrkCompThree(String wrkCompThree) {
		this.wrkCompThree = wrkCompThree;
	}

	public String getWrkThree_dur() {
		return wrkThree_dur;
	}

	public void setWrkThree_dur(String wrkThree_dur) {
		this.wrkThree_dur = wrkThree_dur;
	}

	public String getWrkThree_pos() {
		return wrkThree_pos;
	}

	public void setWrkThree_pos(String wrkThree_pos) {
		this.wrkThree_pos = wrkThree_pos;
	}

	public String getWrkThree_sal() {
		return wrkThree_sal;
	}

	public void setWrkThree_sal(String wrkThree_sal) {
		this.wrkThree_sal = wrkThree_sal;
	}

	public String getWrkThree_dirtSV() {
		return wrkThree_dirtSV;
	}

	public void setWrkThree_dirtSV(String wrkThree_dirtSV) {
		this.wrkThree_dirtSV = wrkThree_dirtSV;
	}

	public String getWrkThree_reasonfl() {
		return wrkThree_reasonfl;
	}

	public void setWrkThree_reasonfl(String wrkThree_reasonfl) {
		this.wrkThree_reasonfl = wrkThree_reasonfl;
	}

	public String getWrk_carPlanDesc() {
		return wrk_carPlanDesc;
	}

	public void setWrk_carPlanDesc(String wrk_carPlanDesc) {
		this.wrk_carPlanDesc = wrk_carPlanDesc;
	}

	public String getWrk_dateAvail() {
		return wrk_dateAvail;
	}

	public void setWrk_dateAvail(String wrk_dateAvail) {
		this.wrk_dateAvail = wrk_dateAvail;
	}

	public String getWrk_expectedSal() {
		return wrk_expectedSal;
	}

	public void setWrk_expectedSal(String wrk_expectedSal) {
		this.wrk_expectedSal = wrk_expectedSal;
	}

	public String getWrk_willTT() {
		return wrk_willTT;
	}

	public void setWrk_willTT(String wrk_willTT) {
		this.wrk_willTT = wrk_willTT;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	
	@Override
	public String toString()
	{
		return wrkCompOne + " " + wrkOne_dur + " " + wrkOne_pos + " " + wrkOne_sal + " " + wrkOne_dirtSV + " " + wrkOne_reasonfl
				+ " " + wrkCompTwo + " " + wrkTwo_dur + " " + wrkTwo_pos + " " + wrkTwo_sal + " " + wrkTwo_dirtSV + " " + wrkTwo_reasonfl 
				+ " " + wrkCompThree + " " + wrkThree_dur + " " + wrkThree_pos + " " + wrkThree_sal + " " + wrkThree_dirtSV + " " + wrkThree_reasonfl
				+ " " + wrk_carPlanDesc + " " + wrk_dateAvail + " " + wrk_expectedSal + " " + wrk_willTT;
	}
}
