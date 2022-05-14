package group5.ApplicantApp.jumpstart.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "applicants")
public class Applicant {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long app_id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date app_dateApplied;
	
	@PrePersist
	private void onCreate()
	{
		app_dateApplied = new Date();
	}
	
	@Column(name = "job_position", columnDefinition= "VARCHAR(30)")
	private String ajobPos;
	
	@Column(name = "app_firstName", columnDefinition= "VARCHAR(50)")
	private String afirstName;
	
	@Column(name = "app_lastName", columnDefinition= "VARCHAR(30)")
	private String alastName;
	
	@Column(name = "app_middleName", columnDefinition= "VARCHAR(30)")
	private String amidName;
	
	@Column(name = "status")
	private String status;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date app_birthdate;
	
	@Column(name = "app_religion", columnDefinition= "VARCHAR(20)")
	private String areligion;
	
	@Column(name = "app_sex", columnDefinition= "VARCHAR(10)")
	private String asex;
	
	
	@Column(name = "app_age")
	private int aage;
	
	@Column(name = "app_cityAdd", columnDefinition= "VARCHAR(70)")
	private String acityAdd;
	
	@Column(name = "app_provAdd", columnDefinition= "VARCHAR(70)")
	private String aprovAdd;
	
	@Column(name = "app_telNum", columnDefinition= "VARCHAR(20)")
	private String atelNum;
	
	@Column(name = "app_mobileNum", columnDefinition= "VARCHAR(20)")
	private String amobileNum;
	
	@Column(name = "app_emailAdd", columnDefinition= "VARCHAR(70)")
	private String aemailAdd;
	

	@Column(name = "app_philhealth", columnDefinition= "VARCHAR(20)")
	private String aphilNum;
	
	@Column(name = "app_sssNum", columnDefinition= "VARCHAR(20)")
	private String asssNum;
	
	@Column(name = "app_tinNum", columnDefinition= "VARCHAR(20)")
	private String atinNum;
	
	//Foreign Keys
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<ContactPerson>  conPerson = new ArrayList<>();
	
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Spouse>  appSpouse = new ArrayList<>();
	
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Dependent>  appDependent = new ArrayList<>();
	
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Family>  appFamily = new ArrayList<>();
	
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<EducationalBg>  appEducBg = new ArrayList<>();
	
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Thesis>  appThesis = new ArrayList<>();
	
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Extracurricular>  appExtraCurr = new ArrayList<>();
	
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<WorkExperience>  appWorkExp = new ArrayList<>();
	
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Conviction>  appConvic = new ArrayList<>();
	
	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<References>  appReferences = new ArrayList<>();

	public long getApp_id() {
		return app_id;
	}

	public void setApp_id(long app_id) {
		this.app_id = app_id;
	}

	public Date getApp_dateApplied() {
		return app_dateApplied;
	}

	public void setApp_dateApplied(Date app_dateApplied) {
		this.app_dateApplied = app_dateApplied;
	}

	public String getAjobPos() {
		return ajobPos;
	}

	public void setAjobPos(String ajobPos) {
		this.ajobPos = ajobPos;
	}

	public String getAfirstName() {
		return afirstName;
	}

	public void setAfirstName(String afirstName) {
		this.afirstName = afirstName;
	}

	public String getAlastName() {
		return alastName;
	}

	public void setAlastName(String alastName) {
		this.alastName = alastName;
	}

	public String getAmidName() {
		return amidName;
	}

