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
import group5.ApplicantApp.jumpstart.entities.ContactPerson;
import group5.ApplicantApp.jumpstart.entities.Login;
import group5.ApplicantApp.jumpstart.service.ApplicantsService;
import group5.ApplicantApp.jumpstart.service.LoginService;

@Controller
public class ApplicantsController {

	@Autowired
	private ApplicantsService applicantsService;
	
	@GetMapping("/")
	public String dashboard()
	{
		return "home";
	}
	
//	@GetMapping("/login")
//	public String loginPage()
//	{
//		return "login";
//	}
//	
	
	// display list of applicants
	@GetMapping("/hrPage")
	public String viewHomePage(Model model) {
		return findPaginated(1, "firstName", "asc", model);		
	}
	
	@GetMapping("/showApplicantForm")
	public String showApplicantForm(Model model) {
		// create model attribute to bind form data
		Applicant applicant = new Applicant();
		model.addAttribute("applicant", applicant);
		return "applicant_user";
	}
	
	@PostMapping("/saveApplicant")
	public String saveApplicant(@ModelAttribute("applicant") Applicant applicant) {
		// save applicants to database
		applicantsService.saveApplicant(applicant);
		return "redirect:/hrPage";
	}
	
	@PostMapping("/createApplicant")
	public String createApplicant(@ModelAttribute("applicant") Applicant applicant,HttpServletRequest request) {
		// create applicants to database
		
		String[] conName = request.getParameterValues("conName");
		String[] conNum = request.getParameterValues("conNum");
		String[] conRelation = request.getParameterValues("conRelation");
		String[] conAddress = request.getParameterValues("conAddress");

		applicantsService.saveApplicant(applicant);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get applicant from the service
		Applicant applicant = applicantsService.getApplicantById(id);
		
		// set applicant as a model attribute to pre-populate the form
		model.addAttribute("applicant", applicant);
		return "update_employee";
	}
	
	@GetMapping("/deleteApplicant/{id}")
	public String deleteApplicant(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.applicantsService.deleteApplicantById(id);
		return "redirect:/hrPage";
	}
	
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Applicant> page = applicantsService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Applicant> listApplicants = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listApplicants", listApplicants);
		return "index";
	}
	
	//login controller
	
	@Autowired
    private LoginService userService;
 
                                  
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