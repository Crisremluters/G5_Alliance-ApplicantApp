package group5.ApplicantApp.jumpstart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import group5.ApplicantApp.jumpstart.entities.Applicant;
import group5.ApplicantApp.jumpstart.repository.ApplicantsRepository;




@Service
public class ApplicantsServiceImpl implements ApplicantsService {

	@Autowired
	private ApplicantsRepository applicantsRepository;

	@Override
	public List<Applicant> getAllApplicants() {
		return applicantsRepository.findAll();
	}

	@Override
	public void saveApplicant(Applicant applicant) {
		this.applicantsRepository.save(applicant);
	}

	@Override
	public Applicant getApplicantById(long id) {
		Optional<Applicant> optional = applicantsRepository.findById(id);
		Applicant applicant = null;
		if (optional.isPresent()) {
			applicant = optional.get();
		} else {
			throw new RuntimeException(" Applicant not found for id :: " + id);
		}
		return applicant;
	}

	@Override
	public void deleteApplicantById(long id) {
		this.applicantsRepository.deleteById(id);
	}

	@Override
	public Page<Applicant> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.applicantsRepository.findAll(pageable);
	}
}