	public void setAmidName(String amidName) {
		this.amidName = amidName;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getApp_birthdate() {
		return app_birthdate;
	}

	public void setApp_birthdate(Date app_birthdate) {
		this.app_birthdate = app_birthdate;
	}

	public String getAreligion() {
		return areligion;
	}

	public void setAreligion(String areligion) {
		this.areligion = areligion;
	}

	public String getAsex() {
		return asex;
	}

	public void setAsex(String asex) {
		this.asex = asex;
	}

	public int getAage() {
		return aage;
	}

	public void setAage(int aage) {
		this.aage = aage;
	}

	public String getAcityAdd() {
		return acityAdd;
	}

	public void setAcityAdd(String acityAdd) {
		this.acityAdd = acityAdd;
	}

	public String getAprovAdd() {
		return aprovAdd;
	}

	public void setAprovAdd(String aprovAdd) {
		this.aprovAdd = aprovAdd;
	}

	public String getAtelNum() {
		return atelNum;
	}

	public void setAtelNum(String atelNum) {
		this.atelNum = atelNum;
	}

	public String getAmobileNum() {
		return amobileNum;
	}

	public void setAmobileNum(String amobileNum) {
		this.amobileNum = amobileNum;
	}

	public String getAemailAdd() {
		return aemailAdd;
	}

	public void setAemailAdd(String aemailAdd) {
		this.aemailAdd = aemailAdd;
	}

	public String getAphilNum() {
		return aphilNum;
	}

	public void setAphilNum(String aphilNum) {
		this.aphilNum = aphilNum;
	}

	public String getAsssNum() {
		return asssNum;
	}

	public void setAsssNum(String asssNum) {
		this.asssNum = asssNum;
	}

	public String getAtinNum() {
		return atinNum;
	}

	public void setAtinNum(String atinNum) {
		this.atinNum = atinNum;
	}

	public List<ContactPerson> getConPerson() {
		return conPerson;
	}

	public void setConPerson(List<ContactPerson> conPerson) {
		this.conPerson = conPerson;
	}
	
	public List<Spouse> getAppSpouse() {
		return appSpouse;
	}

	public void setAppSpouse(List<Spouse> appSpouse) {
		this.appSpouse = appSpouse;
	}
	
	public List<Dependent> getAppDependent() {
		return appDependent;
	}

	public void setAppDependent(List<Dependent> appDependent) {
		this.appDependent = appDependent;
	}

	public List<Family> getAppFamily() {
		return appFamily;
	}

	public void setAppFamily(List<Family> appFamily) {
		this.appFamily = appFamily;
	}

	public List<EducationalBg> getAppEducBg() {
		return appEducBg;
	}

	public void setAppEducBg(List<EducationalBg> appEducBg) {
		this.appEducBg = appEducBg;
	}

	public List<Thesis> getAppThesis() {
		return appThesis;
	}

	public void setAppThesis(List<Thesis> appThesis) {
		this.appThesis = appThesis;
	}

	public List<Extracurricular> getAppExtraCurr() {
		return appExtraCurr;
	}

	public void setAppExtraCurr(List<Extracurricular> appExtraCurr) {
		this.appExtraCurr = appExtraCurr;
	}
	
	public List<WorkExperience> getAppWorkExp() {
		return appWorkExp;
	}

	public void setAppWorkExp(List<WorkExperience> appWorkExp) {
		this.appWorkExp = appWorkExp;
	}
	
	public List<Conviction> getAppConvic() {
		return appConvic;
	}

	public void setAppConvic(List<Conviction> appConvic) {
		this.appConvic = appConvic;
	}

	public List<References> getAppReferences() {
		return appReferences;
	}

	public void setAppReferences(List<References> appReferences) {
		this.appReferences = appReferences;
	}

	public void addConPerson(String conName, String conNum, String conRelation, String conAddress) {
		this.conPerson.add(new ContactPerson(conName, conNum, conRelation, conAddress, this));
	}
	
	public void addSpouse(String spouseName, String spouseOccup, String spouseComp, String spouseAge) {
		this.appSpouse.add(new Spouse(spouseName, spouseOccup, spouseComp, spouseAge, this));
	}
	
	public void addDependent(String depName1, String depAge1, String depRelation1, String depName2, String depAge2, String depRelation2, String depName3, String depAge3, String depRelation3){
		this.appDependent.add(new Dependent(depName1, depAge1, depRelation1, depName2, depAge2, depRelation2, depName3, depAge3, depRelation3, this));
	}
	
	public void addFamily(String fbfatherName, String fbfatherOccup, String fbfatherComp, String fbfatherAge, String fbmotherName, String fbmotherOccup, String fbmotherComp, String fbmotherAge, String fbNumSiblings, String fbBirthOrder){
		this.appFamily.add(new Family(fbfatherName, fbfatherOccup, fbfatherComp, fbfatherAge, fbmotherName, fbmotherOccup, fbmotherComp, fbmotherAge, fbNumSiblings, fbBirthOrder,this));
	}
	
	public void addEducBg(String educNameGS, String educYrsGS, String educDegreeGS, String educAchievementGS, String educNameHS, String educYrsHS, String educDegreeHS, String educAchievementHS, String educNameCS, String educYrsCS, String educDegreeCS, String educAchievementCS, String educNameMS, String educYrsMS, String educDegreeMS, String educAchievementMS){
		this.appEducBg.add(new EducationalBg(educNameGS, educYrsGS, educDegreeGS, educAchievementGS, educNameHS, educYrsHS, educDegreeHS, educAchievementHS, educNameCS, educYrsCS, educDegreeCS, educAchievementCS, educNameMS, educYrsMS, educDegreeMS, educAchievementMS, this));
	}
	
	public void addThesis(String thesisSubj, String thesisTitle, String thesisProgLang, String thesisDesc, String thesisRole, String thesisTName, String thesisContactNum, String thesisGrade){
		this.appThesis.add(new Thesis(thesisSubj, thesisTitle, thesisProgLang, thesisDesc, thesisRole, thesisTName, thesisContactNum, thesisGrade, this));
	}
	
	public void addExtraCurr(String extraActOne, String extraActOneRole, String extraActTwo, String extraActTwoRole){
		this.appExtraCurr.add(new Extracurricular(extraActOne, extraActOneRole, extraActTwo, extraActTwoRole, this));
	}
	
	public void addWorkExp(String wrkCompOne, String wrkOne_dur, String wrkOne_pos, String wrkOne_sal, String wrkOne_dirtSV, String wrkOne_reasonfl,
			String wrkCompTwo, String wrkTwo_dur, String wrkTwo_pos, String wrkTwo_sal, String wrkTwo_dirtSV, String wrkTwo_reasonfl,
			String wrkCompThree, String wrkThree_dur, String wrkThree_pos, String wrkThree_sal, String wrkThree_dirtSV, String wrkThree_reasonfl,
			String wrk_carPlanDesc, String wrk_dateAvail, String wrk_expectedSal, String wrk_willTT) {
		this.appWorkExp.add(new WorkExperience(wrkCompOne, wrkOne_dur, wrkOne_pos, wrkOne_sal, wrkOne_dirtSV, wrkOne_reasonfl,
				wrkCompTwo, wrkTwo_dur, wrkTwo_pos, wrkTwo_sal, wrkTwo_dirtSV, wrkTwo_reasonfl,
				wrkCompThree, wrkThree_dur, wrkThree_pos, wrkThree_sal, wrkThree_dirtSV, wrkThree_reasonfl,
				wrk_carPlanDesc, wrk_dateAvail, wrk_expectedSal, wrk_willTT, this));
	}
	
	public void addConviction(String prevConvic, String convicDetails, String convicUnderDrugT, String convicDTReason){
		this.appConvic.add(new Conviction(prevConvic, convicDetails, convicUnderDrugT, convicDTReason, this));
	}
	
	public void addReferences(String refNameOne, String refOneComp, String refOnePos, String refOneRel, String refOneContactNum,
			String refNameTwo, String refTwoComp, String refTwoPos, String refTwoRelation, String refTwoContactNum, 
			String refNameThree, String refThreeComp, String refThreePos, String refThreeRelation, String refThreeContactNum){
		this.appReferences.add(new References(refNameOne, refOneComp, refOnePos, refOneRel, refOneContactNum,
		    refNameTwo, refTwoComp, refTwoPos, refTwoRelation, refTwoContactNum, 
		    refNameThree, refThreeComp, refThreePos, refThreeRelation, refThreeContactNum, this));
	}
	
}
