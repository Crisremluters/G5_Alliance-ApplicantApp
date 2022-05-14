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
@Table(name = "family")
public class Family {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long fam_id;
	
	@Column(name = "fambg_fatherName", columnDefinition= "VARCHAR(30)")
	private String fbfatherName;
	
	@Column(name = "fambg_fatherOccup", columnDefinition= "VARCHAR(20)")
	private String fbfatherOccup;
	
	@Column(name = "fambg_fatherComp", columnDefinition= "VARCHAR(30)")
	private String fbfatherComp;
	
	@Column(name = "fambg_fatherAge", columnDefinition= "VARCHAR(3)")
	private String fbfatherAge;
	
	@Column(name = "fambg_motherName", columnDefinition= "VARCHAR(30)")
	private String fbmotherName;
	
	@Column(name = "fambg_motherOccup", columnDefinition= "VARCHAR(20)")
	private String fbmotherOccup;
	
	@Column(name = "fambg_motherComp", columnDefinition= "VARCHAR(30)")
	private String fbmotherComp;
	
	@Column(name = "fambg_motherAge", columnDefinition= "VARCHAR(3)")
	private String fbmotherAge;
	
	@Column(name = "fambg_numOfSiblings", columnDefinition= "VARCHAR(3)")
	private String fbNumSiblings;
	
	@Column(name = "fambg_birthOrder", columnDefinition= "VARCHAR(10)")
	private String fbBirthOrder;
	
	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;

	public Family() {
	}
	
	public Family(String fbfatherName, String fbfatherOccup, String fbfatherComp, String fbfatherAge,
			String fbmotherName, String fbmotherOccup, String fbmotherComp, String fbmotherAge, String fbNumSiblings,
			String fbBirthOrder, Applicant applicant) {
		super();
		this.fbfatherName = fbfatherName;
		this.fbfatherOccup = fbfatherOccup;
		this.fbfatherComp = fbfatherComp;
		this.fbfatherAge = fbfatherAge;
		this.fbmotherName = fbmotherName;
		this.fbmotherOccup = fbmotherOccup;
		this.fbmotherComp = fbmotherComp;
		this.fbmotherAge = fbmotherAge;
		this.fbNumSiblings = fbNumSiblings;
		this.fbBirthOrder = fbBirthOrder;
		this.applicant = applicant;
	}

	public long getFam_id() {
		return fam_id;
	}

	public void setFam_id(long fam_id) {
		this.fam_id = fam_id;
	}

	public String getFbfatherName() {
		return fbfatherName;
	}

	public void setFbfatherName(String fbfatherName) {
		this.fbfatherName = fbfatherName;
	}

	public String getFbfatherOccup() {
		return fbfatherOccup;
	}

	public void setFbfatherOccup(String fbfatherOccup) {
		this.fbfatherOccup = fbfatherOccup;
	}

	public String getFbfatherComp() {
		return fbfatherComp;
	}

	public void setFbfatherComp(String fbfatherComp) {
		this.fbfatherComp = fbfatherComp;
	}

	public String getFbfatherAge() {
		return fbfatherAge;
	}

	public void setFbfatherAge(String fbfatherAge) {
		this.fbfatherAge = fbfatherAge;
	}

	public String getFbmotherName() {
		return fbmotherName;
	}

	public void setFbmotherName(String fbmotherName) {
		this.fbmotherName = fbmotherName;
	}

	public String getFbmotherOccup() {
		return fbmotherOccup;
	}

	public void setFbmotherOccup(String fbmotherOccup) {
		this.fbmotherOccup = fbmotherOccup;
	}

	public String getFbmotherComp() {
		return fbmotherComp;
	}

	public void setFbmotherComp(String fbmotherComp) {
		this.fbmotherComp = fbmotherComp;
	}

	public String getFbmotherAge() {
		return fbmotherAge;
	}

	public void setFbmotherAge(String fbmotherAge) {
		this.fbmotherAge = fbmotherAge;
	}

	public String getFbNumSiblings() {
		return fbNumSiblings;
	}

	public void setFbNumSiblings(String fbNumSiblings) {
		this.fbNumSiblings = fbNumSiblings;
	}

	public String getFbBirthOrder() {
		return fbBirthOrder;
	}

	public void setFbBirthOrder(String fbBirthOrder) {
		this.fbBirthOrder = fbBirthOrder;
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
		return fbfatherName + " " + fbfatherOccup + " " + fbfatherComp + " " + fbfatherAge + " " + fbmotherName + " "
				+ fbmotherOccup + " " + fbmotherComp + " " + fbmotherAge + " " + fbNumSiblings + " " + fbBirthOrder;
	}
}
