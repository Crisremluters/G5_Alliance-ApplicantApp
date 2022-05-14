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
@Table(name = "extracurricular")
public class Extracurricular {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long extra_id;
	
	@Column(name = "extraAct_one", columnDefinition= "VARCHAR(30)")
	private String extraActOne;
	
	@Column(name = "extraAct_one_role", columnDefinition= "VARCHAR(20)")
	private String extraActOneRole;
	
	@Column(name = "extraAct_two", columnDefinition= "VARCHAR(30)")
	private String extraActTwo;
	
	@Column(name = "extraAct_two_role", columnDefinition= "VARCHAR(20)")
	private String extraActTwoRole;
	
	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;

	public Extracurricular() {
	}

	public Extracurricular(String extraActOne, String extraActOneRole, String extraActTwo, String extraActTwoRole,
			Applicant applicant) {
		super();
		this.extraActOne = extraActOne;
		this.extraActOneRole = extraActOneRole;
		this.extraActTwo = extraActTwo;
		this.extraActTwoRole = extraActTwoRole;
		this.applicant = applicant;
	}

	public long getExtra_id() {
		return extra_id;
	}

	public void setExtra_id(long extra_id) {
		this.extra_id = extra_id;
	}

	public String getExtraActOne() {
		return extraActOne;
	}

	public void setExtraActOne(String extraActOne) {
		this.extraActOne = extraActOne;
	}

	public String getExtraActOneRole() {
		return extraActOneRole;
	}

	public void setExtraActOneRole(String extraActOneRole) {
		this.extraActOneRole = extraActOneRole;
	}

	public String getExtraActTwo() {
		return extraActTwo;
	}

	public void setExtraActTwo(String extraActTwo) {
		this.extraActTwo = extraActTwo;
	}

	public String getExtraActTwoRole() {
		return extraActTwoRole;
	}

	public void setExtraActTwoRole(String extraActTwoRole) {
		this.extraActTwoRole = extraActTwoRole;
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
		return extraActOne + " " + extraActOneRole + " " + extraActTwo + " " + extraActTwoRole;
	}
}
