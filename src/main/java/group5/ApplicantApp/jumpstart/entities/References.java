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
@Table(name = "appreferences")
public class References {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long ref_id;
	
	@Column(name = "refName_One", columnDefinition= "VARCHAR(30)")
	private String refNameOne;
	
	@Column(name = "refOne_comp", columnDefinition= "VARCHAR(30)")
	private String refOneComp;

	@Column(name = "refOne_position", columnDefinition= "VARCHAR(20)")
	private String refOnePos;
	
	@Column(name = "refOne_relation", columnDefinition= "VARCHAR(20)")
	private String refOneRel;
	
	@Column(name = "refOne_contactNum", columnDefinition= "VARCHAR(20)")
	private String refOneContactNum;
	
	@Column(name = "refName_Two", columnDefinition= "VARCHAR(30)")
	private String refNameTwo;

	@Column(name = "refTwo_comp", columnDefinition= "VARCHAR(30)")
	private String refTwoComp;
	
	@Column(name = "refTwo_position", columnDefinition= "VARCHAR(20)")
	private String refTwoPos;
	
	@Column(name = "refTwo_relation", columnDefinition= "VARCHAR(20)")
	private String refTwoRelation;
	
	@Column(name = "refTwo_contactNum", columnDefinition= "VARCHAR(20)")
	private String refTwoContactNum;
	
	@Column(name = "refName_Three", columnDefinition= "VARCHAR(30)")
	private String refNameThree;

	@Column(name = "refThree_comp", columnDefinition= "VARCHAR(30)")
	private String refThreeComp;
	
	@Column(name = "refThree_position", columnDefinition= "VARCHAR(20)")
	private String refThreePos;
	
	@Column(name = "refThree_relation", columnDefinition= "VARCHAR(20)")
	private String refThreeRelation;
	
	@Column(name = "refThree_contactNum", columnDefinition= "VARCHAR(20)")
	private String refThreeContactNum;
	
	@ManyToOne
	@JoinColumn(name = "app_id")
	private Applicant applicant;

	public References() {
	}

	public References(String refNameOne, String refOneComp, String refOnePos, String refOneRel, String refOneContactNum,
			String refNameTwo, String refTwoComp, String refTwoPos, String refTwoRelation, String refTwoContactNum,
			String refNameThree, String refThreeComp, String refThreePos, String refThreeRelation,
			String refThreeContactNum, Applicant applicant) {
		super();
		this.refNameOne = refNameOne;
		this.refOneComp = refOneComp;
		this.refOnePos = refOnePos;
		this.refOneRel = refOneRel;
		this.refOneContactNum = refOneContactNum;
		this.refNameTwo = refNameTwo;
		this.refTwoComp = refTwoComp;
		this.refTwoPos = refTwoPos;
		this.refTwoRelation = refTwoRelation;
		this.refTwoContactNum = refTwoContactNum;
		this.refNameThree = refNameThree;
		this.refThreeComp = refThreeComp;
		this.refThreePos = refThreePos;
		this.refThreeRelation = refThreeRelation;
		this.refThreeContactNum = refThreeContactNum;
		this.applicant = applicant;
	}

	public long getRef_id() {
		return ref_id;
	}

	public void setRef_id(long ref_id) {
		this.ref_id = ref_id;
	}

	public String getRefNameOne() {
		return refNameOne;
	}

	public void setRefNameOne(String refNameOne) {
		this.refNameOne = refNameOne;
	}

	public String getRefOneComp() {
		return refOneComp;
	}

	public void setRefOneComp(String refOneComp) {
		this.refOneComp = refOneComp;
	}

	public String getRefOnePos() {
		return refOnePos;
	}

	public void setRefOnePos(String refOnePos) {
		this.refOnePos = refOnePos;
	}

	public String getRefOneRel() {
		return refOneRel;
	}

	public void setRefOneRel(String refOneRel) {
		this.refOneRel = refOneRel;
	}

	public String getRefOneContactNum() {
		return refOneContactNum;
	}

	public void setRefOneContactNum(String refOneContactNum) {
		this.refOneContactNum = refOneContactNum;
	}

	public String getRefNameTwo() {
		return refNameTwo;
	}

	public void setRefNameTwo(String refNameTwo) {
		this.refNameTwo = refNameTwo;
	}

	public String getRefTwoComp() {
		return refTwoComp;
	}

	public void setRefTwoComp(String refTwoComp) {
		this.refTwoComp = refTwoComp;
	}

	public String getRefTwoPos() {
		return refTwoPos;
	}

	public void setRefTwoPos(String refTwoPos) {
		this.refTwoPos = refTwoPos;
	}

	public String getRefTwoRelation() {
		return refTwoRelation;
	}

	public void setRefTwoRelation(String refTwoRelation) {
		this.refTwoRelation = refTwoRelation;
	}

	public String getRefTwoContactNum() {
		return refTwoContactNum;
	}

	public void setRefTwoContactNum(String refTwoContactNum) {
		this.refTwoContactNum = refTwoContactNum;
	}

	public String getRefNameThree() {
		return refNameThree;
	}

	public void setRefNameThree(String refNameThree) {
		this.refNameThree = refNameThree;
	}

	public String getRefThreeComp() {
		return refThreeComp;
	}

	public void setRefThreeComp(String refThreeComp) {
		this.refThreeComp = refThreeComp;
	}

	public String getRefThreePos() {
		return refThreePos;
	}

	public void setRefThreePos(String refThreePos) {
		this.refThreePos = refThreePos;
	}

	public String getRefThreeRelation() {
		return refThreeRelation;
	}

	public void setRefThreeRelation(String refThreeRelation) {
		this.refThreeRelation = refThreeRelation;
	}

	public String getRefThreeContactNum() {
		return refThreeContactNum;
	}

	public void setRefThreeContactNum(String refThreeContactNum) {
		this.refThreeContactNum = refThreeContactNum;
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
		return refNameOne + " " + refOneComp + " " + refOnePos + " " + refOneRel + " " + refOneContactNum
				+ " " + refNameTwo + " " + refTwoComp + " " + refTwoPos + " " + refTwoRelation + " " + refTwoContactNum
				+ " " + refNameThree + " " + refThreeComp + " " + refThreePos + " " + refThreeRelation + " " + refThreeContactNum;
	}
}
