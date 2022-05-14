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
@Table(name = "conviction")
public class Conviction {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long convic_id;
	
	@Column(name = "convic_havePrevious", columnDefinition= "VARCHAR(10)")
	private String prevConvic;
	
	@Column(name = "convic_details", columnDefinition= "VARCHAR(30)")
	private String convicDetails;

	@Column(name = "convic_undergoDrugTest", columnDefinition= "VARCHAR(10)")
	private String convicUnderDrugT;
	
	@Column(name = "convic_DrugTestReason", columnDefinition= "VARCHAR(30)")
	private String convicDTReason;

	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;

	public Conviction() {
	}

	public Conviction(String prevConvic, String convicDetails, String convicUnderDrugT, String convicDTReason,
			Applicant applicant) {
		super();
		this.prevConvic = prevConvic;
		this.convicDetails = convicDetails;
		this.convicUnderDrugT = convicUnderDrugT;
		this.convicDTReason = convicDTReason;
		this.applicant = applicant;
	}

	public long getConvic_id() {
		return convic_id;
	}

	public void setConvic_id(long convic_id) {
		this.convic_id = convic_id;
	}

	public String getPrevConvic() {
		return prevConvic;
	}

	public void setPrevConvic(String prevConvic) {
		this.prevConvic = prevConvic;
	}

	public String getConvicDetails() {
		return convicDetails;
	}

	public void setConvicDetails(String convicDetails) {
		this.convicDetails = convicDetails;
	}

	public String getConvicUnderDrugT() {
		return convicUnderDrugT;
	}

	public void setConvicUnderDrugT(String convicUnderDrugT) {
		this.convicUnderDrugT = convicUnderDrugT;
	}

	public String getConvicDTReason() {
		return convicDTReason;
	}

	public void setConvicDTReason(String convicDTReason) {
		this.convicDTReason = convicDTReason;
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
		return prevConvic + " " + convicDetails + " " + convicUnderDrugT + " " + convicDTReason;
	}
}
