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
@Table(name = "education")
public class EducationalBg {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long educ_id;
	
	@Column(name = "educ_nameGS", columnDefinition= "VARCHAR(30)")
	private String educNameGS;
	
	@Column(name = "educ_yrsGS", columnDefinition= "VARCHAR(15)")
	private String educYrsGS;
	
	@Column(name = "educ_degreeGS", columnDefinition= "VARCHAR(60)")
	private String educDegreeGS;
	
	@Column(name = "educ_achievementGS", columnDefinition= "VARCHAR(50)")
	private String educAchievementGS;
	
	@Column(name = "educ_nameHS", columnDefinition= "VARCHAR(30)")
	private String educNameHS;
	
	@Column(name = "educ_yrsHS", columnDefinition= "VARCHAR(15)")
	private String educYrsHS;
	
	@Column(name = "educ_degreeHS", columnDefinition= "VARCHAR(60)")
	private String educDegreeHS;
	
	@Column(name = "educ_achievementHS", columnDefinition= "VARCHAR(50)")
	private String educAchievementHS;
	
	@Column(name = "educ_nameCS", columnDefinition= "VARCHAR(30)")
	private String educNameCS;
	
	@Column(name = "educ_yrsCS", columnDefinition= "VARCHAR(15)")
	private String educYrsCS;
	
	@Column(name = "educ_degreeCS", columnDefinition= "VARCHAR(60)")
	private String educDegreeCS;
	
	@Column(name = "educ_achievementCS", columnDefinition= "VARCHAR(50)")
	private String educAchievementCS;
	
	@Column(name = "educ_nameMS", columnDefinition= "VARCHAR(30)")
	private String educNameMS;
	
	@Column(name = "educ_yrsMS", columnDefinition= "VARCHAR(15)")
	private String educYrsMS;
	
	@Column(name = "educ_degreeMS", columnDefinition= "VARCHAR(60)")
	private String educDegreeMS;
	
	@Column(name = "educ_achievementMS", columnDefinition= "VARCHAR(50)")
	private String educAchievementMS;
	
	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;
	
	public EducationalBg() {
	}
	
	public EducationalBg(String educNameGS, String educYrsGS, String educDegreeGS, String educAchievementGS,
			String educNameHS, String educYrsHS, String educDegreeHS, String educAchievementHS, String educNameCS,
			String educYrsCS, String educDegreeCS, String educAchievementCS, String educNameMS, String educYrsMS,
			String educDegreeMS, String educAchievementMS, Applicant applicant) {
		super();
		this.educNameGS = educNameGS;
		this.educYrsGS = educYrsGS;
		this.educDegreeGS = educDegreeGS;
		this.educAchievementGS = educAchievementGS;
		this.educNameHS = educNameHS;
		this.educYrsHS = educYrsHS;
		this.educDegreeHS = educDegreeHS;
		this.educAchievementHS = educAchievementHS;
		this.educNameCS = educNameCS;
		this.educYrsCS = educYrsCS;
		this.educDegreeCS = educDegreeCS;
		this.educAchievementCS = educAchievementCS;
		this.educNameMS = educNameMS;
		this.educYrsMS = educYrsMS;
		this.educDegreeMS = educDegreeMS;
		this.educAchievementMS = educAchievementMS;
		this.applicant = applicant;
	}

	public long getEduc_id() {
		return educ_id;
	}

	public void setEduc_id(long educ_id) {
		this.educ_id = educ_id;
	}

	public String getEducNameGS() {
		return educNameGS;
	}

	public void setEducNameGS(String educNameGS) {
		this.educNameGS = educNameGS;
	}

	public String getEducYrsGS() {
		return educYrsGS;
	}

	public void setEducYrsGS(String educYrsGS) {
		this.educYrsGS = educYrsGS;
	}

	public String getEducDegreeGS() {
		return educDegreeGS;
	}

	public void setEducDegreeGS(String educDegreeGS) {
		this.educDegreeGS = educDegreeGS;
	}

	public String getEducAchievementGS() {
		return educAchievementGS;
	}

	public void setEducAchievementGS(String educAchievementGS) {
		this.educAchievementGS = educAchievementGS;
	}

	public String getEducNameHS() {
		return educNameHS;
	}

	public void setEducNameHS(String educNameHS) {
		this.educNameHS = educNameHS;
	}

	public String getEducYrsHS() {
		return educYrsHS;
	}

	public void setEducYrsHS(String educYrsHS) {
		this.educYrsHS = educYrsHS;
	}

	public String getEducDegreeHS() {
		return educDegreeHS;
	}

	public void setEducDegreeHS(String educDegreeHS) {
		this.educDegreeHS = educDegreeHS;
	}

	public String getEducAchievementHS() {
		return educAchievementHS;
	}

	public void setEducAchievementHS(String educAchievementHS) {
		this.educAchievementHS = educAchievementHS;
	}

	public String getEducNameCS() {
		return educNameCS;
	}

	public void setEducNameCS(String educNameCS) {
		this.educNameCS = educNameCS;
	}

	public String getEducYrsCS() {
		return educYrsCS;
	}

	public void setEducYrsCS(String educYrsCS) {
		this.educYrsCS = educYrsCS;
	}

	public String getEducDegreeCS() {
		return educDegreeCS;
	}

	public void setEducDegreeCS(String educDegreeCS) {
		this.educDegreeCS = educDegreeCS;
	}

	public String getEducAchievementCS() {
		return educAchievementCS;
	}

	public void setEducAchievementCS(String educAchievementCS) {
		this.educAchievementCS = educAchievementCS;
	}

	public String getEducNameMS() {
		return educNameMS;
	}

	public void setEducNameMS(String educNameMS) {
		this.educNameMS = educNameMS;
	}

	public String getEducYrsMS() {
		return educYrsMS;
	}

	public void setEducYrsMS(String educYrsMS) {
		this.educYrsMS = educYrsMS;
	}

	public String getEducDegreeMS() {
		return educDegreeMS;
	}

	public void setEducDegreeMS(String educDegreeMS) {
		this.educDegreeMS = educDegreeMS;
	}

	public String getEducAchievementMS() {
		return educAchievementMS;
	}

	public void setEducAchievementMS(String educAchievementMS) {
		this.educAchievementMS = educAchievementMS;
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
		return educNameGS + " " + educYrsGS + " " + educDegreeGS + " " + educAchievementGS + " " + educNameHS + " "
				+ educYrsHS + " " + educDegreeHS + " " + educAchievementHS + " " + educNameCS + " " + educYrsCS + " "
				+ educDegreeCS + " " + educAchievementCS + " " + educNameMS + " " + educYrsMS + " " + educDegreeMS + " " 
				+ educAchievementMS;
	}
}
