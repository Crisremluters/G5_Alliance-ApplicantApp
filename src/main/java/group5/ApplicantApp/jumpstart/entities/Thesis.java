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
@Table(name = "thesis")
public class Thesis {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long thesis_id;
	
	@Column(name = "thesis_sub", columnDefinition= "VARCHAR(50)")
	private String thesisSubj;
	
	@Column(name = "thesis_title", columnDefinition= "VARCHAR(50)")
	private String thesisTitle;
	
	@Column(name = "thesis_progLang", columnDefinition= "VARCHAR(50)")
	private String thesisProgLang;
	
	@Column(name = "thesis_desc", columnDefinition= "VARCHAR(60)")
	private String thesisDesc;
	
	@Column(name = "thesis_role", columnDefinition= "VARCHAR(30)")
	private String thesisRole;
	
	@Column(name = "thesis_teachersName", columnDefinition= "VARCHAR(30)")
	private String thesisTName;
	
	@Column(name = "thesis_contactNum", columnDefinition= "VARCHAR(20)")
	private String thesisContactNum;
	
	@Column(name = "thesis_grade", columnDefinition= "VARCHAR(10)")
	private String thesisGrade;
	
	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;

	public Thesis() {
	}
	
	public Thesis(String thesisSubj, String thesisTitle, String thesisProgLang, String thesisDesc, String thesisRole,
			String thesisTName, String thesisContactNum, String thesisGrade, Applicant applicant) {
		super();
		this.thesisSubj = thesisSubj;
		this.thesisTitle = thesisTitle;
		this.thesisProgLang = thesisProgLang;
		this.thesisDesc = thesisDesc;
		this.thesisRole = thesisRole;
		this.thesisTName = thesisTName;
		this.thesisContactNum = thesisContactNum;
		this.thesisGrade = thesisGrade;
		this.applicant = applicant;
	}

	public long getThesis_id() {
		return thesis_id;
	}

	public void setThesis_id(long thesis_id) {
		this.thesis_id = thesis_id;
	}

	public String getThesisSubj() {
		return thesisSubj;
	}

	public void setThesisSubj(String thesisSubj) {
		this.thesisSubj = thesisSubj;
	}

	public String getThesisTitle() {
		return thesisTitle;
	}

	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}

	public String getThesisProgLang() {
		return thesisProgLang;
	}

	public void setThesisProgLang(String thesisProgLang) {
		this.thesisProgLang = thesisProgLang;
	}

	public String getThesisDesc() {
		return thesisDesc;
	}

	public void setThesisDesc(String thesisDesc) {
		this.thesisDesc = thesisDesc;
	}

	public String getThesisRole() {
		return thesisRole;
	}

	public void setThesisRole(String thesisRole) {
		this.thesisRole = thesisRole;
	}

	public String getThesisTName() {
		return thesisTName;
	}

	public void setThesisTName(String thesisTName) {
		this.thesisTName = thesisTName;
	}

	public String getThesisContactNum() {
		return thesisContactNum;
	}

	public void setThesisContactNum(String thesisContactNum) {
		this.thesisContactNum = thesisContactNum;
	}

	public String getThesisGrade() {
		return thesisGrade;
	}

	public void setThesisGrade(String thesisGrade) {
		this.thesisGrade = thesisGrade;
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
		return thesisSubj + " " + thesisTitle + " " + thesisProgLang + " " + thesisDesc + " " + thesisRole + " " + thesisTName + " "
				+ thesisContactNum + " " + thesisGrade;
	}
}
