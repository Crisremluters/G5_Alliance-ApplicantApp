package group5.ApplicantApp.jumpstart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group5.ApplicantApp.jumpstart.entities.Login;
import group5.ApplicantApp.jumpstart.repository.LoginRepository;

 
@Service
public class LoginService {
@Autowired
private LoginRepository repo;
  
  public Login login(String email, String password) {
  Login user = repo.findByEmailAndPassword(email, password);
   return user;
  }
 
}
