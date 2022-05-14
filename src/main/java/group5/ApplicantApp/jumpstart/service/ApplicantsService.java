package group5.ApplicantApp.jumpstart.service;

import java.util.List;
import org.springframework.data.domain.Page;

import group5.ApplicantApp.jumpstart.entities.Applicant;

public interface ApplicantsService {
	List<Applicant> getAllApplicants();
	void saveApplicant(Applicant applicant);
	Applicant getApplicantById(long id);
	void deleteApplicantById(long id);
	Page<Applicant> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}