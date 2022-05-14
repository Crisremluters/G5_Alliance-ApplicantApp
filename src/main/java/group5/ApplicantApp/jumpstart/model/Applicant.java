//package group5.ApplicantApp.jumpstart.model;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.PrePersist;
//import javax.persistence.Table;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//
//
//
//@Entity
//@Table(name = "applicants")
//public class Applicant {
//	
//	@Id
//	@GeneratedValue(strategy =  GenerationType.IDENTITY)
//	private long id;
//	
//	@Column(name = "first_name")
//	private String firstName;
//	
//	@Column(name = "last_name")
//	private String lastName;
//	
//	@Column(name = "email")
//	private String email;
//	
//	@Column(name = "status")
//	private String status;
//	
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date dateApplied;
//	
//	@PrePersist
//	private void onCreate()
//	{
//		dateApplied = new Date();
//	}
//	
//	
//	@OneToMany(mappedBy = "applicant",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	private List<ApplicantAddress>  appAddress = new ArrayList<>();
//	
//	public Date getDateApplied() {
//		return dateApplied;
//	}
//	public void setDateApplied(Date dateApplied) {
//		this.dateApplied = dateApplied;
//	}
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public List<ApplicantAddress> getAppAddress() {
//		return appAddress;
//	}
//	public void setAppAddress(List<ApplicantAddress> appAddress) {
//		this.appAddress = appAddress;
//	}
//	
//	public void addAddress(String city_address, String provincial_address) {
//		this.appAddress.add(new ApplicantAddress(city_address, provincial_address,this));
//	}
//	
//	
//}
