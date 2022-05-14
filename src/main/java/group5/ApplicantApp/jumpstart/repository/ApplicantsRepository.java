package group5.ApplicantApp.jumpstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import group5.ApplicantApp.jumpstart.entities.Applicant;


@Repository
public interface ApplicantsRepository extends JpaRepository<Applicant, Long>{

}