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
@Table(name = "spouse")
public class Spouse {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long spouse_id;
	
	@Column(name = "spouse_name", columnDefinition= "VARCHAR(80)")
	private String spouseName;
	
	@Column(name = "spouse_occupation", columnDefinition= "VARCHAR(30)")
	private String spouseOccup;
	
	@Column(name = "spouse_company", columnDefinition= "VARCHAR(50)")
	private String spouseComp;
		
	@Column(name = "spouse_age", columnDefinition= "VARCHAR(3)")
	private String spouseAge;
	
	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;
	
	public Spouse() {
	}

	public Spouse(String spouseName, String spouseOccup, String spouseComp, String spouseAge, Applicant applicant) {
		super();
		this.spouseName = spouseName;
		this.spouseOccup = spouseOccup;
		this.spouseComp = spouseComp;
		this.spouseAge = spouseAge;
		this.applicant = applicant;
	}

	public long getSpouse_id() {
		return spouse_id;
	}

	public void setSpouse_id(long spouse_id) {
		this.spouse_id = spouse_id;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseOccup() {
		return spouseOccup;
	}

	public void setSpouseOccup(String spouseOccup) {
		this.spouseOccup = spouseOccup;
	}

	public String getSpouseComp() {
		return spouseComp;
	}

	public void setSpouseComp(String spouseComp) {
		this.spouseComp = spouseComp;
	}

	public String getSpouseAge() {
		return spouseAge;
	}

	public void setSpouseAge(String spouseAge) {
		this.spouseAge = spouseAge;
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
		return spouseName + " " + spouseOccup + " " + spouseComp + " " + spouseAge;
	}
}
