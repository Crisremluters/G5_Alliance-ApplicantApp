package group5.ApplicantApp.jumpstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import group5.ApplicantApp.jumpstart.entities.Login;



@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	Login findByEmailAndPassword(String email, String password);

}
