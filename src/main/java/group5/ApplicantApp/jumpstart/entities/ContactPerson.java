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
@Table(name = "contactpersons")
public class ContactPerson {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long contact_id;
	
	@Column(name = "contact_name", columnDefinition= "VARCHAR(50)")
	private String conName;
	
	@Column(name = "contact_num", columnDefinition= "VARCHAR(20)")
	private String conNum;
	
	@Column(name = "contact_relationship", columnDefinition= "VARCHAR(20)")
	private String conRelation;
	
	@Column(name = "contact_address", columnDefinition= "VARCHAR(70)")
	private String conAddress;
	
	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;
	
	public ContactPerson() {
	}

	public ContactPerson(String conName, String conNum, String conRelation, String conAddress,
			Applicant applicant) {
		super();
		this.conName = conName;
		this.conNum = conNum;
		this.conRelation = conRelation;
		this.conAddress = conAddress;
		this.applicant = applicant;
	}

	public long getContact_id() {
		return contact_id;
	}

	public void setContact_id(long contact_id) {
		this.contact_id = contact_id;
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public String getConNum() {
		return conNum;
	}

	public void setConNum(String conNum) {
		this.conNum = conNum;
	}

	public String getConRelation() {
		return conRelation;
	}

	public void setConRelation(String conRelation) {
		this.conRelation = conRelation;
	}

	public String getConAddress() {
		return conAddress;
	}

	public void setConAddress(String conAddress) {
		this.conAddress = conAddress;
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
		return conName + " " + conNum + " " + conRelation + " " + conAddress;
	}
	
}
