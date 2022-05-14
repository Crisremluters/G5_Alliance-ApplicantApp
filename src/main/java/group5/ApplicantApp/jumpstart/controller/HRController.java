package group5.ApplicantApp.jumpstart.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import group5.ApplicantApp.jumpstart.entities.Applicant;
//import group5.ApplicantApp.jumpstart.model.ApplicantAddress;
import group5.ApplicantApp.jumpstart.entities.Login;
import group5.ApplicantApp.jumpstart.repository.LoginRepository;
import group5.ApplicantApp.jumpstart.service.ApplicantsService;
import group5.ApplicantApp.jumpstart.service.LoginService;

@Controller
public class HRController {

	@Autowired
    private LoginService userService;
	
	@Autowired
    private LoginRepository loginRepo;
	
	
	@GetMapping("/usersList")
	public String showUsersManagementPage(Model model) {
		
		List<Login> hrList = loginRepo.findAll();
		model.addAttribute("hrList", hrList);
		return "usersListPage";
	}
	
	@GetMapping("/usersManagement")
	public String showUsersManagementPage2(Model model) {
		
		List<Login> hrList = loginRepo.findAll();
		model.addAttribute("hrList", hrList);
		return "user_management";
	}
	
	@GetMapping("/usersListAddStats")
	public String showListOfUsers(Model model) {
		
		List<Login> hrList = loginRepo.findAll();
		model.addAttribute("hrList", hrList);
		return "usersListAddStatus";
	}
	
	@PostMapping("/saveUpdateUser")
	public String saveUpdateUser(@ModelAttribute("newUser") Login newUser) {
		// save employee to database
		loginRepo.save(newUser);
		return "redirect:/usersListAddStats";
	}
	
	
	@GetMapping("/showNewAddUsersForm")
	public String showNewAddUsersForm(Model model) {
		// create model attribute to bind form data
		Login newUser = new Login();
		model.addAttribute("newUser", newUser);
		return "new_user";
	}
	
	@GetMapping("/showNewEditUsersForm/{id}")
	public String showNewEditUsersForm(@PathVariable ( value = "id") long id, Model model) {
		// create model attribute to bind form data
		Login newUser = loginRepo.findById(id).get();
		model.addAttribute("newUser", newUser);
		return "edit_user";
	}
	
	
	@GetMapping("/showListEditUsers")
	public String showListEditUsers(Model model) {
		// create model attribute to bind form data
		List<Login> hrList = loginRepo.findAll();
		model.addAttribute("hrList", hrList);
		return "edit_user_list";
	}
	
	@GetMapping("/showListDeleteUsers")
	public String showListDeleteUsers(Model model) {
		// create model attribute to bind form data
		List<Login> hrList = loginRepo.findAll();
		model.addAttribute("hrList", hrList);
		return "delete_user_list";
	}
	
	@GetMapping("/users/delete/{id}")
	public String deleteApplicant(@PathVariable("id") long id, Model model)
	{
		loginRepo.deleteById(id);
		return "redirect:/showListDeleteUsers";
	}
	
	
	@GetMapping("/showAddUserStatsForm/{id}")
	public String showNewAddUserStatsForm(@PathVariable ( value = "id") long id, Model model) {
		// create model attribute to bind form data
		Login newUser = loginRepo.findById(id).get();
		model.addAttribute("newUser", newUser);
		return "add_user_stats";
	}
	
	@PostMapping("/saveNewUser")
	public String saveNewUser(@ModelAttribute("newUser") Login newUser) {
		// save employee to database
		loginRepo.save(newUser);
		return "redirect:/showNewAddUsersForm";
	}
	
	
    @GetMapping("/login")  
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());
        return mav;
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("user") Login user ) {
    
     Login oauthUser = userService.login(user.getEmail(), user.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/hrPage";
    
    
     } else {
     return "redirect:/login";
    
    
     }
 
}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    
  
        return "redirect:/login";
    }
	
	
}