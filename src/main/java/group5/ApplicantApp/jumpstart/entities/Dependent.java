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
@Table(name = "dependents")
public class Dependent {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long dep_id;
	
	//dependents table
	@Column(name = "dependent_name1", columnDefinition= "VARCHAR(50)")
	private String depName1;
		
	@Column(name = "dependent_age1", columnDefinition= "VARCHAR(3)")
	private String depAge1;
		
	@Column(name = "dependent_relation1", columnDefinition= "VARCHAR(20)")
	private String depRelation1;
		
	@Column(name = "dependent_name2", columnDefinition= "VARCHAR(50)")
	private String depName2;
		
	@Column(name = "dependent_age2", columnDefinition= "VARCHAR(3)")
	private String depAge2;
	
	@Column(name = "dependent_relation2", columnDefinition= "VARCHAR(20)")
	private String depRelation2;
		
	@Column(name = "dependent_name3", columnDefinition= "VARCHAR(50)")
	private String depName3;
		
	@Column(name = "dependent_age3", columnDefinition= "VARCHAR(3)")
	private String depAge3;
		
	@Column(name = "dependent_relation3", columnDefinition= "VARCHAR(20)")
	private String depRelation3;
	
	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;
	
	public Dependent() {
	}
	
	public Dependent(String depName1, String depAge1, String depRelation1, String depName2, String depAge2,
			String depRelation2, String depName3, String depAge3, String depRelation3, Applicant applicant) {
		super();
		this.depName1 = depName1;
		this.depAge1 = depAge1;
		this.depRelation1 = depRelation1;
		this.depName2 = depName2;
		this.depAge2 = depAge2;
		this.depRelation2 = depRelation2;
		this.depName3 = depName3;
		this.depAge3 = depAge3;
		this.depRelation3 = depRelation3;
		this.applicant = applicant;
	}

	public long getDep_id() {
		return dep_id;
	}

	public void setDep_id(long dep_id) {
		this.dep_id = dep_id;
	}

	public String getDepName1() {
		return depName1;
	}

	public void setDepName1(String depName1) {
		this.depName1 = depName1;
	}

	public String getDepAge1() {
		return depAge1;
	}

	public void setDepAge1(String depAge1) {
		this.depAge1 = depAge1;
	}

	public String getDepRelation1() {
		return depRelation1;
	}

	public void setDepRelation1(String depRelation1) {
		this.depRelation1 = depRelation1;
	}

	public String getDepName2() {
		return depName2;
	}

	public void setDepName2(String depName2) {
		this.depName2 = depName2;
	}

	public String getDepAge2() {
		return depAge2;
	}

	public void setDepAge2(String depAge2) {
		this.depAge2 = depAge2;
	}

	public String getDepRelation2() {
		return depRelation2;
	}

	public void setDepRelation2(String depRelation2) {
		this.depRelation2 = depRelation2;
	}

	public String getDepName3() {
		return depName3;
	}

	public void setDepName3(String depName3) {
		this.depName3 = depName3;
	}

	public String getDepAge3() {
		return depAge3;
	}

	public void setDepAge3(String depAge3) {
		this.depAge3 = depAge3;
	}

	public String getDepRelation3() {
		return depRelation3;
	}

	public void setDepRelation3(String depRelation3) {
		this.depRelation3 = depRelation3;
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
		return depName1 + " " + depAge1 + " " + depRelation1 + " " + depName2 + " " + depAge2 + " "
				+ depRelation2 + " " + depName3 + " " + depAge3 + " " + depRelation3;
	}
}
